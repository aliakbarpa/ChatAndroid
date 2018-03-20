# ChatAndroid
apply plugin: 'com.android.application'

android {
    compileSdkVersion 26
    defaultConfig {
        applicationId "com.crypto.aliakbarpammu.alichat"
        minSdkVersion 23
        targetSdkVersion 26
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
}

dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation 'com.android.support:appcompat-v7:26.1.0'
    implementation 'com.android.support.constraint:constraint-layout:1.0.2'
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'com.android.support.test:runner:1.0.1'
    androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.1'

    //add lib
    compile 'com.github.bhargavms:DotLoader:1.0.3'
    compile 'com.github.lguipeng:BubbleView:1.0.1'
    compile 'com.android.support:design:26.1.0'
    compile 'com.quickblox:quickblox-android-sdk-core:3.3.0'
    compile 'com.quickblox:quickblox-android-sdk-chat:3.3.0'
    compile 'com.amulyakhare:com.amulyakhare.textdrawable:1.0.1'
    testCompile 'junit:junit:4.12'
    //Add Library for circle menu
    compile 'com.github.Hitomis:CircleMenu:v1.1.0'
    compile 'com.quickblox:quickblox-android-sdk-content:3.3.0'
    compile 'com.squareup.picasso:picasso:2.5.2'
}
