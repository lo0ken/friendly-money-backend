package com.friendlymoney.backend.mapper

import com.friendlymoney.backend.mapper.TransactionMapper.Companion.TRANSACTION_MAPPER
import com.friendlymoney.backend.testdata.TransactionTestData.Companion.FIRST_EXPENSE_TRANSACTION_DTO
import com.friendlymoney.backend.testdata.TransactionTestData.Companion.FIRST_EXPENSE_TRANSACTION_ENTITY
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class TransactionMapperTest {

    @Test
    fun mapDtoToEntity() {
        val result = TRANSACTION_MAPPER.convertToEntity(FIRST_EXPENSE_TRANSACTION_DTO)

        Assertions.assertThat(result)
                .isEqualTo(FIRST_EXPENSE_TRANSACTION_ENTITY)
    }

    @Test
    fun mapEntityToDto() {
        val result = TRANSACTION_MAPPER.convertToDto(FIRST_EXPENSE_TRANSACTION_ENTITY)

        Assertions.assertThat(result)
                .isEqualTo(FIRST_EXPENSE_TRANSACTION_DTO)
    }
}