package com.friendlymoney.backend.mapper

import com.friendlymoney.backend.mapper.CategoryMapper.Companion.CATEGORY_MAPPER
import com.friendlymoney.backend.testdata.CategoryTestData.Companion.FIRST_EXPENSE_CATEGORY_DTO
import com.friendlymoney.backend.testdata.CategoryTestData.Companion.FIRST_EXPENSE_CATEGORY_ENTITY
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class CategoryMapperTest {

    @Test
    fun mapDtoToEntity() {
        val result = CATEGORY_MAPPER.convertToEntity(FIRST_EXPENSE_CATEGORY_DTO)

        Assertions.assertThat(result)
                .isEqualTo(FIRST_EXPENSE_CATEGORY_ENTITY)
    }

    @Test
    fun mapEntityToDto() {
        val result = CATEGORY_MAPPER.convertToDto(FIRST_EXPENSE_CATEGORY_ENTITY)

        Assertions.assertThat(result)
                .isEqualTo(FIRST_EXPENSE_CATEGORY_DTO)
    }
}