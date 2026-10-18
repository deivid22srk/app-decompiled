package com.google.android.finsky.detailspage;

import android.os.AsyncTask;

/* loaded from: classes.dex */
final class dr extends AsyncTask<Void, Integer, Void> {

    /* renamed from: a, reason: collision with root package name */
    final int f2625a;

    /* renamed from: b, reason: collision with root package name */
    final int f2626b;
    final /* synthetic */ Cdo c;

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Void doInBackground(Void[] voidArr) {
        return a();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onCancelled(Void r2) {
        super.onCancelled(r2);
        this.c.i();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Void r2) {
        super.onPostExecute(r2);
        this.c.i();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onProgressUpdate(Integer[] numArr) {
        int i;
        Integer[] numArr2 = numArr;
        if (!isCancelled()) {
            i = this.c.f2621a;
            if (i != 2) {
                this.c.b(numArr2[0].intValue());
            }
        }
    }

    public dr(Cdo cdo, int i, int i2) {
        this.c = cdo;
        this.f2625a = i;
        this.f2626b = i2;
    }

    private Void a() {
        int i = this.f2625a;
        while (!isCancelled()) {
            publishProgress(Integer.valueOf(i));
            i++;
            if (i <= this.f2626b) {
                try {
                    Thread.sleep(400L);
                } catch (InterruptedException e) {
                }
            } else {
                return null;
            }
        }
        return null;
    }
}
