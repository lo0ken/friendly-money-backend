package com.friendlymoney.backend.testdata

import com.friendlymoney.backend.dto.Transaction
import com.friendlymoney.backend.entity.TransactionEntity
import com.friendlymoney.backend.testdata.CategoryTestData.Companion.FIRST_EXPENSE_CATEGORY_DTO
import com.friendlymoney.backend.testdata.CategoryTestData.Companion.FIRST_EXPENSE_CATEGORY_ENTITY
import com.friendlymoney.backend.testdata.CategoryTestData.Companion.FIRST_INCOME_CATEGORY_DTO
import com.friendlymoney.backend.testdata.CategoryTestData.Companion.FIRST_INCOME_CATEGORY_ENTITY
import com.friendlymoney.backend.testdata.TransactionTypeTestData.Companion.EXPENSE_TRANSACTION_TYPE_DTO
import com.friendlymoney.backend.testdata.TransactionTypeTestData.Companion.EXPENSE_TRANSACTION_TYPE_ENTITY
import com.friendlymoney.backend.testdata.TransactionTypeTestData.Companion.INCOME_TRANSACTION_TYPE_DTO
import com.friendlymoney.backend.testdata.TransactionTypeTestData.Companion.INCOME_TRANSACTION_TYPE_ENTITY
import java.math.BigDecimal
import java.time.LocalDate

class TransactionTestData {
    companion object {
        const val FIRST_EXPENSE_TRANSACTION_ID = 1
        const val FIRST_EXPENSE_TRANSACTION_NAME = "First expense transaction"
        val FIRST_EXPENSE_TRANSACTION_AMOUNT = BigDecimal.valueOf(131.59)
        const val FIRST_EXPENSE_TRANSACTION_COMMENT = "First expense transaction comment"
        val FIRST_EXPENSE_TRANSACTION_CREATION_DATE = LocalDate.parse("2021-04-29")

        val FIRST_EXPENSE_TRANSACTION_ENTITY: TransactionEntity = TransactionEntity(
                id = FIRST_EXPENSE_TRANSACTION_ID,
                name = FIRST_EXPENSE_TRANSACTION_NAME,
                amount = FIRST_EXPENSE_TRANSACTION_AMOUNT,
                type = EXPENSE_TRANSACTION_TYPE_ENTITY,
                category = FIRST_EXPENSE_CATEGORY_ENTITY,
                comment = FIRST_EXPENSE_TRANSACTION_COMMENT,
                creationDate = FIRST_EXPENSE_TRANSACTION_CREATION_DATE
        )

        val FIRST_EXPENSE_TRANSACTION_DTO: Transaction = Transaction(
                id = FIRST_EXPENSE_TRANSACTION_ID,
                name = FIRST_EXPENSE_TRANSACTION_NAME,
                amount = FIRST_EXPENSE_TRANSACTION_AMOUNT,
                type = EXPENSE_TRANSACTION_TYPE_DTO,
                category = FIRST_EXPENSE_CATEGORY_DTO,
                comment = FIRST_EXPENSE_TRANSACTION_COMMENT,
                creationDate = FIRST_EXPENSE_TRANSACTION_CREATION_DATE
        )

        const val FIRST_INCOME_TRANSACTION_ID = 1
        const val FIRST_INCOME_TRANSACTION_NAME = "First income transaction"
        val FIRST_INCOME_TRANSACTION_AMOUNT = BigDecimal.valueOf(131.59)
        const val FIRST_INCOME_TRANSACTION_COMMENT = "First income transaction comment"
        val FIRST_INCOME_TRANSACTION_CREATION_DATE = LocalDate.parse("2021-04-29")

        val FIRST_INCOME_TRANSACTION_ENTITY: TransactionEntity = TransactionEntity(
                id = FIRST_INCOME_TRANSACTION_ID,
                name = FIRST_INCOME_TRANSACTION_NAME,
                amount = FIRST_INCOME_TRANSACTION_AMOUNT,
                type = INCOME_TRANSACTION_TYPE_ENTITY,
                category = FIRST_INCOME_CATEGORY_ENTITY,
                comment = FIRST_INCOME_TRANSACTION_COMMENT,
                creationDate = FIRST_INCOME_TRANSACTION_CREATION_DATE
        )

        val FIRST_INCOME_TRANSACTION_DTO: Transaction = Transaction(
                id = FIRST_INCOME_TRANSACTION_ID,
                name = FIRST_INCOME_TRANSACTION_NAME,
                amount = FIRST_INCOME_TRANSACTION_AMOUNT,
                type = INCOME_TRANSACTION_TYPE_DTO,
                category = FIRST_INCOME_CATEGORY_DTO,
                comment = FIRST_INCOME_TRANSACTION_COMMENT,
                creationDate = FIRST_INCOME_TRANSACTION_CREATION_DATE
        )
    }
}