package com.google.android.finsky.widget.consumption;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.Map;

/* loaded from: classes.dex */
final class t implements f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f5197a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f5198b;
    final /* synthetic */ NowPlayingWidgetProvider c;

    t(NowPlayingWidgetProvider nowPlayingWidgetProvider, Context context, int i) {
        this.c = nowPlayingWidgetProvider;
        this.f5197a = context;
        this.f5198b = i;
    }

    @Override // com.google.android.finsky.widget.consumption.f
    public final void a(Map<k, Bitmap> map) {
        this.c.a(this.f5197a, AppWidgetManager.getInstance(this.f5197a), map, this.f5198b);
    }
}
