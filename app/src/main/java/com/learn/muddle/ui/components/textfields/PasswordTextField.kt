package com.learn.muddle.ui.components.textfields

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.room.util.TableInfo
import com.learn.muddle.R
import com.learn.muddle.core.utils.Utils
import com.learn.muddle.data.ErrorValueModel

@Composable
fun PasswordTextField(
    name: String,
    placeHolder: String,
    value: String,
    onValueChange: (String) -> ErrorValueModel,
) {
    var text by remember {
        mutableStateOf(value)
    }
    var errorCode by remember { mutableStateOf(0) }

    var errorMessage by remember { mutableStateOf("") }

    errorMessage = if (errorCode != 0 ){
        stringResource(id = errorCode)
    }else ""

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            value = value,
            onValueChange = {
                text = it
                onValueChange(it)
                errorCode = Utils.isValidPassword(it)
                println(errorCode)
                print("String Resource===>")
            },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedTextColor = Color.Black,
                unfocusedBorderColor = Color.LightGray,
                unfocusedLabelColor = Color.Gray,
                focusedLeadingIconColor = MaterialTheme.colorScheme.primary,
                errorLeadingIconColor = MaterialTheme.colorScheme.error

            ),
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_lock),
                    contentDescription = null,
                    modifier = Modifier
                        .width(20.dp)
                        .height(20.dp)
                )
            },
            shape = RoundedCornerShape(10.dp),
            label = { Text(text = name, style = MaterialTheme.typography.labelMedium) },
            placeholder = { placeHolder },
            textStyle = MaterialTheme.typography.labelMedium,
            visualTransformation = PasswordVisualTransformation(),
            isError = errorMessage.isNotEmpty() && errorMessage != "No error",

            )
        Spacer(modifier = Modifier.padding(5.dp))
        if (errorMessage.isNotEmpty() && errorMessage != "No error" ) {
            Log.d( "Error message", errorMessage)
            Text(
                text = errorMessage,
                color = MaterialTheme.colorScheme.error,
                style = MaterialTheme.typography.bodySmall
            )
        }else{

        }


}


@Preview
@Composable
fun PreviewPasswordTextField() {

    PasswordTextField(
        name = "Password",
        placeHolder = "Enter Password",
        value = "",
        onValueChange = {})

}


