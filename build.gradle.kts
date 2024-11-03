plugins {
    val comAndroid = "8.7.2"
    val orgJetBrainsKotlin = "2.0.21"

    id("com.android.application") version "$comAndroid" apply false
    id("com.android.library") version "$comAndroid" apply false
    id("io.ktor.plugin") version "2.3.12" apply false
    id("org.jetbrains.kotlin.android") version "$orgJetBrainsKotlin" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "$orgJetBrainsKotlin" apply false
}