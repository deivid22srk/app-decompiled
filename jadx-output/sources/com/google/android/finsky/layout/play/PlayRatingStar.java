package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public class PlayRatingStar extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    int f3367a;

    /* renamed from: b, reason: collision with root package name */
    int f3368b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private cv n;

    public PlayRatingStar(Context context) {
        this(context, null);
    }

    public PlayRatingStar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getIndex() {
        return this.j;
    }

    public void setOnPressStateChangeListener(cv cvVar) {
        this.n = cvVar;
    }

    public void setFocused(boolean z) {
        this.l = z;
        a();
    }

    public void setFilled(boolean z) {
        this.k = z;
        a();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        boolean isPressed = isPressed();
        if (this.m != isPressed) {
            if (this.n != null) {
                this.n.a(this, isPressed);
            }
            this.m = isPressed;
        }
    }

    final void a() {
        if (ik.b()) {
            Resources resources = getContext().getResources();
            Drawable a2 = this.k ? com.caverock.androidsvg.q.a(resources, this.f3368b, this.e) : com.caverock.androidsvg.q.a(resources, this.f3367a, this.d);
            if (this.l) {
                setImageDrawable(new LayerDrawable(new Drawable[]{a2, resources.getDrawable(this.c)}));
                return;
            } else {
                setImageDrawable(a2);
                return;
            }
        }
        if (this.k) {
            setImageResource(this.l ? this.i : this.h);
        } else {
            setImageResource(this.l ? this.g : this.f);
        }
    }
}
