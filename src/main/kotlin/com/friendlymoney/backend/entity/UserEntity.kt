package com.friendlymoney.backend.entity

import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.ManyToMany
import javax.persistence.Table

@Entity
@Table(name = "users")
class UserEntity(

        val username: String,

        val password: String,

        val phone: String,

        val email: String,

        @ManyToMany(fetch = FetchType.EAGER)
        @JoinTable(name = "user_roles",
                joinColumns = [JoinColumn(name = "user_id", referencedColumnName = "id")],
                inverseJoinColumns = [JoinColumn(name = "role_id", referencedColumnName = "id")])
        val roles: List<RoleEntity>,

        id: Int? = null
): BaseEntity(id)