plugins {
    id("me.lulu.java-library")
}

dependencies {
    implementation(platform("me.lulu.platforms:products-platform"))
    compileOnly("org.spigotmc:spigot-api")
}