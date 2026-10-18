package com.google.android.wallet.ui.common;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
final class aj implements l {

    /* renamed from: a, reason: collision with root package name */
    private FormSpinner f7483a;

    aj(FormSpinner formSpinner) {
        this.f7483a = formSpinner;
    }

    @Override // com.google.android.wallet.ui.common.l
    public final void a(CharSequence charSequence) {
        View selectedView = this.f7483a.getSelectedView();
        if (selectedView instanceof TextView) {
            ((TextView) selectedView).setError(charSequence);
        } else {
            String valueOf = String.valueOf(selectedView);
            Log.w("FormSpinner", new StringBuilder(String.valueOf(valueOf).length() + 26).append("Cannot set error on view: ").append(valueOf).toString());
        }
    }

    @Override // com.google.android.wallet.ui.common.l
    public final CharSequence a() {
        View selectedView = this.f7483a.getSelectedView();
        if (selectedView instanceof TextView) {
            return ((TextView) selectedView).getError();
        }
        return null;
    }
}
