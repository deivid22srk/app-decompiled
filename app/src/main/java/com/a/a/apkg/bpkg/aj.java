package com.a.a.apkg.bpkg;

import java.util.Set;

/* loaded from: classes.dex */
final class aj extends com.a.a.apkg.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f937b;
    public final /* synthetic */ a c;
    public final /* synthetic */ ac d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(ac acVar, String str, Object[] objArr, int i, a aVar) {
        super(str, objArr);
        this.d = acVar;
        this.f937b = i;
        this.c = aVar;
    }

    @Override // com.a.a.apkg.c
    public final void a() {
        w wVar;
        Set set;
        wVar = this.d.v;
        wVar.c();
        synchronized (this.d) {
            set = this.d.y;
            set.remove(Integer.valueOf(this.f937b));
        }
    }
}
