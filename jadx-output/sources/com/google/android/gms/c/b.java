package com.google.android.gms.c;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.q;
import com.google.android.gms.internal.oj;

/* loaded from: classes.dex */
final class b implements q {
    b() {
    }

    @Override // com.google.android.gms.common.api.q
    public final void a(ConnectionResult connectionResult) {
        if (oj.f6205a) {
            Log.d("Herrevad", "failed to connect to network quality service");
        }
        if (connectionResult.c == 7 || connectionResult.c == 8) {
            return;
        }
        a.a();
    }
}
