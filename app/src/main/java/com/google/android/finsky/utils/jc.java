package com.google.android.finsky.utils;

import com.google.android.finsky.protos.qv;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes.dex */
final class jc implements com.android.volley.t<com.google.android.finsky.protos.id> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5022a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f5023b;
    final /* synthetic */ com.google.android.finsky.cpkg.o c;

    jc(String str, int i, com.google.android.finsky.cpkg.o oVar) {
        this.f5022a = str;
        this.f5023b = i;
        this.c = oVar;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(com.google.android.finsky.protos.id idVar) {
        com.google.android.finsky.protos.id idVar2 = idVar;
        qv c = jb.c(this.f5022a);
        try {
            if (this.f5023b != 7 && c != null) {
                switch (this.f5023b) {
                    case 1:
                        c.f4314a = null;
                        break;
                    case 2:
                        c.f4315b = null;
                        break;
                    case 3:
                        c.c = null;
                        break;
                    case 4:
                        c.d = null;
                        break;
                    case 5:
                        c.e = null;
                        break;
                    case 6:
                        c.f = null;
                        break;
                }
                byte[] a2 = com.google.protobuf.nano.c.a(idVar2.f3945a);
                this.c.a((com.google.android.finsky.cpkg.o) dg.a((qv) com.google.protobuf.nano.c.a(c, a2, a2.length)));
            } else {
                this.c.a((com.google.android.finsky.cpkg.o) dg.a(idVar2.f3945a));
            }
            jb.b(this.f5022a, this.f5023b);
            jb.a(this.f5022a, idVar2.f3946b);
            jb.a(true);
        } catch (InvalidProtocolBufferNanoException e) {
            FinskyLog.b(e, "Failed parsing GetUserSettings response", new Object[0]);
            jb.a(false);
        }
    }
}
