package com.streakmacro.minecraftlauncher.domain.model

data class Account(
    val id: String,
    val username: String,
    val email: String,
    val accessToken: String,
    val refreshToken: String,
    val expiresAt: Long,
    val createdAt: Long
)