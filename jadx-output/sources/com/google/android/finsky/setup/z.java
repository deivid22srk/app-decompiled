package com.google.android.finsky.setup;

import android.view.View;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
final class z implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ VpaSelectionActivity f4684a;

    z(VpaSelectionActivity vpaSelectionActivity) {
        this.f4684a = vpaSelectionActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean[] zArr;
        CheckedTextView checkedTextView = (CheckedTextView) view;
        checkedTextView.toggle();
        int intValue = ((Integer) checkedTextView.getTag()).intValue();
        if (intValue > 0) {
            zArr = this.f4684a.q;
            zArr[intValue - 1] = checkedTextView.isChecked();
        } else {
            VpaSelectionActivity.a(this.f4684a, checkedTextView.isChecked());
        }
        this.f4684a.g();
    }
}
