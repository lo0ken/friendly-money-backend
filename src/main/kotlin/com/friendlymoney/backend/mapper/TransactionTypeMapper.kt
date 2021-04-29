package com.friendlymoney.backend.mapper

import com.friendlymoney.backend.dto.TransactionType
import com.friendlymoney.backend.entity.TransactionTypeEntity
import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers

@Mapper
interface TransactionTypeMapper {
    companion object {
        val TRANSACTION_TYPE_MAPPER: TransactionTypeMapper = Mappers.getMapper(TransactionTypeMapper::class.java)
    }

    fun convertToDto(entity: TransactionTypeEntity): TransactionType
    fun convertToEntity(dto: TransactionType): TransactionTypeEntity
}