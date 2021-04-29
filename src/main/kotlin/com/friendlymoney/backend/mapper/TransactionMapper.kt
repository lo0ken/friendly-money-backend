package com.friendlymoney.backend.mapper

import com.friendlymoney.backend.dto.Transaction
import com.friendlymoney.backend.entity.TransactionEntity
import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers

@Mapper
interface TransactionMapper {
    companion object {
        val TRANSACTION_MAPPER: TransactionMapper = Mappers.getMapper(TransactionMapper::class.java)
    }

    fun convertToDto(entity: TransactionEntity): Transaction
    fun convertToEntity(dto: Transaction): TransactionEntity
}