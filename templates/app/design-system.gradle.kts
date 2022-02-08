import org.apache.tools.ant.taskdefs.condition.Os

val dsSchemaTask = task<Exec>("dsSchema") {
    if (Os.isFamily(Os.FAMILY_WINDOWS)) {
        commandLine("./run-ds-shema.bat")
    } else {
        commandLine("./run-ds-shema.sh")
    }
}
dsSchemaTask.setProperty(Task.TASK_DESCRIPTION, "Runs DS Schema to generate DS Schema Components.")
dsSchemaTask.setProperty(Task.TASK_GROUP, "design system schema")
