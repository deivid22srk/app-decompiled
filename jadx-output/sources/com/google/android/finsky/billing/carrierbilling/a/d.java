package com.google.android.finsky.billing.carrierbilling.a;

import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.deivid22srk.store.R;
import com.android.volley.t;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.carrierbilling.b.o;
import com.google.android.finsky.billing.k;
import com.google.android.finsky.protos.ca;
import com.google.android.finsky.protos.cf;
import com.google.android.finsky.utils.jm;

/* loaded from: classes.dex */
final class d implements t<ca> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f2183a;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(ca caVar) {
        String string;
        ca caVar2 = caVar;
        c cVar = this.f2183a;
        if (cVar.e != null) {
            if (cVar.i != 0) {
                cVar.c.a(cVar.e);
                cVar.h();
            } else {
                ((o) cVar.e).a(false);
            }
            cVar.e = null;
        }
        if (caVar2.f3661a == 1) {
            if (caVar2.c != null) {
                this.f2183a.d = caVar2.c;
                if (jm.a((CharSequence) this.f2183a.d.y)) {
                    this.f2183a.d.y = PhoneNumberUtils.formatNumber(k.c());
                    this.f2183a.d.z = true;
                }
                if (!TextUtils.isEmpty(this.f2183a.d.g) && !TextUtils.isEmpty(this.f2183a.d.k)) {
                    this.f2183a.f = 0;
                }
            }
            if (caVar2.d != null) {
                cf cfVar = caVar2.d.f3669a;
                this.f2183a.g = cfVar.f3671a;
                this.f2183a.h = cfVar.c;
            }
            this.f2183a.f();
            return;
        }
        if (caVar2.f3661a == 3) {
            string = FinskyApp.a().getString(R.string.associating_device_timeout_message);
        } else if (caVar2.f3661a == 2) {
            if (caVar2.f && !TextUtils.isEmpty(caVar2.e)) {
                string = caVar2.e;
            } else {
                string = FinskyApp.a().getString(R.string.device_association_failed);
            }
        } else {
            string = FinskyApp.a().getString(R.string.generic_purchase_completion_error);
        }
        this.f2183a.a(string, string, true);
    }

    d(c cVar) {
        this.f2183a = cVar;
    }
}
