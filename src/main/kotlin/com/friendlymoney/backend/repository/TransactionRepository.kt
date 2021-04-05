package com.friendlymoney.backend.repository

import com.friendlymoney.backend.entity.TransactionEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TransactionRepository: JpaRepository<TransactionEntity, Int> {
}