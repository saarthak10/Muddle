package com.learn.muddle.ui.components.textfields

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.unit.dp
import com.learn.muddle.R

@Composable
fun CommonTextField(
    name: String,
    placeHolder: String,
    value: String,
    onValueChange: (String) -> Unit
) {

    var text by remember {
        mutableStateOf(value)
    }

    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
        value = text,
        onValueChange = {
            text = it
            onValueChange(it)
        },
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedTextColor = Color.Black,
            unfocusedBorderColor = Color.LightGray,
            unfocusedLabelColor = Color.Gray,
            focusedLeadingIconColor = MaterialTheme.colorScheme.primary
        ),
        leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_user),
                contentDescription = null,
                modifier = Modifier
                    .width(20.dp)
                    .height(20.dp)
            )
        },
        shape = RoundedCornerShape(10.dp),
        placeholder = {placeHolder},
        textStyle = MaterialTheme.typography.labelMedium,
        label = { Text(text = name, style = MaterialTheme.typography.labelMedium) },


        )


}