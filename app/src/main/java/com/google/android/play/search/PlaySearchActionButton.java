package com.google.android.play.search;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class PlaySearchActionButton extends ImageView implements n {

    /* renamed from: a, reason: collision with root package name */
    private l f7009a;

    /* renamed from: b, reason: collision with root package name */
    private Drawable f7010b;
    private Drawable c;
    private final boolean d;
    private int e;

    public PlaySearchActionButton(Context context) {
        this(context, null);
    }

    public PlaySearchActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlaySearchActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 1;
        this.f7010b = context.getResources().getDrawable(com.google.android.play.j.play_ic_clear);
        this.c = context.getResources().getDrawable(com.google.android.play.j.ic_mic_dark);
        this.d = ai.a(context);
        setMode(2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new k(this));
    }

    public void setPlaySearchController(l lVar) {
        if (this.f7009a != null) {
            this.f7009a.b(this);
        }
        this.f7009a = lVar;
        this.f7009a.a(this);
    }

    @Override // com.google.android.play.search.n
    public final void a(int i) {
        a();
    }

    @Override // com.google.android.play.search.n
    public final void a(String str, boolean z) {
        a();
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

    private void a() {
        if (this.f7009a == null) {
            return;
        }
        String str = this.f7009a.d;
        if (this.d && (this.f7009a.a() || TextUtils.isEmpty(str))) {
            setMode(2);
        } else {
            setMode(1);
        }
    }

    private void setMode(int i) {
        Drawable drawable;
        int i2;
        if (this.e != i) {
            this.e = i;
            if (i == 1) {
                drawable = this.f7010b;
                i2 = com.google.android.play.m.play_accessibility_search_plate_clear;
            } else if (i != 2) {
                drawable = null;
                i2 = 0;
            } else {
                drawable = this.c;
                i2 = com.google.android.play.m.play_accessibility_search_plate_voice_search_button;
            }
            if (drawable != null) {
                setImageDrawable(drawable);
                setContentDescription(getContext().getResources().getString(i2));
                setVisibility(0);
            }
        }
    }
}
