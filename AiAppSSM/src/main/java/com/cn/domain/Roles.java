package com.cn.domain;

public class Roles {
    private Integer roleId;
    private String roleName;
    private String description;
    public Roles() {
    }
    public Roles(Integer roleId, String roleName, String description) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.description = description;
    }
    @Override
    public String toString() {
        return "Roles [roleId=" + roleId + ", roleName=" + roleName + ", description=" + description + "]";
    }
    public Integer getRoleId() {
        return roleId;
    }
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    public String getRoleName() {
        return roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
