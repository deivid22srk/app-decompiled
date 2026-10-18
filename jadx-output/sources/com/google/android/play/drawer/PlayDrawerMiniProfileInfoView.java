package com.google.android.play.drawer;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.by;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
class PlayDrawerMiniProfileInfoView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    TextView f6846a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f6847b;
    private boolean c;
    private boolean d;

    public PlayDrawerMiniProfileInfoView(Context context) {
        this(context, null);
    }

    public PlayDrawerMiniProfileInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f6846a = (TextView) findViewById(com.google.android.play.k.mini_display_name);
        this.f6847b = (ImageView) findViewById(com.google.android.play.k.mini_toggle_account_list_button);
    }

    public final void a(boolean z) {
        if (this.c != z) {
            this.c = z;
            a();
            if (!z) {
                b(false);
            }
        }
    }

    public final void b(boolean z) {
        if (this.d != z) {
            this.d = z;
            a();
        }
    }

    private void a() {
        Resources resources = getResources();
        if (this.d) {
            this.f6847b.setVisibility(0);
            this.f6847b.setImageResource(com.google.android.play.j.ic_up_white_16);
            setContentDescription(resources.getString(com.google.android.play.m.play_drawer_content_description_hide_account_list_button));
        } else if (this.c) {
            this.f6847b.setVisibility(0);
            this.f6847b.setImageResource(com.google.android.play.j.ic_down_white_16);
            setContentDescription(resources.getString(com.google.android.play.m.play_drawer_content_description_show_account_list_button));
        } else {
            this.f6847b.setVisibility(8);
            setContentDescription(null);
        }
    }

    public final void a(View.OnClickListener onClickListener) {
        int n = by.n(this);
        int o = by.o(this);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        if (onClickListener == null) {
            setBackgroundResource(com.google.android.play.h.play_apps_primary);
        } else {
            setBackgroundResource(com.google.android.play.j.drawer_mini_profile_background);
        }
        by.a(this, n, paddingTop, o, paddingBottom);
        setOnClickListener(onClickListener);
        setClickable(onClickListener != null);
    }
}
