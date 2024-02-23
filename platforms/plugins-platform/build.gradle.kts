plugins {
    id("java-platform")
}

group = "me.lulu.platforms"

// allow the definition of dependencies to other platforms like the Spring Boot BOM
javaPlatform.allowDependencies()

dependencies {
    constraints {
        api("io.freefair.gradle:lombok-plugin:5.3.0")
        api("gradle.plugin.com.github.johnrengelman:shadow:7.1.2")
    }
}
