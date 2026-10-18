package com.google.android.play.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.by;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.play.o;

/* loaded from: classes.dex */
public class PlayActionButton extends Button {

    /* renamed from: a, reason: collision with root package name */
    private int f6962a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6963b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private String h;
    private int i;

    public PlayActionButton(Context context) {
        this(context, null);
    }

    public PlayActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.PlayActionButton);
        this.f6963b = obtainStyledAttributes.getBoolean(o.PlayActionButton_draw_as_label, false);
        this.c = obtainStyledAttributes.getBoolean(o.PlayActionButton_use_all_caps_in_label_mode, true);
        this.f6962a = obtainStyledAttributes.getInt(o.PlayActionButton_action_style, 0);
        this.d = obtainStyledAttributes.getDimensionPixelSize(o.PlayActionButton_action_xpadding, 0);
        this.e = obtainStyledAttributes.getDimensionPixelSize(o.PlayActionButton_action_top_padding, 0);
        this.f = obtainStyledAttributes.getDimensionPixelSize(o.PlayActionButton_action_bottom_padding, 0);
        this.g = obtainStyledAttributes.getInt(o.PlayActionButton_local_priority, -1);
        obtainStyledAttributes.recycle();
    }

    public void setDrawAsLabel(boolean z) {
        if (this.f6963b != z) {
            this.f6963b = z;
            b();
        }
    }

    public void setActionStyle(int i) {
        if (this.f6962a != i) {
            this.f6962a = i;
            b();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        Log.e("PlayCommon", "Don't call PlayActionButton.setOnClickListener() directly");
        Log.wtf("PlayCommon", "Don't call PlayActionButton.setOnClickListener() directly");
        throw new UnsupportedOperationException("Call PlayActionButton.configure()");
    }

    public final void a() {
        super.setOnClickListener(null);
        setClickable(false);
        setFocusable(false);
    }

    public final void a(int i, int i2, View.OnClickListener onClickListener) {
        a(i, getResources().getString(i2), onClickListener);
    }

    public final void a(int i, String str, View.OnClickListener onClickListener) {
        this.h = str;
        this.i = i;
        if (onClickListener != null) {
            setFocusable(true);
            super.setOnClickListener(onClickListener);
            setClickable(true);
        } else {
            setFocusable(false);
            super.setOnClickListener(null);
            setClickable(false);
        }
        b();
    }

    private void b() {
        setText((this.h == null || (this.f6963b && !this.c)) ? this.h : this.h.toUpperCase());
        Context context = getContext();
        if (this.f6963b) {
            setBackgroundResource(isClickable() ? com.google.android.play.j.play_highlight_overlay_light : 0);
            setTextColor(com.google.android.play.utils.h.a(context, this.f6962a == 2 ? 0 : this.i));
        } else {
            switch (this.f6962a) {
                case 0:
                    setBackgroundResource(com.google.android.play.utils.h.a(this.i));
                    setTextColor(getResources().getColorStateList(com.google.android.play.h.play_action_button_text));
                    break;
                case 1:
                    setBackgroundResource(com.google.android.play.j.play_action_button_secondary);
                    setTextColor(com.google.android.play.utils.h.a(context, this.i));
                    break;
                case 2:
                    setBackgroundResource(com.google.android.play.utils.h.b(this.i));
                    setTextColor(com.google.android.play.utils.h.a(context, this.i));
                    break;
            }
        }
        if (!(this.f6963b && !isClickable())) {
            by.a(this, this.d, this.e, this.d, this.f);
        } else {
            by.a(this, 0, 0, 0, 0);
        }
    }

    public int getPriority() {
        return this.g;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        com.google.android.play.utils.g.a(accessibilityNodeInfo, this.f6963b && !isClickable() ? TextView.class.getName() : null);
    }
}
