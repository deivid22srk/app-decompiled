package com.google.android.libraries.bind.data;

import java.util.List;

/* loaded from: classes.dex */
public final class w extends b {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f6705a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6706b;

    public w(int i, int i2) {
        super(com.google.android.libraries.bind.apkg.o.c);
        this.f6705a = Integer.valueOf(i);
        this.f6706b = i2;
    }

    @Override // com.google.android.libraries.bind.data.a, com.google.android.libraries.bind.data.q
    public final List<Data> a(List<Data> list) {
        if (list.size() > 0 && !this.f6705a.equals(list.get(0).c(this.f6706b))) {
            return null;
        }
        return list;
    }
}
