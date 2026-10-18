package com.google.android.finsky.wear;

import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import com.google.android.finsky.protos.pf;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;

/* loaded from: classes.dex */
final class t extends AsyncTask<Object, Void, Throwable> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.bpkg.b f5150a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f5151b;
    final /* synthetic */ String c;
    final /* synthetic */ m d;

    t(m mVar, com.google.android.finsky.bpkg.b bVar, String str, String str2) {
        this.d = mVar;
        this.f5150a = bVar;
        this.f5151b = str;
        this.c = str2;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Throwable doInBackground(Object[] objArr) {
        return a(objArr);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Throwable th) {
        pf pfVar;
        pf pfVar2;
        com.google.android.gms.common.api.m mVar;
        com.google.android.finsky.bpkg.s sVar;
        com.google.android.finsky.bpkg.s sVar2;
        Throwable th2 = th;
        this.d.d();
        if (th2 == null) {
            String str = "/install_wearable/" + this.d.f5136a + "/" + this.f5151b;
            FinskyLog.a("Writing Install Request to install %s (%s) to %s", this.d.f5136a, this.d.f5137b, str);
            com.google.android.gms.wearable.y a2 = com.google.android.gms.wearable.y.a(str);
            com.google.android.gms.wearable.o oVar = a2.f6636a;
            oVar.a("assetIdentifier", this.c);
            pfVar = this.d.r;
            oVar.a("apkSize", pfVar.c);
            pfVar2 = this.d.r;
            oVar.a("apkSha1", pfVar2.g);
            oVar.a("nodeIds", new String[]{this.d.f5137b});
            com.google.android.gms.wearable.f fVar = com.google.android.gms.wearable.aa.f6462a;
            mVar = this.d.x;
            fVar.a(mVar, a2.a()).a(new u(this, str));
            sVar = this.d.m;
            com.google.android.finsky.bpkg.u d = com.google.android.finsky.bpkg.u.a(sVar.a(this.d.f5136a), this.d.f5136a).i(this.f5151b).d(90);
            sVar2 = this.d.m;
            sVar2.a(d.f2132a);
            this.d.a();
            return;
        }
        bh.a(111, r0.f5136a, null, 994, th2.toString(), r0.i, this.d.f5137b);
        this.d.a(this.f5150a);
    }

    private static Throwable a(Object... objArr) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream2 = null;
        File file = (File) objArr[0];
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) objArr[1];
        try {
            fileInputStream = new FileInputStream(file);
            try {
                autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
            } catch (Throwable th) {
                th = th;
            }
            try {
                jm.a(fileInputStream, autoCloseOutputStream);
                autoCloseOutputStream.flush();
                jm.a((Closeable) fileInputStream);
                jm.a(autoCloseOutputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                autoCloseOutputStream2 = autoCloseOutputStream;
                jm.a((Closeable) fileInputStream);
                jm.a(autoCloseOutputStream2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }
}
