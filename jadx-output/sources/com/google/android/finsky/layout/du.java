package com.google.android.finsky.layout;

import android.os.AsyncTask;
import java.util.List;

/* loaded from: classes.dex */
final class du extends AsyncTask<Void, Integer, Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ScreenshotGallery f3241a;

    du(ScreenshotGallery screenshotGallery) {
        this.f3241a = screenshotGallery;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Void doInBackground(Void[] voidArr) {
        return a();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onProgressUpdate(Integer[] numArr) {
        ScreenshotGallery.a(this.f3241a, numArr[0].intValue());
    }

    private Void a() {
        com.google.android.finsky.adapters.ag agVar;
        List list;
        int i = 0;
        while (!isCancelled()) {
            agVar = this.f3241a.h;
            if (agVar != null) {
                publishProgress(Integer.valueOf(i));
                i++;
                list = this.f3241a.l;
                if (i < list.size()) {
                    try {
                        Thread.sleep(400L);
                    } catch (InterruptedException e) {
                    }
                } else {
                    return null;
                }
            } else {
                return null;
            }
        }
        return null;
    }
}
