package com.friendlymoney.backend.mapper

import com.friendlymoney.backend.dto.CategoryType
import com.friendlymoney.backend.entity.CategoryTypeEntity
import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers

@Mapper
interface CategoryTypeMapper {
    companion object {
        val CATEGORY_TYPE_MAPPER: CategoryTypeMapper = Mappers.getMapper(CategoryTypeMapper::class.java)
    }

    fun convertToDto(entity: CategoryTypeEntity): CategoryType
    fun convertToEntity(dto: CategoryType): CategoryTypeEntity
}