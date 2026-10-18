package com.google.android.finsky.receivers;

import android.os.AsyncTask;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.hy;
import com.google.android.finsky.utils.hz;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
final class af extends AsyncTask<Void, Void, Long> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ai f4444a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ File f4445b;
    final /* synthetic */ com.google.android.finsky.protos.ad c;
    final /* synthetic */ com.google.android.finsky.bpkg.t d;
    final /* synthetic */ aj e;
    final /* synthetic */ u f;

    af(u uVar, ai aiVar, File file, com.google.android.finsky.protos.ad adVar, com.google.android.finsky.bpkg.t tVar, aj ajVar) {
        this.f = uVar;
        this.f4444a = aiVar;
        this.f4445b = file;
        this.c = adVar;
        this.d = tVar;
        this.e = ajVar;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Long doInBackground(Void[] voidArr) {
        return a();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Long l) {
        com.google.android.finsky.download.d dVar;
        String str;
        String str2;
        Long l2 = l;
        if (l2.longValue() <= 0) {
            this.f.a(this.d, this.f4444a, this.e);
            return;
        }
        long intValue = com.google.android.finsky.cpkg.d.by.b().intValue();
        dVar = this.f.o;
        long j = (intValue * dVar.f2698b) / 100;
        if (l2.longValue() < j) {
            this.f.a(this.f.e, "free-space", 0, (Exception) null);
            str2 = this.f.n;
            FinskyLog.a("Cannot patch %s (%s), need %d, free %d", this.f.e, str2, Long.valueOf(j), l2);
            this.f.a(this.d, this.f4444a, this.e);
            return;
        }
        str = this.f.n;
        FinskyLog.a("Downloading patch for %s (%s)", this.f.e, str);
        this.f4444a.f4451b |= 4;
        this.f.a(this.d, this.f4444a, this.e);
    }

    private Long a() {
        String str;
        String str2;
        long valueOf;
        String str3;
        long a2 = u.a(this.f4444a);
        try {
            hz a3 = hy.a(new FileInputStream(this.f4445b));
            if (!this.c.c.equals(a3.f4981b)) {
                this.f.a(this.f.e, "base-file-signature", 0, (Exception) null);
                str3 = this.f.n;
                FinskyLog.a("Cannot patch %s (%s), bad hash, expect %s actual %s", this.f.e, str3, this.c.c, a3.f4981b);
                valueOf = -1L;
            } else {
                valueOf = Long.valueOf(a2);
            }
            return valueOf;
        } catch (FileNotFoundException e) {
            this.f.a(this.f.e, "base-file-FileNotFoundException", 0, e);
            str2 = this.f.n;
            FinskyLog.a("Cannot patch %s (%s), FileNotFoundException, %s", this.f.e, str2, this.f4445b);
            return -1L;
        } catch (IOException e2) {
            this.f.a(this.f.e, "base-file-otherexception", 0, e2);
            str = this.f.n;
            FinskyLog.a("Cannot patch %s (%s), unexpected exception %s", this.f.e, str, e2);
            return -1L;
        }
    }
}
