package com.google.android.finsky.widget;

import android.content.Context;
import com.google.android.finsky.gpkg.ai;
import com.google.android.finsky.widget.recommendation.RecommendedWidgetProvider;

/* loaded from: classes.dex */
final class t implements ai {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f5242a;

    t(Context context) {
        this.f5242a = context;
    }

    @Override // com.google.android.finsky.gpkg.ai
    public final void a(String str) {
        String c = s.c(str);
        if (c != null) {
            int[] a2 = r.a(this.f5242a).a(RecommendedWidgetProvider.class, c, true);
            if (a2.length > 0) {
                com.google.android.finsky.widget.recommendation.h.a(this.f5242a, a2);
            }
        }
    }
}
