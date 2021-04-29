package com.friendlymoney.backend.entity

import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "category")
class CategoryEntity(

       val name: String,

       @ManyToOne(fetch = FetchType.EAGER)
       val type: CategoryTypeEntity,

       @ManyToOne(fetch = FetchType.LAZY)
       val user: UserEntity,

       @OneToMany(mappedBy = "category")
       val transactions: MutableList<TransactionEntity>,

       id: Int?
): BaseEntity(id)