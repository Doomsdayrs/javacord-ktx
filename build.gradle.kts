plugins {
	kotlin("jvm") version ("1.3.72")
}

group = "com.github.doomsdayrs.lib"
version = "0.0.1"
description = "Collection of javacord extensions"

buildscript {
	repositories {
		mavenCentral()
	}
	dependencies {
		classpath(kotlin("gradle-plugin", version = "1.3.70"))
	}
}

dependencies {
	implementation(kotlin("stdlib"))
	implementation(kotlin("stdlib-jdk8"))

	// Kotlin
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.61")
	implementation("org.javacord:javacord-core:3.0.5")
	implementation("org.javacord:javacord:3.0.5")

	testImplementation("org.jetbrains.kotlin:kotlin-test:1.3.61")
}