package com.google.android.finsky.activities;

import android.content.Context;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
public final class db extends da {
    private final int c;

    db(int i, int i2) {
        super(i2, R.string.flag_other_concern_prompt);
        this.c = i;
    }

    @Override // com.google.android.finsky.activities.da
    public final void a(Context context, Document document, String str) {
        FinskyApp.a().b((String) null).a(document.f1963a.f3890a, this.c, str, new dc(this, context), new dd(this));
    }
}
