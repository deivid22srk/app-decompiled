package com.a.a.a.b;

import java.io.IOException;
import java.util.Set;

/* loaded from: classes.dex */
final class ai extends com.a.a.a.c {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f936b;
    final /* synthetic */ a.f c;
    final /* synthetic */ int d;
    final /* synthetic */ boolean e;
    final /* synthetic */ ac f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(ac acVar, String str, Object[] objArr, int i, a.f fVar, int i2, boolean z) {
        super(str, objArr);
        this.f = acVar;
        this.f936b = i;
        this.c = fVar;
        this.d = i2;
        this.e = z;
    }

    @Override // com.a.a.a.c
    public final void a() {
        w wVar;
        Set set;
        try {
            wVar = this.f.v;
            wVar.a(this.c, this.d);
            this.f.i.a(this.f936b, a.CANCEL);
            synchronized (this.f) {
                set = this.f.y;
                set.remove(Integer.valueOf(this.f936b));
            }
        } catch (IOException e) {
        }
    }
}
