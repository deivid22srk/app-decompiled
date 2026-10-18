package com.google.android.gms.common;

import android.content.Intent;

/* loaded from: classes.dex */
public class UserRecoverableException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final Intent f5560b;

    public UserRecoverableException(String str, Intent intent) {
        super(str);
        this.f5560b = intent;
    }
}
