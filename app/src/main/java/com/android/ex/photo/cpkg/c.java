package com.android.ex.photo.cpkg;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f1145a;

    /* renamed from: b, reason: collision with root package name */
    public Bitmap f1146b;
    public int c;

    public final Drawable a(Resources resources) {
        if (resources == null) {
            throw new IllegalArgumentException("resources can not be null!");
        }
        if (this.f1145a != null) {
            return this.f1145a;
        }
        if (this.f1146b == null) {
            return null;
        }
        return new BitmapDrawable(resources, this.f1146b);
    }
}
