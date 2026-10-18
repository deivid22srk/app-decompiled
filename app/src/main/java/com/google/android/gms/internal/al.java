package com.google.android.gms.internal;

/* loaded from: classes.dex */
public final class al extends aa<al> {

    /* renamed from: a, reason: collision with root package name */
    public int f5872a = 0;

    /* renamed from: b, reason: collision with root package name */
    public String f5873b = "";
    public String c = "";

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.aa, com.google.android.gms.internal.af
    public final int a() {
        int a2 = super.a();
        if (this.f5872a != 0) {
            a2 += zzaic.b(1, this.f5872a);
        }
        if (!this.f5873b.equals("")) {
            a2 += zzaic.b(2, this.f5873b);
        }
        return !this.c.equals("") ? a2 + zzaic.b(3, this.c) : a2;
    }

    @Override // com.google.android.gms.internal.aa, com.google.android.gms.internal.af
    public final void a(zzaic zzaicVar) {
        if (this.f5872a != 0) {
            zzaicVar.a(1, this.f5872a);
        }
        if (!this.f5873b.equals("")) {
            zzaicVar.a(2, this.f5873b);
        }
        if (!this.c.equals("")) {
            zzaicVar.a(3, this.c);
        }
        super.a(zzaicVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof al)) {
            return false;
        }
        al alVar = (al) obj;
        if (this.f5872a != alVar.f5872a) {
            return false;
        }
        if (this.f5873b == null) {
            if (alVar.f5873b != null) {
                return false;
            }
        } else if (!this.f5873b.equals(alVar.f5873b)) {
            return false;
        }
        if (this.c == null) {
            if (alVar.c != null) {
                return false;
            }
        } else if (!this.c.equals(alVar.c)) {
            return false;
        }
        return (this.o == null || this.o.c()) ? alVar.o == null || alVar.o.c() : this.o.equals(alVar.o);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.c == null ? 0 : this.c.hashCode()) + (((this.f5873b == null ? 0 : this.f5873b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.f5872a) * 31)) * 31)) * 31;
        if (this.o != null && !this.o.c()) {
            i = this.o.hashCode();
        }
        return hashCode + i;
    }

    public al() {
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
                        case 0:
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
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                            this.f5872a = e;
                            break;
                    }
                case 18:
                    this.f5873b = zVar.c();
                    break;
                case 26:
                    this.c = zVar.c();
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
