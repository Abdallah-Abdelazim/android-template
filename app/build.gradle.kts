plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.parcelize)
    alias(libs.plugins.navigation.safeargs)
    alias(libs.plugins.ksp)
    alias(libs.plugins.kotlin.kapt)
}

android {
    // TODO change to your package name (also rename package hierarchy in java folder
    namespace = "com.example.template"
    compileSdk = 34

    defaultConfig {
        // TODO change to your application ID
        applicationId = "com.example.template"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

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
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
    packaging {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
}

dependencies {

    // Core
    api(libs.core.ktx)
    api(libs.appcompat)
    api(libs.activity)
    api(libs.fragment)

    // UI
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.recyclerview)
    implementation(libs.cardview)

    // Coroutines
    api(libs.coroutines.android)

    // Navigation
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)

    // Koin DI
    api(libs.koin.android)

    // Lifecycle
    implementation(libs.viewmodel)

    // Room
    implementation(libs.room)
    ksp(libs.room.compiler)

    // Retrofit & Moshi
    implementation(libs.moshi)
    ksp(libs.moshi.codegen)
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.moshi)
    implementation(libs.retrofit.converter.scalars)
    implementation(platform(libs.okhttp.bom))
    implementation(libs.okhttp)
    implementation(libs.okhttp.logging.interceptor)

    // Chucker
    debugImplementation(libs.chucker.library)
    releaseImplementation(libs.chucker.stub)

    // Glide
    implementation(libs.glide)
    ksp(libs.glide.ksp)

    // Misc.
    api(libs.utilcodex)

    // Testing
    testImplementation(libs.junit)
    testImplementation(libs.mockito.core)
    testImplementation(libs.mockito.inline)
    testImplementation(libs.kluent.android)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.espresso.core)

}