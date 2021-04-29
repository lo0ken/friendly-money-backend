package com.friendlymoney.backend.entity

import com.friendlymoney.backend.enums.CategoryTypeEnum
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Table

@Entity
@Table(name = "category_type")
class CategoryTypeEntity(

        @Enumerated(EnumType.STRING)
        val code: CategoryTypeEnum,

        val name: String,

        id: Int?
): BaseEntity(id)