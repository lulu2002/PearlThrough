dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
    }
}

includeBuild("../platforms")
includeBuild("../api")

rootProject.name = "build-logic"

include("java-library")
include("spigot-plugin")
include("common")
