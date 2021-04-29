package com.friendlymoney.backend.dto

import com.friendlymoney.backend.enums.CategoryTypeEnum

data class CategoryType(
        val code: CategoryTypeEnum,
        val name: String,

        val id: Int? = null
)