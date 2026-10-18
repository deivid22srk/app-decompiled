package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.google.android.finsky.layout.DetailsSectionStack;

/* loaded from: classes.dex */
public class SubscriptionsModuleLayout extends DetailsSectionStack {

    /* renamed from: a, reason: collision with root package name */
    final LayoutInflater f2514a;

    /* renamed from: b, reason: collision with root package name */
    boolean f2515b;

    public SubscriptionsModuleLayout(Context context) {
        this(context, null);
    }

    public SubscriptionsModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2514a = LayoutInflater.from(context);
    }
}
