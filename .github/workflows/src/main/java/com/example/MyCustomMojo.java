package com.example;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "mygoal", defaultPhase = LifecyclePhase.INSTALL)
public class MyCustomMojo extends AbstractMojo {
    public void execute() throws MojoExecutionException {
        getLog().info("Hello from my custom Maven plugin!");
    }
}
