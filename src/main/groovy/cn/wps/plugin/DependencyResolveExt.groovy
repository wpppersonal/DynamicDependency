package cn.wps.plugin;

public class DependencyResolveExt {

    final String name

    DependencyResolveExt(String name) {
        this.name = name
    }

    boolean debuggable = true
    /**
     * the aar dependency config part of groupId
     */
    String groupId
    /**
     * the aar dependency config part of artifactId
     */
    String artifactId
    /**
     * the aar dependency config part of version
     */
    String version
}
