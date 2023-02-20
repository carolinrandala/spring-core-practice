package org.sda.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // first thing to do when using configurations
@ComponentScan("org.sda.beans")
public class ApplicationConfiguration {

}
