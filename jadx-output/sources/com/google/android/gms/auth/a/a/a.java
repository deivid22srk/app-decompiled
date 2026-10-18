package com.google.android.gms.auth.a.a;

/* loaded from: classes.dex */
public enum a {
    CLIENT_LOGIN_DISABLED("ClientLoginDisabled"),
    DEVICE_MANAGEMENT_REQUIRED("DeviceManagementRequiredOrSyncDisabled"),
    SOCKET_TIMEOUT("SocketTimeout"),
    SUCCESS("Ok"),
    UNKNOWN_ERROR("UNKNOWN_ERR"),
    NETWORK_ERROR("NetworkError"),
    SERVICE_UNAVAILABLE("ServiceUnavailable"),
    INTNERNAL_ERROR("InternalError"),
    BAD_AUTHENTICATION("BadAuthentication"),
    EMPTY_CONSUMER_PKG_OR_SIG("EmptyConsumerPackageOrSig"),
    NEEDS_2F("InvalidSecondFactor"),
    NEEDS_POST_SIGN_IN_FLOW("PostSignInFlowRequired"),
    NEEDS_BROWSER("NeedsBrowser"),
    UNKNOWN("Unknown"),
    NOT_VERIFIED("NotVerified"),
    TERMS_NOT_AGREED("TermsNotAgreed"),
    ACCOUNT_DISABLED("AccountDisabled"),
    CAPTCHA("CaptchaRequired"),
    ACCOUNT_DELETED("AccountDeleted"),
    SERVICE_DISABLED("ServiceDisabled"),
    NEED_PERMISSION("NeedPermission"),
    INVALID_SCOPE("INVALID_SCOPE"),
    USER_CANCEL("UserCancel"),
    PERMISSION_DENIED("PermissionDenied"),
    THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED("ThirdPartyDeviceManagementRequired"),
    DM_INTERNAL_ERROR("DeviceManagementInternalError"),
    DM_SYNC_DISABLED("DeviceManagementSyncDisabled"),
    DM_ADMIN_BLOCKED("DeviceManagementAdminBlocked"),
    DM_ADMIN_PENDING_APPROVAL("DeviceManagementAdminPendingApproval"),
    DM_STALE_SYNC_REQUIRED("DeviceManagementStaleSyncRequired"),
    DM_DEACTIVATED("DeviceManagementDeactivated"),
    DM_REQUIRED("DeviceManagementRequired"),
    ALREADY_HAS_GMAIL("ALREADY_HAS_GMAIL"),
    BAD_PASSWORD("WeakPassword"),
    BAD_REQUEST("BadRequest"),
    BAD_USERNAME("BadUsername"),
    DELETED_GMAIL("DeletedGmail"),
    EXISTING_USERNAME("ExistingUsername"),
    LOGIN_FAIL("LoginFail"),
    NOT_LOGGED_IN("NotLoggedIn"),
    NO_GMAIL("NoGmail"),
    REQUEST_DENIED("RequestDenied"),
    SERVER_ERROR("ServerError"),
    USERNAME_UNAVAILABLE("UsernameUnavailable"),
    GPLUS_OTHER("GPlusOther"),
    GPLUS_NICKNAME("GPlusNickname"),
    GPLUS_INVALID_CHAR("GPlusInvalidChar"),
    GPLUS_INTERSTITIAL("GPlusInterstitial"),
    GPLUS_PROFILE_ERROR("ProfileUpgradeError");

    private final String X;

    a(String str) {
        this.X = str;
    }

    public static final a a(String str) {
        a aVar = null;
        a[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            a aVar2 = values[i];
            if (!aVar2.X.equals(str)) {
                aVar2 = aVar;
            }
            i++;
            aVar = aVar2;
        }
        return aVar;
    }

    public static boolean b(a aVar) {
        return NETWORK_ERROR.equals(aVar) || SERVICE_UNAVAILABLE.equals(aVar);
    }

    public static boolean a(a aVar) {
        if (!BAD_AUTHENTICATION.equals(aVar) && !CAPTCHA.equals(aVar) && !NEED_PERMISSION.equals(aVar) && !NEEDS_BROWSER.equals(aVar) && !USER_CANCEL.equals(aVar) && !THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(aVar)) {
            if (!(DEVICE_MANAGEMENT_REQUIRED.equals(aVar) || DM_INTERNAL_ERROR.equals(aVar) || DM_SYNC_DISABLED.equals(aVar) || DM_ADMIN_BLOCKED.equals(aVar) || DM_ADMIN_PENDING_APPROVAL.equals(aVar) || DM_STALE_SYNC_REQUIRED.equals(aVar) || DM_DEACTIVATED.equals(aVar) || DM_REQUIRED.equals(aVar))) {
                return false;
            }
        }
        return true;
    }
}
