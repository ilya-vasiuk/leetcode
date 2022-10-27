plugins {
  kotlin("jvm").version("1.7.20")
  application
  jacoco
}

repositories {
  mavenCentral()
}

dependencies {
  implementation(platform(kotlin("bom")))
  implementation(kotlin("stdlib-jdk8"))

//  implementation("org.kordamp.gradle:jacoco-gradle-plugin:0.47.0")

  testImplementation("org.jetbrains.kotlin:kotlin-test")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

tasks.jacocoTestReport {
  reports {
    csv.required.set(true)
  }
}
