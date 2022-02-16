val beagleVersion: String by project

dependencies {
    implementation("br.com.zup.beagle:beagle-spring-starter:$beagleVersion")
}

apply(from = "design-system.gradle.kts")
