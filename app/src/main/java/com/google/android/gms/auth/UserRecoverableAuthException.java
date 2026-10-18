package com.google.android.gms.auth;

import android.content.Intent;

/* loaded from: classes.dex */
public class UserRecoverableAuthException extends GoogleAuthException {

    /* renamed from: a, reason: collision with root package name */
    private final Intent f5374a;

    public UserRecoverableAuthException(String str, Intent intent) {
        super(str);
        this.f5374a = intent;
    }
}
