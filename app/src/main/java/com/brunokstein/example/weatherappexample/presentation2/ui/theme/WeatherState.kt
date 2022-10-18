package com.brunokstein.example.weatherappexample.presentation2.ui.theme

import com.brunokstein.example.weatherappexample.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
