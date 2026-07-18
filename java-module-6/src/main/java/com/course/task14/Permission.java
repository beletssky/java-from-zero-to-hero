package com.course.task14;

/**
 * Permission: пара (ресурс, действие).
 * equals/hashCode основаны на обоих полях, чтобы дубли корректно поглощались Set.
 */
public class Permission {

  private String resource;
  private String action;

  public Permission(String resource, String action) {
    this.resource = resource;
    this.action = action;
  }

  public String getResource() {
    return resource;
  }

  public String getAction() {
    return action;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Permission that = (Permission) o;
    if (resource != null ? !resource.equals(that.resource) : that.resource != null) {
      return false;
    }
    return action != null ? action.equals(that.action) : that.action ==  null;
  }

  @Override
  public int hashCode() {
    int result = resource != null ? resource.hashCode() : 0;
    result = 31 * result + (action != null ? action.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Permission{resource='" + resource + "', action='" + action + "'}";
  }
}
