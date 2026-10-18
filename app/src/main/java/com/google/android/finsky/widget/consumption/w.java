package com.google.android.finsky.widget.consumption;

import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class w {

    /* renamed from: a, reason: collision with root package name */
    RemoteViews f5203a;

    /* renamed from: b, reason: collision with root package name */
    boolean f5204b;
    List<k> c;
    boolean d;
    boolean e;
    int f;
    final /* synthetic */ NowPlayingWidgetProvider g;

    /* JADX WARN: Multi-variable type inference failed */
    public w(NowPlayingWidgetProvider nowPlayingWidgetProvider, RemoteViews remoteViews, List<k> list) {
        this.g = nowPlayingWidgetProvider;
        this.f5204b = true;
        this.c = new ArrayList();
        this.d = false;
        this.e = false;
        this.f5203a = null;
        this.f5204b = remoteViews;
        this.c = list;
    }

    public w(NowPlayingWidgetProvider nowPlayingWidgetProvider) {
        this.g = nowPlayingWidgetProvider;
        this.f5204b = true;
        this.c = new ArrayList();
        this.d = false;
        this.e = false;
    }
}
