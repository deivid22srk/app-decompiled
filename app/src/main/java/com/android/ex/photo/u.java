package com.android.ex.photo;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.ay;

/* loaded from: classes.dex */
final class u implements ay<com.android.ex.photo.cpkg.c> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f1172a;

    private u(k kVar) {
        this.f1172a = kVar;
    }

    /* synthetic */ u(k kVar, byte b2) {
        this(kVar);
    }

    @Override // android.support.v4.app.ay
    public final /* synthetic */ void a(android.support.v4.b.n<com.android.ex.photo.cpkg.c> nVar, com.android.ex.photo.cpkg.c cVar) {
        Drawable a2 = cVar.a(this.f1172a.c.getResources());
        a j = this.f1172a.c.j();
        switch (nVar.n) {
            case 1:
                if (a2 == null) {
                    j.a((Drawable) null);
                    break;
                } else {
                    j.a(a2);
                    break;
                }
            case 2:
                k.a(this.f1172a, a2);
                break;
        }
    }

    @Override // android.support.v4.app.ay
    public final android.support.v4.b.n<com.android.ex.photo.cpkg.c> a(int i, Bundle bundle) {
        String string = bundle.getString("image_uri");
        switch (i) {
            case 1:
                return this.f1172a.a(1, string);
            case 2:
                return this.f1172a.a(2, string);
            default:
                return null;
        }
    }

    @Override // android.support.v4.app.ay
    public final void b() {
    }
}
