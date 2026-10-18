package com.a.a.a.b;

import java.io.IOException;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
final class ah extends com.a.a.a.c {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f935b;
    final /* synthetic */ List c;
    final /* synthetic */ boolean d;
    final /* synthetic */ ac e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(ac acVar, String str, Object[] objArr, int i, List list, boolean z) {
        super(str, objArr);
        this.e = acVar;
        this.f935b = i;
        this.c = list;
        this.d = z;
    }

    @Override // com.a.a.a.c
    public final void a() {
        w wVar;
        Set set;
        wVar = this.e.v;
        wVar.b();
        try {
            this.e.i.a(this.f935b, a.CANCEL);
            synchronized (this.e) {
                set = this.e.y;
                set.remove(Integer.valueOf(this.f935b));
            }
        } catch (IOException e) {
        }
    }
}
