package com.learn.muddle.presentation.onboarding

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.learn.muddle.ui.theme.MuddleTheme

@Composable
fun OnboardingScreen(){
    Column( modifier = Modifier.fillMaxSize()) {
        Text(text = "Hello")
        Text( text= "saarthak")
    }
}



@Preview(showBackground = true)
@Composable
fun OnboardingScreenPreview(){
    MuddleTheme {
        OnboardingScreen()
    }
}