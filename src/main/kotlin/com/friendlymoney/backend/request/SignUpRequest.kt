package com.friendlymoney.backend.request

data class SignUpRequest(
        val username: String,
        val password: String,
        val phone: String,
        val email: String,
)