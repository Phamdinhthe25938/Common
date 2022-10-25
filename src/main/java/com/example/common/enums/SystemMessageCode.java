package com.example.common.enums;

public enum SystemMessageCode {

    API_ERROR_UNKNOWN("E_CM_ERROR_UNKNOWN", "api.error.unknown"),
    API_INVALID_REQUEST_ARGUMENT("E_CM_INVALID_REQUEST_ARGUMENT",
        "api.error.invalid-request-argument"),
    API_SERVICE_DOWN("E_CM_SERVICE_DOWN", "api.error.service-down"),
    API_BAD_REQUEST("E_CM_BAD_REQUEST", "ms_e_cm_bad_request"),
    API_FILE_TOO_LARGE("E_CM_FILE_LARGE", "api.error.file-too-large"),

    AUTH_UNAUTHORIZED("100", "api.error.auth.unauthorized"),
    AUTH_BAD_CREDENTIAL("101", "api.error.auth.bad-credential"),
    AUTH_USERNAME_NOT_FOUND("102", "api.error.auth.username-not-found"),
    AUTH_EMAIL_NOT_FOUND("103", "api.error.auth.email-not-found"),
    AUTH_MOBILE_NOT_FOUND("104", "api.error.auth.mobile-not-found"),
    AUTH_INVALID_ACCOUNT_STATUS("105", "api.error.auth.invalid-account-status"),
    AUTH_NO_PERMISSION("106", "api.error.auth.no-permission"),
    AUTH_USERNAME_EXISTED("107", "api.error.auth.username-existed"),
    AUTH_EMAIL_EXISTED("108", "api.error.auth.email-existed"),
    AUTH_MOBILE_EXISTED("109", "api.error.auth.mobile-existed"),
    AUTH_WRONG_PASSWORD("110", "api.error.auth.wrong-password"),
    AUTH_USER_NOT_FOUND("111", "api.error.auth.user-not-found"),
    AUTH_VERIFY_TOKEN_NOT_FOUND("112", "api.error.auth.verify-token-not-found"),
    AUTH_DEVICE_NOT_FOUND("113", "api.error.auth.device-not-found"),
    AUTH_SESSION_NOT_FOUND("114", "api.error.auth.session-not-found"),
    AUTH_PERMISSION_NOT_FOUND("115", "api.error.auth.permission-not-found"),
    AUTH_ROLE_NOT_FOUND("116", "api.error.auth.role-not-found"),
    AUTH_ROLE_CODE_EXISTED("117", "api.error.auth.role-code-existed"),
    AUTH_ROLE_NAME_EXISTED("118", "api.error.auth.role-name-existed"),
    AUTH_VERIFY_TOKEN_EXPIRED("119", "api.error.auth.verify-token-expired"),
    AUTH_PASSWORD_EXPIRED("120", "api.error.auth.password-expired"),
    AUTH_CALL_SERVICE_FAIL("121", "api.error.auth.call-service-fail"),
    FACE_SEARCH_NOT_FOUND("300", "api.face.search.not-found"),

    // Common code response
    API_SUCCESS("S_CM_00", "ms_s_cm_00"),
    API_CREATE_SUCCESS("S_CM_01", "ms_s_cm_01"),
    API_UPDATE_SUCCESS("S_CM_02", "ms_s_cm_02"),
    API_DELETE_SUCCESS("S_CM_03", "ms_s_cm_03"),
    API_GET_SUCCESS("S_CM_04", "ms_s_cm_04"),
    API_DATA_INVALID("S_CM_05", "ms_s_cm_05"),

    API_TOKEN_NOT_EXISTS("E_CM_01", "ms_e_cm_01"),
    API_TOKEN_EXPIRED("E_CM_02", "ms_e_cm_02"),
    API_TOKEN_INVALID("E_CM_03", "ms_e_cm_03"),
    API_ACCOUNT_INVALID("E_CM_04", "ms_e_cm_04"),
    API_CONSTRUCTION_SITE_EXISTS("E_CM_05", "ms_e_cm_05"),
    API_NOT_EXISTS_IN_SYSTEM("E_CM_06", "ms_e_cm_06"),
    API_EXISTS_IN_SYSTEM("E_CM_07", "ms_e_cm_07"),
    API_ACCOUNT_DOESNT_HAVE_ANNY_CONSTRUCTION_SITE("E_CM_08", "ms_e_cm_08"),

    // Login code response
    ERROR_USERNAME_PASSWORD("E_010_01", "ms_e_010_01"),
    ERROR_ACCOUNT_INVALID("E_010_02", "ms_e_010_02"),
    ERROR_REFRESH_TOKEN_INVALID("E_010_03", "ms_e_010_03"),
    SUCCESS_LOGIN("S_010_01", "ms_s_010_01"),
    SUCCESS_LOGOUT("S_010_02", "ms_s_010_02"),
    SUCCESS_REFRESH_TOKEN("S_010_03", "ms_s_010_03"),

    // Driver code response
    ERROR_TYPE_EXISTS_IN_SYSTEM("E_020_01", "ms_e_020_01");


    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    SystemMessageCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
