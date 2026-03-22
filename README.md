# MultiLoader Template

[![Build](https://img.shields.io/github/actions/workflow/status/moritz-htk/MultiLoader-Template/build.yml)](https://github.com/moritz-htk/MultiLoader-Template/actions)

This project is a fork of [Jared's MultiLoader Template](https://github.com/jaredlll08/MultiLoader-Template) and has been adapted to work with [Neo Loom](https://github.com/RelativityMC/neo-loom) to make NeoForge support functional. Neo Loom is a fork of Fabric Loom that is compatible with NeoForge, so the overall setup remains very similar to Fabric Loom while also supporting NeoForge.

This project originally grew out of my own modding needs, while I was looking for an alternative to Architectury Loom. It was put together very quickly, so it is possible that not everything works exactly as expected. That said, I am still very open to improvements in the form of pull requests or other contributions.

This project provides a Gradle project template that can compile Minecraft mods for multiple modloaders using a common project for the sources. This project does not require any third party libraries or dependencies.

## Getting Started

### IntelliJ IDEA
This guide will show how to import the MultiLoader Template into IntelliJ IDEA.

1. Clone or download this repository to your computer.
2. Configure the project by setting the properties in the `gradle.properties` file. You will also need to change the `rootProject.name` property in `settings.gradle`; this should match the folder name of your project, or else IDEA may complain.
3. Open the template's root folder as a new project in IDEA. This is the folder that contains this README.md file and the gradlew executable.
4. Make sure your Gradle JVM and Project SDK are set to a valid **Java 25** installation. Then refresh the Gradle project in IDEA.
5. Open the Gradle tool window and run the project-specific client task for the loader you want to test, for example `:fabric:runClient` or `:neoforge:runClient`.
6. Assuming you were able to run the game in step 5, your workspace should now be set up.

### Eclipse
While it is possible to use this template in Eclipse it is not recommended. During the development of this template multiple critical bugs and quirks related to Eclipse were found at nearly every level of the required build tools. While we continue to work with these tools to report and resolve issues support for projects like these are not there yet. For now Eclipse is considered unsupported by this project. The development cycle for build tools is notoriously slow so there are no ETAs available.

## Development Guide
When using this template the majority of your mod should be developed in the `common` project. The `common` project is compiled against the vanilla game and is used to hold code shared between the different loader-specific versions of your mod. The `common` project has no knowledge or access to modloader-specific code, APIs, or concepts. Code that requires something from a specific loader must be done through the project that is specific to that loader, such as the `fabric` or `neoforge` projects.

Loader-specific projects such as `fabric` and `neoforge` are used to load the `common` project into the game. These projects also define code that is specific to that loader. Loader-specific projects can access all the code in the `common` project. It is important to remember that the `common` project cannot access code from loader-specific projects.

## Removing Platforms and Loaders
While this template has support for multiple modloaders, loaders may change over time and existing loaders may become less relevant.

Removing loader-specific projects is as easy as deleting the folder and removing the corresponding `include(...)` line from `settings.gradle`.
For example, if you wanted to remove support for `fabric`, you would follow these steps:

1. Delete the subproject folder. For example, delete `MultiLoader-Template/fabric`.
2. Remove the project from `settings.gradle`. For example, remove `include('fabric')`.

## Credits
- [Jared's MultiLoader Template](https://github.com/jaredlll08/MultiLoader-Template)
- [Neo Loom](https://github.com/RelativityMC/neo-loom)