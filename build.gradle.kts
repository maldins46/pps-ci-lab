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
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.3.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.3.1")
    testCompileOnly("junit:junit:4.12")
    testRuntimeOnly("org.junit.vintage:junit-vintage-engine:5.3.1")
}