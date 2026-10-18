package com.android.volley.apkg;

import com.android.volley.VolleyError;

/* loaded from: classes.dex */
public final class aa implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f1198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f1199b;

    aa(z zVar, boolean z) {
        this.f1199b = zVar;
        this.f1198a = z;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        int i;
        int i2;
        i = this.f1199b.c;
        if (i != 0) {
            z zVar = this.f1199b;
            i2 = this.f1199b.c;
            zVar.setImageResource(i2);
        }
    }

    @Override // com.android.volley.apkg.u
    public final void a(t tVar, boolean z) {
        int i;
        int i2;
        if (z && this.f1198a) {
            this.f1199b.post(new ab(this, tVar));
            return;
        }
        if (tVar.f1224a == null) {
            i = this.f1199b.f1227b;
            if (i != 0) {
                z zVar = this.f1199b;
                i2 = this.f1199b.f1227b;
                zVar.setImageResource(i2);
                return;
            }
            return;
        }
        this.f1199b.setImageBitmap(tVar.f1224a);
    }
}
