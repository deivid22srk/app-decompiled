package com.google.android.finsky.wear;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.hz;
import com.google.android.finsky.utils.ia;
import com.google.android.finsky.utils.jm;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
final class q extends AsyncTask<Void, Void, hz> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.b.t f5144a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Uri f5145b;
    final /* synthetic */ long c;
    final /* synthetic */ String d;
    final /* synthetic */ m e;

    q(m mVar, com.google.android.finsky.b.t tVar, Uri uri, long j, String str) {
        this.e = mVar;
        this.f5144a = tVar;
        this.f5145b = uri;
        this.c = j;
        this.d = str;
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
        hz hzVar2 = hzVar;
        wVar = this.e.v;
        wVar.b(this.f5145b);
        if (hzVar2 != null) {
            i = m.a(this.e, this.e.f5136a, hzVar2, this.c, this.d);
            if (i != 0) {
                bh.a(127, this.e.f5136a, "copy-verification", r10 == 0 ? 963 : i, null, r1.i, this.e.f5137b);
            }
        } else {
            i = 963;
        }
        if (i == 0) {
            String str = this.e.f5136a;
            nVar = this.e.i;
            bh.a(127, str, null, 0, null, nVar, this.e.f5137b);
            FinskyLog.a("Successfully copied APK to update %s (%s)", this.e.f5136a, this.e.f5137b);
            this.e.a(60, (String) null);
            this.e.a();
            return;
        }
        FinskyLog.d("Error while copying download for %s (%s).", this.e.f5136a, this.e.f5137b);
        cancel(false);
    }

    private hz a() {
        InputStream inputStream;
        Context context;
        InputStream openInputStream;
        OutputStream c;
        hz hzVar;
        OutputStream outputStream = null;
        String str = this.f5144a.f2130a;
        try {
            try {
                context = this.e.t;
                openInputStream = context.getContentResolver().openInputStream(this.f5145b);
                try {
                    try {
                        c = this.e.c();
                    } catch (IOException e) {
                        bh.a(127, str, "open-IOException", r10 == 0 ? 963 : 0, null, r2.i, this.e.f5137b);
                        FinskyLog.c("IOException while copying %s (%s): %s", str, this.e.f5137b, e);
                        jm.a((Closeable) openInputStream);
                        jm.a((Closeable) null);
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream = openInputStream;
                }
            } catch (FileNotFoundException e2) {
                bh.a(127, str, "source-FileNotFoundException", r10 == 0 ? 963 : 0, null, r0.i, this.e.f5137b);
                FinskyLog.c("FileNotFoundException %s", this.f5145b);
                jm.a((Closeable) null);
                jm.a((Closeable) null);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            try {
                ia iaVar = new ia(c);
                jm.a(openInputStream, iaVar);
                hzVar = iaVar.a();
                try {
                    m.a(c);
                    jm.a((Closeable) openInputStream);
                    jm.a(c);
                } catch (IOException e3) {
                    bh.a(127, str, "finish-IOException", r10 == 0 ? 963 : 0, null, r5.i, this.e.f5137b);
                    FinskyLog.c("IOException while finishing %s (%s): %s", str, this.e.f5137b, e3);
                    jm.a((Closeable) openInputStream);
                    jm.a(c);
                    hzVar = null;
                }
            } catch (IOException e4) {
                bh.a(127, str, "copy-IOException", r10 == 0 ? 963 : 0, null, r5.i, this.e.f5137b);
                FinskyLog.c("IOException while copying %s (%s): %s", str, this.e.f5137b, e4);
                jm.a((Closeable) openInputStream);
                jm.a(c);
                hzVar = null;
            }
            return hzVar;
        } catch (Throwable th3) {
            th = th3;
            outputStream = c;
            inputStream = openInputStream;
            jm.a((Closeable) inputStream);
            jm.a(outputStream);
            throw th;
        }
    }
}
