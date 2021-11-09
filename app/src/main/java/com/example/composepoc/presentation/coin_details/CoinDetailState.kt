package com.example.composepoc.presentation.coin_details

import com.example.composepoc.remote.dto.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
