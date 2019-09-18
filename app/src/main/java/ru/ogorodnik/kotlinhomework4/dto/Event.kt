package ru.ogorodnik.kotlinhomework4.dto

class Event(
    id: Long,
    author: String,
    created: String,
    content: String,
    likes: Int = 0,
    likedByMe: Boolean = false,
    comments: Int = 0,
    commentedByMe: Boolean = false,
    shares: Int = 0,
    sharedByMe: Boolean = false,
    val address: String,
    val location: ru.ogorodnik.kotlinhomework4.dto.Location
): Post(id, author, created, content, likes, likedByMe, comments, commentedByMe, shares, sharedByMe)