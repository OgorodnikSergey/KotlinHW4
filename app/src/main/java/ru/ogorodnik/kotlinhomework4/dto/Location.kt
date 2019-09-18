package ru.ogorodnik.kotlinhomework4.dto

// Делаю как в презентации из урока, слайд 51 "Собственный класс Location"
data class Location(val lat: Double, val lng: Double, val zoom: Int = 30) {
}