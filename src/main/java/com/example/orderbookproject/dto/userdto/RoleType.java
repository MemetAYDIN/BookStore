package com.example.orderbookproject.dto.userdto;

/**
 * The enum Role type.
 */
public enum RoleType {

    /**
     * Admin role type.
     */
    ADMIN("ADMIN"),
    /**
     * User role type.
     */
    USER("USER");

    private final String value;

    /**
     * Role Type.
     *
     * @param value value
     */
    RoleType(String value) {
        this.value = value;
    }

    /**
     * Gets role type.
     *
     * @param val the val
     * @return the role type
     */
    public static RoleType getRoleType(String val) {
        RoleType[] var1 = values();
        int var2 = var1.length;

        for (int i = 0; i < var2; ++i) {
            RoleType type = var1[i];
            if (type.getValue().equals(val)) {
                return type;
            }
        }
        return null;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public String getValue() {
        return this.value;
    }
}
