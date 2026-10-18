package com.google.android.wallet.ui.common.bpkg;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.wallet.ui.common.FormEditText;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f7501a;

    public f(CharSequence charSequence, Pattern pattern) {
        super(charSequence);
        if (pattern == null) {
            throw new IllegalArgumentException("pattern must not be null");
        }
        this.f7501a = pattern;
    }

    @Override // com.google.android.wallet.ui.common.bpkg.a
    public final boolean a(TextView textView) {
        if (!(textView instanceof FormEditText)) {
            return TextUtils.isEmpty(textView.getText()) || this.f7501a.matcher(textView.getText()).matches();
        }
        FormEditText formEditText = (FormEditText) textView;
        return formEditText.getValueLength() == 0 || this.f7501a.matcher(formEditText.getValue()).matches();
    }
}
