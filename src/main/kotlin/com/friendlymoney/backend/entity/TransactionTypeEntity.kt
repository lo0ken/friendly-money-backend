package com.friendlymoney.backend.entity

import com.friendlymoney.backend.enum.TransactionTypeEnum
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Table

@Entity
@Table(name = "transaction_type")
class TransactionTypeEntity(

        @Enumerated(EnumType.STRING)
        val code: TransactionTypeEnum,

        val name: String,

        id: Int?
): BaseEntity(id)