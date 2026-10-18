package android.support.design.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class r implements ai {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FloatingActionButton f141a;

    r(FloatingActionButton floatingActionButton) {
        this.f141a = floatingActionButton;
    }

    @Override // android.support.design.widget.ai
    public final float a() {
        return this.f141a.getSizeDimension() / 2.0f;
    }

    @Override // android.support.design.widget.ai
    public final void a(int i, int i2, int i3, int i4) {
        Rect rect;
        int i5;
        int i6;
        int i7;
        int i8;
        rect = this.f141a.h;
        rect.set(i, i2, i3, i4);
        FloatingActionButton floatingActionButton = this.f141a;
        i5 = this.f141a.f;
        i6 = this.f141a.f;
        i7 = this.f141a.f;
        i8 = this.f141a.f;
        floatingActionButton.setPadding(i5 + i, i6 + i2, i7 + i3, i8 + i4);
    }

    @Override // android.support.design.widget.ai
    public final void a(Drawable drawable) {
        super/*android.view.View*/.setBackgroundDrawable(drawable);
    }

    @Override // android.support.design.widget.ai
    public final boolean b() {
        boolean z;
        z = this.f141a.g;
        return z;
    }
}
