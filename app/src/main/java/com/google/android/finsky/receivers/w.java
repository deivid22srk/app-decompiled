package com.google.android.finsky.receivers;

import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.hy;
import com.google.android.finsky.utils.hz;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
final class w extends AsyncTask<Void, Void, hz> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Uri f4502a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f4503b;
    final /* synthetic */ String c;
    final /* synthetic */ u d;

    w(u uVar, Uri uri, long j, String str) {
        this.d = uVar;
        this.f4502a = uri;
        this.f4503b = j;
        this.c = str;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ hz doInBackground(Void[] voidArr) {
        return a();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(hz hzVar) {
        String str;
        com.google.android.finsky.installer.s sVar;
        List list;
        List list2;
        com.google.android.finsky.download.w wVar;
        String str2;
        int a2 = u.a(this.d, this.d.e, hzVar, this.f4503b, this.c);
        if (a2 != 0) {
            wVar = this.d.t;
            wVar.b(this.f4502a);
            str2 = this.d.n;
            FinskyLog.d("Error while verifying download for %s (%s)", this.d.e, str2);
            cancel(false);
            FinskyApp.a().h().a(111, this.d.e, (String) null, a2, (String) null, this.d.k);
            this.d.a(5, a2);
            this.d.a(a2, (String) null);
            return;
        }
        str = this.d.n;
        if (str.equals(this.d.e)) {
            sVar = this.d.d;
            sVar.a(this.d.e, this.f4502a);
            list = this.d.C;
            if (u.a((List<String>) list, this.d.e)) {
                list2 = this.d.C;
                FinskyLog.e("Processing APK with splits (%s) in single-file path", list2);
            }
        }
        this.d.i();
    }

    private hz a() {
        try {
            try {
                return hy.a(FinskyApp.a().getContentResolver().openInputStream(this.f4502a));
            } catch (IOException e) {
                FinskyLog.c("IOException while copying %s: %s", this.d.e, e);
                return null;
            }
        } catch (FileNotFoundException e2) {
            FinskyLog.c("FileNotFoundException for %s: %s", this.d.e, this.f4502a);
            return null;
        }
    }
}
