package com.google.android.finsky.layout;

import android.accounts.Account;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.jm;

/* loaded from: classes.dex */
public class AccountSelectorView extends IdentifiableTextView {
    public AccountSelectorView(Context context) {
        this(context, null);
    }

    public AccountSelectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
        Account i = FinskyApp.a().i();
        getContext();
        setText(jm.a(i));
    }
}
