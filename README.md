# Web APIs

This repository contains Java bindings of Web APIs that are used by Carte/CSS4J
projects.

<br/>

## Building from source

### Requirements

To build `web-apis` you need the following software installed:

- The [Git version control system](https://git-scm.com/downloads) is required to
obtain the sources. Any recent version should suffice.
- Java 11 or later. You can install it from your favourite package manager or by
downloading from [Adoptium](https://adoptium.net/).

<br/>

### Building with Gradle

Execute the build script with `gradlew build` to build. For example:

```shell
git clone https://github.com/css4j/web-apis.git
cd web-apis
./gradlew build
```
or just `gradlew build` (without the `./`) on a Windows command prompt.

<br/>

### Deploying to a Maven repository

Use:
- `gradlew build publishToMavenLocal` to install in your local Maven repository.
- `gradlew publish` to deploy to a (generally remote) Maven repository.

Before deploying to a remote Maven repository, please read the
`publishing.repositories.maven` block of
[web-apis.java-conventions.gradle](https://github.com/css4j/web-apis/blob/master/buildSrc/src/main/groovy/web-apis.java-conventions.gradle)
to learn which properties you need to set (like `mavenReleaseRepoUrl`or
`mavenRepoUsername`), either at the [command line](https://docs.gradle.org/current/userguide/build_environment.html#sec:project_properties)
(`-P` option) or your `GRADLE_USER_HOME/gradle.properties` file.

<br/>

## Usage from a Gradle project

If your Gradle project depends on any of the web-apis modules, you can use this
project's own Maven repository in a `repositories` section of your build file:
```groovy
repositories {
    maven {
        url "https://css4j.github.io/maven/"
        mavenContent {
            releasesOnly()
        }
        content {
            includeGroup 'io.sf.carte'
        }
    }
}
```
please use that repository **only** for the artifact groups that it supplies.

Then, in your `build.gradle` file you can list the dependencies, for example:
```groovy
dependencies {
    api "io.sf.carte:smil-api:1.0"
    api "io.sf.carte:svgom-api:1.0"
}
```

<br/>

##  Licensing

The source files and derived works are available under the "W3C Software and
Document Notice and License". Please read the [LICENSE.txt](LICENSE.txt) file
for details.
