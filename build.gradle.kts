plugins {
    `kotlin-dsl`
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform { }
}

dependencies {
    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.3.2")
}

repositories {
    jcenter()
}
