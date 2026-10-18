package com.google.android.gms.internal;

import com.google.android.gms.internal.aa;

/* loaded from: classes.dex */
public abstract class aa<M extends aa<M>> extends af {
    protected ac o;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.af
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public M clone() {
        M m = (M) super.clone();
        ae.a(this, m);
        return m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.af
    public int a() {
        if (this.o == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.o.b(); i2++) {
            i += this.o.a(i2).a();
        }
        return i;
    }

    @Override // com.google.android.gms.internal.af
    public void a(zzaic zzaicVar) {
        if (this.o == null) {
            return;
        }
        for (int i = 0; i < this.o.b(); i++) {
            this.o.a(i).a(zzaicVar);
        }
    }

    protected final boolean a(z zVar, int i) {
        byte[] bArr;
        ad adVar;
        int j = zVar.j();
        if (!zVar.b(i)) {
            return false;
        }
        int b2 = ai.b(i);
        int j2 = zVar.j() - j;
        if (j2 == 0) {
            bArr = ai.h;
        } else {
            bArr = new byte[j2];
            System.arraycopy(zVar.f6259a, j + zVar.f6260b, bArr, 0, j2);
        }
        ah ahVar = new ah(i, bArr);
        if (this.o == null) {
            this.o = new ac();
            adVar = null;
        } else {
            ac acVar = this.o;
            int c = acVar.c(b2);
            adVar = (c < 0 || acVar.d[c] == ac.f5861a) ? null : acVar.d[c];
        }
        if (adVar == null) {
            ad adVar2 = new ad();
            ac acVar2 = this.o;
            int c2 = acVar2.c(b2);
            if (c2 >= 0) {
                acVar2.d[c2] = adVar2;
                adVar = adVar2;
            } else {
                int i2 = c2 ^ (-1);
                if (i2 >= acVar2.e || acVar2.d[i2] != ac.f5861a) {
                    if (acVar2.f5862b && acVar2.e >= acVar2.c.length) {
                        acVar2.a();
                        i2 = acVar2.c(b2) ^ (-1);
                    }
                    if (acVar2.e >= acVar2.c.length) {
                        int b3 = ac.b(acVar2.e + 1);
                        int[] iArr = new int[b3];
                        ad[] adVarArr = new ad[b3];
                        System.arraycopy(acVar2.c, 0, iArr, 0, acVar2.c.length);
                        System.arraycopy(acVar2.d, 0, adVarArr, 0, acVar2.d.length);
                        acVar2.c = iArr;
                        acVar2.d = adVarArr;
                    }
                    if (acVar2.e - i2 != 0) {
                        System.arraycopy(acVar2.c, i2, acVar2.c, i2 + 1, acVar2.e - i2);
                        System.arraycopy(acVar2.d, i2, acVar2.d, i2 + 1, acVar2.e - i2);
                    }
                    acVar2.c[i2] = b2;
                    acVar2.d[i2] = adVar2;
                    acVar2.e++;
                    adVar = adVar2;
                } else {
                    acVar2.c[i2] = b2;
                    acVar2.d[i2] = adVar2;
                    adVar = adVar2;
                }
            }
        }
        adVar.f5863a.add(ahVar);
        return true;
    }
}
