package cn.wps.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project


public class DynamicDependencyPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        if (project != project.rootProject) {
            throw new IllegalStateException("please apply plugin easy-dependency to root project")
        }
        // apply the maven publish plugin and dynamic dependency resolve plugin to all the sub projects
        //
        project.subprojects {
            it.plugins.apply(DependencyResolvePlugin)
        }
    }
}
