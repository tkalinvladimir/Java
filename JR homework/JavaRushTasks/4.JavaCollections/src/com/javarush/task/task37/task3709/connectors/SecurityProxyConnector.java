package com.javarush.task.task37.task3709.connectors;

import com.javarush.task.task37.task3709.security.SecurityChecker;
import com.javarush.task.task37.task3709.security.SecurityCheckerImpl;

public class SecurityProxyConnector implements Connector{
    private SecurityChecker securityChecker;
    private  SimpleConnector simpleConnector;

    public SecurityProxyConnector(String s) {
        this.simpleConnector = new SimpleConnector(s);
        this.securityChecker = new SecurityCheckerImpl();
    }

    @Override
    public void connect() {
        if (securityChecker.performSecurityCheck()) {
        simpleConnector.connect();
        }

    }
}
