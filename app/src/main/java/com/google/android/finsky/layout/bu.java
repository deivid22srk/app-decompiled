package com.google.android.finsky.layout;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
final class bu implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LabelEditText f3171a;

    bu(LabelEditText labelEditText) {
        this.f3171a = labelEditText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        String str;
        int i;
        int i2;
        String str2;
        String str3;
        String str4;
        if (!z) {
            this.f3171a.f3011b = this.f3171a.getText().toString().trim();
            str = this.f3171a.f3011b;
            if (!TextUtils.isEmpty(str)) {
                i = this.f3171a.f3010a;
                if (i != 0) {
                    LabelEditText labelEditText = this.f3171a;
                    Context context = this.f3171a.getContext();
                    i2 = this.f3171a.f3010a;
                    str2 = this.f3171a.f3011b;
                    labelEditText.setText(context.getString(i2, str2));
                    return;
                }
                return;
            }
            return;
        }
        LabelEditText labelEditText2 = this.f3171a;
        str3 = this.f3171a.f3011b;
        labelEditText2.setText(str3);
        LabelEditText labelEditText3 = this.f3171a;
        str4 = this.f3171a.f3011b;
        labelEditText3.setSelection(str4.length());
    }
}
