package com.google.android.gms.internal;

/* loaded from: classes.dex */
public final class ol extends af {
    private static volatile ol[] f;

    /* renamed from: a, reason: collision with root package name */
    public om[] f6206a = om.b();

    /* renamed from: b, reason: collision with root package name */
    public String f6207b = null;
    public Long c = null;
    public Long d = null;
    public Integer e = null;

    public static ol[] b() {
        if (f == null) {
            synchronized (ae.f5865a) {
                if (f == null) {
                    f = new ol[0];
                }
            }
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.af
    public final int a() {
        int a2 = super.a();
        if (this.f6206a != null && this.f6206a.length > 0) {
            for (int i = 0; i < this.f6206a.length; i++) {
                om omVar = this.f6206a[i];
                if (omVar != null) {
                    a2 += zzaic.b(1, omVar);
                }
            }
        }
        if (this.f6207b != null) {
            a2 += zzaic.b(2, this.f6207b);
        }
        if (this.c != null) {
            a2 += zzaic.b(3, this.c.longValue());
        }
        if (this.d != null) {
            a2 += zzaic.b(4, this.d.longValue());
        }
        return this.e != null ? a2 + zzaic.b(5, this.e.intValue()) : a2;
    }

    @Override // com.google.android.gms.internal.af
    public final void a(zzaic zzaicVar) {
        if (this.f6206a != null && this.f6206a.length > 0) {
            for (int i = 0; i < this.f6206a.length; i++) {
                om omVar = this.f6206a[i];
                if (omVar != null) {
                    zzaicVar.a(1, omVar);
                }
            }
        }
        if (this.f6207b != null) {
            zzaicVar.a(2, this.f6207b);
        }
        if (this.c != null) {
            zzaicVar.a(3, this.c.longValue());
        }
        if (this.d != null) {
            zzaicVar.a(4, this.d.longValue());
        }
        if (this.e != null) {
            zzaicVar.a(5, this.e.intValue());
        }
        super.a(zzaicVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ol)) {
            return false;
        }
        ol olVar = (ol) obj;
        if (!ae.a(this.f6206a, olVar.f6206a)) {
            return false;
        }
        if (this.f6207b == null) {
            if (olVar.f6207b != null) {
                return false;
            }
        } else if (!this.f6207b.equals(olVar.f6207b)) {
            return false;
        }
        if (this.c == null) {
            if (olVar.c != null) {
                return false;
            }
        } else if (!this.c.equals(olVar.c)) {
            return false;
        }
        if (this.d == null) {
            if (olVar.d != null) {
                return false;
            }
        } else if (!this.d.equals(olVar.d)) {
            return false;
        }
        return this.e == null ? olVar.e == null : this.e.equals(olVar.e);
    }

    public final int hashCode() {
        return (((this.d == null ? 0 : this.d.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + (((this.f6207b == null ? 0 : this.f6207b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + ae.a(this.f6206a)) * 31)) * 31)) * 31)) * 31) + (this.e != null ? this.e.hashCode() : 0);
    }

    public ol() {
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
                    int b2 = ai.b(zVar, 10);
                    int length = this.f6206a == null ? 0 : this.f6206a.length;
                    om[] omVarArr = new om[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f6206a, 0, omVarArr, 0, length);
                    }
                    while (length < omVarArr.length - 1) {
                        omVarArr[length] = new om();
                        zVar.a(omVarArr[length]);
                        zVar.a();
                        length++;
                    }
                    omVarArr[length] = new om();
                    zVar.a(omVarArr[length]);
                    this.f6206a = omVarArr;
                    break;
                case 18:
                    this.f6207b = zVar.c();
                    break;
                case 24:
                    this.c = Long.valueOf(zVar.f());
                    break;
                case 32:
                    this.d = Long.valueOf(zVar.f());
                    break;
                case 40:
                    this.e = Integer.valueOf(zVar.e());
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
