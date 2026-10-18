package com.google.android.play.image;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f6943a;

    i(e eVar) {
        this.f6943a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        HashMap hashMap2;
        this.f6943a.k = true;
        hashMap = this.f6943a.g;
        for (n nVar : hashMap.values()) {
            List<j> list = nVar.c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                j jVar = list.get(i);
                jVar.f6944a = nVar.f6947b;
                if (jVar.f6945b != null) {
                    jVar.f6945b.a_(jVar);
                }
            }
        }
        hashMap2 = this.f6943a.g;
        hashMap2.clear();
        e.f(this.f6943a);
        this.f6943a.k = false;
    }
}
