package com.sharmaxz.interceptor;

import com.sharmaxz.model.Client;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session", proxyMode= ScopedProxyMode.TARGET_CLASS)
public class UserSession {

    Client client;

    public void addLoggedUser(Client client) {
        this.client = client;
    }

    public Client getLoggedUser() {
        return client;
    }

    public void removeLoggedUser() {
        this.client = null;
    }
}