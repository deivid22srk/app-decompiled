package com.google.android.finsky.billing.iab;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.lightpurchase.PurchaseParams;
import com.google.android.finsky.billing.lightpurchase.ah;
import com.google.android.finsky.protos.bk;
import com.google.android.finsky.protos.dp;
import com.google.android.finsky.protos.iy;
import com.google.android.finsky.protos.iz;
import com.google.android.finsky.protos.ja;
import com.google.android.finsky.protos.jb;
import com.google.android.finsky.protos.mh;
import com.google.android.finsky.protos.mk;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.as;
import com.google.android.finsky.utils.df;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.internal.jk;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m {
    public static String a(String str, String str2, String str3) {
        return str2 + ":" + str3 + ":" + str;
    }

    public static Account a(String str, Context context) {
        Account account;
        com.google.android.finsky.b.a aVar = FinskyApp.a().s;
        aVar.f2060a.c();
        com.google.android.finsky.b.b a2 = aVar.a(str);
        if (a2 != null && a2.c != null) {
            com.google.android.finsky.g.h hVar = FinskyApp.a().p;
            hVar.c();
            List<Account> a3 = hVar.a(str, a2.c.f2138b);
            if (a3.size() > 0) {
                if (a2.d != null) {
                    String str2 = a2.d.i;
                    Iterator<Account> it = a3.iterator();
                    while (it.hasNext()) {
                        account = it.next();
                        if (TextUtils.equals(account.name, str2)) {
                            FinskyLog.a("%s: Account determined from installer data - %s", a2.f2104a, FinskyLog.a(str2));
                            break;
                        }
                    }
                }
                FinskyLog.a("%s: Account determined from library ownership - %s", a2.f2104a, FinskyLog.a(a3.get(0).name));
                account = a3.get(0);
            } else {
                account = null;
            }
            if (account != null) {
                return account;
            }
        }
        Account b2 = com.google.android.finsky.api.a.b(context);
        if (b2 != null) {
            FinskyLog.a("%s: Account from first account - %s", str, FinskyLog.a(b2.name));
            return b2;
        }
        FinskyLog.c("%s: No account found.", str);
        return null;
    }

    public static n a(String str, PackageManager packageManager, int i) {
        if (TextUtils.isEmpty(str)) {
            FinskyLog.c("Input Error: Non empty/null argument expected for packageName.", new Object[0]);
            return n.RESULT_DEVELOPER_ERROR;
        }
        for (String str2 : packageManager.getPackagesForUid(i)) {
            if (str.equals(str2)) {
                return n.RESULT_OK;
            }
        }
        FinskyLog.c("Package name %s does not match UID %d", str, Integer.valueOf(i));
        return n.RESULT_DEVELOPER_ERROR;
    }

    public static PurchaseParams a(Context context, int i, String str, List<String> list, String str2, String str3, String str4, mh[] mhVarArr) {
        PackageInfo a2 = a(context, str);
        if (a2 == null) {
            return null;
        }
        String a3 = a(a2);
        String[] strArr = null;
        if (list != null && !list.isEmpty()) {
            String[] strArr2 = new String[list.size()];
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= strArr2.length) {
                    break;
                }
                strArr2[i3] = a(list.get(i3), str3, str);
                i2 = i3 + 1;
            }
            strArr = strArr2;
        }
        String a4 = a(str2, str3, str);
        ah a5 = PurchaseParams.a();
        int i4 = 0;
        if ("inapp".equals(str3)) {
            i4 = 11;
        } else if ("subs".equals(str3)) {
            i4 = 15;
        }
        dp dpVar = new dp();
        dpVar.e = 3;
        dpVar.f = true;
        dpVar.c = i4;
        dpVar.d = true;
        dpVar.f3740a = a4;
        dpVar.f3741b = true;
        a5.f2311a = dpVar;
        a5.f2312b = a4;
        a5.d = 1;
        int i5 = a2.versionCode;
        a5.j = new mk();
        a5.j.f4130a = i;
        a5.j.f4131b = true;
        if (!TextUtils.isEmpty(str)) {
            a5.j.c = str;
            a5.j.d = true;
        }
        a5.j.e = i5;
        a5.j.f = true;
        if (!TextUtils.isEmpty(a3)) {
            a5.j.g = a3;
            a5.j.h = true;
        }
        if (!TextUtils.isEmpty(str4)) {
            a5.j.i = str4;
            a5.j.j = true;
        }
        if (strArr != null) {
            a5.j.k = strArr;
        }
        if (mhVarArr != null) {
            a5.j.l = mhVarArr;
        }
        return a5.a();
    }

    public static PurchaseParams a(Context context, dp dpVar, String str) {
        String c = as.c(dpVar.f3740a);
        PackageInfo a2 = a(context, c);
        if (a2 == null) {
            return null;
        }
        mk mkVar = new mk();
        mkVar.c = c;
        mkVar.d = true;
        mkVar.e = a2.versionCode;
        mkVar.f = true;
        mkVar.g = a(a2);
        mkVar.h = true;
        ah a3 = PurchaseParams.a();
        a3.f2311a = dpVar;
        a3.f2312b = dpVar.f3740a;
        a3.d = 1;
        a3.j = mkVar;
        a3.i = str;
        return a3.a();
    }

    public static Bundle a(jb[] jbVarArr, dp dpVar) {
        if (jbVarArr == null) {
            return null;
        }
        for (jb jbVar : jbVarArr) {
            if (jbVar != null && jbVar.i != null) {
                iz[] izVarArr = jbVar.i;
                for (iz izVar : izVarArr) {
                    if (izVar != null && izVar.f3981a.c == 11 && TextUtils.equals(izVar.f3981a.f3740a, dpVar.f3740a) && izVar.n != null) {
                        iy iyVar = izVar.n;
                        if (iyVar.d && iyVar.f3980b) {
                            Bundle bundle = new Bundle();
                            bundle.putString("inapp_signed_purchase_data", iyVar.f3979a);
                            bundle.putString("inapp_purchase_data_signature", iyVar.c);
                            return bundle;
                        }
                    } else if (izVar != null && izVar.f3981a.c == 15 && TextUtils.equals(izVar.f3981a.f3740a, dpVar.f3740a) && izVar.m != null) {
                        ja jaVar = izVar.m;
                        if (jaVar.l && jaVar.j) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("inapp_signed_purchase_data", jaVar.i);
                            bundle2.putString("inapp_purchase_data_signature", jaVar.k);
                            return bundle2;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static Intent a(Context context, PurchaseParams purchaseParams, Bundle bundle, n nVar) {
        bk bkVar;
        String str;
        jk b2;
        Intent intent = new Intent();
        if (bundle == null) {
            bkVar = null;
            str = null;
        } else {
            String string = bundle.getString("inapp_signed_purchase_data");
            String string2 = bundle.getString("inapp_purchase_data_signature");
            if (string != null && string2 != null) {
                intent.putExtra("INAPP_PURCHASE_DATA", string);
                intent.putExtra("INAPP_DATA_SIGNATURE", string2);
            }
            bkVar = (bk) ParcelableProto.a(bundle, "purchase_total_price");
            str = string;
        }
        intent.putExtra("RESPONSE_CODE", nVar.ordinal());
        if (!TextUtils.isEmpty(str) && bkVar != null && FinskyApp.a().e().a(12604266L) && purchaseParams.f2281a.c == 11) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                com.google.android.gms.ads.c.b bVar = new com.google.android.gms.ads.c.b(jSONObject.getString("packageName"), jSONObject.getString("productId"), "", bkVar.f3634a, bkVar.f3634a, bkVar.c);
                try {
                    av.a(bVar, "PlayStoreInAppPurchase must not be null.");
                    try {
                        b2 = com.google.android.gms.ads.c.c.b(context);
                        b2.a(bVar.f5275a);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.b.b("Failed to report In-App Purchases", e);
                    }
                    a((Throwable) null);
                } catch (GooglePlayServicesNotAvailableException e2) {
                    FinskyLog.d("Unable to report IAP, GooglePlayServicesNotAvailableException: %s", e2.getMessage());
                    a(e2);
                }
            } catch (JSONException e3) {
                FinskyLog.e("Invalid purchaseDataJson: %s", FinskyLog.a(str));
                a(e3);
            }
        }
        return intent;
    }

    private static void a(Throwable th) {
        if (FinskyApp.a().e().a(12604323L)) {
            com.google.android.finsky.a.b bVar = new com.google.android.finsky.a.b(1105);
            bVar.a(th);
            FinskyApp.a().h().b(bVar.f1473a);
        }
    }

    private static PackageInfo a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64);
        } catch (PackageManager.NameNotFoundException e) {
            FinskyLog.c("Cannot find package: %s", str);
            return null;
        }
    }

    private static String a(PackageInfo packageInfo) {
        return df.a(packageInfo.signatures[0].toByteArray());
    }

    public static void a(Activity activity, String str) {
        if (FinskyApp.a().v.a(str) != null) {
            Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
            intent.setPackage(str);
            activity.sendBroadcast(intent);
        }
    }
}
