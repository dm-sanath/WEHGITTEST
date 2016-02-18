package com.weh.camel.osgi.osgi;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.Main;

/**
 * A simple example router to show how to define the route with Java DSL
 *
 * @version 
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Allow this route to be run as an application
     */
    public static void main(String[] args) throws Exception {
        new Main().run(args);
    }

    public void configure() {
        // set up the transform bean
        MyTransform transform = new MyTransform();
        transform.setPrefix("JavaDSL");
        
        from("timer://myTimer?fixedRate=true&period=2000")
            .bean(transform, "transform")
            .to("log:ExampleRouter");        
    }

}
