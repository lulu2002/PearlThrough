plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(platform("me.lulu.platforms:products-platform"))
    implementation(platform("me.lulu.platforms:plugins-platform"))
    implementation(project(":java-library"))
    implementation("gradle.plugin.com.github.johnrengelman:shadow")
}