package com.brunokstein.example.weatherappexample.data.repository

import com.brunokstein.example.weatherappexample.data.mappers.toWeatherInfo
import com.brunokstein.example.weatherappexample.data.remote.WeatherApi
import com.brunokstein.example.weatherappexample.domain.repository.WeatherRepository

import com.brunokstein.example.weatherappexample.domain.util.Resource
import com.brunokstein.example.weatherappexample.domain.weather.WeatherInfo
import java.lang.Exception
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
) : WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        }catch(e: Exception){
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}