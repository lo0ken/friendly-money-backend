package com.friendlymoney.backend.testdata

import com.friendlymoney.backend.dto.CategoryType
import com.friendlymoney.backend.entity.CategoryTypeEntity
import com.friendlymoney.backend.enums.CategoryTypeEnum

class CategoryTypeTestData {
    companion object {
        const val EXPENSE_CATEGORY_TYPE_ID = 1
        val EXPENSE_CATEGORY_TYPE_CODE = CategoryTypeEnum.EXPENSE
        const val EXPENSE_CATEGORY_TYPE_NAME = "Expense"

        val EXPENSE_CATEGORY_TYPE_ENTITY = CategoryTypeEntity(
                id = EXPENSE_CATEGORY_TYPE_ID,
                code = EXPENSE_CATEGORY_TYPE_CODE,
                name = EXPENSE_CATEGORY_TYPE_NAME
        )

        val EXPENSE_CATEGORY_TYPE_DTO = CategoryType(
                id = EXPENSE_CATEGORY_TYPE_ID,
                code = EXPENSE_CATEGORY_TYPE_CODE,
                name = EXPENSE_CATEGORY_TYPE_NAME
        )

        const val INCOME_CATEGORY_TYPE_ID = 2
        val INCOME_CATEGORY_TYPE_CODE = CategoryTypeEnum.INCOME
        const val INCOME_CATEGORY_TYPE_NAME = "Income"

        val INCOME_CATEGORY_TYPE_ENTITY = CategoryTypeEntity(
                id = INCOME_CATEGORY_TYPE_ID,
                code = INCOME_CATEGORY_TYPE_CODE,
                name = INCOME_CATEGORY_TYPE_NAME
        )

        val INCOME_CATEGORY_TYPE_DTO = CategoryType(
                id = INCOME_CATEGORY_TYPE_ID,
                code = INCOME_CATEGORY_TYPE_CODE,
                name = INCOME_CATEGORY_TYPE_NAME
        )
    }
}