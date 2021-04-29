package com.friendlymoney.backend.dto

import com.friendlymoney.backend.enum.CategoryTypeEnum

data class CategoryType(
        val code: CategoryTypeEnum,
        val name: String,

        val id: Int? = null
)