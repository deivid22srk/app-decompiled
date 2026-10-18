package com.google.android.finsky.receivers;

import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.hz;
import com.google.android.finsky.utils.ia;
import com.google.android.finsky.utils.jm;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
final class y extends AsyncTask<Void, Void, hz> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.bpkg.t f4506a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Uri f4507b;
    final /* synthetic */ long c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ u f;

    y(u uVar, com.google.android.finsky.bpkg.t tVar, Uri uri, long j, String str, String str2) {
        this.f = uVar;
        this.f4506a = tVar;
        this.f4507b = uri;
        this.c = j;
        this.d = str;
        this.e = str2;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ hz doInBackground(Void[] voidArr) {
        return a();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(hz hzVar) {
        com.google.android.finsky.download.w wVar;
        int i;
        com.google.android.finsky.apkg.n nVar;
        String str;
        hz hzVar2 = hzVar;
        wVar = this.f.t;
        wVar.b(this.f4507b);
        if (hzVar2 != null) {
            i = u.a(this.f, this.f.e, hzVar2, this.c, this.e);
            if (i != 0) {
                this.f.a(this.f.e, "gdiff-verification", i, (Exception) null);
            }
        } else {
            i = 0;
        }
        if (hzVar2 == null || i != 0) {
            u.h();
            this.f.b(4, 8);
            return;
        }
        com.google.android.finsky.apkg.i h = FinskyApp.a().h();
        String str2 = this.f.e;
        nVar = this.f.k;
        h.a(108, str2, (String) null, 0, (String) null, nVar);
        str = this.f.n;
        FinskyLog.a("Successfully applied patch to update %s (%s)", this.f.e, str);
        this.f.i();
    }

    private hz a() {
        InputStream inputStream;
        RandomAccessFile randomAccessFile;
        com.google.android.finsky.download.d dVar;
        com.google.android.finsky.download.d dVar2;
        String str;
        com.google.android.finsky.download.d dVar3;
        OutputStream d;
        com.google.android.finsky.download.d dVar4;
        String str2;
        hz a2;
        String str3;
        com.google.android.finsky.download.d dVar5;
        String str4;
        com.google.android.finsky.download.d dVar6;
        OutputStream outputStream = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str5 = this.f4506a.f2130a;
        try {
            FinskyApp a3 = FinskyApp.a();
            a3.getContentResolver();
            try {
                a3.getPackageManager().getApplicationInfo(str5, 0);
                dVar = this.f.o;
                randomAccessFile = new RandomAccessFile(dVar.b(), "r");
                try {
                    u uVar = this.f;
                    Uri uri = this.f4507b;
                    dVar2 = this.f.o;
                    inputStream = uVar.a(a3, uri, dVar2);
                    if (inputStream == null) {
                        jm.a(randomAccessFile);
                        jm.a((Closeable) inputStream);
                        jm.a((Closeable) null);
                        return null;
                    }
                    try {
                        try {
                            dVar3 = this.f.o;
                            d = dVar3.d();
                        } catch (IOException e) {
                            u.a(this.f, str5, "patch-IOException", 0, e);
                            str = this.f.n;
                            FinskyLog.c("IOException while patching %s (%s): %s", str5, str, e);
                            jm.a(randomAccessFile);
                            jm.a((Closeable) inputStream);
                            jm.a((Closeable) null);
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        ia iaVar = new ia(d);
                        u uVar2 = this.f;
                        dVar4 = this.f.o;
                        str2 = this.f.n;
                        if (uVar2.a(dVar4, str2, randomAccessFile, inputStream, iaVar, this.c, this.d)) {
                            a2 = iaVar.a();
                            try {
                                dVar5 = this.f.o;
                                dVar5.a(d);
                                str4 = this.f.n;
                                dVar6 = this.f.o;
                                FinskyLog.a("Patch apply task for %s (%s) (format %d) completed in %d ms", str5, str4, Integer.valueOf(dVar6.g.g), Long.valueOf(elapsedRealtime - SystemClock.elapsedRealtime()));
                                jm.a(randomAccessFile);
                                jm.a((Closeable) inputStream);
                                jm.a(d);
                            } catch (IOException e2) {
                                u.a(this.f, str5, "finish-IOException", 0, e2);
                                str3 = this.f.n;
                                FinskyLog.c("IOException while finishing %s (%s): %s", str5, str3, e2);
                                jm.a(randomAccessFile);
                                jm.a((Closeable) inputStream);
                                jm.a(d);
                                a2 = null;
                            }
                        } else {
                            jm.a(randomAccessFile);
                            jm.a((Closeable) inputStream);
                            jm.a(d);
                            a2 = null;
                        }
                        return a2;
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = d;
                        jm.a(randomAccessFile);
                        jm.a((Closeable) inputStream);
                        jm.a(outputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = null;
                }
            } catch (PackageManager.NameNotFoundException e3) {
                this.f.a(str5, "source-NameNotFoundException", 0, e3);
                FinskyLog.c("NameNotFoundException %s", this.f4507b);
                jm.a((Closeable) null);
                jm.a((Closeable) null);
                jm.a((Closeable) null);
                return null;
            } catch (FileNotFoundException e4) {
                this.f.a(str5, "source-FileNotFoundException", 0, e4);
                FinskyLog.c("FileNotFoundException %s", this.f4507b);
                jm.a((Closeable) null);
                jm.a((Closeable) null);
                jm.a((Closeable) null);
                return null;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            randomAccessFile = null;
        }
    }
}
