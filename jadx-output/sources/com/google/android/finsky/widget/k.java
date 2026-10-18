package com.google.android.finsky.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.vending.R;

/* loaded from: classes.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    final ViewGroup f5216a;

    /* renamed from: b, reason: collision with root package name */
    final TextView f5217b;
    final ImageView c;

    public k(View view) {
        this.f5216a = (ViewGroup) view.findViewById(R.id.container);
        this.f5217b = (TextView) view.findViewById(R.id.backend_name);
        this.c = (ImageView) view.findViewById(R.id.backend_icon);
        view.setTag(this);
    }
}
