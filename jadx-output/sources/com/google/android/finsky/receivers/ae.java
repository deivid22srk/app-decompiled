package com.google.android.finsky.receivers;

import android.os.AsyncTask;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class ae extends AsyncTask<Void, Void, Long> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ai f4442a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.b.t f4443b;
    final /* synthetic */ aj c;
    final /* synthetic */ u d;

    ae(u uVar, ai aiVar, com.google.android.finsky.b.t tVar, aj ajVar) {
        this.d = uVar;
        this.f4442a = aiVar;
        this.f4443b = tVar;
        this.c = ajVar;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Long l) {
        com.google.android.finsky.download.d dVar;
        com.google.android.finsky.download.d dVar2;
        String str;
        String str2;
        Long l2 = l;
        dVar = this.d.o;
        long j = dVar.f2698b;
        dVar2 = this.d.o;
        long j2 = ((j + dVar2.e) * 110) / 100;
        if (l2.longValue() >= j2) {
            str = this.d.n;
            FinskyLog.a("Downloading gzip for %s (%s)", this.d.e, str);
            this.f4442a.f4451b |= 512;
            this.d.a(this.f4443b, this.f4442a, this.c);
            return;
        }
        u.a(this.d, this.d.e, "gzip-free-space", 0, (Exception) null);
        str2 = this.d.n;
        FinskyLog.a("Cannot use gzipped apk %s (%s), need %d, free %d", this.d.e, str2, Long.valueOf(j2), l2);
        this.d.a(this.f4443b, this.f4442a, this.c);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Long doInBackground(Void[] voidArr) {
        return Long.valueOf(u.a(this.f4442a));
    }
}
