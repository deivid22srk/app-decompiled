package com.google.android.finsky.layout.play;

import com.google.android.finsky.protos.ol;

/* loaded from: classes.dex */
final class bm implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ol f3443a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlayCardRateAndSuggestClusterView f3444b;

    bm(PlayCardRateAndSuggestClusterView playCardRateAndSuggestClusterView, ol olVar) {
        this.f3444b = playCardRateAndSuggestClusterView;
        this.f3443a = olVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PlayCardRateAndSuggestContentScroller playCardRateAndSuggestContentScroller;
        playCardRateAndSuggestContentScroller = this.f3444b.i;
        playCardRateAndSuggestContentScroller.a();
        this.f3444b.j.a(this.f3443a.f4213a, com.google.android.finsky.utils.bc.a(this.f3443a.c));
    }
}
