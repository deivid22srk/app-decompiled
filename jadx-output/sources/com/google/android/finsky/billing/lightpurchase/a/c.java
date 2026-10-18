package com.google.android.finsky.billing.lightpurchase.a;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

/* loaded from: classes.dex */
final class c implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f2288a;

    c(a aVar) {
        this.f2288a = aVar;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        RadioButton radioButton;
        RadioGroup radioGroup2;
        RadioButton radioButton2;
        Spinner spinner;
        radioButton = this.f2288a.aj;
        if (radioButton != null && i != -1) {
            radioGroup2 = this.f2288a.ai;
            if (((RadioButton) radioGroup2.findViewById(i)).isChecked()) {
                radioButton2 = this.f2288a.aj;
                radioButton2.setChecked(false);
                spinner = this.f2288a.ak;
                spinner.setEnabled(false);
            }
        }
    }
}
