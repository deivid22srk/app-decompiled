package com.google.android.finsky.download;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.el;

/* loaded from: classes.dex */
final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ContentValues f2719a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ el f2720b;
    final /* synthetic */ j c;

    l(j jVar, ContentValues contentValues, el elVar) {
        this.c = jVar;
        this.f2719a = contentValues;
        this.f2720b = elVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ContentResolver contentResolver;
        Uri uri;
        try {
            contentResolver = this.c.e;
            uri = j.f2716a;
            Uri insert = contentResolver.insert(uri, this.f2719a);
            j.c(insert);
            if (this.f2720b != null) {
                this.f2720b.a(insert);
            }
        } catch (IllegalArgumentException e) {
            FinskyLog.a(e, "Unable to insert download request for %s", this.f2719a.toString());
        }
    }
}
