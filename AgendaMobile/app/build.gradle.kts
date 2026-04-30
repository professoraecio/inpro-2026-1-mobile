plugins {
    id("com.android.application")
}

android {
    namespace = "com.professoraecio.agendamobile"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.professoraecio.agendamobile"
        minSdk = 24
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
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.7.1")
    implementation("com.google.android.material:material:1.13.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.1")
    implementation(files("src\\main\\java\\com\\professoraecio\\agendamobile\\libs\\gson-2.8.8.jar"))
    implementation(files("src\\main\\java\\com\\professoraecio\\agendamobile\\libs\\okhttp-3.10.0.jar"))
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.3.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.7.0")

    //implementation("com.squareup.okhttp3:okhttp3:3.10.0")
    //implementation("com.google.code.gson:gson:2.8.8")
    implementation("com.squareup.okio:okio:3.4.0")
}