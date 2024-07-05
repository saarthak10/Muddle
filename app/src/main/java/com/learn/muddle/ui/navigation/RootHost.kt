package com.learn.muddle.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.learn.muddle.ui.presentation.authentication.login.Login
import com.learn.muddle.ui.presentation.authentication.signup.SignUp
import com.learn.muddle.ui.presentation.onboarding.OnboardingScreen

@Composable
fun RootHost(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.OnboardingScreen.route ){

        composable(route = Screens.OnboardingScreen.route){
            OnboardingScreen{
                navController.navigate(it)
            }
        }

        composable(route = Screens.LoginScreen.route){
            Login{
                navController.navigate(it)
            }
        }

        composable(Screens.SignUpScreen.route){
            SignUp{
                navController.navigate(it)
            }
        }

    }
}
