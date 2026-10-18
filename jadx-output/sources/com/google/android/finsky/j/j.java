package com.google.android.finsky.j;

import android.media.MediaPlayer;

/* loaded from: classes.dex */
final class j implements MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f2896a;

    j(d dVar) {
        this.f2896a = dVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f2896a.f2889a.c();
        this.f2896a.d.remove(this.f2896a.e);
        if (!this.f2896a.c()) {
            return;
        }
        this.f2896a.f2890b.f2884a = 10;
    }
}
