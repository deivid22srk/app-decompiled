package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class FamilyShareModuleLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    final LayoutInflater f2499a;

    /* renamed from: b, reason: collision with root package name */
    boolean f2500b;

    public FamilyShareModuleLayout(Context context) {
        this(context, null);
    }

    public FamilyShareModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2499a = LayoutInflater.from(context);
    }
}
