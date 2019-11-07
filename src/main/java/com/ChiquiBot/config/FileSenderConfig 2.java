package com.ChiquiBot.config;

import org.glassfish.jersey.server.ResourceConfig;

public class FileSenderConfig extends ResourceConfig {
    public FileSenderConfig(){
        register(new DependencyBinder());
        packages(true,"com.ChiquiBot");
    }

}
