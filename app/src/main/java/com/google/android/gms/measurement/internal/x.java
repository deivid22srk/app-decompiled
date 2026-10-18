package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public final class x extends ba {

    /* renamed from: a, reason: collision with root package name */
    private static final X500Principal f6386a = new X500Principal("CN=Android Debug,O=Android,C=US");

    /* renamed from: b, reason: collision with root package name */
    private String f6387b;
    private String c;
    private String d;
    private String e;
    private long f;
    private String g;

    x(ap apVar) {
        super(apVar);
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
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.cpkg.a h() {
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

    @Override // com.google.android.gms.measurement.internal.ba
    protected final void a() {
        String str;
        MessageDigest messageDigest;
        long j;
        long j2 = 0;
        String str2 = "Unknown";
        str = "Unknown";
        PackageManager packageManager = super.i().getPackageManager();
        String packageName = super.i().getPackageName();
        String installerPackageName = packageManager.getInstallerPackageName(packageName);
        if (installerPackageName == null) {
            installerPackageName = "manual_install";
        } else if ("com.deivid22srk.store".equals(installerPackageName)) {
            installerPackageName = "";
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(super.i().getPackageName(), 0);
            if (packageInfo != null) {
                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                str = TextUtils.isEmpty(applicationLabel) ? "Unknown" : applicationLabel.toString();
                str2 = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException e) {
            super.l().f6388a.a("Error retrieving package info: appName", str);
        }
        this.f6387b = packageName;
        this.d = installerPackageName;
        this.c = str2;
        this.e = str;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (PackageManager.NameNotFoundException e2) {
            super.l().f6388a.a("Package name not found", e2);
        } catch (NoSuchAlgorithmException e3) {
            super.l().f6388a.a("Could not get MD5 instance", e3);
        }
        if (!o()) {
            PackageInfo packageInfo2 = packageManager.getPackageInfo(super.i().getPackageName(), 64);
            if (messageDigest != null && packageInfo2.signatures != null && packageInfo2.signatures.length > 0) {
                byte[] digest = messageDigest.digest(packageInfo2.signatures[0].toByteArray());
                com.google.android.gms.common.internal.av.a(digest);
                com.google.android.gms.common.internal.av.a(digest.length > 0);
                int i = 0;
                int length = digest.length - 1;
                j = 0;
                while (length >= 0) {
                    if (length < digest.length - 8) {
                        break;
                    }
                    long j3 = ((digest[length] & 255) << i) + j;
                    length--;
                    i += 8;
                    j = j3;
                }
                j2 = j;
                this.f = j2;
            }
        }
        j = 0;
        j2 = j;
        this.f = j2;
    }

    final AppMetadata a(String str) {
        String str2 = this.f6387b;
        String b2 = b();
        String str3 = this.c;
        String str4 = this.d;
        long A = i.A();
        u();
        return new AppMetadata(str2, b2, str3, str4, A, this.f, str, super.m().r());
    }

    final String b() {
        u();
        if (i.B()) {
            return "";
        }
        if (this.g == null) {
            Status a2 = com.google.android.gms.measurement.d.a(super.i());
            if (a2 == null || !a2.a()) {
                this.g = "";
                super.l().f6388a.a("getGoogleAppId failed with status", Integer.valueOf(a2 == null ? 0 : a2.g));
                if (a2 != null && a2.h != null) {
                    super.l().f.a(a2.h);
                }
            } else {
                try {
                    if (com.google.android.gms.measurement.d.b()) {
                        String a3 = com.google.android.gms.measurement.d.a();
                        if (TextUtils.isEmpty(a3)) {
                            a3 = "";
                        }
                        this.g = a3;
                    } else {
                        this.g = "";
                    }
                } catch (IllegalStateException e) {
                    this.g = "";
                    super.l().f6388a.a("getGoogleAppId or isMeasurementEnabled failed with exception", e);
                }
            }
        }
        return this.g;
    }

    private boolean o() {
        try {
            PackageInfo packageInfo = super.i().getPackageManager().getPackageInfo(super.i().getPackageName(), 64);
            if (packageInfo != null && packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(packageInfo.signatures[0].toByteArray()))).getSubjectX500Principal().equals(f6386a);
            }
        } catch (PackageManager.NameNotFoundException e) {
            super.l().f6388a.a("Package name not found", e);
        } catch (CertificateException e2) {
            super.l().f6388a.a("Error obtaining certificate", e2);
        }
        return true;
    }
}
