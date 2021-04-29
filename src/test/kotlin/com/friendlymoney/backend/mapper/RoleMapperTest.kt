package com.friendlymoney.backend.mapper

import com.friendlymoney.backend.mapper.RoleMapper.Companion.ROLE_MAPPER
import com.friendlymoney.backend.testdata.RoleTestData.Companion.USER_ROLE_DTO
import com.friendlymoney.backend.testdata.RoleTestData.Companion.USER_ROLE_ENTITY
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoleMapperTest {

    @Test
    fun mapDtoToEntity() {
        val result = ROLE_MAPPER.convertToEntity(USER_ROLE_DTO)

        assertThat(result)
                .isEqualTo(USER_ROLE_ENTITY)
    }

    @Test
    fun mapEntityToDto() {
        val result = ROLE_MAPPER.convertToDto(USER_ROLE_ENTITY)

        assertThat(result)
                .isEqualTo(USER_ROLE_DTO)
    }
}