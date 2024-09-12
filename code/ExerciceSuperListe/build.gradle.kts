plugins {
    kotlin("jvm") version "2.0.10"
}

group = "org.ye"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    // https://mvnrepository.com/artifact/com.google.guava/guava
    // https://mvnrepository.com/artifact/org.magicwerk.brownies/brownies-collections
    implementation("org.magicwerk.brownies:brownies-collections:0.9.23")


}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}