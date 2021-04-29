package com.friendlymoney.backend.mapper

import com.friendlymoney.backend.mapper.CategoryTypeMapper.Companion.CATEGORY_TYPE_MAPPER
import com.friendlymoney.backend.testdata.CategoryTypeTestData.Companion.EXPENSE_CATEGORY_TYPE_DTO
import com.friendlymoney.backend.testdata.CategoryTypeTestData.Companion.EXPENSE_CATEGORY_TYPE_ENTITY
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class CategoryTypeMapperTest {
    
    @Test
    fun mapDtoToEntity() {
        val result = CATEGORY_TYPE_MAPPER.convertToEntity(EXPENSE_CATEGORY_TYPE_DTO)

        Assertions.assertThat(result)
                .isEqualTo(EXPENSE_CATEGORY_TYPE_ENTITY)
    }

    @Test
    fun mapEntityToDto() {
        val result = CATEGORY_TYPE_MAPPER.convertToDto(EXPENSE_CATEGORY_TYPE_ENTITY)

        Assertions.assertThat(result)
                .isEqualTo(EXPENSE_CATEGORY_TYPE_DTO)
    }
}