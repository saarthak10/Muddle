package com.learn.muddle.presentation.onboarding

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.learn.muddle.ui.theme.MuddleTheme

@Composable
fun OnboardingScreen( event: (OnboardingEvent)-> Unit){
    Column( modifier = Modifier.fillMaxSize()) {

    }
}



@Preview(showBackground = true)
@Composable
fun OnboardingScreenPreview(){
    MuddleTheme {
        // OnboardingScreen()
    }
}