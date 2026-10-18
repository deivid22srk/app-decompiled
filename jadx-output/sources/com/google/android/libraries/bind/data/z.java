package com.google.android.libraries.bind.data;

import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    final List<aa> f6710a;

    public final int a() {
        return this.f6710a.size();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.US, "  observers count: %d\n", Integer.valueOf(a())));
        for (aa aaVar : this.f6710a) {
            sb.append("    ");
            sb.append(aaVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
