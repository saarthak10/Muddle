package com.learn.muddle.ui.navigation

sealed class Screens( val route: String) {

    object OnboardingScreen :Screens("Onboarding")
    object LoginScreen: Screens("login")
    object SignUpScreen: Screens("signup")
}