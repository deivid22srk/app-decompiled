package com.google.android.finsky.detailspage;

import android.text.TextUtils;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ol;
import com.google.android.finsky.protos.oo;

/* loaded from: classes.dex */
public class e extends ed {
    @Override // com.google.android.finsky.detailspage.ed
    protected final ee a(Document document) {
        ol olVar = document.aJ().f4260a.k;
        ee eeVar = new ee();
        eeVar.f2636a = document;
        eeVar.e = false;
        eeVar.f = null;
        eeVar.h = this.c.getResources().getString(R.string.antenna_playlist);
        eeVar.i = olVar.f4213a;
        eeVar.f2637b = olVar.e;
        return eeVar;
    }

    @Override // com.google.android.finsky.detailspage.ed
    protected final boolean b(Document document) {
        oo ooVar = document.aJ().f4260a;
        return (ooVar == null || ooVar.k == null || TextUtils.isEmpty(ooVar.k.e)) ? false : true;
    }
}
