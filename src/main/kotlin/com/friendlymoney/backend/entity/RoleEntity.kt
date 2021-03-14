package com.friendlymoney.backend.entity

import javax.persistence.*

@Entity
@Table(name = "roles")
class RoleEntity(

        val name: String

): BaseEntity()