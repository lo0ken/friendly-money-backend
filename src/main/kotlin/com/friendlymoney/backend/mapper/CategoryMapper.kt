package com.friendlymoney.backend.mapper

import com.friendlymoney.backend.dto.Category
import com.friendlymoney.backend.entity.CategoryEntity
import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers

@Mapper
interface CategoryMapper {
    companion object {
        val CATEGORY_MAPPER: CategoryMapper = Mappers.getMapper(CategoryMapper::class.java)
    }

    fun convertToDto(entity: CategoryEntity): Category
    fun convertToEntity(dto: Category): CategoryEntity
}