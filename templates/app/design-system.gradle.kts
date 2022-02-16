import org.apache.tools.ant.taskdefs.condition.Os

task("dsSchema") {
    description = "Runs DS Schema to generate DS Schema Components."
    group = "design system schema"
    doLast {
        logger.info("Running Design System Schema...")
        logger.info("Step 1 - Fetching json schemas from repository")
        val tempDir = mkdir("temp")
        exec {
            workingDir(tempDir)
            commandLine("git", "clone", "--depth", "1", "{{inputs.url}}")
        }
        logger.info("Step 2 - Executing ds-schema")
        val dsSchemaCommand = "npx -q -p @zup-it/ds-schema-cli -p @zup-it/ds-schema-plugins -c ds-schema"
        exec {
            if (Os.isFamily(Os.FAMILY_WINDOWS)) {
                commandLine("cmd", "/c", dsSchemaCommand)
            } else {
                commandLine("sh", "-c", dsSchemaCommand)
            }
        }
        tempDir.deleteRecursively()
        logger.info("Finished Design System Schema")
    }
}