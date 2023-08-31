plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.ecommerce_app"
    compileSdk = 33

    buildFeatures{
        viewBinding = true
    }
    defaultConfig {
        applicationId = "com.example.ecommerce_app"
        minSdk = 23
        targetSdk = 33
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

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


//    tiny cart
    implementation ("com.github.hishd:TinyCart:1.0.1")
    /*For Material search bar*/
    implementation ("com.github.mancj:MaterialSearchBar:0.8.5")

    /*For roundedImage */
    implementation ("com.makeramen:roundedimageview:2.3.0")

    /*Carousel */
    implementation ("org.imaginativeworld.whynotimagecarousel:whynotimagecarousel:2.1.0")

    /*Glide*/
    implementation ("com.github.bumptech.glide:glide:4.15.1")
    /*Volley library*/
    implementation ("com.android.volley:volley:1.2.1")

    // Circle Indicator (To fix the xml preview "Missing classes" error)
    implementation ("me.relex:circleindicator:2.1.6")

    implementation ("com.github.delight-im:Android-AdvancedWebView:v3.2.1")

}