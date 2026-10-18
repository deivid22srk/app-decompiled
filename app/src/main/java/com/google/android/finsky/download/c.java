package com.google.android.finsky.download;

import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

/* loaded from: classes.dex */
final class c extends AsyncTask<Void, Void, Integer> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Uri f2695a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f2696b;
    final /* synthetic */ boolean c;
    final /* synthetic */ DownloadBroadcastReceiver d;

    c(DownloadBroadcastReceiver downloadBroadcastReceiver, Uri uri, boolean z, boolean z2) {
        this.d = downloadBroadcastReceiver;
        this.f2695a = uri;
        this.f2696b = z;
        this.c = z2;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Integer num) {
        w wVar;
        w wVar2;
        w wVar3;
        w wVar4;
        Integer num2 = num;
        wVar = DownloadBroadcastReceiver.f2676a;
        b a2 = wVar.a(this.f2695a);
        if (a2 == null) {
            FinskyLog.a("Did not find download in queue for %s", this.f2695a.toString());
            return;
        }
        if (num2.intValue() != -1) {
            a2.b(num2.intValue());
        } else {
            FinskyLog.d("DownloadBroadcastReceiver received invalid HTTP status of -1", new Object[0]);
        }
        if (this.f2696b) {
            wVar4 = DownloadBroadcastReceiver.f2676a;
            wVar4.h(a2);
            return;
        }
        if (this.c) {
            if (a2.m()) {
                FinskyLog.a("Received ACTION_DOWNLOAD_COMPLETE %d for %s - dropping because already in state %d.", num2, a2, Integer.valueOf(a2.n()));
                return;
            } else if (f.a(num2.intValue())) {
                wVar3 = DownloadBroadcastReceiver.f2676a;
                wVar3.b(a2, 3);
                return;
            } else {
                wVar2 = DownloadBroadcastReceiver.f2676a;
                wVar2.b(a2, 5);
                return;
            }
        }
        FinskyLog.e("Invalid DownloadBroadcastReceiver intent", new Object[0]);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Integer doInBackground(Void[] voidArr) {
        w wVar;
        wVar = DownloadBroadcastReceiver.f2676a;
        List<r> a2 = wVar.b().a(this.f2695a, (h) null);
        if (a2.size() <= 0) {
            FinskyLog.c("Unable to find %s in download manager", this.f2695a.toString());
            return -1;
        }
        return Integer.valueOf(a2.get(0).d);
    }
}
