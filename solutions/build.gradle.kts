plugins {
  kotlin("jvm").version("1.7.20")
  application
}

repositories {
  mavenCentral()
}

dependencies {
  implementation(platform(kotlin("bom")))
  implementation(kotlin("stdlib-jdk8"))

  testImplementation("org.jetbrains.kotlin:kotlin-test")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}
