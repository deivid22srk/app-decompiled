package com.google.android.gms.internal;

import android.content.Intent;

/* loaded from: classes.dex */
public class zza extends zzr {
    private Intent c;

    public zza() {
    }

    public zza(gy gyVar) {
        super(gyVar);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.c != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}
