package com.friendlymoney.backend.dto

data class Category(
        val name: String,
        val type: CategoryType,
        val user: User,
        val transactions: MutableList<Transaction>,

        val id: Int? = null
)