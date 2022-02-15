package com.github.falconsw.mytheme.services

import com.intellij.openapi.project.Project
import com.github.falconsw.mytheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
