package com.google.android.finsky.wear;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class c extends AsyncTask<Void, Void, Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f5120a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String[] f5121b;
    final /* synthetic */ Runnable c;

    c(Context context, String[] strArr, Runnable runnable) {
        this.f5120a = context;
        this.f5121b = strArr;
        this.c = runnable;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Void r2) {
        this.c.run();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Void doInBackground(Void[] voidArr) {
        boolean z;
        String[] a2 = com.google.android.finsky.bpkg.z.a(this.f5120a);
        for (int length = a2.length - 1; length >= 0; length--) {
            int length2 = this.f5121b.length - 1;
            while (true) {
                if (length2 < 0) {
                    z = false;
                    break;
                }
                if (a2[length].equals(this.f5121b[length2])) {
                    z = true;
                    break;
                }
                length2--;
            }
            if (!z) {
                FinskyLog.a("Deleting out-of-date node %s", a2[length]);
                com.google.android.finsky.bpkg.z.a(this.f5120a, a2[length]);
            }
        }
        return null;
    }
}
