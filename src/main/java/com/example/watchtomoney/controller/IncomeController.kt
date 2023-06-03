package com.example.watchtomoney.controller

import com.example.watchtomoney.model.dto.IncomeRequest
import com.example.watchtomoney.model.entity.Income
import com.example.watchtomoney.service.IncomeService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/income")
class IncomeController(
    private val incomeService: IncomeService
) {

    @PostMapping
    fun setIncome(
        @RequestBody request: IncomeRequest
    ) {
        incomeService.setIncome(request)
    }

    @GetMapping("/{id}")
    fun getIncome(
        @PathVariable id: Long
    ) : Income {
        return incomeService.getIncome(id)
    }

//    @PutMapping
//    fun updateIncome(
//        @RequestBody request: UpdateIncomeRequest
//    ) {
//        incomeService.updateIncome()
//    }
//
//    @DeleteMapping
//    fun deleteIncome() {
//        incomeService.deleteIncome()
//    }

}