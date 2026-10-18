package com.google.android.play.drawer;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

/* loaded from: classes.dex */
class PlayDrawerDownloadSwitchRow extends RelativeLayout implements View.OnClickListener, Checkable, CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f6843a;

    /* renamed from: b, reason: collision with root package name */
    TextView f6844b;
    Switch c;
    int d;
    q e;
    private boolean f;
    private int g;
    private boolean h;
    private final View.OnTouchListener i;

    static {
        f6843a = Build.VERSION.SDK_INT >= 16;
    }

    public PlayDrawerDownloadSwitchRow(Context context) {
        this(context, null);
    }

    public PlayDrawerDownloadSwitchRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new p(this);
        this.g = getResources().getColor(com.google.android.play.h.play_fg_primary);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f6844b = (TextView) findViewById(com.google.android.play.k.action_text);
        setOnClickListener(this);
        View findViewById = findViewById(com.google.android.play.k.switch_button);
        if (findViewById != null) {
            this.c = (Switch) findViewById;
            this.c.setOnCheckedChangeListener(this);
            this.c.setOnTouchListener(this.i);
        }
    }

    @Override // android.widget.Checkable
    @SuppressLint({"NewApi"})
    public void setChecked(boolean z) {
        if (this.f != z) {
            a(z);
            if (!this.h) {
                if (Build.VERSION.SDK_INT >= 14) {
                    sendAccessibilityEvent(2048);
                }
                this.h = true;
                if (this.e != null) {
                    this.e.a(z);
                }
                this.h = false;
            }
        }
    }

    @TargetApi(14)
    public final void a(boolean z) {
        this.f = z;
        if (f6843a && this.c != null) {
            this.c.setChecked(z);
            this.c.refreshDrawableState();
        }
        this.f6844b.setTextColor(z ? this.d : this.g);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f) {
            mergeDrawableStates(onCreateDrawableState, new int[]{android.R.attr.checked});
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        toggle();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z != this.f) {
            setChecked(z);
        }
    }

    @Override // android.view.View
    @TargetApi(16)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(CheckBox.class.getName());
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(PlayDrawerDownloadSwitchRow.class.getName());
        accessibilityEvent.setChecked(this.f);
    }
}
