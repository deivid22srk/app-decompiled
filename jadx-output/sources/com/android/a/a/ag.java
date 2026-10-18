package com.android.a.a;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
final class ag implements ab {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aq f1064a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f1065b;
    final /* synthetic */ Queue c;
    final /* synthetic */ af d;

    ag(af afVar, aq aqVar, ab abVar, Queue queue) {
        this.d = afVar;
        this.f1064a = aqVar;
        this.f1065b = abVar;
        this.c = queue;
    }

    @Override // com.android.a.a.ab
    public final void a() {
        List<av> a2 = this.d.a(this.f1064a);
        if (a2.isEmpty()) {
            if (this.f1065b != null) {
                this.f1065b.a();
                return;
            }
            return;
        }
        if (this.c.size() > 0) {
            String str = (String) this.c.remove();
            for (av avVar : a2) {
                if (avVar.a(str)) {
                    aq a3 = af.a(this.d, this.f1064a, avVar.f1087a);
                    this.d.a(a3, (Queue<String>) this.c, this.f1065b);
                    return;
                }
            }
        }
        this.d.a(af.a(this.d, this.f1064a, a2.get(0).f1087a), (Queue<String>) new LinkedList(), this.f1065b);
    }
}
