package com.example.sweater.domain;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author Matvey
 */
public enum Role implements GrantedAuthority {
    USER;

    @Override
    public String getAuthority() {
        return name();
    }
}
