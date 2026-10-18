package com.google.android.wallet.ui.common.b;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.wallet.ui.common.FormEditText;

/* loaded from: classes.dex */
public final class g extends a {
    public g(CharSequence charSequence) {
        super(charSequence);
    }

    @Override // com.google.android.wallet.ui.common.b.a
    public final boolean a(TextView textView) {
        int trimmedLength;
        if (textView instanceof FormEditText) {
            trimmedLength = ((FormEditText) textView).getValueLength();
        } else {
            trimmedLength = TextUtils.getTrimmedLength(textView.getText());
        }
        return trimmedLength > 0;
    }
}
