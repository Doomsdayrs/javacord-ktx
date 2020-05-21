plugins {
    java
    maven
    kotlin("jvm") version "1.3.72"
}

group = "com.github.doomsdayrs.lib"
version = "0.1.1"

repositories {
    mavenCentral()
}

dependencies {
    // Kotlin
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.61")
    implementation("org.javacord:javacord-core:3.0.5")
    implementation("org.javacord:javacord:3.0.5")

    testImplementation("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}