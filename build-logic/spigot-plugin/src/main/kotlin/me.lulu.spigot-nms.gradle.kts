plugins {
    id("me.lulu.java-library")
}

dependencies {
    implementation(platform("me.lulu.platforms:products-platform"))
    implementation("me.lulu.pearlthrough.api:api")
}