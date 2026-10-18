package com.google.android.libraries.bind.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    final List<y> f6707a = new ArrayList();

    public final int a() {
        return this.f6707a.size();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.US, "  observers count: %d\n", Integer.valueOf(a())));
        for (y yVar : this.f6707a) {
            sb.append("    ");
            sb.append(yVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
