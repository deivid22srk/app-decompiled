package com.google.android.wallet.ui.common;

import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes.dex */
final class ab implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FormEditText f7474a;

    /* renamed from: b, reason: collision with root package name */
    private StringBuilder f7475b;
    private int c;

    ab(FormEditText formEditText) {
        this.f7474a = formEditText;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f7475b = new StringBuilder(charSequence.length());
        this.c = -1;
        if (this.f7474a.getSelectionStart() == this.f7474a.getSelectionEnd() && i2 == 1 && i3 == 0) {
            int size = this.f7474a.s.size();
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = this.f7474a.s.get(i4).intValue();
                if (this.c < 0 && intValue >= i + 1) {
                    if (this.f7475b.length() > 0) {
                        this.c = this.f7475b.length() - 1;
                        this.f7475b.deleteCharAt(this.c);
                    } else {
                        this.c = 0;
                    }
                }
                if (intValue >= charSequence.length()) {
                    break;
                }
                this.f7475b.append(charSequence.charAt(intValue));
            }
            if (this.c < 0) {
                this.c = this.f7475b.length() - 1;
                this.f7475b.deleteCharAt(this.c);
                return;
            }
            return;
        }
        int size2 = this.f7474a.s.size();
        for (int i5 = 0; i5 < size2; i5++) {
            int intValue2 = this.f7474a.s.get(i5).intValue();
            if (intValue2 < i) {
                this.f7475b.append(charSequence.charAt(intValue2));
            } else {
                if (this.c < 0) {
                    this.c = this.f7475b.length();
                }
                if (intValue2 < charSequence.length()) {
                    if (intValue2 >= i + i2) {
                        this.f7475b.append(charSequence.charAt(intValue2));
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.c >= 0) {
            this.f7475b.insert(this.c, charSequence, i, i + i3);
            this.c += i3;
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f7474a.a((CharSequence) this.f7475b, false);
        if (this.c < 0 || this.c > this.f7474a.s.size()) {
            this.c = this.f7474a.s.size();
        }
        this.f7474a.setCursorPositionInValue(this.c);
    }
}
