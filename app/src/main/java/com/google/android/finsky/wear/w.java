package com.google.android.finsky.wear;

import android.os.Bundle;
import com.google.android.finsky.protos.jt;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class w implements com.android.volley.t<jt> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5156a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f5157b;

    w(v vVar, String str) {
        this.f5157b = vVar;
        this.f5156a = str;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(jt jtVar) {
        jt jtVar2 = jtVar;
        if (jtVar2.f4008a == 1) {
            ArrayList arrayList = new ArrayList(jtVar2.c.length);
            for (com.google.android.finsky.protos.ab abVar : jtVar2.c) {
                Bundle bundle = new Bundle();
                bundle.putString("name", abVar.f3578a);
                bundle.putLong("version", abVar.c);
                bundle.putLong("size", abVar.e);
                bundle.putString("hash_sha256", abVar.g);
                bundle.putString("download_url", abVar.i);
                if (abVar.k.length > 0) {
                    bundle.putString("download_auth_cookie", abVar.k[0].f3955a + "=" + abVar.k[0].c);
                }
                arrayList.add(bundle);
            }
            v.a(this.f5157b, 0, this.f5156a, arrayList);
            return;
        }
        FinskyLog.d("Module delivery for node %s failed with error %d", this.f5157b.f5155b, Integer.valueOf(jtVar2.f4008a));
        v.a(this.f5157b, 1, this.f5156a, null);
    }
}
