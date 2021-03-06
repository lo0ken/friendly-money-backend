package com.friendlymoney.backend.dto

import com.friendlymoney.backend.enums.TransactionTypeEnum

data class TransactionType(
    val code: TransactionTypeEnum,
    val name: String,

    val id: Int? = null
)