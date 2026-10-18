package com.google.android.finsky.activities;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
final class al implements com.android.volley.t<com.google.android.finsky.protos.fu> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1546a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f1547b;

    al(ab abVar, String str) {
        this.f1547b = abVar;
        this.f1546a = str;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(com.google.android.finsky.protos.fu fuVar) {
        com.google.android.finsky.protos.fu fuVar2 = fuVar;
        if (!this.f1546a.equals(fuVar2.f3845a)) {
            Toast.makeText(this.f1547b, R.string.debug_play_country_override_update_failed, 1).show();
            return;
        }
        ab abVar = this.f1547b;
        Object[] objArr = new Object[1];
        objArr[0] = TextUtils.isEmpty(fuVar2.f3845a) ? this.f1547b.getString(R.string.debug_play_country_override_none) : fuVar2.f3845a;
        Toast.makeText(this.f1547b, abVar.getString(R.string.debug_play_country_override_update_success, objArr), 1).show();
        new Handler(Looper.getMainLooper()).postDelayed(new am(this), 3000L);
    }
}
