package com.example.thirdlab

data class Matches(
    val AwayTeam: String,
    val AwayTeamScore: Int,
    val DateUtc: String,
    val Group: Any,
    val HomeTeam: String,
    val HomeTeamScore: Int,
    val Location: String,
    val MatchNumber: Int,
    val RoundNumber: Int
)