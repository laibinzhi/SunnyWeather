package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 * @author: laibinzhi
 * @date: 2020-08-03 17:03
 * @github: https://github.com/laibinzhi
 * @blog: https://www.laibinzhi.top/
 */
data class RealtimeResponse(val status: String, val result: Result) {

    data class Result(val realtime: Realtime)

    data class Realtime(
        val skycon: String,
        val temperature: Float,
        @SerializedName("air_quality") val airQuality: AirQuality
    )

    data class AirQuality(val aqi: AQI)

    data class AQI(val chn: Float)

}