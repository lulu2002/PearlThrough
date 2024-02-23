plugins {
    java
    id("me.lulu.common")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

dependencies {
    testImplementation(platform("me.lulu.platforms:test-platform"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}