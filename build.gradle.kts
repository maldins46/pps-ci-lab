plugins {
    kotlin("jvm") version "1.3.72"
    scala
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.scala-lang:scala-library:2.11.12")
}