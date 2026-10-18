package com.google.android.finsky.utils;

import android.text.TextUtils;
import com.android.volley.ServerError;
import com.google.android.finsky.protos.qi;

/* loaded from: classes.dex */
final class an implements com.android.volley.t<qi> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.a.i f4740a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f4741b;
    final /* synthetic */ com.google.android.finsky.protos.gk c;
    final /* synthetic */ com.google.android.finsky.api.b d;
    final /* synthetic */ ap e;
    final /* synthetic */ aq f;
    final /* synthetic */ am g;

    an(am amVar, com.google.android.finsky.a.i iVar, String str, com.google.android.finsky.protos.gk gkVar, com.google.android.finsky.api.b bVar, ap apVar, aq aqVar) {
        this.g = amVar;
        this.f4740a = iVar;
        this.f4741b = str;
        this.c = gkVar;
        this.d = bVar;
        this.e = apVar;
        this.f = aqVar;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(qi qiVar) {
        qi qiVar2 = qiVar;
        this.f4740a.a(120, (String) null, (String) null, 0, (String) null, (com.google.android.finsky.a.n) null);
        if (!TextUtils.isEmpty(this.f4741b)) {
            bg.p.a((com.google.android.finsky.c.o<String>) this.f4741b);
        }
        if (this.c != null) {
            if (!TextUtils.isEmpty(qiVar2.f4295a)) {
                String str = qiVar2.f4295a;
                FinskyLog.a("Received device config token %s", str);
                this.g.a(str);
                this.d.d();
                this.d.e();
                if (this.e != null) {
                    this.e.a();
                }
            } else {
                FinskyLog.e("Unexpected - missing UploadDeviceConfigToken", new Object[0]);
                if (this.e != null) {
                    this.e.a(new ServerError());
                }
            }
        }
        this.g.a(this.f);
    }
}
