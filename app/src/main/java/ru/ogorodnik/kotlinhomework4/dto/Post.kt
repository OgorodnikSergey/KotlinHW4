package ru.ogorodnik.kotlinhomework4.dto

open class Post(
    val id: Long,
    val author: String,
    val created: String,
    var content: String,
    var likes: Int = 0,
    var likedByMe: Boolean = false,
    var comments: Int = 0,
    var commentedByMe: Boolean = false,
    var shares: Int = 0,
    var sharedByMe: Boolean = false
)