package com.kd.mrgm.auth.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.kd.mrgm.R

@Composable
fun WelcomeScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = stringResource(id = R.string.logo),
            contentScale = ContentScale.Inside,
            modifier = modifier.fillMaxSize(),
        )
    }
}


@Preview(showBackground = true, widthDp = 320, heightDp = 640)
@Composable
fun WelcomeScreenPrev() {
    WelcomeScreen()
}