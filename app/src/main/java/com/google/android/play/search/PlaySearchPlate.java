package com.google.android.play.search;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class PlaySearchPlate extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public PlaySearchNavigationButton f7015a;

    /* renamed from: b, reason: collision with root package name */
    PlaySearchPlateTextContainer f7016b;
    private PlaySearchActionButton c;

    public PlaySearchPlate(Context context) {
        this(context, null);
    }

    public PlaySearchPlate(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlaySearchPlate(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f7015a = (PlaySearchNavigationButton) findViewById(com.google.android.play.k.navigation_button);
        this.f7016b = (PlaySearchPlateTextContainer) findViewById(com.google.android.play.k.text_container);
        this.c = (PlaySearchActionButton) findViewById(com.google.android.play.k.action_button);
    }

    public void setPlaySearchController(l lVar) {
        this.f7015a.setPlaySearchController(lVar);
        this.f7016b.setPlaySearchController(lVar);
        this.c.setPlaySearchController(lVar);
    }

    public void setHint(CharSequence charSequence) {
        this.f7016b.setHint(charSequence);
    }

    public int getFocusViewId() {
        return com.google.android.play.k.search_box_text_input;
    }

    public void setIdleModeDrawerIconState(int i) {
        this.f7015a.setIdleModeDrawerIconState(i);
    }
}
