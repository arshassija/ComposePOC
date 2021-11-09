package com.example.composepoc.repository

import com.example.composepoc.remote.CoinPaprikaApi
import com.example.composepoc.remote.dto.CoinDetailDto
import com.example.composepoc.remote.dto.CoinDto
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}