plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(platform("me.lulu.platforms:plugins-platform"))
    implementation(project(":common"))
    implementation("io.freefair.gradle:lombok-plugin")
}