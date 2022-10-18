package com.brunokstein.example.weatherappexample.domain.repository

import com.brunokstein.example.weatherappexample.domain.util.Resource
import com.brunokstein.example.weatherappexample.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}