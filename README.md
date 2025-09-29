# Web APIs

This repository contains Java bindings of Web APIs that are used by Carte/CSS4J
projects.

<br/>

## Why the Web APIs project?

[EchoSVG](https://github.com/css4j/echosvg) is a fork of Apache Batik, an SVG
toolkit in the Java language. Both projects require Java bindings based on old
versions of the SVG and SMIL DOM APIs.

Apache Batik uses the `xml-apis-ext-1.3.04.jar` package, which is unsuitable for
modular Java due to the fact that it also contains the SAC package which is found
in other packages.

This project offers separate packages for SVGOM and SMIL which aren't the exact
ones shipped by `xml-apis-ext-1.3.04` but are compatible with both EchoSVG and
Batik.

The code is based on old Java bindings downloaded from the W3C, and several
method signatures had to be modified so they matched the implementations in
EchoSVG/Batik. Although it would have been easy to upgrade EchoSVG instead, that
would have created problems in cases where both `xml-apis-ext-1.3.04.jar` and
`svgom-api` or `smil-api` were found in the classpath or modulepath (which is
conceivable if, for example, somebody is using EchoSVG and Apache FOP in the
same project).

<br/>

## Building from source

### Requirements

To build `web-apis` you need the following software installed:

- The [Git version control system](https://git-scm.com/downloads) is required to
obtain the sources. Any recent version should suffice.

- Java 11 to 21. You can install it from your favourite package manager or by
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
        url = "https://css4j.github.io/maven/"
        mavenContent {
            releasesOnly()
        }
        content {
            // Include io.sf.w3 as well as all the groups used by EchoSVG
            includeGroupByRegex 'io\\.sf\\..*'

            // Alternative to the regex:
            //includeGroup 'io.sf.carte'
            //includeGroup 'io.sf.w3'
        }
    }
}
```
please use that repository only for the artifact groups that it supplies.

Then, in your `build.gradle` file you can list the dependencies, for example:

```groovy
dependencies {
    api 'io.sf.carte:svgom-api:1.1.4'
}
```

If you use the packages provided by this project, you may need to exclude the
`xml-apis-ext` dependency in you Gradle or Maven build, for example:

```groovy
dependencies {
    api ('io.sf.carte:svgom-api:1.1.4') {
        exclude group: 'xml-apis', module: 'xml-apis-ext'
    }
}
```

<br/>

##  Licensing

The source files and derived works are available under the "W3C Software and
Document Notice and License". Please read the [LICENSE.txt](LICENSE.txt) file
for details.
