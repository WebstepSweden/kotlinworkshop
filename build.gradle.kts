plugins {
    id("org.jetbrains.kotlin.jvm").version("1.7.20")
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform { }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("ch.qos.logback:logback-classic:1.4.4")
    testImplementation("io.kotest:kotest-runner-junit5-jvm:5.5.4")
}

repositories {
    mavenCentral()
}
