package com.example.composepoc.repository

import com.example.composepoc.remote.dto.CoinDetailDto
import com.example.composepoc.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}