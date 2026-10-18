package com.google.android.finsky.installer;

import com.google.android.finsky.utils.ee;

/* loaded from: classes.dex */
final class aa implements ee {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f2855a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f2856b;

    aa(z zVar, t tVar) {
        this.f2856b = zVar;
        this.f2855a = tVar;
    }

    @Override // com.google.android.finsky.utils.ee
    public final void a() {
        b();
        this.f2855a.a();
    }

    @Override // com.google.android.finsky.utils.ee
    public final void a(int i, String str) {
        synchronized (this.f2856b) {
            b();
            this.f2855a.a(i, str);
        }
    }

    private void b() {
        synchronized (this.f2856b) {
            if (this.f2856b.f2881b != null) {
                this.f2856b.f2881b.delete();
                this.f2856b.f2881b = null;
            }
            if (this.f2856b.c != null) {
                this.f2856b.c = null;
            }
            this.f2856b.f2880a = null;
        }
    }
}
