package com.example.common.enums;

public enum StatusEnum {

    ACTIVE(1, "ACTIVE"),
    INACTIVE(2, "INACTIVE"),
    DELETE(3, "DELETE");

    private int code;
    private String content;

    public int getCode() {
        return code;
    }

    public String getContent() {
        return content;
    }

    StatusEnum(int code, String content) {
        this.code = code;
        this.content = content;
    }
}
