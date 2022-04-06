package com.keycloak.duospi.provider;

import com.keycloak.duospi.authenticator.DuoAuthenticatorFactory;
import org.keycloak.Config;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.services.resource.RealmResourceProvider;
import org.keycloak.services.resource.RealmResourceProviderFactory;

public class DuoProviderFactory implements RealmResourceProviderFactory{
    @Override
    public String getId() {
        return DuoAuthenticatorFactory.PROVIDER_ID;
    }

    @Override
    public int order() {
        return 0;
    }

    @Override
    public RealmResourceProvider create(KeycloakSession keycloakSession) {
        return new DuoProvider(keycloakSession);
    }

    @Override
    public void init(Config.Scope scope) {
    }

    @Override
    public void postInit(KeycloakSessionFactory keycloakSessionFactory) {
    }

    @Override
    public void close() {
    }
}
