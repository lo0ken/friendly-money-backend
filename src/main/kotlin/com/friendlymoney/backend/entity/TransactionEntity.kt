package com.friendlymoney.backend.entity

import java.math.BigDecimal
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "transaction")
class TransactionEntity(
        val name: String,
        val amount: BigDecimal,

        @ManyToOne(fetch = FetchType.EAGER)
        val type: TransactionTypeEntity,

        @ManyToOne(fetch = FetchType.EAGER)
        val category: CategoryEntity,

        var comment: String,
        val creationDate: LocalDate
): BaseEntity()