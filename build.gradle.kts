plugins {
  kotlin("jvm").version("1.9.22")
  application
}

repositories {
  mavenCentral()
}

dependencies {
  implementation(platform(kotlin("bom")))

  testImplementation("org.jetbrains.kotlin:kotlin-test")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

kotlin {
  compilerOptions {
    languageVersion.set(org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_2_0)
    apiVersion.set(org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_2_0)
  }
}
