package com.google.android.gms.internal;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class af {
    public volatile int p = -1;

    public static final <T extends af> T a(T t, byte[] bArr, int i) {
        try {
            z a2 = z.a(bArr, i);
            t.a(a2);
            a2.a(0);
            return t;
        } catch (zzaij e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public int a() {
        return 0;
    }

    public abstract af a(z zVar);

    public void a(zzaic zzaicVar) {
    }

    @Override // 
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public af clone() {
        return (af) super.clone();
    }

    public final int d() {
        int a2 = a();
        this.p = a2;
        return a2;
    }

    public String toString() {
        return ag.a(this);
    }

    public static final byte[] a(af afVar) {
        byte[] bArr = new byte[afVar.d()];
        try {
            zzaic a2 = zzaic.a(bArr, bArr.length);
            afVar.a(a2);
            a2.a();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }
}
