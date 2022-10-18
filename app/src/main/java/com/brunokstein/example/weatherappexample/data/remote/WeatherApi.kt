package com.brunokstein.example.weatherappexample.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("v1/forecast?latitude=-15.7801&longitude=-47.9292&hourly=temperature_2m,relativehumidity_2m,weathercode,pressure_msl,windspeed_10m")
    suspend fun getWeatherData(
        @Query("latitude") lat: Double,
        @Query("longitude") long: Double
    ): WeatherDto

}
