package com.google.android.finsky.installer;

import android.content.pm.PackageInstaller;
import java.io.FilterOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
final class y extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f2878a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageInstaller.Session f2879b;

    public y(OutputStream outputStream, PackageInstaller.Session session) {
        super(outputStream);
        this.f2878a = outputStream;
        this.f2879b = session;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f2878a.write(bArr, i, i2);
    }
}
