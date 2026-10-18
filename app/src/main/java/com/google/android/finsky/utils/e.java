package com.google.android.finsky.utils;

/* loaded from: classes.dex */
final class e implements com.android.volley.t<String> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4842a;

    e(String str) {
        this.f4842a = str;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(String str) {
        FinskyLog.d("URL[%s] was not redirected.", FinskyLog.a(this.f4842a));
    }
}
