package com.a.a.apkg.apkg;

import com.a.a.af;

/* loaded from: classes.dex */
public final class r implements com.a.a.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f911a;

    /* renamed from: b, reason: collision with root package name */
    public final int f912b;
    public final com.a.a.ab c;
    public int d;

    public r(o oVar, int i, com.a.a.ab abVar) {
        this.f911a = oVar;
        this.f912b = i;
        this.c = abVar;
    }

    @Override // com.a.a.w
    public final com.a.a.ab a() {
        return this.c;
    }

    @Override // com.a.a.w
    public final af a(com.a.a.ab abVar) {
        ac acVar;
        af f;
        ac acVar2;
        com.a.a.l lVar;
        this.d++;
        if (this.f912b > 0) {
            com.a.a.v vVar = this.f911a.f908b.i.get(this.f912b - 1);
            lVar = this.f911a.c;
            com.a.a.aA2 aVar = lVar.f1037b.f1016a;
            if (!abVar.a().getHost().equals(aVar.f885b) || com.a.a.apkg.l.a(abVar.a()) != aVar.c) {
                throw new IllegalStateException("network interceptor " + vVar + " must retain the same host and port");
            }
            if (this.d > 1) {
                throw new IllegalStateException("network interceptor " + vVar + " must call proceed() exactly once");
            }
        }
        if (this.f912b >= this.f911a.f908b.i.size()) {
            acVar = this.f911a.g;
            acVar.a(abVar);
            if (this.f911a.b() && abVar.d != null) {
                acVar2 = this.f911a.g;
                okio2.h a2 = okio2.o.a(acVar2.a(abVar, abVar.d.b()));
                abVar.d.a(a2);
                a2.close();
            }
            f = this.f911a.f();
            return f;
        }
        r rVar = new r(this.f911a, this.f912b + 1, abVar);
        com.a.a.v vVar2 = this.f911a.f908b.i.get(this.f912b);
        af a3 = vVar2.a(rVar);
        if (rVar.d != 1) {
            throw new IllegalStateException("network interceptor " + vVar2 + " must call proceed() exactly once");
        }
        return a3;
    }
}
