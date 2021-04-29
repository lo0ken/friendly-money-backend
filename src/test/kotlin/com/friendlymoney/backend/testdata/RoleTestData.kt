package com.friendlymoney.backend.testdata

import com.friendlymoney.backend.dto.Role
import com.friendlymoney.backend.entity.RoleEntity

class RoleTestData {
    companion object {
        const val USER_ROLE_ID: Int = 1
        const val USER_ROLE_NAME: String = "USER"

        val USER_ROLE_ENTITY: RoleEntity = RoleEntity(
                id = USER_ROLE_ID,
                name = USER_ROLE_NAME
        )

        val USER_ROLE_DTO: Role = Role(
                id = USER_ROLE_ID,
                name = USER_ROLE_NAME
        )
    }
}