package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 * @author: laibinzhi
 * @date: 2020-08-03 12:04
 * @github: https://github.com/laibinzhi
 * @blog: https://www.laibinzhi.top/
 */
data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(
    val name: String,
    val location: Location,
    @SerializedName("formatted_address") val address: String
)

data class Location(val lng: String, val lat: String)