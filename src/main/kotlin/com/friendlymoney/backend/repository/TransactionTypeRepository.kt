package com.friendlymoney.backend.repository

import com.friendlymoney.backend.entity.TransactionTypeEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TransactionTypeRepository: JpaRepository<TransactionTypeEntity, Int> {
}