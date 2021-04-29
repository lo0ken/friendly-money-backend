package com.friendlymoney.backend.mapper

import com.friendlymoney.backend.mapper.UserMapper.Companion.USER_MAPPER
import com.friendlymoney.backend.testdata.UserTestData.Companion.FIRST_USER_DTO
import com.friendlymoney.backend.testdata.UserTestData.Companion.FIRST_USER_ENTITY
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class UserMapperTest {

    @Test
    fun mapDtoToEntity() {
        val result = USER_MAPPER.convertToEntity(FIRST_USER_DTO)

        Assertions.assertThat(result)
                .isEqualTo(FIRST_USER_ENTITY)
    }

    @Test
    fun mapEntityToDto() {
        val result = USER_MAPPER.convertToDto(FIRST_USER_ENTITY)

        Assertions.assertThat(result)
                .isEqualTo(FIRST_USER_DTO)
    }
}