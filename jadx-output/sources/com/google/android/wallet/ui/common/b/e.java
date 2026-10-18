package com.google.android.wallet.ui.common.b;

import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import com.google.android.wallet.ui.common.FormEditText;

/* loaded from: classes.dex */
public final class e extends a {

    /* renamed from: a, reason: collision with root package name */
    public double f7500a = Double.NEGATIVE_INFINITY;
    public double c = Double.POSITIVE_INFINITY;

    @Override // com.google.android.wallet.ui.common.b.a
    public final boolean a(TextView textView) {
        String charSequence;
        if (textView instanceof FormEditText) {
            charSequence = ((FormEditText) textView).getValue();
        } else {
            charSequence = textView.getText().toString();
        }
        if (TextUtils.isEmpty(charSequence)) {
            return true;
        }
        try {
            double parseDouble = Double.parseDouble(charSequence);
            if (parseDouble >= this.f7500a) {
                if (parseDouble <= this.c) {
                    return true;
                }
            }
            return false;
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(charSequence);
            Log.e("NumValueValidator", valueOf.length() != 0 ? "Could not parse numeric value for string: ".concat(valueOf) : new String("Could not parse numeric value for string: "), e);
            return false;
        }
    }
}
