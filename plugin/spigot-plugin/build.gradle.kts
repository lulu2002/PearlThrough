import dev.s7a.gradle.minecraft.server.tasks.LaunchMinecraftServerTask

plugins {
    id("me.lulu.spigot-plugin")
    id("me.lulu.lombok")
    id("dev.s7a.gradle.minecraft.server") version "3.0.0"
}

group = "me.lulu.pearlthrough"
version = "1.0.0"
java.sourceCompatibility = JavaVersion.VERSION_1_8

dependencies {
    implementation("me.lulu.pearlthrough.nms:1_7_R4")
    implementation("me.lulu.pearlthrough.nms:1_8_R3")
}

task<LaunchMinecraftServerTask>("testPlugin") {
    dependsOn("shadowJar")

    doFirst {
        copy {
            from(buildDir.resolve("libs/spigot-plugin-1.0.0-all.jar"))
            into(buildDir.resolve("MinecraftServer/plugins"))
        }
    }

    jarUrl.set("https://cdn.getbukkit.org/spigot/spigot-1.8.8-R0.1-SNAPSHOT-latest.jar")
    agreeEula.set(true)
}