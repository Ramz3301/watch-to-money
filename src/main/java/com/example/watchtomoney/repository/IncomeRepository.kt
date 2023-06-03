package com.example.watchtomoney.repository

import com.example.watchtomoney.model.entity.Income
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface IncomeRepository : JpaRepository<Income,Long>{
}