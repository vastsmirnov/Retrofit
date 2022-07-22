package com.vast.retrofit.domain.animals

import com.google.gson.annotations.SerializedName

data class Animal(
    @SerializedName("id")
    val id: Int,

    @SerializedName("name")
    val name: String,

    @SerializedName("image_link")
    val photo: String,

    @SerializedName("habitat")
    val habitat: String,

    @SerializedName("diet")
    val diet: String,

    @SerializedName("geo_range")
    val geoRange: String
    )