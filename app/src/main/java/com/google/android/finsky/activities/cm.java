package com.google.android.finsky.activities;

import android.content.Context;
import android.widget.Toast;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class cm implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ck f1656a;

    cm(ck ckVar) {
        this.f1656a = ckVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        Context context;
        Context context2;
        Context context3;
        context = this.f1656a.ap;
        context2 = this.f1656a.ap;
        String string = context.getString(R.string.family_library_settings_save_failed, com.google.android.finsky.utils.aw.a(context2, volleyError));
        context3 = this.f1656a.ap;
        Toast.makeText(context3, string, 1).show();
    }
}
