package com.google.android.play.onboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.play.h;
import com.google.android.play.k;
import com.google.android.play.l;
import com.google.android.play.widget.PageIndicator;

/* loaded from: classes.dex */
public class OnboardNavFooter extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    protected final TextView f7000a;

    /* renamed from: b, reason: collision with root package name */
    protected final TextView f7001b;
    protected final PageIndicator c;

    public OnboardNavFooter(Context context) {
        this(context, null);
    }

    public OnboardNavFooter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OnboardNavFooter(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public OnboardNavFooter(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(l.play_onboard_nav_footer, this);
        setBackgroundColor(context.getResources().getColor(h.play_onboard_app_color_dark));
        this.f7000a = (TextView) findViewById(k.start_button);
        this.f7001b = (TextView) findViewById(k.end_button);
        this.c = (PageIndicator) findViewById(k.page_indicator);
    }
}
