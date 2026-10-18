package com.google.android.finsky.layout;

/* loaded from: classes.dex */
final class cy extends com.google.android.finsky.j.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlaylistControlButtons f3211a;

    cy(PlaylistControlButtons playlistControlButtons) {
        this.f3211a = playlistControlButtons;
    }

    @Override // com.google.android.finsky.j.l
    public final void a(int i) {
        this.f3211a.setIsPlaying(i > 0);
    }
}
