package com.google.android.finsky.utils;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.FinskyApp;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ef extends AsyncTask<Void, Void, Uri> {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f4845a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4846b;
    private final String c;
    private final ee d;
    private final boolean e;
    private final String f;
    private final boolean g;
    private volatile IOException h;
    private volatile hz i;
    private final Handler j;

    public /* synthetic */ ef(Uri uri, long j, String str, ee eeVar, boolean z, String str2, boolean z2, byte b2) {
        this(uri, j, str, eeVar, z, str2, z2);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Uri doInBackground(Void[] voidArr) {
        return a();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Uri uri) {
        int i;
        Uri uri2 = uri;
        if (this.h != null) {
            FinskyLog.c("Verification check of %s failed, exception=%s", this.f, this.h);
            i = 961;
        } else {
            if (this.i != null) {
                if (this.f4846b != this.i.f4980a) {
                    FinskyLog.c("Signature check of %s failed, size expected=%d actual=%d", this.f, Long.valueOf(this.f4846b), Long.valueOf(this.i.f4980a));
                    i = 919;
                } else if (!this.c.equals(this.i.f4981b)) {
                    FinskyLog.c("Signature check of %s failed, hash expected=%s actual=%s", this.f, this.c, this.i.f4981b);
                    i = 960;
                }
            }
            i = 0;
        }
        if (i != 0) {
            FinskyLog.c("Signature check failed, aborting installation. Error %d", Integer.valueOf(i));
            this.d.a(i, this.h != null ? this.h.getClass().getSimpleName() : null);
            return;
        }
        int i2 = this.e ? 3 : 2;
        if (this.g) {
            FinskyLog.a("Allowing downgrade install for %s", this.f);
            i2 |= 128;
        }
        eg egVar = new eg(this);
        if (uri2 == null) {
            uri2 = this.f4845a;
        }
        if (uri2 != null) {
            ea.a(FinskyApp.a(), uri2, egVar, i2);
        } else {
            this.d.a(-3, null);
        }
    }

    private ef(Uri uri, long j, String str, ee eeVar, boolean z, String str2, boolean z2) {
        this.j = new Handler(Looper.getMainLooper());
        this.f4845a = uri;
        this.f4846b = j;
        this.c = str;
        this.d = eeVar;
        this.e = z;
        this.f = str2;
        this.g = z2;
    }

    private Uri a() {
        this.h = null;
        if (this.f4846b >= 0) {
            try {
                this.i = hy.a(FinskyApp.a().getContentResolver().openInputStream(this.f4845a));
            } catch (IOException e) {
                this.h = e;
            }
        }
        return FinskyApp.a().o.b().b(this.f4845a);
    }
}
