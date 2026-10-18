package com.google.android.finsky.billing.lightpurchase.a;

import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

/* loaded from: classes.dex */
final class d implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f2289a;

    d(a aVar) {
        this.f2289a = aVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        RadioGroup radioGroup;
        Spinner spinner;
        if (z) {
            radioGroup = this.f2289a.ai;
            radioGroup.clearCheck();
            spinner = this.f2289a.ak;
            spinner.setEnabled(true);
        }
    }
}
