plugins {
    kotlin("jvm") version "1.2.30"
}

dependencies {
    compile(kotlin("stdlib"))
    testCompile("io.kotlintest:kotlintest:2.0.7")
}

repositories {
    jcenter()
}
