package com.google.android.finsky.billing.iab;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.al;
import com.google.android.finsky.billing.lightpurchase.IabV3Activity;
import com.google.android.finsky.billing.lightpurchase.PurchaseParams;
import com.google.android.finsky.g.ah;
import com.google.android.finsky.g.u;
import com.google.android.finsky.protos.ea;
import com.google.android.finsky.protos.ga;
import com.google.android.finsky.protos.gx;
import com.google.android.finsky.protos.mh;
import com.google.android.finsky.protos.mi;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.as;
import com.google.android.finsky.utils.cz;
import com.google.android.finsky.utils.ik;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final int f2235b = com.google.android.finsky.c.d.cI.b().intValue();
    private static final long c = com.google.android.finsky.c.d.cH.b().longValue();
    private static final int d = com.google.android.finsky.c.d.cG.b().intValue();

    /* renamed from: a, reason: collision with root package name */
    final Context f2236a;
    private final com.google.android.finsky.g.h e;
    private final ah f;
    private final com.google.android.finsky.api.b g;

    public b(Context context, com.google.android.finsky.g.h hVar, ah ahVar, com.google.android.finsky.api.b bVar) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (hVar == null) {
            throw new IllegalArgumentException("libraries must not be null");
        }
        if (ahVar == null) {
            throw new IllegalArgumentException("libraryReplicators must not be null");
        }
        if (bVar.b() == null) {
            throw new IllegalArgumentException("dfeApi must specify an account");
        }
        this.f2236a = context;
        this.e = hVar;
        this.f = ahVar;
        this.g = bVar;
    }

    public final int a(int i, String str) {
        n a2 = a(i);
        if (a2 == n.RESULT_OK) {
            n a3 = a(str);
            if (a3 != n.RESULT_OK) {
                return a3.l;
            }
            return a3.l;
        }
        return a2.l;
    }

    public final Bundle a(int i, String str, String str2, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        n a2 = a(i);
        if (a2 != n.RESULT_OK) {
            bundle2.putInt("RESPONSE_CODE", a2.l);
            return bundle2;
        }
        n a3 = a(str2);
        if (a3 != n.RESULT_OK) {
            bundle2.putInt("RESPONSE_CODE", a3.l);
            return bundle2;
        }
        if (bundle == null) {
            FinskyLog.c("Input Error: Non-null argument expected for skusBundle.", new Object[0]);
            bundle2.putInt("RESPONSE_CODE", n.RESULT_DEVELOPER_ERROR.l);
            return bundle2;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("ITEM_ID_LIST");
        if (stringArrayList == null) {
            FinskyLog.c("Input Error: skusBundle must contain an array associated with key %s.", "ITEM_ID_LIST");
            bundle2.putInt("RESPONSE_CODE", n.RESULT_DEVELOPER_ERROR.l);
            return bundle2;
        }
        if (stringArrayList.isEmpty()) {
            FinskyLog.c("Input Error: skusBundle array associated with key %s cannot be empty.", "ITEM_ID_LIST");
            bundle2.putInt("RESPONSE_CODE", n.RESULT_DEVELOPER_ERROR.l);
            return bundle2;
        }
        if (stringArrayList.size() > f2235b) {
            FinskyLog.c("Input Error: skusBundle array associated with key %s cannot contain more than %d items.", "ITEM_ID_LIST", Integer.valueOf(f2235b));
            bundle2.putInt("RESPONSE_CODE", n.RESULT_DEVELOPER_ERROR.l);
            return bundle2;
        }
        for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
            if (TextUtils.isEmpty(stringArrayList.get(i2))) {
                FinskyLog.c("Input Error: skusBundle array associated with key %s contains an empty/null sku at index %d.", "ITEM_ID_LIST", Integer.valueOf(i2));
                bundle2.putInt("RESPONSE_CODE", n.RESULT_DEVELOPER_ERROR.l);
                return bundle2;
            }
        }
        a(str, stringArrayList, str2, bundle2);
        return bundle2;
    }

    public final Bundle a(int i, String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        n a2 = a(i);
        if (a2 != n.RESULT_OK) {
            bundle.putInt("RESPONSE_CODE", a2.l);
            return bundle;
        }
        n a3 = a(str3);
        if (a3 != n.RESULT_OK) {
            bundle.putInt("RESPONSE_CODE", a3.l);
            return bundle;
        }
        if (TextUtils.isEmpty(str2)) {
            FinskyLog.c("Input Error: Non empty/null argument expected for sku.", new Object[0]);
            bundle.putInt("RESPONSE_CODE", n.RESULT_DEVELOPER_ERROR.l);
            return bundle;
        }
        if (a(str3, str2, str)) {
            bundle.putInt("RESPONSE_CODE", n.RESULT_ITEM_ALREADY_OWNED.l);
            return bundle;
        }
        bundle.putParcelable("BUY_INTENT", a(m.a(this.f2236a, i, str, null, str2, str3, str4, null)));
        bundle.putInt("RESPONSE_CODE", n.RESULT_OK.l);
        return bundle;
    }

    public final Bundle a(int i, String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        n a2 = a(i);
        if (a2 != n.RESULT_OK) {
            bundle.putInt("RESPONSE_CODE", a2.l);
        } else {
            n a3 = a(str2);
            if (a3 != n.RESULT_OK) {
                bundle.putInt("RESPONSE_CODE", a3.l);
            } else {
                a(str, str2, str3, bundle);
                bundle.putInt("RESPONSE_CODE", n.RESULT_OK.l);
            }
        }
        return bundle;
    }

    public final int a(int i, String str, String str2) {
        n a2 = a(i);
        if (a2 == n.RESULT_OK) {
            if (TextUtils.isEmpty(str2)) {
                FinskyLog.c("Input Error: Non empty/null argument expected for purchaseToken.", new Object[0]);
                return n.RESULT_DEVELOPER_ERROR.l;
            }
            return a(str, str2).l;
        }
        return a2.l;
    }

    public final int b(int i, String str, String str2) {
        n a2 = a(i);
        if (a2 == n.RESULT_OK) {
            n a3 = a(str2);
            if (a3 == n.RESULT_OK) {
                if (i < 4) {
                    FinskyLog.c("Input Error: isPromoEligible was introduced in API version 4.", new Object[0]);
                    return n.RESULT_DEVELOPER_ERROR.l;
                }
                return b(str, str2).l;
            }
            return a3.l;
        }
        return a2.l;
    }

    public final Bundle a(int i, String str, List<String> list, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        n a2 = a(i);
        if (a2 != n.RESULT_OK) {
            bundle.putInt("RESPONSE_CODE", a2.l);
            return bundle;
        }
        if (i < 5) {
            FinskyLog.c("Input Error: getBuyIntentToReplaceSkus was introduced in API version 5.", new Object[0]);
            bundle.putInt("RESPONSE_CODE", n.RESULT_DEVELOPER_ERROR.l);
            return bundle;
        }
        n a3 = a(str3);
        if (a3 != n.RESULT_OK) {
            bundle.putInt("RESPONSE_CODE", a3.l);
            return bundle;
        }
        if (TextUtils.isEmpty(str2)) {
            FinskyLog.c("Input Error: Non empty/null argument expected for newSku.", new Object[0]);
            bundle.putInt("RESPONSE_CODE", n.RESULT_DEVELOPER_ERROR.l);
            return bundle;
        }
        if (a(str3, str2, str)) {
            bundle.putInt("RESPONSE_CODE", n.RESULT_ITEM_ALREADY_OWNED.l);
            return bundle;
        }
        bundle.putParcelable("BUY_INTENT", a(m.a(this.f2236a, i, str, list, str2, str3, str4, null)));
        bundle.putInt("RESPONSE_CODE", n.RESULT_OK.l);
        return bundle;
    }

    public final Bundle a(int i, String str, String str2, String str3, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        n a2 = a(i);
        if (a2 != n.RESULT_OK) {
            bundle2.putInt("RESPONSE_CODE", a2.l);
            return bundle2;
        }
        if (i < 6) {
            FinskyLog.c("Input Error: getPurchasesWithHistory was introduced in API version 6.", new Object[0]);
            bundle2.putInt("RESPONSE_CODE", n.RESULT_DEVELOPER_ERROR.l);
            return bundle2;
        }
        n a3 = a(str2);
        if (a3 != n.RESULT_OK) {
            bundle2.putInt("RESPONSE_CODE", a3.l);
            return bundle2;
        }
        mi miVar = null;
        if (bundle != null && !bundle.isEmpty()) {
            miVar = new mi();
            miVar.f4127a = a(bundle);
        }
        Semaphore semaphore = new Semaphore(0);
        this.g.a(i, str, str2, str3, miVar, new j(this, bundle2, semaphore), new k(this, bundle2, semaphore));
        try {
            if (!semaphore.tryAcquire(c, TimeUnit.MILLISECONDS)) {
                bundle2.putInt("RESPONSE_CODE", n.RESULT_ERROR.l);
            }
        } catch (InterruptedException e) {
            bundle2.putInt("RESPONSE_CODE", n.RESULT_ERROR.l);
        }
        return bundle2;
    }

    static n a(String str) {
        if (TextUtils.isEmpty(str)) {
            FinskyLog.c("Input Error: Non empty/null argument expected for type.", new Object[0]);
            return n.RESULT_DEVELOPER_ERROR;
        }
        if (!TextUtils.equals(str, "inapp") && !TextUtils.equals(str, "subs")) {
            FinskyLog.c("Unknown item type specified %s", str);
            return n.RESULT_BILLING_UNAVAILABLE;
        }
        return n.RESULT_OK;
    }

    private void a(String str, ArrayList<String> arrayList, String str2, Bundle bundle) {
        ArrayList a2 = cz.a(arrayList.size());
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 == arrayList.size()) {
                break;
            }
            a2.add(m.a(arrayList.get(i2), str2, str));
            i = i2 + 1;
        }
        boolean a3 = FinskyApp.a().d(this.g.c()).a(12603718L);
        String[] strArr = new String[1];
        Semaphore semaphore = new Semaphore(0);
        com.android.volley.l<?> a4 = this.g.a((List<String>) a2, (int[]) null, false, str, true, (com.android.volley.t<ga>) new c(this, a3, strArr, bundle, semaphore), (com.android.volley.s) new d(this, bundle, semaphore));
        if (a3) {
            strArr[0] = a4.c();
        }
        try {
            if (!semaphore.tryAcquire(c, TimeUnit.MILLISECONDS)) {
                bundle.putInt("RESPONSE_CODE", n.RESULT_ERROR.l);
            }
        } catch (InterruptedException e) {
            bundle.putInt("RESPONSE_CODE", n.RESULT_ERROR.l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(gx gxVar) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            ea eaVar = gxVar.u[0];
            String str2 = gxVar.c;
            jSONObject.put("productId", as.d(str2));
            if (str2.startsWith("inapp:")) {
                str = "inapp";
            } else if (str2.startsWith("subs:")) {
                str = "subs";
            } else {
                str = null;
            }
            jSONObject.put("type", str);
            jSONObject.put("price", eaVar.h);
            if (eaVar.v.length > 0) {
                jSONObject.put("price_amount_micros", eaVar.v[0].d);
                jSONObject.put("price_currency_code", eaVar.v[0].f);
            } else {
                jSONObject.put("price_amount_micros", eaVar.d);
                jSONObject.put("price_currency_code", eaVar.f);
            }
            jSONObject.put("title", gxVar.i);
            jSONObject.put("description", Html.fromHtml(gxVar.o));
        } catch (JSONException e) {
            FinskyLog.e("Exception when creating json: %s", e);
        }
        return jSONObject.toString();
    }

    final boolean a(String str, String str2, String str3) {
        this.e.c();
        return this.e.a(this.g.b()).e(m.a(str2, str, str3)) != null;
    }

    final PendingIntent a(PurchaseParams purchaseParams) {
        Intent a2;
        if (ik.a()) {
            Account b2 = this.g.b();
            Bundle bundle = new Bundle();
            bundle.putParcelable("TvIntentUtils.account", b2);
            bundle.putParcelable("TvIntentUtils.purchaseParams", purchaseParams);
            bundle.putBoolean("TvIntentUtils.showOfferResolution", false);
            bundle.putString("TvIntentUtils.breadCrumb", purchaseParams.l.c);
            a2 = new Intent("com.google.android.finsky.tv.IABV3_PURCHASE");
            a2.putExtras(bundle);
        } else {
            a2 = IabV3Activity.a(this.g.b(), purchaseParams);
        }
        return PendingIntent.getActivity(this.f2236a, 0, a2, 1073741824);
    }

    private void a(String str, String str2, String str3, Bundle bundle) {
        String str4;
        com.google.android.finsky.g.a a2 = this.e.a(this.g.b());
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        if (str2.equals("inapp")) {
            Pair a3 = a(a2.f(str), str3);
            List<com.google.android.finsky.g.t> list = (List) a3.first;
            str4 = (String) a3.second;
            for (com.google.android.finsky.g.t tVar : list) {
                arrayList.add(as.d(tVar.j));
                arrayList2.add(tVar.f2836a);
                arrayList3.add(tVar.f2837b);
            }
        } else if (str2.equals("subs")) {
            Pair a4 = a(a2.g(str), str3);
            List<u> list2 = (List) a4.first;
            str4 = (String) a4.second;
            for (u uVar : list2) {
                arrayList.add(as.d(uVar.j));
                arrayList2.add(uVar.f2838a);
                arrayList3.add(uVar.f2839b);
            }
        } else {
            str4 = str3;
        }
        bundle.putStringArrayList("INAPP_PURCHASE_ITEM_LIST", arrayList);
        bundle.putStringArrayList("INAPP_PURCHASE_DATA_LIST", arrayList2);
        bundle.putStringArrayList("INAPP_DATA_SIGNATURE_LIST", arrayList3);
        if (str4 != null) {
            bundle.putString("INAPP_CONTINUATION_TOKEN", str4);
        }
    }

    private static <T> Pair<List<T>, String> a(List<T> list, String str) {
        int i;
        int size;
        String str2;
        if (list.size() <= d) {
            return Pair.create(list, null);
        }
        if (TextUtils.isEmpty(str)) {
            i = 0;
        } else {
            String str3 = new String(Base64.decode(str, 0));
            if (!str3.startsWith("CONT-TOKEN-")) {
                i = -1;
            } else {
                i = Integer.parseInt(str3.substring(11));
            }
            if (i < 0 || i >= list.size()) {
                i = 0;
            }
        }
        int i2 = d + i;
        if (i2 >= list.size()) {
            size = list.size();
            str2 = null;
        } else {
            str2 = Base64.encodeToString(("CONT-TOKEN-" + i2).getBytes(), 0);
            size = i2;
        }
        return Pair.create(list.subList(i, size), str2);
    }

    private n a(String str, String str2) {
        Semaphore semaphore = new Semaphore(0);
        n[] nVarArr = {n.RESULT_OK};
        this.g.a(str2, str, new e(this, nVarArr, semaphore), new g(this, nVarArr, semaphore));
        try {
            if (!semaphore.tryAcquire(c, TimeUnit.MILLISECONDS)) {
                return n.RESULT_ERROR;
            }
            return nVarArr[0];
        } catch (InterruptedException e) {
            return n.RESULT_ERROR;
        }
    }

    private n b(String str, String str2) {
        Semaphore semaphore = new Semaphore(0);
        n[] nVarArr = {n.RESULT_ERROR};
        int i = 11;
        if (str2.equals("subs")) {
            i = 15;
        }
        this.g.a(i, str, com.google.android.finsky.billing.carrierbilling.a.a(), new h(this, nVarArr, semaphore, str), new i(this, nVarArr, semaphore));
        try {
            if (!semaphore.tryAcquire(c, TimeUnit.MILLISECONDS)) {
                nVarArr[0] = n.RESULT_ERROR;
            }
            return nVarArr[0];
        } catch (InterruptedException e) {
            FinskyLog.c("Interrupted: %s", e.getMessage());
            return n.RESULT_ERROR;
        }
    }

    static mh[] a(Bundle bundle) {
        int i = 0;
        mh[] mhVarArr = new mh[bundle.size()];
        Iterator<String> it = bundle.keySet().iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                String next = it.next();
                mh mhVar = new mh();
                mhVar.f4125a = next;
                mhVar.f4126b = true;
                Object obj = bundle.get(next);
                if (obj != null) {
                    if (obj instanceof Boolean) {
                        mhVar.e = ((Boolean) obj).booleanValue();
                        mhVar.f = true;
                    } else if (obj instanceof Long) {
                        mhVar.g = ((Long) obj).longValue();
                        mhVar.h = true;
                    } else if (obj instanceof Integer) {
                        mhVar.g = ((Integer) obj).intValue();
                        mhVar.h = true;
                    } else {
                        mhVar.c = obj.toString();
                        mhVar.d = true;
                    }
                }
                i = i2 + 1;
                mhVarArr[i2] = mhVar;
            } else {
                return mhVarArr;
            }
        }
    }

    final n a(int i) {
        n nVar;
        if (i < 3 || i > 6) {
            FinskyLog.c("Unsupported billing API version: %d", Integer.valueOf(i));
            nVar = n.RESULT_BILLING_UNAVAILABLE;
        } else {
            nVar = n.RESULT_OK;
        }
        if (nVar == n.RESULT_OK) {
            if (!al.a(this.g.c(), i)) {
                FinskyLog.c("Billing unavailable for this package and user.", new Object[0]);
                return n.RESULT_BILLING_UNAVAILABLE;
            }
            return n.RESULT_OK;
        }
        return nVar;
    }
}
