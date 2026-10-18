package com.google.android.finsky.jpkg;

import android.media.AudioManager;

/* loaded from: classes.dex */
public final class h implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f2894a;

    h(d dVar) {
        this.f2894a = dVar;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f2894a.i = i;
    }
}
