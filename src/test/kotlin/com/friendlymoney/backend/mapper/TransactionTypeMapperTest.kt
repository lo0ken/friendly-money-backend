package com.friendlymoney.backend.mapper

import com.friendlymoney.backend.mapper.TransactionTypeMapper.Companion.TRANSACTION_TYPE_MAPPER
import com.friendlymoney.backend.testdata.TransactionTypeTestData.Companion.EXPENSE_TRANSACTION_TYPE_DTO
import com.friendlymoney.backend.testdata.TransactionTypeTestData.Companion.EXPENSE_TRANSACTION_TYPE_ENTITY
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class TransactionTypeMapperTest {
    
    @Test
    fun mapDtoToEntity() {
        val result = TRANSACTION_TYPE_MAPPER.convertToEntity(EXPENSE_TRANSACTION_TYPE_DTO)

        Assertions.assertThat(result)
                .isEqualTo(EXPENSE_TRANSACTION_TYPE_ENTITY)
    }

    @Test
    fun mapEntityToDto() {
        val result = TRANSACTION_TYPE_MAPPER.convertToDto(EXPENSE_TRANSACTION_TYPE_ENTITY)

        Assertions.assertThat(result)
                .isEqualTo(EXPENSE_TRANSACTION_TYPE_DTO)
    }
}