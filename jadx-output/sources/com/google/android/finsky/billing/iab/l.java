package com.google.android.finsky.billing.iab;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.protos.mh;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class l extends com.deivid22srk.store.a.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InAppBillingService f2255a;

    private l(InAppBillingService inAppBillingService) {
        this.f2255a = inAppBillingService;
    }

    /* synthetic */ l(InAppBillingService inAppBillingService, byte b2) {
        this(inAppBillingService);
    }

    @Override // com.deivid22srk.store.a.e
    public final int a(int i, String str, String str2) {
        n a2;
        a2 = m.a(str, this.f2255a.getPackageManager(), Binder.getCallingUid());
        if (a2 == n.RESULT_OK) {
            String b2 = InAppBillingService.b(this.f2255a, str);
            if (b2 != null) {
                return InAppBillingService.c(this.f2255a, b2).a(i, str2);
            }
            return n.RESULT_BILLING_UNAVAILABLE.l;
        }
        return a2.l;
    }

    @Override // com.deivid22srk.store.a.e
    public final Bundle a(int i, String str, String str2, Bundle bundle) {
        n a2;
        a2 = m.a(str, this.f2255a.getPackageManager(), Binder.getCallingUid());
        if (a2 != n.RESULT_OK) {
            return InAppBillingService.a(a2);
        }
        String b2 = InAppBillingService.b(this.f2255a, str);
        if (b2 == null) {
            return InAppBillingService.a(n.RESULT_BILLING_UNAVAILABLE);
        }
        return InAppBillingService.c(this.f2255a, b2).a(i, str, str2, bundle);
    }

    @Override // com.deivid22srk.store.a.e
    public final Bundle a(int i, String str, String str2, String str3, String str4) {
        n a2;
        a2 = m.a(str, this.f2255a.getPackageManager(), Binder.getCallingUid());
        if (a2 != n.RESULT_OK) {
            return InAppBillingService.a(a2);
        }
        String b2 = InAppBillingService.b(this.f2255a, str);
        if (b2 == null) {
            return InAppBillingService.a(n.RESULT_BILLING_UNAVAILABLE);
        }
        return InAppBillingService.c(this.f2255a, b2).a(i, str, str2, str3, str4);
    }

    @Override // com.deivid22srk.store.a.e
    public final Bundle a(int i, String str, String str2, String str3) {
        n a2;
        a2 = m.a(str, this.f2255a.getPackageManager(), Binder.getCallingUid());
        if (a2 != n.RESULT_OK) {
            return InAppBillingService.a(a2);
        }
        String b2 = InAppBillingService.b(this.f2255a, str);
        if (b2 == null) {
            return InAppBillingService.a(n.RESULT_BILLING_UNAVAILABLE);
        }
        return InAppBillingService.c(this.f2255a, b2).a(i, str, str2, str3);
    }

    @Override // com.deivid22srk.store.a.e
    public final int b(int i, String str, String str2) {
        n a2;
        a2 = m.a(str, this.f2255a.getPackageManager(), Binder.getCallingUid());
        if (a2 == n.RESULT_OK) {
            String b2 = InAppBillingService.b(this.f2255a, str);
            if (b2 != null) {
                return InAppBillingService.c(this.f2255a, b2).a(i, str, str2);
            }
            return n.RESULT_BILLING_UNAVAILABLE.l;
        }
        return a2.l;
    }

    @Override // com.deivid22srk.store.a.e
    public final int c(int i, String str, String str2) {
        n a2;
        a2 = m.a(str, this.f2255a.getPackageManager(), Binder.getCallingUid());
        if (a2 == n.RESULT_OK) {
            String b2 = InAppBillingService.b(this.f2255a, str);
            if (b2 != null) {
                return InAppBillingService.c(this.f2255a, b2).b(i, str, str2);
            }
            return n.RESULT_BILLING_UNAVAILABLE.l;
        }
        return a2.l;
    }

    @Override // com.deivid22srk.store.a.e
    public final Bundle a(int i, String str, List<String> list, String str2, String str3, String str4) {
        n a2;
        a2 = m.a(str, this.f2255a.getPackageManager(), Binder.getCallingUid());
        if (a2 != n.RESULT_OK) {
            return InAppBillingService.a(a2);
        }
        String b2 = InAppBillingService.b(this.f2255a, str);
        if (b2 == null) {
            return InAppBillingService.a(n.RESULT_BILLING_UNAVAILABLE);
        }
        return InAppBillingService.c(this.f2255a, b2).a(i, str, list, str2, str3, str4);
    }

    @Override // com.deivid22srk.store.a.e
    public final Bundle a(int i, String str, String str2, String str3, String str4, Bundle bundle) {
        n a2;
        a2 = m.a(str, this.f2255a.getPackageManager(), Binder.getCallingUid());
        if (a2 != n.RESULT_OK) {
            return InAppBillingService.a(a2);
        }
        String b2 = InAppBillingService.b(this.f2255a, str);
        if (b2 == null) {
            return InAppBillingService.a(n.RESULT_BILLING_UNAVAILABLE);
        }
        b c = InAppBillingService.c(this.f2255a, b2);
        Bundle bundle2 = new Bundle();
        n a3 = c.a(i);
        if (a3 != n.RESULT_OK) {
            bundle2.putInt("RESPONSE_CODE", a3.l);
            return bundle2;
        }
        if (i < 6) {
            FinskyLog.c("Input Error: getBuyIntentExtraParams was introduced in API version 6.", new Object[0]);
            bundle2.putInt("RESPONSE_CODE", n.RESULT_DEVELOPER_ERROR.l);
            return bundle2;
        }
        n a4 = b.a(str3);
        if (a4 != n.RESULT_OK) {
            bundle2.putInt("RESPONSE_CODE", a4.l);
            return bundle2;
        }
        if (TextUtils.isEmpty(str2)) {
            FinskyLog.c("Input Error: Non empty/null argument expected for sku.", new Object[0]);
            bundle2.putInt("RESPONSE_CODE", n.RESULT_DEVELOPER_ERROR.l);
            return bundle2;
        }
        if (c.a(str3, str2, str)) {
            bundle2.putInt("RESPONSE_CODE", n.RESULT_ITEM_ALREADY_OWNED.l);
            return bundle2;
        }
        ArrayList<String> arrayList = null;
        mh[] mhVarArr = null;
        if (bundle != null && !bundle.isEmpty()) {
            arrayList = bundle.getStringArrayList("skusToReplace");
            bundle.remove("skusToReplace");
            if (!bundle.isEmpty()) {
                mhVarArr = b.a(bundle);
            }
        }
        bundle2.putParcelable("BUY_INTENT", c.a(m.a(c.f2236a, i, str, arrayList, str2, str3, str4, mhVarArr)));
        bundle2.putInt("RESPONSE_CODE", n.RESULT_OK.l);
        return bundle2;
    }

    @Override // com.deivid22srk.store.a.e
    public final Bundle a(int i, String str, String str2, String str3, Bundle bundle) {
        n a2;
        a2 = m.a(str, this.f2255a.getPackageManager(), Binder.getCallingUid());
        if (a2 != n.RESULT_OK) {
            return InAppBillingService.a(a2);
        }
        String b2 = InAppBillingService.b(this.f2255a, str);
        if (b2 == null) {
            return InAppBillingService.a(n.RESULT_BILLING_UNAVAILABLE);
        }
        return InAppBillingService.c(this.f2255a, b2).a(i, str, str2, str3, bundle);
    }
}
