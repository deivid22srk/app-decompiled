package com.google.android.gms.internal;

/* loaded from: classes.dex */
public final class h extends aa<h> {
    private static volatile h[] c;

    /* renamed from: a, reason: collision with root package name */
    public String f6014a = "";

    /* renamed from: b, reason: collision with root package name */
    public i f6015b = null;

    public static h[] b() {
        if (c == null) {
            synchronized (ae.f5865a) {
                if (c == null) {
                    c = new h[0];
                }
            }
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.aa, com.google.android.gms.internal.af
    public final int a() {
        int a2 = super.a() + zzaic.b(1, this.f6014a);
        return this.f6015b != null ? a2 + zzaic.b(2, this.f6015b) : a2;
    }

    @Override // com.google.android.gms.internal.aa, com.google.android.gms.internal.af
    public final void a(zzaic zzaicVar) {
        zzaicVar.a(1, this.f6014a);
        if (this.f6015b != null) {
            zzaicVar.a(2, this.f6015b);
        }
        super.a(zzaicVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f6014a == null) {
            if (hVar.f6014a != null) {
                return false;
            }
        } else if (!this.f6014a.equals(hVar.f6014a)) {
            return false;
        }
        if (this.f6015b == null) {
            if (hVar.f6015b != null) {
                return false;
            }
        } else if (!this.f6015b.equals(hVar.f6015b)) {
            return false;
        }
        return (this.o == null || this.o.c()) ? hVar.o == null || hVar.o.c() : this.o.equals(hVar.o);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f6015b == null ? 0 : this.f6015b.hashCode()) + (((this.f6014a == null ? 0 : this.f6014a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
        if (this.o != null && !this.o.c()) {
            i = this.o.hashCode();
        }
        return hashCode + i;
    }

    public h() {
        this.o = null;
        this.p = -1;
    }

    @Override // com.google.android.gms.internal.af
    public final /* synthetic */ af a(z zVar) {
        while (true) {
            int a2 = zVar.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    this.f6014a = zVar.c();
                    break;
                case 18:
                    if (this.f6015b == null) {
                        this.f6015b = new i();
                    }
                    zVar.a(this.f6015b);
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
