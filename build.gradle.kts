plugins {
    id("org.jetbrains.kotlin.jvm").version("1.3.40")
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform { }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("ch.qos.logback:logback-classic:1.2.3")
    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.3.3")
}

repositories {
    jcenter()
}
