package com.friendlymoney.backend.entity

import com.friendlymoney.backend.enum.TransactionTypeEnum
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Table

@Entity
@Table(name = "transaction_type")
class TransactionTypeEntity(

        val code: String,

        @Enumerated(EnumType.STRING)
        val name: TransactionTypeEnum,

        id: Int?
): BaseEntity(id)