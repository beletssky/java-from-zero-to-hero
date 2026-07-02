package com.course.task14;

import java.util.Objects;

/**
 * Permission: пара (ресурс, действие).
 * equals/hashCode основаны на обоих полях, чтобы дубли корректно поглощались Set.
 */
public class Permission {

    private String resource;
    private String action;

    public Permission(String resource, String action) {
        // TODO: реализуй
        this.resource = resource;
        this.action = action;
    }

    public String getResource() {
        // TODO: реализуй
        return resource;
    }

    public String getAction() {
        // TODO: реализуй
        return action;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: реализуй
        if (this == o) return true;
        if (!(o instanceof Permission permission)) return false;
        return this.resource.equals(permission.resource)
                && this.action.equals(permission.action);
    }

    @Override
    public int hashCode() {
        // TODO: реализуй
        return Objects.hash(resource, action);
    }

    @Override
    public String toString() {
        // TODO: реализуй
        return "Permission{resource='" + resource + "', action='" + action + "'}";
    }
}
