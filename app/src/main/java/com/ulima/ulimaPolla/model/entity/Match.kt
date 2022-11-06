package com.ulima.ulimaPolla.model.entity

data class Match(
    val id: Int,
    val homeTeam: MatchTeam,
    val awayTeam : MatchTeam
)
