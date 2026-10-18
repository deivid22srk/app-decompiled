package com.google.android.finsky.wear;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;

/* loaded from: classes.dex */
final class r extends AsyncTask<File, Void, Bundle> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.bpkg.b f5146a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f5147b;

    r(m mVar, com.google.android.finsky.bpkg.b bVar) {
        this.f5147b = mVar;
        this.f5146a = bVar;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Bundle bundle) {
        int i;
        com.google.android.finsky.bpkg.a aVar;
        Bundle bundle2 = bundle;
        if (bundle2 != null && (i = bundle2.getInt("com.google.android.gms.version", -1)) > 0) {
            aVar = this.f5147b.l;
            com.google.android.finsky.bpkg.b a2 = aVar.a("com.google.android.gms");
            if (a2 == null || a2.c == null) {
                FinskyLog.e("Missing package state for GMS on node %s", this.f5147b.f5137b);
                bh.a(111, r0.f5136a, null, 992, null, r0.i, this.f5147b.f5137b);
                this.f5147b.a(this.f5146a);
                return;
            } else {
                int i2 = a2.c.c;
                if (i > i2) {
                    FinskyLog.c("Required GMS %d greater than installed %d on %s", Integer.valueOf(i), Integer.valueOf(i2), this.f5147b.f5137b);
                    bh.a(111, r0.f5136a, null, 991, null, r0.i, this.f5147b.f5137b);
                    this.f5147b.a(this.f5146a);
                    return;
                }
            }
        }
        this.f5147b.b(this.f5146a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bundle doInBackground(File... fileArr) {
        Context context;
        try {
            File file = fileArr[0];
            context = this.f5147b.t;
            PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 128);
            if (packageArchiveInfo != null) {
                return packageArchiveInfo.applicationInfo.metaData;
            }
            return null;
        } catch (Exception e) {
            bh.a(111, r2.f5136a, null, 991, e.toString(), r2.i, this.f5147b.f5137b);
            return null;
        }
    }
}
