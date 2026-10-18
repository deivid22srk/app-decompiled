package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class au {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f5705a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f5706b;

    private au(Object obj) {
        this.f5706b = av.a(obj);
        this.f5705a = new ArrayList();
    }


    public final au a(String str, Object obj) {
        this.f5705a.add(((String) av.a(str)) + "=" + String.valueOf(obj));
        return this;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder(100).append(this.f5706b.getClass().getSimpleName()).append('{');
        int size = this.f5705a.size();
        for (int i = 0; i < size; i++) {
            append.append(this.f5705a.get(i));
            if (i < size - 1) {
                append.append(", ");
            }
        }
        return append.append('}').toString();
    }
}
