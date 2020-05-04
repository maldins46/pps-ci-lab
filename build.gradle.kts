plugins {
    kotlin("jvm") version "1.3.72"
    scala
    groovy
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.codehaus.groovy:groovy-all:2.4.15")
    implementation("org.scala-lang:scala-library:2.11.12")
}