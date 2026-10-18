package com.google.android.wallet.ui.common;

import android.text.TextUtils;
import android.widget.TextView;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes2.dex */
public final class n extends com.google.android.wallet.ui.common.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExpDateEditText f7527a;
    private final GregorianCalendar c;
    private final GregorianCalendar d;

    public n(ExpDateEditText expDateEditText, com.google.b.a.a.a.a.d dVar, com.google.b.a.a.a.a.d dVar2) {
        this.f7527a = expDateEditText;
        this.c = new GregorianCalendar(dVar.f7553a, dVar.f7554b - 1, 1);
        this.d = new GregorianCalendar(dVar2.f7553a, dVar2.f7554b - 1, 1);
    }

    @Override // com.google.android.wallet.ui.common.b.a
    public final boolean a(TextView textView) {
        char c;
        if (TextUtils.isEmpty(textView.getText())) {
            return true;
        }
        int expMonth = this.f7527a.getExpMonth();
        int expYear = this.f7527a.getExpYear();
        if (expMonth <= 0 || expMonth > 12) {
            c = 2;
        } else if (expYear == 0) {
            c = 3;
        } else {
            if (expYear < 100) {
                expYear += 2000;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(expYear, expMonth - 1, 1);
            if (gregorianCalendar.compareTo((Calendar) this.c) < 0) {
                c = 65535;
            } else {
                c = gregorianCalendar.compareTo((Calendar) this.d) > 0 ? (char) 1 : (char) 0;
            }
        }
        switch (c) {
            case 65535:
                this.f7497b = this.f7527a.getContext().getString(com.google.android.wallet.e.j.wallet_uic_error_expired_credit_card);
                return false;
            case 0:
                this.f7497b = null;
                return true;
            case 1:
                this.f7497b = this.f7527a.getContext().getString(com.google.android.wallet.e.j.wallet_uic_error_year_invalid);
                return false;
            case 2:
                this.f7497b = this.f7527a.getContext().getString(com.google.android.wallet.e.j.wallet_uic_error_month_invalid);
                return false;
            case 3:
                this.f7497b = this.f7527a.getContext().getString(com.google.android.wallet.e.j.wallet_uic_error_year_must_not_be_empty);
                return false;
            default:
                throw new IllegalArgumentException("Unexpected expiration date error!");
        }
    }
}
