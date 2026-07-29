plugins {
    alias(libs.plugins.com.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.kapt) apply false
    alias(libs.plugins.kotlin.ksp) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.kotlin.parcelize) apply false
    alias(libs.plugins.kotlin.compose.compiler) apply false
    alias(libs.plugins.hilt.android) apply false
    alias(libs.plugins.com.squareup.wire) apply false

    alias(libs.plugins.com.autonomousapps.dependency.analysis)
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
