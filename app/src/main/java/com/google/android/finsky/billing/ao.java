package com.google.android.finsky.billing;

import android.os.Bundle;
import com.google.android.finsky.protos.bw;

/* loaded from: classes.dex */
public abstract class ao extends f {
    public ao(g gVar, j jVar, Bundle bundle) {
        super(gVar, jVar, bundle);
    }

    public final void a(bw bwVar) {
        Bundle bundle = new Bundle();
        if (bwVar.d) {
            bundle.putString("instrument_id", bwVar.c);
        }
        super.a(false, bundle);
    }
}
