package com.google.android.finsky.detailspage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.oo;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public class d extends TextModule {
    @Override // com.google.android.finsky.detailspage.TextModule
    protected final ek a(Document document, boolean z) {
        oo ooVar;
        CharSequence u = document.u();
        if (TextUtils.isEmpty(u) || (ooVar = document.aJ().f4260a) == null) {
            return null;
        }
        ek ekVar = new ek();
        ekVar.f2646a = document.f1963a.g;
        ekVar.f2647b = document.f1963a.e;
        ekVar.c = null;
        ekVar.d = 8388611;
        ekVar.e = false;
        Resources resources = this.c.getResources();
        ekVar.f = null;
        ekVar.g = u;
        int color = resources.getColor(R.color.play_white);
        if (document.c(1)) {
            color = ik.a(ooVar, color);
        }
        ekVar.m = Integer.valueOf(color);
        return ekVar;
    }
}
