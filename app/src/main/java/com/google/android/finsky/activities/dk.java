package com.google.android.finsky.activities;

import android.app.PendingIntent;
import android.content.Context;
import android.os.AsyncTask;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class dk extends AsyncTask<Context, Void, PendingIntent> {
    dk() {
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ PendingIntent doInBackground(Context[] contextArr) {
        return a(contextArr);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(PendingIntent pendingIntent) {
        PendingIntent unused = dj.f1684a = pendingIntent;
    }

    private static PendingIntent a(Context... contextArr) {
        String str;
        PendingIntent pendingIntent = null;
        try {
            Context context = contextArr[0];
            if (com.google.android.gms.common.c.a(context) == 0) {
                str = dj.f1685b;
                pendingIntent = com.google.android.gms.auth.b.a(context, str);
            } else {
                FinskyLog.d("GooglePlayServices is not available.", new Object[0]);
            }
        } catch (Exception e) {
        }
        return pendingIntent;
    }
}
