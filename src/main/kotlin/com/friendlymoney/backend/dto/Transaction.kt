package com.friendlymoney.backend.dto

import java.math.BigDecimal
import java.time.LocalDate

data class Transaction(
    val name: String,
    val amount: BigDecimal,
    val type: TransactionType,
    val category: Category,
    var comment: String,
    val creationDate: LocalDate,

    val id: Int? = null
)