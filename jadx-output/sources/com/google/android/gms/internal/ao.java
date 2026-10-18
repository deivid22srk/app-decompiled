package com.google.android.gms.internal;

/* loaded from: classes.dex */
public final class ao extends aa<ao> {
    private static volatile ao[] c;

    /* renamed from: a, reason: collision with root package name */
    public String f5878a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f5879b = "";

    public static ao[] b() {
        if (c == null) {
            synchronized (ae.f5865a) {
                if (c == null) {
                    c = new ao[0];
                }
            }
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.aa, com.google.android.gms.internal.af
    public final int a() {
        int a2 = super.a();
        if (!this.f5878a.equals("")) {
            a2 += zzaic.b(1, this.f5878a);
        }
        return !this.f5879b.equals("") ? a2 + zzaic.b(2, this.f5879b) : a2;
    }

    @Override // com.google.android.gms.internal.aa, com.google.android.gms.internal.af
    public final void a(zzaic zzaicVar) {
        if (!this.f5878a.equals("")) {
            zzaicVar.a(1, this.f5878a);
        }
        if (!this.f5879b.equals("")) {
            zzaicVar.a(2, this.f5879b);
        }
        super.a(zzaicVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        if (this.f5878a == null) {
            if (aoVar.f5878a != null) {
                return false;
            }
        } else if (!this.f5878a.equals(aoVar.f5878a)) {
            return false;
        }
        if (this.f5879b == null) {
            if (aoVar.f5879b != null) {
                return false;
            }
        } else if (!this.f5879b.equals(aoVar.f5879b)) {
            return false;
        }
        return (this.o == null || this.o.c()) ? aoVar.o == null || aoVar.o.c() : this.o.equals(aoVar.o);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f5879b == null ? 0 : this.f5879b.hashCode()) + (((this.f5878a == null ? 0 : this.f5878a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
        if (this.o != null && !this.o.c()) {
            i = this.o.hashCode();
        }
        return hashCode + i;
    }

    public ao() {
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
                    this.f5878a = zVar.c();
                    break;
                case 18:
                    this.f5879b = zVar.c();
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
