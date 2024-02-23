plugins {
    id("me.lulu.spigot-nms")
}

dependencies {
    compileOnly(files("./libs/spigot-1.8.8-R0.1-SNAPSHOT-latest.jar"))
}

group = "${group}.nms"