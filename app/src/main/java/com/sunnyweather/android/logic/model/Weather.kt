package com.sunnyweather.android.logic.model

/**
 * @author: laibinzhi
 * @date: 2020-08-03 17:12
 * @github: https://github.com/laibinzhi
 * @blog: https://www.laibinzhi.top/
 */
data class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily)
