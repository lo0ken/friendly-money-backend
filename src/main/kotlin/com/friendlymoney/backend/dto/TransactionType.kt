package com.friendlymoney.backend.dto

import com.friendlymoney.backend.enum.TransactionTypeEnum

data class TransactionType(
    val code: TransactionTypeEnum,
    val name: String,

    val id: Int? = null
)