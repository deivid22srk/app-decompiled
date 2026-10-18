package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public final class ac extends ba {
    public ac(ap apVar) {
        super(apVar);
    }

    static byte[] a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            return byteArrayOutputStream.toByteArray();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.ba
    protected final void a() {
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ x f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ bg g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.c.a h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ Context i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ g j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ al k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ z l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ ai m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ i n() {
        return super.n();
    }

    public final boolean b() {
        NetworkInfo networkInfo;
        u();
        try {
            networkInfo = ((ConnectivityManager) super.i().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    public final void a(URL url, byte[] bArr, ad adVar) {
        super.e();
        u();
        com.google.android.gms.common.internal.av.a(url);
        com.google.android.gms.common.internal.av.a(bArr);
        com.google.android.gms.common.internal.av.a(adVar);
        super.k().b(new af(this, url, bArr, adVar));
    }
}
