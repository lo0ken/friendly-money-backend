package com.friendlymoney.backend.entity

import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "roles")
class RoleEntity(

        val name: String,

        id: Int?
): BaseEntity(id)