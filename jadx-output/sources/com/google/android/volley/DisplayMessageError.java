package com.google.android.volley;

import com.android.volley.VolleyError;

/* loaded from: classes.dex */
public abstract class DisplayMessageError extends VolleyError {

    /* renamed from: a, reason: collision with root package name */
    public String f7176a;

    public DisplayMessageError(String str) {
        this.f7176a = str;
    }

    public DisplayMessageError() {
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "DisplayErrorMessage[" + this.f7176a + "]";
    }
}
