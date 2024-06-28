package com.learn.muddle.ui.presentation.authentication.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.learn.muddle.R
import com.learn.muddle.ui.theme.MuddleTheme


@Composable
fun Login(navigateTo: (route: String) -> Unit) {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = R.drawable.splash_icon),
            contentDescription = "Logo",
            modifier = Modifier
                .width(100.dp)
                .height(150.dp)
                .align(Alignment.CenterHorizontally)
                .padding(top = 40.dp),
            alignment = Alignment.Center
        )
        Text(
            text = stringResource(id = R.string.app_name),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 5.dp)
            ,
            style = MaterialTheme.typography.titleLarge,
        )
        Text(text = stringResource(R.string.str_text_welcome_to_muddle),
            modifier = Modifier.padding(start = 10.dp, top = 20.dp),
            style = MaterialTheme.typography.titleMedium
        )
    //region Features Text
        Row( modifier = Modifier.padding(top = 20.dp), verticalAlignment = Alignment.CenterVertically) {

            Image(painter = painterResource(id = R.drawable.ic_right), contentDescription = "Right",
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = stringResource(R.string.str_feature_text), style = MaterialTheme.typography.titleSmall)

        }
        Row( modifier = Modifier.padding(top = 3.dp), verticalAlignment = Alignment.CenterVertically) {

            Image(painter = painterResource(id = R.drawable.ic_right), contentDescription = "Right",
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = stringResource(R.string.str_feature_text_first), style = MaterialTheme.typography.titleSmall)

        }
        Row( modifier = Modifier.padding(top = 3.dp), verticalAlignment = Alignment.CenterVertically) {

            Image(painter = painterResource(id = R.drawable.ic_right), contentDescription = "Right",
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = stringResource(R.string.str_feature_text_second), style = MaterialTheme.typography.titleSmall)

        }
        Row( modifier = Modifier.padding(top = 3.dp), verticalAlignment = Alignment.CenterVertically) {

            Image(painter = painterResource(id = R.drawable.ic_right), contentDescription = "Right",
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = stringResource(R.string.str_feature_text_third), style = MaterialTheme.typography.titleSmall)

        }
    //endregion


    }




}