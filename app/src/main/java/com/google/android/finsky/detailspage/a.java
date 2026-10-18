package com.google.android.finsky.detailspage;

import android.text.TextUtils;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
public class a extends TextModule {
    @Override // com.google.android.finsky.detailspage.TextModule
    protected final ek a(Document document, boolean z) {
        com.google.android.finsky.protos.au H = document.H();
        CharSequence a2 = H != null ? com.google.android.finsky.utils.bc.a(H.i) : null;
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        ek ekVar = new ek();
        ekVar.f2646a = document.f1963a.g;
        ekVar.f2647b = document.f1963a.e;
        ekVar.c = null;
        ekVar.d = 8388611;
        ekVar.e = false;
        ekVar.f = this.c.getResources().getString(R.string.details_about_author).toUpperCase();
        ekVar.g = a2;
        ekVar.m = Integer.valueOf(this.c.getResources().getColor(R.color.play_white));
        return ekVar;
    }
}
