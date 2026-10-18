package com.google.android.gms.internal;

/* loaded from: classes.dex */
public final class g extends aa<g> {

    /* renamed from: a, reason: collision with root package name */
    public h[] f5997a = h.b();

    @Override // com.google.android.gms.internal.aa, com.google.android.gms.internal.af
    protected final int a() {
        int a2 = super.a();
        if (this.f5997a != null && this.f5997a.length > 0) {
            for (int i = 0; i < this.f5997a.length; i++) {
                h hVar = this.f5997a[i];
                if (hVar != null) {
                    a2 += zzaic.b(1, hVar);
                }
            }
        }
        return a2;
    }

    @Override // com.google.android.gms.internal.aa, com.google.android.gms.internal.af
    public final void a(zzaic zzaicVar) {
        if (this.f5997a != null && this.f5997a.length > 0) {
            for (int i = 0; i < this.f5997a.length; i++) {
                h hVar = this.f5997a[i];
                if (hVar != null) {
                    zzaicVar.a(1, hVar);
                }
            }
        }
        super.a(zzaicVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (ae.a(this.f5997a, gVar.f5997a)) {
            return (this.o == null || this.o.c()) ? gVar.o == null || gVar.o.c() : this.o.equals(gVar.o);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.o == null || this.o.c()) ? 0 : this.o.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + ae.a(this.f5997a)) * 31);
    }

    public g() {
        this.o = null;
        this.p = -1;
    }

    public static g a(byte[] bArr) {
        return (g) af.a(new g(), bArr, bArr.length);
    }

    @Override // com.google.android.gms.internal.af
    public final /* synthetic */ af a(z zVar) {
        while (true) {
            int a2 = zVar.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    int b2 = ai.b(zVar, 10);
                    int length = this.f5997a == null ? 0 : this.f5997a.length;
                    h[] hVarArr = new h[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f5997a, 0, hVarArr, 0, length);
                    }
                    while (length < hVarArr.length - 1) {
                        hVarArr[length] = new h();
                        zVar.a(hVarArr[length]);
                        zVar.a();
                        length++;
                    }
                    hVarArr[length] = new h();
                    zVar.a(hVarArr[length]);
                    this.f5997a = hVarArr;
                    break;
                default:
                    if (!a(zVar, a2)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
