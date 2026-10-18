package com.a.a.apkg.apkg;

/* loaded from: classes.dex */
abstract class g implements okio2.y {

    /* renamed from: a, reason: collision with root package name */
    public boolean f899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f900b;

    public g(f fVar) {
        this.f900b = fVar;
    }

    /* synthetic */ g(f fVar, byte b2) {
        this(fVar);
    }

    @Override // okio2.y
    public final okio2.z a() {
        okio2.i iVar;
        iVar = this.f900b.c;
        return iVar.a();
    }

    public final void a(boolean z) {
        int i;
        int i2;
        com.a.a.l lVar;
        int i3;
        com.a.a.m mVar;
        com.a.a.l lVar2;
        int i4;
        i = this.f900b.e;
        if (i != 5) {
            StringBuilder sb = new StringBuilder("state: ");
            i4 = this.f900b.e;
            throw new IllegalStateException(sb.append(i4).toString());
        }
        this.f900b.e = 0;
        if (z) {
            i3 = this.f900b.f;
            if (i3 == 1) {
                f.e(this.f900b);
                com.a.a.apkg.a aVar = com.a.a.apkg.a.f887b;
                mVar = this.f900b.f897a;
                lVar2 = this.f900b.f898b;
                aVar.a(mVar, lVar2);
                return;
            }
        }
        i2 = this.f900b.f;
        if (i2 == 2) {
            this.f900b.e = 6;
            lVar = this.f900b.f898b;
            lVar.c.close();
        }
    }

    public final void b() {
        com.a.a.l lVar;
        lVar = this.f900b.f898b;
        com.a.a.apkg.l.a(lVar.c);
        this.f900b.e = 6;
    }
}
