package de.samples.schulung;

import org.apache.maven.model.Dependency;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import java.util.List;

@Mojo(
        name = "dependency-counter",
        defaultPhase = LifecyclePhase.INITIALIZE
)
public class DependencyCounterMojo extends AbstractMojo {

    @Parameter(
            defaultValue = "${project}",
            required = true,
            readonly = true
    )
    MavenProject project;

    @Parameter(
            property = "scope"
    )
    String scope;

    @Override
    public void execute() /*throws MojoExecutionException, MojoFailureException*/ {
        getLog().info("Hello World!");
        getLog().info("Counting dependencies with scope " + (scope != null && !scope.isEmpty() ? scope : "(all scopes)"));
        final List<Dependency> dependencies = project.getDependencies();
        final long count = dependencies
                .stream()
                .filter(dep -> scope == null || scope.isEmpty() || scope.equals(dep.getScope()))
                .count();
        getLog().info("Number of dependencies: " + count);
    }

}