package com.friendlymoney.backend.service.api

import com.friendlymoney.backend.dto.User
import com.friendlymoney.backend.request.SignUpRequest

interface UserService {

    fun findByUserName(username: String): User?

    fun register(signUpRequest: SignUpRequest): User
}