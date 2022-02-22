val beagleVersion: String by project

dependencies {
    implementation("br.com.zup.beagle:beagle-spring-starter:$beagleVersion")
}

{% if inputs.configure_design_system %}
apply(from = "design-system.gradle.kts")
{% endif %}
