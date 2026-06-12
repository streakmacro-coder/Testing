package com.streakmacro.minecraftlauncher.domain.model

data class Mod(
    val id: String,
    val name: String,
    val version: String,
    val path: String,
    val type: ModType,
    val enabled: Boolean = true,
    val addedAt: Long
)

enum class ModType { MOD, RESOURCE_PACK, DATA_PACK, BEHAVIOR_PACK }