plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.thechef"
    compileSdk = 34

    buildFeatures{
        viewBinding= true

    }

    defaultConfig {
        applicationId = "com.example.thechef"
        minSdk = 31
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation ("com.google.code.gson:gson:2.10.1")

    implementation ("com.github.bumptech.glide:glide:4.12.0")
    implementation ("com.google.android.gms:play-services-auth:20.2.0")
    implementation(libs.firebase.database)
    implementation(libs.firebase.storage)
    implementation(libs.recyclerview)
    annotationProcessor ("com.github.bumptech.glide:compiler:4.12.0")
    implementation(libs.material)
    implementation("de.hdodenhof:circleimageview:3.1.0")
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(libs.firebase.auth)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}