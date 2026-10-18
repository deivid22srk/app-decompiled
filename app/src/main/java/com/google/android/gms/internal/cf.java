package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
final class cf {

    /* renamed from: a, reason: collision with root package name */
    ByteArrayOutputStream f5920a = new ByteArrayOutputStream(4096);

    /* renamed from: b, reason: collision with root package name */
    Base64OutputStream f5921b = new Base64OutputStream(this.f5920a, 10);

    public final void a(byte[] bArr) {
        this.f5921b.write(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        try {
            this.f5921b.close();
        } catch (IOException e) {
            com.google.android.gms.ads.internal.util.client.b.b("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.f5920a.close();
            str = this.f5920a.toString();
        } catch (IOException e2) {
            com.google.android.gms.ads.internal.util.client.b.b("HashManager: Unable to convert to Base64.", e2);
            str = "";
        } finally {
            this.f5920a = null;
            this.f5921b = null;
        }
        return str;
    }
}
