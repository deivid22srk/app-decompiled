package com.google.android.finsky.receivers;

import java.util.Comparator;

/* loaded from: classes.dex */
final class n implements Comparator<com.google.android.finsky.bpkg.b> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f4488a;

    n(h hVar) {
        this.f4488a = hVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(com.google.android.finsky.bpkg.b bVar, com.google.android.finsky.bpkg.b bVar2) {
        int i;
        int i2 = 2;
        int i3 = bVar.d.m;
        int i4 = bVar2.d.m;
        if ((i3 & 16384) != 0) {
            i = 0;
        } else {
            i = (i3 & 32768) != 0 ? 1 : 2;
        }
        if ((i4 & 16384) != 0) {
            i2 = 0;
        } else if ((i4 & 32768) != 0) {
            i2 = 1;
        }
        if (i != i2) {
            return i - i2;
        }
        boolean z = (i3 & 262144) != 0;
        if (z != ((i4 & 262144) != 0)) {
            return !z ? -1 : 1;
        }
        return 0;
    }
}
