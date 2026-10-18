package com.google.android.gms.auth;

import android.content.Intent;

/* loaded from: classes.dex */
public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException {

    /* renamed from: a, reason: collision with root package name */
    private final int f5363a;

    GooglePlayServicesAvailabilityException(int i, String str, Intent intent) {
        super(str, intent);
        this.f5363a = i;
    }
}
