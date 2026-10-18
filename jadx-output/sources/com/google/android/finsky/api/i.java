package com.google.android.finsky.api;

import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
final class i implements Comparator<Integer> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f1957a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f1958b;

    i(g gVar, List list) {
        this.f1958b = gVar;
        this.f1957a = list;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Integer num, Integer num2) {
        return ((String) this.f1957a.get(num.intValue())).compareTo((String) this.f1957a.get(num2.intValue()));
    }
}
