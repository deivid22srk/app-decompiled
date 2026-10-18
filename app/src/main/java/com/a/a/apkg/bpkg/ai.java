package com.a.a.apkg.bpkg;

import java.io.IOException;
import java.util.Set;

/* loaded from: classes.dex */
final class ai extends com.a.a.apkg.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f936b;
    public final /* synthetic */ okio2.f c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ac f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(ac acVar, String str, Object[] objArr, int i, okio2.f fVar, int i2, boolean z) {
        super(str, objArr);
        this.f = acVar;
        this.f936b = i;
        this.c = fVar;
        this.d = i2;
        this.e = z;
    }

    @Override // com.a.a.apkg.c
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
