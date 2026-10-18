package com.google.android.gms.internal;

/* loaded from: classes.dex */
public final class i extends aa<i> {
    private static volatile i[] c;

    /* renamed from: a, reason: collision with root package name */
    public int f6044a = 1;

    /* renamed from: b, reason: collision with root package name */
    public j f6045b = null;

    public static i[] b() {
        if (c == null) {
            synchronized (ae.f5865a) {
                if (c == null) {
                    c = new i[0];
                }
            }
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.aa, com.google.android.gms.internal.af
    public final int a() {
        int a2 = super.a() + zzaic.b(1, this.f6044a);
        return this.f6045b != null ? a2 + zzaic.b(2, this.f6045b) : a2;
    }

    @Override // com.google.android.gms.internal.aa, com.google.android.gms.internal.af
    public final void a(zzaic zzaicVar) {
        zzaicVar.a(1, this.f6044a);
        if (this.f6045b != null) {
            zzaicVar.a(2, this.f6045b);
        }
        super.a(zzaicVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f6044a != iVar.f6044a) {
            return false;
        }
        if (this.f6045b == null) {
            if (iVar.f6045b != null) {
                return false;
            }
        } else if (!this.f6045b.equals(iVar.f6045b)) {
            return false;
        }
        return (this.o == null || this.o.c()) ? iVar.o == null || iVar.o.c() : this.o.equals(iVar.o);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f6045b == null ? 0 : this.f6045b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.f6044a) * 31)) * 31;
        if (this.o != null && !this.o.c()) {
            i = this.o.hashCode();
        }
        return hashCode + i;
    }

    public i() {
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
                case 8:
                    int e = zVar.e();
                    switch (e) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            this.f6044a = e;
                            break;
                    }
                case 18:
                    if (this.f6045b == null) {
                        this.f6045b = new j();
                    }
                    zVar.a(this.f6045b);
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
