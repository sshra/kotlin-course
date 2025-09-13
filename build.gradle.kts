plugins {
    kotlin("jvm") version "2.2.0"
}

group = "com.stimmax"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}