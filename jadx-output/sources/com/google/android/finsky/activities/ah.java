package com.google.android.finsky.activities;

import android.widget.Toast;
import com.android.vending.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class ah implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f1540a;

    ah(ab abVar) {
        this.f1540a = abVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        String string = this.f1540a.getString(R.string.debug_play_country_override_failure);
        Toast.makeText(this.f1540a, string, 1).show();
        FinskyLog.d("%s Volley error message: %s", string, volleyError.getMessage());
    }
}
