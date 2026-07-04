package com.example.testingmyapi.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.ui.platform.LocalView
import androidx.compose.runtime.SideEffect
import androidx.core.view.WindowCompat
private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFFEF5350),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFF7F0000),
    onPrimaryContainer = Color(0xFFFFFFFF),

    secondary = Color(0xFFFF6B6B),
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFF4A0A1A),
    onSecondaryContainer = Color(0xFFFFFFFF),

    tertiary = Color(0xFFD32F2F),
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFF3E0A0A),
    onTertiaryContainer = Color(0xFFFFFFFF),

    background = Color(0xFF0D0D0D),
    onBackground = Color(0xFFFFFFFF),

    surface = Color(0xFF1A1A1A),
    onSurface = Color(0xFFFFFFFF),

    surfaceVariant = Color(0xFF2D2D2D),
    onSurfaceVariant = Color(0xFFB0B0B0),

    error = Color(0xFFEF5350),
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFF4A0A1A),
    onErrorContainer = Color(0xFFFFFFFF),

    inverseSurface = Color(0xFFE8E8E8),
    inverseOnSurface = Color(0xFF121212)
)
private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF1565C0),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFBBDEFB),
    onPrimaryContainer = Color(0xFF000000),

    secondary = Color(0xFF42A5F5),
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFE3F2FD),
    onSecondaryContainer = Color(0xFF000000),

    tertiary = Color(0xFF0D47A1),
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFBBDEFB),
    onTertiaryContainer = Color(0xFF000000),

    background = Color(0xFFF5F9FF),
    onBackground = Color(0xFF000000),

    surface = Color(0xFFFFFFFF),
    onSurface = Color(0xFF000000),

    surfaceVariant = Color(0xFFE8E8E8),
    onSurfaceVariant = Color(0xFF6B6B6B),

    error = Color(0xFFBA1A1A),
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFFFDAD6),
    onErrorContainer = Color(0xFF000000),

    inverseSurface = Color(0xFF1E1E1E),
    inverseOnSurface = Color(0xFFFFFFFF)
)

@Composable
fun CharacterAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as androidx.activity.ComponentActivity).window
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}