package com.learn.muddle.ui.presentation.authentication.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.learn.muddle.R
import com.learn.muddle.data.ErrorValueModel
import com.learn.muddle.ui.components.textfields.CommonTextField
import com.learn.muddle.ui.components.textfields.EmailTextField
import com.learn.muddle.ui.components.textfields.PasswordTextField
import com.learn.muddle.ui.navigation.Screens


@Composable
fun Login(navigateTo: (route: String) -> Unit) {

    val userName = remember {
        mutableStateOf("")
    }
    val userEmail = remember {
        mutableStateOf("")
    }

    val password = remember {
        mutableStateOf("")
    }

    val annotatedStringSignUp = buildAnnotatedString {
        append("Already have an account?")
        pushStringAnnotation(tag = "SignUp", annotation = "SignUp")
        withStyle(style = SpanStyle(color = Color.Blue)) {
            append(" Sign Up")
        }
        pop()
    }

    val annotatedStringForgotPassword = buildAnnotatedString {

        append("Forgot Password?")
        pushStringAnnotation(tag = "ForgotPassword", annotation = "ForgotPassword")
        withStyle(style = SpanStyle(Color.Blue)) {
            append(" Click here")
        }
        pop()
    }

    Column(
        modifier = Modifier.fillMaxSize()
            .verticalScroll(rememberScrollState())

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
                .fillMaxSize()
                .shadow(elevation = 10.dp)
                .fillMaxHeight()
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .align(Alignment.CenterHorizontally)
                    .background(Color.White)
                    .padding(20.dp)

            ) {
                
                Text(
                    text = stringResource(R.string.str_lable_login_signup),
                    modifier = Modifier.padding(top = 5.dp),
                    style = MaterialTheme.typography.titleMedium
                )

                Spacer(modifier = Modifier.padding(15.dp))
                CommonTextField(
                    name = "Username",
                    placeHolder = "Enter Username (optional)",
                    value = userName.value,
                    onValueChange = {userName.value = it}
                )

                Spacer(modifier = Modifier.padding(10.dp))

                EmailTextField(
                    name = "Email",
                    placeHolder = "Enter Email",
                    value = userEmail.value,
                    onValueChange = { userEmail.value = it })

                Spacer(modifier = Modifier.padding(10.dp))
                PasswordTextField(
                    name = "Password",
                    placeHolder = "Enter Password",
                    value = password.value,
                    onValueChange = { ErrorValueModel(value = it, error = "") },

                    )

                Spacer(modifier = Modifier.padding(12.dp))
                Button(
                    onClick = {
                        // handle login click

                    },
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    shape = RoundedCornerShape(10.dp),
                ) {
                    Text(text = "Login", style = MaterialTheme.typography.titleMedium)
                }
                Spacer(modifier = Modifier.padding(8.dp))

                ClickableText(
                    text = annotatedStringForgotPassword,
                    onClick = { offset ->
                        annotatedStringSignUp.getStringAnnotations(
                            tag = "ForgotPassword",
                            start = offset,
                            end = offset
                        )
                            .firstOrNull()?.let {
                                // navigateTo(Screens.SignUpScreen.route)
                            }
                    },
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 16.sp
                    ),
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.padding(3.dp))

            }


        }
        //endregion


    }


}