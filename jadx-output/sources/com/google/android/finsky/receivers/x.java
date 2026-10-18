package com.google.android.finsky.receivers;

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
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
final class x extends AsyncTask<Void, Void, hz> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.b.t f4504a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Uri f4505b;
    final /* synthetic */ boolean c;
    final /* synthetic */ long d;
    final /* synthetic */ String e;
    final /* synthetic */ boolean f;
    final /* synthetic */ u g;

    x(u uVar, com.google.android.finsky.b.t tVar, Uri uri, boolean z, long j, String str, boolean z2) {
        this.g = uVar;
        this.f4504a = tVar;
        this.f4505b = uri;
        this.c = z;
        this.d = j;
        this.e = str;
        this.f = z2;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ hz doInBackground(Void[] voidArr) {
        return a();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(hz hzVar) {
        com.google.android.finsky.download.w wVar;
        int i;
        com.google.android.finsky.a.n nVar;
        String str;
        com.google.android.finsky.download.d dVar;
        boolean b2;
        String str2;
        boolean b3;
        hz hzVar2 = hzVar;
        wVar = this.g.t;
        wVar.b(this.f4505b);
        if (hzVar2 != null) {
            i = u.a(this.g, this.g.e, hzVar2, this.d, this.e);
            if (i != 0) {
                u.a(this.g, this.g.e, "copy-verification", i, (Exception) null);
            }
        } else {
            i = 963;
        }
        if (i != 0) {
            u.h();
            if (this.c) {
                b3 = this.g.b(512, 1024);
                if (b3) {
                    return;
                }
            } else if (this.f) {
                dVar = this.g.o;
                if (!dVar.e()) {
                    b2 = this.g.b(4096, 8192);
                    if (b2) {
                        return;
                    }
                }
            }
            str2 = this.g.n;
            FinskyLog.d("Error while copying download for %s (%s). isExternal=%b isGzip=%b", this.g.e, str2, Boolean.valueOf(this.c), Boolean.valueOf(this.f));
            cancel(false);
            this.g.a(5, i);
            this.g.a(i, (String) null);
            return;
        }
        com.google.android.finsky.a.i h = FinskyApp.a().h();
        String str3 = this.g.e;
        nVar = this.g.k;
        h.a(127, str3, (String) null, 0, (String) null, nVar);
        str = this.g.n;
        FinskyLog.a("Successfully copied APK to update %s (%s)", this.g.e, str);
        this.g.i();
    }

    private hz a() {
        InputStream inputStream;
        Throwable th;
        OutputStream outputStream;
        InputStream gZIPInputStream;
        String str;
        com.google.android.finsky.download.d dVar;
        OutputStream d;
        String str2;
        String str3;
        String str4;
        com.google.android.finsky.download.d dVar2;
        hz hzVar = null;
        String str5 = this.f4504a.f2130a;
        try {
            try {
                inputStream = FinskyApp.a().getContentResolver().openInputStream(this.f4505b);
                try {
                    if (this.c) {
                        try {
                            gZIPInputStream = new GZIPInputStream(inputStream, 8192);
                        } catch (IOException e) {
                            u.a(this.g, str5, "gzip-IOException", 0, e);
                            FinskyLog.c("IOException %s", e.getMessage());
                            jm.a((Closeable) inputStream);
                            jm.a((Closeable) null);
                        }
                    } else {
                        gZIPInputStream = inputStream;
                    }
                    try {
                        try {
                            dVar = this.g.o;
                            d = dVar.d();
                        } catch (Throwable th2) {
                            inputStream = gZIPInputStream;
                            th = th2;
                            outputStream = null;
                        }
                    } catch (IOException e2) {
                        u.a(this.g, str5, "open-IOException", 0, e2);
                        str = this.g.n;
                        FinskyLog.c("IOException while copying %s (%s): %s", str5, str, e2);
                        jm.a((Closeable) gZIPInputStream);
                        jm.a((Closeable) null);
                    }
                } catch (Throwable th3) {
                    outputStream = null;
                    th = th3;
                }
            } catch (FileNotFoundException e3) {
                u.a(this.g, str5, "source-FileNotFoundException", 0, e3);
                FinskyLog.c("FileNotFoundException %s", this.f4505b);
                jm.a((Closeable) null);
                jm.a((Closeable) null);
            }
        } catch (Throwable th4) {
            inputStream = null;
            th = th4;
            outputStream = null;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                ia iaVar = new ia(d);
                jm.a(gZIPInputStream, iaVar);
                hz a2 = iaVar.a();
                str3 = this.g.n;
                FinskyLog.a("%s (%s) (%d bytes) copied successfully in %d ms", str5, str3, Long.valueOf(this.d), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                try {
                    dVar2 = this.g.o;
                    dVar2.a(d);
                    jm.a((Closeable) gZIPInputStream);
                    jm.a(d);
                    hzVar = a2;
                } catch (IOException e4) {
                    u.a(this.g, str5, "finish-IOException", 0, e4);
                    str4 = this.g.n;
                    FinskyLog.c("IOException while finishing %s (%s): %s", str5, str4, e4);
                    jm.a((Closeable) gZIPInputStream);
                    jm.a(d);
                }
            } catch (IOException e5) {
                u.a(this.g, str5, "copy-IOException", 0, e5);
                str2 = this.g.n;
                FinskyLog.c("IOException while copying %s (%s): %s", str5, str2, e5);
                jm.a((Closeable) gZIPInputStream);
                jm.a(d);
            }
            return hzVar;
        } catch (Throwable th5) {
            th = th5;
            outputStream = d;
            inputStream = gZIPInputStream;
            jm.a((Closeable) inputStream);
            jm.a(outputStream);
            throw th;
        }
    }
}
