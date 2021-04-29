package com.friendlymoney.backend.testdata

import com.friendlymoney.backend.dto.User
import com.friendlymoney.backend.entity.UserEntity
import com.friendlymoney.backend.testdata.RoleTestData.Companion.USER_ROLE_DTO
import com.friendlymoney.backend.testdata.RoleTestData.Companion.USER_ROLE_ENTITY

class UserTestData {
    companion object {
        const val FIRST_USER_ID = 1
        const val FIRST_USER_USERNAME = "first_username"
        const val FIRST_USER_PASSWORD = "first_password"
        const val FIRST_USER_PHONE = "first_phone"
        const val FIRST_USER_EMAIL = "first_email"

        val FIRST_USER_ENTITY = UserEntity(
                id = FIRST_USER_ID,
                username = FIRST_USER_USERNAME,
                password = FIRST_USER_PASSWORD,
                phone = FIRST_USER_PHONE,
                email = FIRST_USER_EMAIL,
                roles = listOf(USER_ROLE_ENTITY)
        )

        val FIRST_USER_DTO = User(
                id = FIRST_USER_ID,
                username = FIRST_USER_USERNAME,
                password = FIRST_USER_PASSWORD,
                phone = FIRST_USER_PHONE,
                email = FIRST_USER_EMAIL,
                roles = listOf(USER_ROLE_DTO)
        )
    }
}