package com.google.android.wallet.common.pub.a.a;

import com.google.android.wallet.analytics.f;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List<f> f7287a;

    public a(List<f> list) {
        this.f7287a = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = this.f7287a.size();
        for (int i = 0; i < size; i++) {
            if (sb.length() > 0) {
                sb.append(" -> ");
            }
            sb.append(this.f7287a.get(i).f7240a);
        }
        return sb.toString();
    }
}
