package com.google.android.gms.internal;

/* loaded from: classes.dex */
public final class on extends af {

    /* renamed from: a, reason: collision with root package name */
    public oo[] f6210a = oo.b();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.af
    public final int a() {
        int a2 = super.a();
        if (this.f6210a != null && this.f6210a.length > 0) {
            for (int i = 0; i < this.f6210a.length; i++) {
                oo ooVar = this.f6210a[i];
                if (ooVar != null) {
                    a2 += zzaic.b(1, ooVar);
                }
            }
        }
        return a2;
    }

    @Override // com.google.android.gms.internal.af
    public final void a(zzaic zzaicVar) {
        if (this.f6210a != null && this.f6210a.length > 0) {
            for (int i = 0; i < this.f6210a.length; i++) {
                oo ooVar = this.f6210a[i];
                if (ooVar != null) {
                    zzaicVar.a(1, ooVar);
                }
            }
        }
        super.a(zzaicVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof on) && ae.a(this.f6210a, ((on) obj).f6210a);
    }

    public final int hashCode() {
        return ((getClass().getName().hashCode() + 527) * 31) + ae.a(this.f6210a);
    }

    public on() {
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
                    int length = this.f6210a == null ? 0 : this.f6210a.length;
                    oo[] ooVarArr = new oo[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f6210a, 0, ooVarArr, 0, length);
                    }
                    while (length < ooVarArr.length - 1) {
                        ooVarArr[length] = new oo();
                        zVar.a(ooVarArr[length]);
                        zVar.a();
                        length++;
                    }
                    ooVarArr[length] = new oo();
                    zVar.a(ooVarArr[length]);
                    this.f6210a = ooVarArr;
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
