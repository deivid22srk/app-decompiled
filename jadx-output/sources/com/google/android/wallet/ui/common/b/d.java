package com.google.android.wallet.ui.common.b;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.wallet.ui.common.FormEditText;

/* loaded from: classes.dex */
public class d extends a {

    /* renamed from: a, reason: collision with root package name */
    private final int f7499a;

    public d(int i) {
        this.f7499a = i;
    }

    public boolean b() {
        return true;
    }

    @Override // com.google.android.wallet.ui.common.b.a
    public final boolean a(TextView textView) {
        int trimmedLength;
        if (textView instanceof FormEditText) {
            trimmedLength = ((FormEditText) textView).getValueLength();
        } else {
            trimmedLength = TextUtils.getTrimmedLength(textView.getText());
        }
        return (!b() && trimmedLength == 0) || trimmedLength >= this.f7499a;
    }
}
