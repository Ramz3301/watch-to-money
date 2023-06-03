package com.example.watchtomoney.model.dto

import java.math.BigDecimal


data class IncomeRequest (
    val incomeMoney: BigDecimal,
    val workDaysPerMonth: Int,
)