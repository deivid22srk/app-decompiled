package com.android.a.a;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes.dex */
final class ak implements Comparator<e> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map f1072a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aj f1073b;

    ak(aj ajVar, Map map) {
        this.f1073b = ajVar;
        this.f1072a = map;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(e eVar, e eVar2) {
        return ((Integer) this.f1072a.get(eVar)).intValue() - ((Integer) this.f1072a.get(eVar2)).intValue();
    }
}
