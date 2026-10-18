package com.android.volley;

/* loaded from: classes.dex */
public class VolleyError extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final k f1195b;
    public long c;

    public VolleyError() {
        this.f1195b = null;
    }

    public VolleyError(k kVar) {
        this.f1195b = kVar;
    }

    public VolleyError(String str) {
        super(str);
        this.f1195b = null;
    }

    public VolleyError(String str, Throwable th) {
        super(str, th);
        this.f1195b = null;
    }

    public VolleyError(Throwable th) {
        super(th);
        this.f1195b = null;
    }
}
