pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Money Logger"
include(":app")
include(":data")
include(":domain")

//Core
include(":core:design_system")
include(":core:resources")

//Features
include(":features:overview:api")
include(":features:overview:impl")
include(":features:accounts:api")
include(":features:accounts:impl")
