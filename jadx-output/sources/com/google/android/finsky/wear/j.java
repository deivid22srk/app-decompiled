package com.google.android.finsky.wear;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;

/* loaded from: classes.dex */
final class j extends AsyncTask<Void, Void, Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f5130a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String[] f5131b;
    final /* synthetic */ Runnable c;

    j(Context context, String[] strArr, Runnable runnable) {
        this.f5130a = context;
        this.f5131b = strArr;
        this.c = runnable;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Void r2) {
        this.c.run();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Void doInBackground(Void[] voidArr) {
        boolean z;
        File[] listFiles = new File(this.f5130a.getCacheDir(), "wear").listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (int length = listFiles.length - 1; length >= 0; length--) {
                String decode = Uri.decode(listFiles[length].getName());
                int length2 = this.f5131b.length - 1;
                while (true) {
                    if (length2 < 0) {
                        z = false;
                        break;
                    }
                    if (decode.equals(this.f5131b[length2])) {
                        z = true;
                        break;
                    }
                    length2--;
                }
                if (!z) {
                    FinskyLog.a("Deleting files for out-of-date node %s", decode);
                    File[] listFiles2 = listFiles[length].listFiles();
                    if (listFiles2 != null && listFiles2.length > 0) {
                        for (File file : listFiles2) {
                            file.delete();
                        }
                    }
                    listFiles[length].delete();
                }
            }
            return null;
        }
        return null;
    }
}
