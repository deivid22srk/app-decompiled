package com.google.android.play.c;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes.dex */
final class g extends f {
    private g() {
        super((byte) 0);
    }

    /* synthetic */ g(byte b2) {
        this();
    }

    @Override // com.google.android.play.c.f
    protected final Drawable a(Resources resources, float f, float f2, float f3, float f4, int i, int i2, int i3) {
        return new c(resources, new b(resources, com.google.android.play.h.play_white, f, f2, f3, f4, i, i2, i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static c b(View view) {
        if (!(view instanceof com.google.android.play.layout.l)) {
            return null;
        }
        Drawable foreground = ((com.google.android.play.layout.l) view).getForeground();
        if (!(foreground instanceof c)) {
            throw new IllegalArgumentException("Given view was not initialized by this CardBubbleViewGroupDelegate");
        }
        return (c) foreground;
    }

    @Override // com.google.android.play.c.f
    protected final void e(View view, int i) {
        c b2 = b(view);
        if (b2 == null) {
            return;
        }
        b2.f6825a.a(i);
        b2.a(b2.getBounds());
    }

    @Override // com.google.android.play.c.f
    protected final void f(View view, int i) {
        c b2 = b(view);
        if (b2 == null) {
            return;
        }
        b2.f6825a.b(i);
        b2.a(b2.getBounds());
    }
}
