package com.example.beatrice

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform