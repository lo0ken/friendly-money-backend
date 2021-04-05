package com.friendlymoney.backend.entity

import com.friendlymoney.backend.enum.CategoryTypeEnum
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Table

@Entity
@Table(name = "category_type")
class CategoryTypeEntity(
        val code: String,

        @Enumerated(EnumType.STRING)
        val name: CategoryTypeEnum
): BaseEntity()