package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class gc extends android.support.v7.a.b {

    /* renamed from: b, reason: collision with root package name */
    int f844b;

    public gc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f844b = 0;
    }

    public gc() {
        super(-2);
        this.f844b = 0;
        this.f491a = 8388627;
    }

    public gc(byte b2) {
        super(-1);
        this.f844b = 0;
        this.f491a = 17;
    }

    public gc(gc gcVar) {
        super((android.support.v7.a.b) gcVar);
        this.f844b = 0;
        this.f844b = gcVar.f844b;
    }

    public gc(android.support.v7.a.b bVar) {
        super(bVar);
        this.f844b = 0;
    }

    public gc(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f844b = 0;
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }

    public gc(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f844b = 0;
    }
}
