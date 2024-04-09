plugins {
    kotlin("jvm") version "1.6.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repostories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}