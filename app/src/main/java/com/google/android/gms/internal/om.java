package com.google.android.gms.internal;

/* loaded from: classes.dex */
public final class om extends af {
    private static volatile om[] e;

    /* renamed from: a, reason: collision with root package name */
    public String f6208a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f6209b = null;
    public Long c = null;
    public Float d = null;

    public static om[] b() {
        if (e == null) {
            synchronized (ae.f5865a) {
                if (e == null) {
                    e = new om[0];
                }
            }
        }
        return e;
    }

    @Override // com.google.android.gms.internal.af
    public final void a(zzaic zzaicVar) {
        if (this.f6208a != null) {
            zzaicVar.a(1, this.f6208a);
        }
        if (this.f6209b != null) {
            zzaicVar.a(2, this.f6209b);
        }
        if (this.c != null) {
            zzaicVar.a(3, this.c.longValue());
        }
        if (this.d != null) {
            zzaicVar.a(4, this.d.floatValue());
        }
        super.a(zzaicVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof om)) {
            return false;
        }
        om omVar = (om) obj;
        if (this.f6208a == null) {
            if (omVar.f6208a != null) {
                return false;
            }
        } else if (!this.f6208a.equals(omVar.f6208a)) {
            return false;
        }
        if (this.f6209b == null) {
            if (omVar.f6209b != null) {
                return false;
            }
        } else if (!this.f6209b.equals(omVar.f6209b)) {
            return false;
        }
        if (this.c == null) {
            if (omVar.c != null) {
                return false;
            }
        } else if (!this.c.equals(omVar.c)) {
            return false;
        }
        return this.d == null ? omVar.d == null : this.d.equals(omVar.d);
    }

    public final int hashCode() {
        return (((this.c == null ? 0 : this.c.hashCode()) + (((this.f6209b == null ? 0 : this.f6209b.hashCode()) + (((this.f6208a == null ? 0 : this.f6208a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31) + (this.d != null ? this.d.hashCode() : 0);
    }

    public om() {
        this.p = -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.af
    public final int a() {
        int a2 = super.a();
        if (this.f6208a != null) {
            a2 += zzaic.b(1, this.f6208a);
        }
        if (this.f6209b != null) {
            a2 += zzaic.b(2, this.f6209b);
        }
        if (this.c != null) {
            a2 += zzaic.b(3, this.c.longValue());
        }
        if (this.d == null) {
            return a2;
        }
        this.d.floatValue();
        return a2 + zzaic.b(4) + 4;
    }

    @Override // com.google.android.gms.internal.af
    public final /* synthetic */ af a(z zVar) {
        while (true) {
            int a2 = zVar.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    this.f6208a = zVar.c();
                    break;
                case 18:
                    this.f6209b = zVar.c();
                    break;
                case 24:
                    this.c = Long.valueOf(zVar.f());
                    break;
                case 37:
                    this.d = Float.valueOf(Float.intBitsToFloat(zVar.g()));
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
