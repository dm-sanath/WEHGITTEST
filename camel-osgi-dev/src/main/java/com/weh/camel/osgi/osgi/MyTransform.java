package com.weh.camel.osgi.osgi;

import java.util.Date;

/**
 * @version 
 */
public class MyTransform  {
    private boolean verbose = true;
    private String prefix = "MyTransform";

    public Object transform(Object body) {
        String answer = prefix + " set body:  " + new Date();
        if (verbose) {
            System.out.println(">>>> " + answer);
        }
        System.out.println(">>>> " + answer);
        return answer;
    }

    public boolean isVerbose() {
        return verbose;
    }

    public void setVerbose(boolean verbose) {
        this.verbose = verbose;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
