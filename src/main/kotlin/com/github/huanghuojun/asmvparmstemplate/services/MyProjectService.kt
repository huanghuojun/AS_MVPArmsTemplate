package com.github.huanghuojun.asmvparmstemplate.services

import com.github.huanghuojun.asmvparmstemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
