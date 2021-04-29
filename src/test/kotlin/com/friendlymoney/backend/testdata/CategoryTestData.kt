package com.friendlymoney.backend.testdata

import com.friendlymoney.backend.dto.Category
import com.friendlymoney.backend.entity.CategoryEntity
import com.friendlymoney.backend.testdata.CategoryTypeTestData.Companion.EXPENSE_CATEGORY_TYPE_DTO
import com.friendlymoney.backend.testdata.CategoryTypeTestData.Companion.EXPENSE_CATEGORY_TYPE_ENTITY
import com.friendlymoney.backend.testdata.CategoryTypeTestData.Companion.INCOME_CATEGORY_TYPE_DTO
import com.friendlymoney.backend.testdata.CategoryTypeTestData.Companion.INCOME_CATEGORY_TYPE_ENTITY
import com.friendlymoney.backend.testdata.UserTestData.Companion.FIRST_USER_DTO
import com.friendlymoney.backend.testdata.UserTestData.Companion.FIRST_USER_ENTITY

class CategoryTestData {
    companion object {
        const val FIRST_EXPENSE_CATEGORY_ID = 1
        const val FIRST_EXPENSE_CATEGORY_NAME = "Expense"

        val FIRST_EXPENSE_CATEGORY_ENTITY: CategoryEntity = CategoryEntity(
                id = FIRST_EXPENSE_CATEGORY_ID,
                name = FIRST_EXPENSE_CATEGORY_NAME,
                type = EXPENSE_CATEGORY_TYPE_ENTITY,
                user = FIRST_USER_ENTITY,
                transactions = mutableListOf()
        )

        val FIRST_EXPENSE_CATEGORY_DTO: Category = Category(
                id = FIRST_EXPENSE_CATEGORY_ID,
                name = FIRST_EXPENSE_CATEGORY_NAME,
                type = EXPENSE_CATEGORY_TYPE_DTO,
                user = FIRST_USER_DTO,
                transactions = mutableListOf()
        )

        const val FIRST_INCOME_CATEGORY_ID = 2
        const val FIRST_INCOME_CATEGORY_NAME = "Income"

        val FIRST_INCOME_CATEGORY_ENTITY = CategoryEntity(
                id = FIRST_INCOME_CATEGORY_ID,
                name = FIRST_INCOME_CATEGORY_NAME,
                type = INCOME_CATEGORY_TYPE_ENTITY,
                user = FIRST_USER_ENTITY,
                transactions = mutableListOf()
        )

        val FIRST_INCOME_CATEGORY_DTO = Category(
                id = FIRST_INCOME_CATEGORY_ID,
                name = FIRST_INCOME_CATEGORY_NAME,
                type = INCOME_CATEGORY_TYPE_DTO,
                user = FIRST_USER_DTO,
                transactions = mutableListOf()
        )
    }
}