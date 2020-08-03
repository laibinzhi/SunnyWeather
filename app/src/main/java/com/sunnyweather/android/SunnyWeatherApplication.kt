package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * @author: laibinzhi
 * @date: 2020-08-03 12:01
 * @github: https://github.com/laibinzhi
 * @blog: https://www.laibinzhi.top/
 */
class SunnyWeatherApplication : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "QEVXVxmQDuQIJTiN"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}