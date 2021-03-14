package com.friendlymoney.backend.controller

import com.friendlymoney.backend.request.LoginRequest
import com.friendlymoney.backend.dto.User
import com.friendlymoney.backend.request.SignUpRequest
import com.friendlymoney.backend.response.LoginResponse
import com.friendlymoney.backend.security.jwt.JwtTokenProvider
import com.friendlymoney.backend.service.api.UserService
import org.springframework.http.ResponseEntity
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth")
class AuthenticationController(
        private val userService: UserService,
        private val authenticationManager: AuthenticationManager,
        private val jwtTokenProvider: JwtTokenProvider
) {

    @PostMapping("/login")
    fun login(@RequestBody loginRequest: LoginRequest): ResponseEntity<LoginResponse> {
        authenticationManager.authenticate(UsernamePasswordAuthenticationToken(loginRequest.username, loginRequest.password))

        val roles = userService.findByUserName(loginRequest.username)?.roles!!
        val token = jwtTokenProvider.createToken(loginRequest.username, roles)

        val response = LoginResponse(
                loginRequest.username,
                token
        )

        return ResponseEntity.ok(response)
    }

    @PostMapping("/signup")
    fun signUp(@RequestBody signUpRequest: SignUpRequest): ResponseEntity<User> {
        val user = userService.register(signUpRequest)
        return ResponseEntity.ok(user)
    }
}