package org.example.spartaboard.entity;

public enum UserStatus {
    USER(Authority.USER), // 사용자 권한
    DISABLE(Authority.DISABLE),
    ADMIN(Authority.ADMIN); // 관리자 권한
    private final String authority;
    UserStatus(String authority) {
        this.authority = authority;
    }
    public String getAuthority() {
        return this.authority;
    }
    public static class Authority {
        public static final String USER = "ROLE_USER";
        public static final String DISABLE = "ROLE_DISABLE";
        public static final String ADMIN = "ROLE_ADMIN";
    }
}
