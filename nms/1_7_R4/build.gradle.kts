plugins {
    id("me.lulu.spigot-nms")
}

dependencies {
    compileOnly(files("./libs/spigot-1.7.10-SNAPSHOT-b1657.jar"))
}

group = "${group}.nms"