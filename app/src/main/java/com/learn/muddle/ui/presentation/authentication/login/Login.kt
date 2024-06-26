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
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.learn.muddle.R
import com.learn.muddle.ui.presentation.components.textfields.EmailTextField
import com.learn.muddle.ui.presentation.components.textfields.PasswordTextField


@Composable
fun Login(navigateTo: (route: String) -> Unit) {

    val userEmail = remember {
        mutableStateOf("")
    }

    val password = remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        //region Welcome
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
                .padding(top = 5.dp),
            style = MaterialTheme.typography.titleLarge,
        )
        Text(
            text = stringResource(R.string.str_text_welcome_to_muddle),
            modifier = Modifier.padding(start = 10.dp, top = 20.dp),
            style = MaterialTheme.typography.titleMedium
        )
        //endregion
        //region Features Text
        Row(
            modifier = Modifier.padding(top = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = R.drawable.ic_right), contentDescription = "Right",
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(
                text = stringResource(R.string.str_feature_text),
                style = MaterialTheme.typography.titleSmall
            )

        }
        Row(
            modifier = Modifier.padding(top = 3.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = R.drawable.ic_right), contentDescription = "Right",
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(
                text = stringResource(R.string.str_feature_text_first),
                style = MaterialTheme.typography.titleSmall
            )

        }
        Row(
            modifier = Modifier.padding(top = 3.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = R.drawable.ic_right), contentDescription = "Right",
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(
                text = stringResource(R.string.str_feature_text_second),
                style = MaterialTheme.typography.titleSmall
            )

        }
        Row(
            modifier = Modifier.padding(top = 3.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = R.drawable.ic_right), contentDescription = "Right",
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(
                text = stringResource(R.string.str_feature_text_third),
                style = MaterialTheme.typography.titleSmall
            )

        }
        //endregion

        //region Input fields
        Card(
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
                .shadow(elevation = 10.dp)


        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
                    .background(Color.White)
                    .padding(10.dp)

            ) {

                Spacer(modifier = Modifier.padding(15.dp))

                EmailTextField(
                    name = "Email",
                    placeHolder = "Enter Email",
                    value = userEmail.value,
                    onValueChange = { userEmail.value = it })

                Spacer(modifier = Modifier.padding(20.dp))
                PasswordTextField(
                    name = "Password",
                    placeHolder = "Enter Password",
                    value = password.value,
                    onValueChange = { password.value = it })

                Spacer(modifier = Modifier.padding(20.dp))
                Button(onClick = {
                // handle login click

                 },
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    shape = RoundedCornerShape(10.dp),
                ) {
                    Text(text = "Login", style = MaterialTheme.typography.titleMedium)
                }
            }


        }
        //endregion


    }


}