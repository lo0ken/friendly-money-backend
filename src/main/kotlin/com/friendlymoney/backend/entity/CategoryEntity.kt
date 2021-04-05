package com.friendlymoney.backend.entity

import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "category")
class CategoryEntity(
       val name: String,

       @ManyToOne(fetch = FetchType.LAZY)
       val user: UserEntity
): BaseEntity()