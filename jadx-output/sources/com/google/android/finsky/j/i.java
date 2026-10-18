package com.google.android.finsky.j;

import android.media.MediaPlayer;

/* loaded from: classes.dex */
final class i implements MediaPlayer.OnPreparedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f2895a;

    i(d dVar) {
        this.f2895a = dVar;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.f2895a.f2890b.start();
    }
}
