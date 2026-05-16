package com.example.sanmarcosstore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.sanmarcosstore.ui.navigation.AppNavigation
import com.example.sanmarcosstore.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme(dynamicColor = false) {
                AppNavigation()
            }
        }
    }
}