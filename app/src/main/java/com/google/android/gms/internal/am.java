package com.google.android.gms.internal;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class am extends aa<am> {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f5874a = ai.h;

    /* renamed from: b, reason: collision with root package name */
    public byte[][] f5875b = ai.g;
    public boolean c = false;

    @Override // com.google.android.gms.internal.aa, com.google.android.gms.internal.af
    public final void a(zzaic zzaicVar) {
        if (!Arrays.equals(this.f5874a, ai.h)) {
            zzaicVar.a(1, this.f5874a);
        }
        if (this.f5875b != null && this.f5875b.length > 0) {
            for (int i = 0; i < this.f5875b.length; i++) {
                byte[] bArr = this.f5875b[i];
                if (bArr != null) {
                    zzaicVar.a(2, bArr);
                }
            }
        }
        if (this.c) {
            zzaicVar.a(3, this.c);
        }
        super.a(zzaicVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof am)) {
            return false;
        }
        am amVar = (am) obj;
        if (Arrays.equals(this.f5874a, amVar.f5874a) && ae.a(this.f5875b, amVar.f5875b) && this.c == amVar.c) {
            return (this.o == null || this.o.c()) ? amVar.o == null || amVar.o.c() : this.o.equals(amVar.o);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.o == null || this.o.c()) ? 0 : this.o.hashCode()) + (((this.c ? 1231 : 1237) + ((((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f5874a)) * 31) + ae.a(this.f5875b)) * 31)) * 31);
    }

    public am() {
        this.o = null;
        this.p = -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.aa, com.google.android.gms.internal.af
    public final int a() {
        int a2 = super.a();
        if (!Arrays.equals(this.f5874a, ai.h)) {
            a2 += zzaic.b(1, this.f5874a);
        }
        if (this.f5875b != null && this.f5875b.length > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.f5875b.length; i3++) {
                byte[] bArr = this.f5875b[i3];
                if (bArr != null) {
                    i2++;
                    i += zzaic.a(bArr);
                }
            }
            a2 = a2 + i + (i2 * 1);
        }
        return this.c ? a2 + zzaic.b(3) + 1 : a2;
    }

    @Override // com.google.android.gms.internal.af
    public final /* synthetic */ af a(z zVar) {
        while (true) {
            int a2 = zVar.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    this.f5874a = zVar.d();
                    break;
                case 18:
                    int b2 = ai.b(zVar, 18);
                    int length = this.f5875b == null ? 0 : this.f5875b.length;
                    byte[][] bArr = new byte[b2 + length][];
                    if (length != 0) {
                        System.arraycopy(this.f5875b, 0, bArr, 0, length);
                    }
                    while (length < bArr.length - 1) {
                        bArr[length] = zVar.d();
                        zVar.a();
                        length++;
                    }
                    bArr[length] = zVar.d();
                    this.f5875b = bArr;
                    break;
                case 24:
                    this.c = zVar.b();
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
