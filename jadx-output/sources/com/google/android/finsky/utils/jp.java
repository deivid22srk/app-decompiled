package com.google.android.finsky.utils;

/* loaded from: classes.dex */
final class jp implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ jq f5038a;

    jp(jq jqVar) {
        this.f5038a = jqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Boolean bool;
        jq jqVar = this.f5038a;
        bool = jo.f5036a;
        jqVar.a(bool.booleanValue());
    }
}
