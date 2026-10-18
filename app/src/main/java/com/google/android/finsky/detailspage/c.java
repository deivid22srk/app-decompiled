package com.google.android.finsky.detailspage;

import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ol;
import com.google.android.finsky.protos.oo;

/* loaded from: classes.dex */
public class c extends dz {
    @Override // com.google.android.finsky.detailspage.dz
    protected final boolean h() {
        return true;
    }

    @Override // com.google.android.finsky.detailspage.dz
    protected final ol b(Document document) {
        oo ooVar = document.aJ().f4260a;
        if (ooVar == null) {
            return null;
        }
        return ooVar.l;
    }
}
