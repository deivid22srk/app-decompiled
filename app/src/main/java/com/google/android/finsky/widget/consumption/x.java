package com.google.android.finsky.widget.consumption;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class x extends ArrayList<List<g>> {

    /* renamed from: a, reason: collision with root package name */
    final boolean f5205a;

    /* renamed from: b, reason: collision with root package name */
    final int f5206b;
    final /* synthetic */ NowPlayingWidgetProvider c;

    public x(NowPlayingWidgetProvider nowPlayingWidgetProvider, List<List<g>> list, boolean z, int i) {
        this.c = nowPlayingWidgetProvider;
        this.f5205a = z;
        this.f5206b = i;
        if (list != null) {
            addAll(list);
        }
    }
}
