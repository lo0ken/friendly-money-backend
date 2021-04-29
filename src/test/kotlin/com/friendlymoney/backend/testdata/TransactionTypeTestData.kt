package com.friendlymoney.backend.testdata

import com.friendlymoney.backend.dto.TransactionType
import com.friendlymoney.backend.entity.TransactionTypeEntity
import com.friendlymoney.backend.enums.TransactionTypeEnum

class TransactionTypeTestData {
    companion object {
        const val EXPENSE_TRANSACTION_TYPE_ID = 1
        val EXPENSE_TRANSACTION_TYPE_CODE = TransactionTypeEnum.EXPENSE
        const val EXPENSE_TRANSACTION_TYPE_NAME = "Expense"

        val EXPENSE_TRANSACTION_TYPE_ENTITY = TransactionTypeEntity(
                id = EXPENSE_TRANSACTION_TYPE_ID,
                code = EXPENSE_TRANSACTION_TYPE_CODE,
                name = EXPENSE_TRANSACTION_TYPE_NAME
        )

        val EXPENSE_TRANSACTION_TYPE_DTO = TransactionType(
                id = EXPENSE_TRANSACTION_TYPE_ID,
                code = EXPENSE_TRANSACTION_TYPE_CODE,
                name = EXPENSE_TRANSACTION_TYPE_NAME
        )

        const val INCOME_TRANSACTION_TYPE_ID = 2
        val INCOME_TRANSACTION_TYPE_CODE = TransactionTypeEnum.INCOME
        const val INCOME_TRANSACTION_TYPE_NAME = "Income"

        val INCOME_TRANSACTION_TYPE_ENTITY = TransactionTypeEntity(
                id = INCOME_TRANSACTION_TYPE_ID,
                code = INCOME_TRANSACTION_TYPE_CODE,
                name = INCOME_TRANSACTION_TYPE_NAME
        )

        val INCOME_TRANSACTION_TYPE_DTO = TransactionType(
                id = INCOME_TRANSACTION_TYPE_ID,
                code = INCOME_TRANSACTION_TYPE_CODE,
                name = INCOME_TRANSACTION_TYPE_NAME
        )
    }
}