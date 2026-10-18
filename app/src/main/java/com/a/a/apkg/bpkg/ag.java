package com.a.a.apkg.bpkg;

import java.io.IOException;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
final class ag extends com.a.a.apkg.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f934b;
    public final /* synthetic */ List c;
    public final /* synthetic */ ac d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(ac acVar, String str, Object[] objArr, int i, List list) {
        super(str, objArr);
        this.d = acVar;
        this.f934b = i;
        this.c = list;
    }

    @Override // com.a.a.apkg.c
    public final void a() {
        w wVar;
        Set set;
        wVar = this.d.v;
        wVar.a();
        try {
            this.d.i.a(this.f934b, a.CANCEL);
            synchronized (this.d) {
                set = this.d.y;
                set.remove(Integer.valueOf(this.f934b));
            }
        } catch (IOException e) {
        }
    }
}
