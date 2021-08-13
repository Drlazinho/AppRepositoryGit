package br.com.dio.app.repositories.data.model

import com.google.gson.annotations.SerializedName

data class Owner(
    val login: String,
    @SerializedName("avatar_url") //Como deve ser nome ao procurar no JSON
    val avatarURL: String
)


