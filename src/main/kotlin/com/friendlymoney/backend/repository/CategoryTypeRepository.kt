package com.friendlymoney.backend.repository

import com.friendlymoney.backend.entity.CategoryTypeEntity
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryTypeRepository: JpaRepository<CategoryTypeEntity, Int> {
}