package com.example.watchtomoney.service

import com.example.watchtomoney.model.dto.IncomeRequest
import com.example.watchtomoney.model.entity.Income
import com.example.watchtomoney.repository.IncomeRepository
import org.springframework.stereotype.Service

interface IncomeService {
    fun setIncome(request: IncomeRequest)
    fun getIncome(id: Long): Income
}


@Service
class IncomeServiceImpl(
    private val incomeRepository: IncomeRepository
) : IncomeService {

    override fun setIncome(request: IncomeRequest) {
        val income = Income(
            money = request.incomeMoney,
            workDaysPerMonth = request.workDaysPerMonth
        )
        incomeRepository.save(income)
    }

    override fun getIncome(id: Long): Income {
        return incomeRepository.findById(id).orElseThrow()
    }
}