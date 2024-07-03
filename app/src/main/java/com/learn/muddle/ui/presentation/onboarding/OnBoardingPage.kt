package com.learn.muddle.ui.presentation.onboarding

import androidx.annotation.DrawableRes
import com.learn.muddle.R

data class OnBoardingPage(
    val title: String,
    val description:String,
    @DrawableRes val image:Int
)
val onBoardingPages = listOf(

    OnBoardingPage(
        title = "Manage Goals",
        description = "Set your business strategy and achieve goals you are aiming for",
        image = R.drawable.onboarding_first
    ),
    OnBoardingPage(
        title = "Set a Schedule",
        description = "Organize your schedule quickly to make all your work organised",
        image = R.drawable.onboarding_second
    ),
    OnBoardingPage(
        title = "Assign your work",
        description = "Make your list easily and quickly facilitate your work.",
        image = R.drawable.onboarding_third
    )
)



