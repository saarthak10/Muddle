package com.learn.muddle.ui.presentation.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.learn.muddle.ui.navigation.Screens
import com.learn.muddle.ui.theme.MuddleTheme

@Composable
fun OnboardingScreen(navigateTo: (route:String)->Unit) {

    val onBoardingPages = onBoardingPages
    val currentPage = remember {
        mutableStateOf(0)
    }
    Column(modifier = Modifier.fillMaxSize()) {

        OnBoardingImageView(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            imageRes = onBoardingPages[currentPage.value].image
        )

        OnBoardingDetails(
            modifier = Modifier
                .weight(0.4f)
                .padding(16.dp),
            page = onBoardingPages[currentPage.value]

        )

        onBoardNavButton(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 8.dp, bottom = 8.dp),
            currentPage = currentPage.value,
            totalPages = onBoardingPages.size,
            onNextClicked = {
                currentPage.value++
            },
            navigateTo
        )

        TabSelector(pages = onBoardingPages, currentPage = currentPage.value) {

        }


    }
}

@Composable
fun OnBoardingImageView(modifier: Modifier, imageRes: Int) {

    Box(modifier = modifier) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Fit
        )
        Box(modifier = Modifier
            .fillMaxSize()
            .align(Alignment.BottomCenter)
            .graphicsLayer {
                alpha = 0.6f
            }
            .background(
                Brush.verticalGradient(
                    colorStops = arrayOf(
                        Pair(0.6f, Color.Transparent), Pair(1f, Color.Gray)
                    )
                )
            )
        )
    }

}


@Composable
fun OnBoardingDetails(modifier: Modifier, page: OnBoardingPage) {
    Column(
        modifier = modifier
    ) {

        Text(
            text = page.title,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = page.description,
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

    }


}

@Composable
fun onBoardNavButton(
    modifier: Modifier,
    currentPage: Int,
    totalPages: Int,
    onNextClicked: () -> Unit,
    navigateTo: (route: String) -> Unit
) {

    Button(onClick = {
        if (currentPage < totalPages - 1) {
            onNextClicked()
        } else {
            // handle Onboarding completion
            navigateTo(Screens.LoginScreen.route)
        }

    }, modifier = modifier) {
        Text(text = if (currentPage < totalPages - 1) "Next" else "Get Started")
    }
}


@Composable
fun TabSelector(pages: List<OnBoardingPage>, currentPage: Int, onTabSelected: (Int) -> Unit) {
    TabRow(
        selectedTabIndex = currentPage,
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primary)
    ) {
        onBoardingPages.forEachIndexed { index, _ ->
            Tab(
                selected = index == currentPage,
                onClick = { onTabSelected(index) },
                modifier = Modifier.padding(16.dp),
                content = {
                    Box(
                        modifier = Modifier
                            .size(8.dp)
                            .background(
                                color = if (index == currentPage) {
                                    MaterialTheme.colorScheme.onPrimary
                                } else {
                                    Color.LightGray
                                }, shape = RoundedCornerShape(4.dp)
                            )
                    ) {

                    }
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OnboardingScreenPreview() {
    MuddleTheme {
       //  OnboardingScreen()
    }
}