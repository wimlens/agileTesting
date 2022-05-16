plugins {
    java
}
dependencies {
    testImplementation(platform("org.junit:junit-bom:5.8.2"))
    testImplementation(platform("io.cucumber:cucumber-bom:7.3.4"))

    testImplementation("io.cucumber:cucumber-java")
    testImplementation("io.cucumber:cucumber-junit-platform-engine")
    testImplementation("org.junit.platform:junit-platform-suite")
    testImplementation ("org.assertj:assertj-core:3.6.1")
}

repositories {
    mavenLocal()
    mavenCentral()
}

tasks.withType<Test> {
    useJUnitPlatform()
    // Work around. Gradle does not include enough information to disambiguate
    // between different examples and scenarios.
    systemProperty("cucumber.junit-platform.naming-strategy", "long")
}
