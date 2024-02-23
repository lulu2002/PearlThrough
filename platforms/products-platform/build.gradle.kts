plugins {
    id("java-platform")
}

group = "me.lulu.platforms"

// allow the definition of dependencies to other platforms like the Spring Boot BOM
javaPlatform.allowDependencies()

dependencies {
    constraints {
        api("org.spigotmc:spigot-api:1.8.8-R0.1-SNAPSHOT")
    }
}
