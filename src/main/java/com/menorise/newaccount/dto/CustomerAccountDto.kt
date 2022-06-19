package com.menorise.newaccount.dto

import java.math.BigDecimal
import java.time.LocalDateTime

data class CustomerAccountDto(
        val id: String,
        val balance: BigDecimal? = BigDecimal.ZERO,
        val creationDate: LocalDateTime,
        val transactions: Set<TransactionDto>?


)
