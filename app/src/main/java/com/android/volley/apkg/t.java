package com.android.volley.apkg;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    Bitmap f1224a;

    /* renamed from: b, reason: collision with root package name */
    public final u f1225b;
    public final String c;
    public final /* synthetic */ n d;
    public final String e;

    public t(n nVar, Bitmap bitmap, String str, String str2, u uVar) {
        this.d = nVar;
        this.f1224a = bitmap;
        this.c = str;
        this.e = str2;
        this.f1225b = uVar;
    }

    public final void a() {
        if (this.f1225b != null) {
            r rVar = this.d.c.get(this.e);
            if (rVar != null) {
                if (rVar.a(this)) {
                    this.d.c.remove(this.e);
                    return;
                }
                return;
            }
            r rVar2 = this.d.d.get(this.e);
            if (rVar2 != null) {
                rVar2.a(this);
                if (rVar2.c.size() == 0) {
                    this.d.d.remove(this.e);
                }
            }
        }
    }
}
