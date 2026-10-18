package com.google.android.finsky.billing.iab;

import android.accounts.Account;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.al;
import com.google.android.finsky.protos.rs;
import com.google.android.finsky.protos.rt;
import com.google.android.finsky.protos.sl;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.df;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* loaded from: classes.dex */
final class r extends com.android.vending.a.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MarketBillingService f2262a;

    r(MarketBillingService marketBillingService) {
        this.f2262a = marketBillingService;
    }

    @Override // com.android.vending.a.g
    public final Bundle a(Bundle bundle) {
        n nVar;
        Account a2;
        Bundle a3;
        String[] strArr;
        Random random;
        Account a4;
        long j;
        q b2 = b(bundle);
        if (b2 == null) {
            a3 = new Bundle();
            a3.putInt("RESPONSE_CODE", n.RESULT_DEVELOPER_ERROR.ordinal());
        } else {
            int i = bundle.getInt("API_VERSION", -1);
            String string = bundle.getString("PACKAGE_NAME");
            String string2 = bundle.getString("ITEM_TYPE");
            long j2 = bundle.getLong("NONCE");
            Bundle bundle2 = new Bundle();
            if (i <= 0) {
                FinskyLog.c("No billing API version given!", new Object[0]);
                nVar = n.RESULT_DEVELOPER_ERROR;
            } else if (i > 2) {
                FinskyLog.a("Unsupported (future) billing API version: %d", Integer.valueOf(i));
                nVar = n.RESULT_BILLING_UNAVAILABLE;
            } else {
                nVar = n.RESULT_OK;
            }
            if (nVar == n.RESULT_OK) {
                if (string == null) {
                    FinskyLog.c("No packageName given!", new Object[0]);
                    nVar = n.RESULT_DEVELOPER_ERROR;
                } else {
                    a2 = m.a(string, this.f2262a);
                    if (!a(a2, i)) {
                        FinskyLog.a("Billing unavailable for this package.", new Object[0]);
                        nVar = n.RESULT_BILLING_UNAVAILABLE;
                    } else if (a(string) == null) {
                        FinskyLog.a("No package info for %s", string);
                        nVar = n.RESULT_ERROR;
                    } else {
                        nVar = n.RESULT_OK;
                    }
                }
            }
            if (nVar == n.RESULT_OK) {
                switch (b2) {
                    case CHECK_BILLING_SUPPORTED:
                        if (!a(bundle, new String[]{"PACKAGE_NAME"}, new String[]{"ITEM_TYPE"})) {
                            a3 = a(bundle2, n.RESULT_DEVELOPER_ERROR);
                            break;
                        } else {
                            String str = string2 == null ? "inapp" : string2;
                            if (!str.equals("inapp") && !str.equals("subs")) {
                                FinskyLog.a("Unknown item type specified %s", str);
                                nVar = n.RESULT_BILLING_UNAVAILABLE;
                                break;
                            } else if (i == 1) {
                                if (!str.equals("inapp")) {
                                    FinskyLog.a("Item type %s not supported in billing api version %d", str, Integer.valueOf(i));
                                    nVar = n.RESULT_DEVELOPER_ERROR;
                                    break;
                                }
                                nVar = n.RESULT_OK;
                                break;
                            } else {
                                if (i == 2 && str.equals("subs") && !com.google.android.finsky.c.d.az.b().booleanValue()) {
                                    nVar = n.RESULT_BILLING_UNAVAILABLE;
                                    break;
                                }
                                nVar = n.RESULT_OK;
                            }
                        }
                        break;
                    case RESTORE_TRANSACTIONS:
                        String[] strArr2 = {"PACKAGE_NAME", "NONCE"};
                        strArr = MarketBillingService.c;
                        if (!a(bundle, strArr2, strArr)) {
                            a3 = a(bundle2, n.RESULT_DEVELOPER_ERROR);
                            break;
                        } else {
                            PackageInfo a5 = a(string);
                            if (a5 != null) {
                                random = MarketBillingService.d;
                                long nextLong = random.nextLong() & Long.MAX_VALUE;
                                a4 = m.a(string, this.f2262a);
                                if (!a(a4, i)) {
                                    this.f2262a.f2233b.a(string, nextLong, n.RESULT_BILLING_UNAVAILABLE);
                                    j = nextLong;
                                } else {
                                    rs rsVar = new rs();
                                    rsVar.f = i;
                                    rsVar.g = true;
                                    sl slVar = new sl();
                                    slVar.f4388a = a5.packageName;
                                    slVar.f4389b = true;
                                    slVar.c = a5.versionCode;
                                    slVar.d = true;
                                    slVar.e = df.b(a5.signatures[0].toByteArray());
                                    rsVar.f4355a = slVar;
                                    rsVar.d = "SHA1withRSA";
                                    rsVar.e = true;
                                    rsVar.f4356b = j2;
                                    rsVar.c = true;
                                    com.google.android.vending.a.a.a b3 = FinskyApp.a().b(a4);
                                    b3.f7099a.a(com.google.android.vending.a.a.e.a("https://android.clients.google.com/vending/api/ApiRequest", rs.class, rsVar, rt.class, new s(this, string, nextLong), b3.f7100b, new t(this, string, nextLong)));
                                    j = nextLong;
                                }
                            } else {
                                j = -1;
                            }
                            if (j == -1) {
                                nVar = n.RESULT_ERROR;
                                break;
                            } else {
                                bundle2.putLong("REQUEST_ID", j);
                                nVar = n.RESULT_OK;
                                break;
                            }
                        }
                    case CONFIRM_NOTIFICATIONS:
                    case GET_PURCHASE_INFORMATION:
                    case REQUEST_PURCHASE:
                        FinskyLog.c("IABv2 is deprecated", new Object[0]);
                        a3 = a(bundle2, n.RESULT_BILLING_UNAVAILABLE);
                        break;
                    default:
                        FinskyLog.e("enum %s", b2);
                        a3 = a(bundle2, n.RESULT_DEVELOPER_ERROR);
                        break;
                }
            }
            a3 = a(bundle2, nVar);
        }
        this.f2262a.stopSelf();
        return a3;
    }

    private static Bundle a(Bundle bundle, n nVar) {
        bundle.putInt("RESPONSE_CODE", nVar.ordinal());
        return bundle;
    }

    private static q b(Bundle bundle) {
        String string = bundle.getString("BILLING_REQUEST");
        if (string == null) {
            FinskyLog.c("Received bundle without billing request type", new Object[0]);
            return null;
        }
        try {
            return q.valueOf(string);
        } catch (IllegalArgumentException e) {
            FinskyLog.c("Unknown billing request type: %s", string);
            return null;
        }
    }

    private static boolean a(Bundle bundle, String[] strArr, String[] strArr2) {
        Set<String> keySet = bundle.keySet();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        hashSet.add("BILLING_REQUEST");
        hashSet.add("API_VERSION");
        for (String str : strArr) {
            hashSet.add(str);
        }
        for (String str2 : strArr2) {
            hashSet2.add(str2);
        }
        keySet.removeAll(hashSet2);
        return keySet.equals(hashSet);
    }

    private PackageInfo a(String str) {
        try {
            return this.f2262a.f2232a.getPackageInfo(str, 64);
        } catch (PackageManager.NameNotFoundException e) {
            FinskyLog.c("cannot find package name: %s", str);
            return null;
        }
    }

    private static boolean a(Account account, int i) {
        return account != null && al.a(account.name, i);
    }
}
