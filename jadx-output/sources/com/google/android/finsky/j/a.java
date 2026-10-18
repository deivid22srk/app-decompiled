package com.google.android.finsky.j;

import android.media.MediaPlayer;
import android.os.PowerManager;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public final class a extends MediaPlayer implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {

    /* renamed from: a, reason: collision with root package name */
    int f2884a = 0;

    /* renamed from: b, reason: collision with root package name */
    private MediaPlayer.OnPreparedListener f2885b = null;
    private MediaPlayer.OnCompletionListener c = null;
    private MediaPlayer.OnErrorListener d = null;
    private final l e;
    private final PowerManager.WakeLock f;

    public a(l lVar) {
        super.setOnPreparedListener(this);
        super.setOnCompletionListener(this);
        super.setOnErrorListener(this);
        this.e = lVar;
        this.f = ((PowerManager) FinskyApp.a().getSystemService("power")).newWakeLock(6, "MediaPlayerWrapper");
    }

    @Override // android.media.MediaPlayer
    public final void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.f2885b = onPreparedListener;
    }

    @Override // android.media.MediaPlayer
    public final void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.c = onCompletionListener;
    }

    @Override // android.media.MediaPlayer
    public final void reset() {
        super.reset();
        this.f2884a = 0;
        this.e.h();
        b();
    }

    public final void a() {
        super.reset();
        this.f2884a = 0;
        this.e.h();
    }

    @Override // android.media.MediaPlayer
    public final void setDataSource(String str) {
        super.setDataSource(str);
        this.f2884a = 1;
    }

    @Override // android.media.MediaPlayer
    public final void prepareAsync() {
        super.prepareAsync();
        this.f2884a = 2;
        this.e.d();
    }

    @Override // android.media.MediaPlayer
    public final void prepare() {
        super.prepare();
        this.f2884a = 3;
        this.e.e();
    }

    @Override // android.media.MediaPlayer
    public final void start() {
        super.start();
        this.f2884a = 4;
        this.e.a();
        if (!this.f.isHeld()) {
            this.f.acquire();
        }
    }

    @Override // android.media.MediaPlayer
    public final void stop() {
        super.stop();
        this.f2884a = 6;
        b();
    }

    @Override // android.media.MediaPlayer
    public final void pause() {
        super.pause();
        this.f2884a = 5;
        this.e.b();
        b();
    }

    @Override // android.media.MediaPlayer
    public final void release() {
        super.release();
        this.f2884a = 9;
        b();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.f2884a = 3;
        this.e.e();
        if (this.f2885b != null) {
            this.f2885b.onPrepared(mediaPlayer);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f2884a = 7;
        this.e.c();
        if (this.c != null) {
            this.c.onCompletion(mediaPlayer);
        }
        if (this.f2884a != 10) {
            b();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.f2884a = 8;
        this.e.g();
        if (this.d != null) {
            return this.d.onError(mediaPlayer, i, i2);
        }
        return false;
    }

    private void b() {
        if (this.f.isHeld()) {
            this.f.release();
        }
    }
}
