buildscript {

    extra["minSdkVersion"] = 14
    extra["compileSdkVersion"] = 29
    extra["targetSdkVersion"] = 29
    extra["kotlinVersion"] = "1.3.61"

    repositories {
        mavenCentral()
        google()
        jcenter()
    }

    dependencies {
        val kotlinVersion = property("kotlinVersion") as String
        classpath("com.android.tools.build:gradle:3.6.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("com.otaliastudios.tools:publisher:0.1.5")
    }
}

allprojects {
    repositories {
        mavenCentral()
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(buildDir)
}
