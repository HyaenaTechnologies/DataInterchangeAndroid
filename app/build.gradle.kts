plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
}

val androidxCompose: String = "1.7.2"
val androidxComposeCompiler: String = "1.5.15"
val androidxLifecycle: String = "2.8.6"
val androidxNavigation: String = "2.8.1"
val androidxTest: String = "1.6.1"
val androidxTestServices: String = "1.5.0"
val ioKtor: String = "2.3.12"
val jetBrainsKotlin: String = "2.0.21"
val orgJetBrainsKotlinXCoroutines: String = "1.9.0-RC.2"
val orgJetBrainsKotlinXSerialization: String = "1.7.1"

android {
    buildFeatures {
        buildConfig = true
        compose = true
    }

    buildToolsVersion = "35.0.0"

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    compileSdk = 35

    composeOptions {
        kotlinCompilerExtensionVersion = "$androidxComposeCompiler"
    }

    defaultConfig {
        applicationId = "dev.DataInterchange"
        minSdk = 26
        targetSdk = 35
        testInstrumentationRunner = "androidx.test.runner"
        versionCode = 1
        versionName = "1.0"

        vectorDrawables {
            useSupportLibrary = true
        }
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    namespace = "dev.DataInterchange"

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    ndkVersion = "28.0.12433566"
}

dependencies {
    // Android
    implementation("androidx.activity:activity-compose:1.9.3")
    implementation("androidx.compose.animation:animation:$androidxCompose")
    implementation("androidx.compose.compiler:compiler:$androidxComposeCompiler")
    implementation("androidx.compose.foundation:foundation:$androidxCompose")
    implementation("androidx.compose.material3:material3:1.3.1")
    implementation("androidx.compose.runtime:runtime:$androidxCompose")
    implementation("androidx.compose.ui:ui:$androidxCompose")
    implementation("androidx.compose.ui:ui-text-google-fonts:$androidxCompose")
    implementation("androidx.compose.ui:ui-tooling:$androidxCompose")
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")
    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.fragment:fragment-compose:1.8.5")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:$androidxLifecycle")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:$androidxLifecycle")
    implementation("androidx.navigation:navigation-common-ktx:$androidxNavigation")
    implementation("androidx.navigation:navigation-compose:$androidxNavigation")
    implementation("androidx.navigation:navigation-ui-ktx:$androidxNavigation")
    implementation("androidx.paging:paging-compose:3.3.2")
    // KTOR
    implementation("io.ktor:ktor-events:$ioKtor")
    implementation("io.ktor:ktor-http:$ioKtor")
    implementation("io.ktor:ktor-http-cio:$ioKtor")
    implementation("io.ktor:ktor-io:$ioKtor")
    implementation("io.ktor:ktor-network:$ioKtor")
    implementation("io.ktor:ktor-network-tls:$ioKtor")
    implementation("io.ktor:ktor-network-tls-certificates:$ioKtor")
    implementation("io.ktor:ktor-resources:$ioKtor")
    implementation("io.ktor:ktor-serialization:$ioKtor")
    implementation("io.ktor:ktor-serialization-kotlinx:$ioKtor")
    implementation("io.ktor:ktor-serialization-kotlinx-json:$ioKtor")
    implementation("io.ktor:ktor-utils:$ioKtor")
    implementation("io.ktor:ktor-websockets:$ioKtor")
    implementation("io.ktor:ktor-websocket-serialization:$ioKtor")
    // JetBrains
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$jetBrainsKotlin")
    implementation("org.jetbrains.kotlinx:kotlinx-collections-immutable:0.3.8")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$orgJetBrainsKotlinXCoroutines")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.6.1")
    implementation("org.jetbrains.kotlinx:kotlinx-io-core:0.5.4")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:$orgJetBrainsKotlinXSerialization")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$orgJetBrainsKotlinXSerialization")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json-io:$orgJetBrainsKotlinXSerialization")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-properties:$orgJetBrainsKotlinXSerialization")
    // Tests
    androidTestImplementation("androidx.compose.ui:ui-test:$androidxCompose")
    androidTestImplementation("androidx.navigation:navigation-testing:$androidxNavigation")
    androidTestImplementation("androidx.test:core-ktx:$androidxTest")
    androidTestImplementation("androidx.test:monitor:1.7.2")
    androidTestImplementation("androidx.test:orchestrator:$androidxTestServices")
    androidTestImplementation("androidx.test:rules:$androidxTest")
    androidTestImplementation("androidx.test:runner:$androidxTest")
    androidTestImplementation("androidx.test.services:storage:$androidxTestServices")
    androidTestImplementation("androidx.test.services:test-services:$androidxTestServices")
    androidTestImplementation("androidx.test.uiautomator:uiautomator:2.3.0")
    testImplementation("io.ktor:ktor-serialization-tests:$ioKtor")
    testImplementation("io.ktor:ktor-serialization-kotlinx-tests:$ioKtor")
    testImplementation("io.ktor:ktor-test-dispatcher:$ioKtor")
    testImplementation("org.jetbrains.kotlin:kotlin-test:$jetBrainsKotlin")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:$orgJetBrainsKotlinXCoroutines")
    testImplementation("org.jetbrains.kotlinx:lincheck:2.34")
}