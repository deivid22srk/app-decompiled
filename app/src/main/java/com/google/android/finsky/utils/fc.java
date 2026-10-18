package com.google.android.finsky.utils;

import java.util.Set;

/* loaded from: classes.dex */
final class fc implements com.google.android.play.layout.c {
    fc() {
    }

    @Override // com.google.android.play.layout.c
    public final void a(com.google.android.play.layout.a aVar) {
        Set set;
        set = ey.f4862a;
        set.add(aVar);
    }

    @Override // com.google.android.play.layout.c
    public final void b(com.google.android.play.layout.a aVar) {
        Set set;
        set = ey.f4862a;
        set.remove(aVar);
    }
}
