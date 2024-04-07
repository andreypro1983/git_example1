package org.example;

public class User {
    private Long id;
    private String name;
    private Role role;
    public User(Long id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = Role.getRole(role);
    }
    @Override
    public String toString() {
        return "User: "
                + "id = " + id
                + " name = " + name
                + " role = " + role.name();
    }
    public enum Role {
        admin,
        user;
        public static Role getRole(String role) {
            for (Role r : Role.values()) {
                if (r.name().equals(role)) {
                    return r;
                }
            }
            return null;
        }
    }
}
