package br.com.tiburcio.security_project.model;

import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority {

    private String roleName;

    public Role(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String getAuthority() {
        return roleName;
    }
}
