package com.android.volley;

import android.content.Intent;

/* loaded from: classes.dex */
public class AuthFailureError extends VolleyError {

    /* renamed from: a, reason: collision with root package name */
    public Intent f1194a;

    public AuthFailureError() {
    }

    public AuthFailureError(Intent intent) {
        this.f1194a = intent;
    }

    public AuthFailureError(k kVar) {
        super(kVar);
    }

    public AuthFailureError(String str) {
        super(str);
    }

    public AuthFailureError(String str, Exception exc) {
        super(str, exc);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f1194a != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}
