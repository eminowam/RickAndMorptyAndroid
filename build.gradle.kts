// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://www.jitpack.io" ) }
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:8.1.0")
        classpath ("com.android.tools.build:gradle-api:7.2.2")
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.3")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:8.1.0")
    }
}