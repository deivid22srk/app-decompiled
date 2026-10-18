package com.google.android.finsky.layout.play;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import com.caverock.androidsvg.SVGParseException;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class v implements com.google.android.play.drawer.t {

    /* renamed from: a, reason: collision with root package name */
    private final int f3515a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3516b;
    private final int c;

    public v(int i, int i2, int i3) {
        this.f3515a = i;
        this.f3516b = i3;
        this.c = i2;
    }

    @Override // com.google.android.play.drawer.t
    public final Drawable a(Resources resources, boolean z) {
        try {
            return com.caverock.androidsvg.q.a(resources, this.f3515a, new com.caverock.androidsvg.at().a(z ? resources.getColor(this.f3516b) : resources.getColor(this.c)));
        } catch (SVGParseException e) {
            FinskyLog.e("Bad svg resource: %d", Integer.valueOf(this.f3515a));
            return new ShapeDrawable();
        }
    }
}
