package com.google.android.finsky.activities;

import android.widget.RadioGroup;
import com.google.android.finsky.layout.ButtonBar;

/* loaded from: classes.dex */
final class cs implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ButtonBar f1665a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cr f1666b;

    cs(cr crVar, ButtonBar buttonBar) {
        this.f1666b = crVar;
        this.f1665a = buttonBar;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.f1665a.setPositiveButtonEnabled(true);
    }
}
