package com.dam2.curepaw.data
import com.google.gson.annotations.SerializedName
data class NewsResponse(
    @SerializedName("status") var status:String,
    @SerializedName("totalResults") var totalResults:Int,
    @SerializedName("articles") var articles: List<Article>
)

data class Article(
    @SerializedName("author") var author: String,
    @SerializedName("title") var title: String,
    @SerializedName("description") var description: String,
    @SerializedName("content") var content: String,
    @SerializedName("url") var url: String,
    @SerializedName("urltoimage") var urltoimage: String
)
