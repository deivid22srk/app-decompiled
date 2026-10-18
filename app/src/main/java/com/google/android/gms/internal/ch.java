package com.google.android.gms.internal;

import java.security.MessageDigest;

@gw
/* loaded from: classes.dex */
public final class ch extends cb {

    /* renamed from: b, reason: collision with root package name */
    private MessageDigest f5922b;

    @Override // com.google.android.gms.internal.cb
    public final byte[] a(String str) {
        byte[] bArr;
        String[] split = str.split(" ");
        byte[] bArr2 = new byte[split.length];
        for (int i = 0; i < split.length; i++) {
            int a2 = cg.a(split[i]);
            bArr2[i] = (byte) (((a2 & (-16777216)) >> 24) ^ (((a2 & 255) ^ ((65280 & a2) >> 8)) ^ ((16711680 & a2) >> 16)));
        }
        this.f5922b = a();
        synchronized (this.f5915a) {
            if (this.f5922b == null) {
                bArr = new byte[0];
            } else {
                this.f5922b.reset();
                this.f5922b.update(bArr2);
                byte[] digest = this.f5922b.digest();
                bArr = new byte[digest.length > 4 ? 4 : digest.length];
                System.arraycopy(digest, 0, bArr, 0, bArr.length);
            }
        }
        return bArr;
    }
}
