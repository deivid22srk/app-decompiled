package com.google.android.gms.ads.internal.overlay;

import android.view.TextureView;

/* loaded from: classes.dex */
public abstract class k extends TextureView {
    public abstract String a();

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void setMimeType(String str);

    public abstract void setVideoPath(String str);
}
