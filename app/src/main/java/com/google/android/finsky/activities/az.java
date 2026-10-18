package com.google.android.finsky.activities;

import android.widget.RadioGroup;

/* loaded from: classes.dex */
final class az implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ContentFilterActivity f1562a;

    az(ContentFilterActivity contentFilterActivity) {
        this.f1562a = contentFilterActivity;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.f1562a.p = (com.google.android.finsky.cpkg.c) radioGroup.findViewById(i).getTag();
    }
}
