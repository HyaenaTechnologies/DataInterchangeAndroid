package dev.DataInterchange.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import dev.DataInterchange.R

// Font Provider
val provider: GoogleFont.Provider = GoogleFont.Provider(
    certificates = R.array.com_google_android_gms_fonts_certs,
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms"
)

// Body Font Family
val bodyFontFamily: FontFamily = FontFamily(
    Font(
        fontProvider = provider,
        googleFont = GoogleFont("Red Hat Display"),
    )
)

// Title Font Family
val titleFontFamily: FontFamily = FontFamily(
    Font(
        fontProvider = provider,
        googleFont = GoogleFont("JetBrains Mono"),
    )
)

// Baseline Typography
val baseline: Typography = Typography()

// Calculate Engine Typography
val calculateEngineTypography: Typography = Typography(
    displayLarge = baseline.displayLarge.copy(fontFamily = titleFontFamily),
    displayMedium = baseline.displayMedium.copy(fontFamily = titleFontFamily),
    displaySmall = baseline.displaySmall.copy(fontFamily = titleFontFamily),
    headlineLarge = baseline.headlineLarge.copy(fontFamily = titleFontFamily),
    headlineMedium = baseline.headlineMedium.copy(fontFamily = titleFontFamily),
    headlineSmall = baseline.headlineSmall.copy(fontFamily = titleFontFamily),
    titleLarge = baseline.titleLarge.copy(fontFamily = titleFontFamily),
    titleMedium = baseline.titleMedium.copy(fontFamily = titleFontFamily),
    titleSmall = baseline.titleSmall.copy(fontFamily = titleFontFamily),
    bodyLarge = baseline.bodyLarge.copy(fontFamily = bodyFontFamily),
    bodyMedium = baseline.bodyMedium.copy(fontFamily = bodyFontFamily),
    bodySmall = baseline.bodySmall.copy(fontFamily = bodyFontFamily),
    labelLarge = baseline.labelLarge.copy(fontFamily = bodyFontFamily),
    labelMedium = baseline.labelMedium.copy(fontFamily = bodyFontFamily),
    labelSmall = baseline.labelSmall.copy(fontFamily = bodyFontFamily),
)
