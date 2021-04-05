package com.friendlymoney.backend.repository

import com.friendlymoney.backend.entity.CategoryEntity
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository: JpaRepository<CategoryEntity, Int> {
}