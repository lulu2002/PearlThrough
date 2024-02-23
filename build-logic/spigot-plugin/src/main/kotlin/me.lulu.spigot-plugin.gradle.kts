plugins {
    id("me.lulu.java-library")
    id("com.github.johnrengelman.shadow")
}

dependencies {
    implementation(platform("me.lulu.platforms:products-platform"))
    implementation("me.lulu.pearlthrough.api:api")
    compileOnly("org.spigotmc:spigot-api")
}