package com.google.android.finsky.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class gf implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f4898a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f4899b;
    final /* synthetic */ Context c;
    final /* synthetic */ String d;
    final /* synthetic */ gc e;

    gf(gc gcVar, boolean z, String str, Context context, String str2) {
        this.e = gcVar;
        this.f4898a = z;
        this.f4899b = str;
        this.c = context;
        this.d = str2;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        int i = this.f4898a ? R.string.preregistration_remove_error : R.string.preregistration_add_error;
        if (!TextUtils.isEmpty(this.f4899b)) {
            Toast.makeText(this.c, this.c.getResources().getString(i, this.f4899b), 1).show();
        }
        if (this.f4898a) {
            FinskyLog.d("Unable to remove from preregistration: %s", volleyError);
        } else {
            FinskyLog.d("Unable to preregister: %s", volleyError);
        }
        this.e.b(this.d);
    }
}
