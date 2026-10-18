package com.google.android.wallet.common.pub.a.a;

import com.google.android.wallet.analytics.f;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final f f7288a;

    public b(f fVar) {
        this.f7288a = fVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append('\n');
        a(this.f7288a, sb, 0);
        return sb.toString();
    }

    private static void a(f fVar, StringBuilder sb, int i) {
        StringBuilder sb2 = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb2.append("| ");
        }
        sb.append((CharSequence) sb2);
        sb.append("|-");
        sb.append(fVar.f7240a);
        sb.append(" tokenLen=").append(fVar.f7241b.length);
        sb.append('\n');
        if (fVar.c != null) {
            int i3 = i + 1;
            int size = fVar.c.size();
            for (int i4 = 0; i4 < size; i4++) {
                a(fVar.c.get(i4), sb, i3);
            }
        }
    }
}
