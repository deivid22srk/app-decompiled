package com.google.android.gms.internal;

/* loaded from: classes.dex */
public final class op extends af {
    private static volatile op[] f;

    /* renamed from: a, reason: collision with root package name */
    public Long f6213a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f6214b = null;
    public String c = null;
    public Long d = null;
    public Float e = null;

    public static op[] b() {
        if (f == null) {
            synchronized (ae.f5865a) {
                if (f == null) {
                    f = new op[0];
                }
            }
        }
        return f;
    }

    @Override // com.google.android.gms.internal.af
    public final void a(zzaic zzaicVar) {
        if (this.f6213a != null) {
            zzaicVar.a(1, this.f6213a.longValue());
        }
        if (this.f6214b != null) {
            zzaicVar.a(2, this.f6214b);
        }
        if (this.c != null) {
            zzaicVar.a(3, this.c);
        }
        if (this.d != null) {
            zzaicVar.a(4, this.d.longValue());
        }
        if (this.e != null) {
            zzaicVar.a(5, this.e.floatValue());
        }
        super.a(zzaicVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof op)) {
            return false;
        }
        op opVar = (op) obj;
        if (this.f6213a == null) {
            if (opVar.f6213a != null) {
                return false;
            }
        } else if (!this.f6213a.equals(opVar.f6213a)) {
            return false;
        }
        if (this.f6214b == null) {
            if (opVar.f6214b != null) {
                return false;
            }
        } else if (!this.f6214b.equals(opVar.f6214b)) {
            return false;
        }
        if (this.c == null) {
            if (opVar.c != null) {
                return false;
            }
        } else if (!this.c.equals(opVar.c)) {
            return false;
        }
        if (this.d == null) {
            if (opVar.d != null) {
                return false;
            }
        } else if (!this.d.equals(opVar.d)) {
            return false;
        }
        return this.e == null ? opVar.e == null : this.e.equals(opVar.e);
    }

    public final int hashCode() {
        return (((this.d == null ? 0 : this.d.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + (((this.f6214b == null ? 0 : this.f6214b.hashCode()) + (((this.f6213a == null ? 0 : this.f6213a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31) + (this.e != null ? this.e.hashCode() : 0);
    }

    public op() {
        this.p = -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.af
    public final int a() {
        int a2 = super.a();
        if (this.f6213a != null) {
            a2 += zzaic.b(1, this.f6213a.longValue());
        }
        if (this.f6214b != null) {
            a2 += zzaic.b(2, this.f6214b);
        }
        if (this.c != null) {
            a2 += zzaic.b(3, this.c);
        }
        if (this.d != null) {
            a2 += zzaic.b(4, this.d.longValue());
        }
        if (this.e == null) {
            return a2;
        }
        this.e.floatValue();
        return a2 + zzaic.b(5) + 4;
    }

    @Override // com.google.android.gms.internal.af
    public final /* synthetic */ af a(z zVar) {
        while (true) {
            int a2 = zVar.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    this.f6213a = Long.valueOf(zVar.f());
                    break;
                case 18:
                    this.f6214b = zVar.c();
                    break;
                case 26:
                    this.c = zVar.c();
                    break;
                case 32:
                    this.d = Long.valueOf(zVar.f());
                    break;
                case 45:
                    this.e = Float.valueOf(Float.intBitsToFloat(zVar.g()));
                    break;
                default:
                    if (!ai.a(zVar, a2)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
