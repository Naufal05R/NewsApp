package com.idn.newsapp.data

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@JsonClass(generateAdapter = true)
data class NewsResponse(
    @field:Json(name = "totalResults")
    val totalResults: Int? = null,

    @field:Json(name = "articles")
    val articles: List<ArticlesItem>? = null,

    @field:Json(name = "status")
    var status: String? = null
)

@JsonClass(generateAdapter = true)
@Parcelize
data class Source(
    @field:Json(name = "name")
    val name: String? = null
) : Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class ArticlesItem(
    @field:Json(name = "publishedAT")
    val publishedAt: String? = null,

    @field:Json(name = "author")
    val author: String? = null,

    @field:Json(name = "urlToImage")
    val urlToImage: String? = null,

    @field:Json(name = "description")
    val description: String? = null,

    @field:Json(name = "source")
    val source: Source? = null,

    @field:Json(name = "title")
    val title: String? = null,

    @field:Json(name = "url")
    val url: String? = null,

    @field:Json(name = "content")
    val content: String? = null,
) : Parcelable
