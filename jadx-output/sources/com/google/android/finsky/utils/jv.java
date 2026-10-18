package com.google.android.finsky.utils;

import android.content.res.Resources;
import android.widget.Toast;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class jv implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f5045a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Resources f5046b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;

    jv(boolean z, Resources resources, String str, String str2) {
        this.f5045a = z;
        this.f5046b = resources;
        this.c = str;
        this.d = str2;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        Toast.makeText(FinskyApp.a(), this.f5046b.getString(this.f5045a ? R.string.wishlist_remove_error : R.string.wishlist_add_error, this.c), 1).show();
        if (this.f5045a) {
            FinskyLog.d("Unable to remove from wishlist: %s", volleyError);
        } else {
            FinskyLog.d("Unable to add to wishlist: %s", volleyError);
        }
        js.a(this.d, this.f5045a, true);
    }
}
