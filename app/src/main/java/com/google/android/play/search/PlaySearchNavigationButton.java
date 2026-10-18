package com.google.android.play.search;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class PlaySearchNavigationButton extends ImageView implements n {

    /* renamed from: a, reason: collision with root package name */
    public int f7011a;

    /* renamed from: b, reason: collision with root package name */
    private l f7012b;
    private com.google.android.play.drawer.n c;
    private int d;

    public PlaySearchNavigationButton(Context context) {
        this(context, null);
    }

    public PlaySearchNavigationButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlaySearchNavigationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 0;
        this.c = new com.google.android.play.drawer.n(context);
        this.c.setColorFilter(new PorterDuffColorFilter(context.getResources().getColor(com.google.android.play.h.play_search_plate_navigation_button_color), PorterDuff.Mode.SRC_IN));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setImageDrawable(this.c);
        this.c.a(0, 0);
        setOnClickListener(new o(this));
        setMode(0);
    }

    public void setPlaySearchController(l lVar) {
        if (this.f7012b != null) {
            this.f7012b.b(this);
        }
        this.f7012b = lVar;
        this.f7012b.a(this);
    }

    public void setIdleModeDrawerIconState(int i) {
        this.d = i;
        setMode(i);
    }

    @Override // com.google.android.play.search.n
    public final void a(int i) {
        if (i == 1) {
            setMode(this.d);
        } else if (i == 3 || i == 2) {
            setMode(1);
        }
    }

    public final void a(int i, boolean z) {
        int i2;
        if (i == 0) {
            if (z) {
                i2 = com.google.android.play.m.play_drawer_close;
            } else {
                i2 = com.google.android.play.m.play_drawer_open;
            }
        } else if (this.f7012b != null && this.f7012b.f7048b == 1) {
            i2 = com.google.android.play.m.play_accessibility_search_plate_navigate_up_button;
        } else {
            i2 = com.google.android.play.m.play_accessibility_search_plate_back_button;
        }
        setContentDescription(getContext().getText(i2));
    }

    @Override // com.google.android.play.search.n
    public final void a(String str, boolean z) {
    }

    @Override // com.google.android.play.search.n
    public final void a(v vVar) {
    }

    @Override // com.google.android.play.search.n
    public final boolean b(v vVar) {
        return false;
    }

    @Override // com.google.android.play.search.n
    public final void a(String str) {
    }

    private void setMode(int i) {
        if (this.f7011a == i) {
            if (this.d == 1) {
                a(i, false);
            }
        } else {
            this.c.a(i, 2);
            a(i, false);
            this.f7011a = i;
        }
    }
}
