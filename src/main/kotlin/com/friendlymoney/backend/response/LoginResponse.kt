package com.friendlymoney.backend.response

import com.friendlymoney.backend.dto.User

data class LoginResponse(
        val user: User,
        val token: String
)