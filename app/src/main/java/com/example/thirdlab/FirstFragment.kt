package com.example.thirdlab

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.google.gson.Gson


val newJson = """
    {
      "MatchNumber": 1,
      "RoundNumber": 1,
      "DateUtc": "2021-08-13 19:00:00Z",
      "Location": "Brentford Community Stadium",
      "HomeTeam": "Brentford",
      "AwayTeam": "Arsenal",
      "Group": null,
      "HomeTeamScore": 2,
      "AwayTeamScore": 0
    }
""".trimIndent()

var gson = Gson()
var mUser = gson.fromJson(newJson, Matches::class.java)




@Composable
fun FirstFragment(navController: NavHostController) {
    
    Scaffold(topBar = { TopBar() }, content = { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .background(Color(139, 115, 195, 255)),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //Text(text = "Очки ${mUser.HomeTeamScore} \n Очки ${mUser.AwayTeamScore} ")
            Text(text = "Match Number: ${mUser.MatchNumber.toString()} \n" +
                    "Round Number: ${mUser.RoundNumber.toString()}\n" +
                    "Date: ${mUser.DateUtc.toString()}\n" +
                    "Location: ${mUser.Location.toString()}\n" +
                    "Home Team: ${mUser.HomeTeam.toString()} and Score: ${mUser.HomeTeamScore.toString()}\n" +
                    "Away Team ${mUser.AwayTeam.toString()} and Score: ${mUser.AwayTeamScore.toString()}\n" +
                    "Group: ${mUser.Group.toString()}\n")
        }
    })

}