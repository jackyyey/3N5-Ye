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
    // https://mvnrepository.com/artifact/org.hibernate.validator/hibernate-validator
    implementation("org.hibernate.validator:hibernate-validator:8.0.1.Final")
    implementation("jakarta.validation:jakarta.validation-api:3.1.0")



}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}