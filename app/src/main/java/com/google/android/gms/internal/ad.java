package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class ad implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    List<ah> f5863a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private ab<?, ?> f5864b;
    private Object c;

    ad() {
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ad clone() {
        ad adVar = new ad();
        try {
            adVar.f5864b = this.f5864b;
            if (this.f5863a == null) {
                adVar.f5863a = null;
            } else {
                adVar.f5863a.addAll(this.f5863a);
            }
            if (this.c != null) {
                if (this.c instanceof af) {
                    adVar.c = ((af) this.c).clone();
                } else if (this.c instanceof byte[]) {
                    adVar.c = ((byte[]) this.c).clone();
                } else if (this.c instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.c;
                    byte[][] bArr2 = new byte[bArr.length][];
                    adVar.c = bArr2;
                    for (int i = 0; i < bArr.length; i++) {
                        bArr2[i] = (byte[]) bArr[i].clone();
                    }
                } else if (this.c instanceof boolean[]) {
                    adVar.c = ((boolean[]) this.c).clone();
                } else if (this.c instanceof int[]) {
                    adVar.c = ((int[]) this.c).clone();
                } else if (this.c instanceof long[]) {
                    adVar.c = ((long[]) this.c).clone();
                } else if (this.c instanceof float[]) {
                    adVar.c = ((float[]) this.c).clone();
                } else if (this.c instanceof double[]) {
                    adVar.c = ((double[]) this.c).clone();
                } else if (this.c instanceof af[]) {
                    af[] afVarArr = (af[]) this.c;
                    af[] afVarArr2 = new af[afVarArr.length];
                    adVar.c = afVarArr2;
                    for (int i2 = 0; i2 < afVarArr.length; i2++) {
                        afVarArr2[i2] = afVarArr[i2].clone();
                    }
                }
            }
            return adVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        if (this.c != null && adVar.c != null) {
            if (this.f5864b == adVar.f5864b) {
                return !this.f5864b.f5860b.isArray() ? this.c.equals(adVar.c) : this.c instanceof byte[] ? Arrays.equals((byte[]) this.c, (byte[]) adVar.c) : this.c instanceof int[] ? Arrays.equals((int[]) this.c, (int[]) adVar.c) : this.c instanceof long[] ? Arrays.equals((long[]) this.c, (long[]) adVar.c) : this.c instanceof float[] ? Arrays.equals((float[]) this.c, (float[]) adVar.c) : this.c instanceof double[] ? Arrays.equals((double[]) this.c, (double[]) adVar.c) : this.c instanceof boolean[] ? Arrays.equals((boolean[]) this.c, (boolean[]) adVar.c) : Arrays.deepEquals((Object[]) this.c, (Object[]) adVar.c);
            }
            return false;
        }
        if (this.f5863a != null && adVar.f5863a != null) {
            return this.f5863a.equals(adVar.f5863a);
        }
        try {
            return Arrays.equals(c(), adVar.c());
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(c()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    final int a() {
        int i = 0;
        if (this.c != null) {
            return this.f5864b.a(this.c);
        }
        Iterator<ah> it = this.f5863a.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            ah next = it.next();
            i = next.f5867b.length + zzaic.d(next.f5866a) + 0 + i2;
        }
    }

    final void a(zzaic zzaicVar) {
        if (this.c != null) {
            this.f5864b.a(this.c, zzaicVar);
            return;
        }
        for (ah ahVar : this.f5863a) {
            zzaicVar.c(ahVar.f5866a);
            zzaicVar.b(ahVar.f5867b);
        }
    }

    private byte[] c() {
        byte[] bArr = new byte[a()];
        a(zzaic.a(bArr, bArr.length));
        return bArr;
    }
}
