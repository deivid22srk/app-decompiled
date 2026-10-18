package com.google.android.vending.a.a;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.android.vending.R;
import com.android.volley.o;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, a> f7104a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Context f7105b;
    private o c;

    public d(Context context, o oVar) {
        this.f7105b = context;
        this.c = oVar;
    }

    public a a(Account account) {
        a aVar;
        synchronized (this.f7104a) {
            aVar = this.f7104a.get(account.name);
            if (aVar == null) {
                aVar = new a(this.c, b(account));
                this.f7104a.put(account.name, aVar);
            }
        }
        return aVar;
    }

    private c b(Account account) {
        try {
            PackageInfo packageInfo = this.f7105b.getPackageManager().getPackageInfo(this.f7105b.getPackageName(), 0);
            int i = packageInfo.versionCode;
            String str = packageInfo.versionName;
            TelephonyManager telephonyManager = (TelephonyManager) this.f7105b.getSystemService("phone");
            Context context = this.f7105b;
            return new c(context, account, Locale.getDefault(), Long.toHexString(com.google.android.finsky.api.d.p.b().longValue()), i, telephonyManager.getNetworkOperatorName(), telephonyManager.getSimOperatorName(), telephonyManager.getNetworkOperator(), telephonyManager.getSimOperator(), Build.DEVICE, Build.VERSION.SDK, com.google.android.finsky.api.d.r.b(), com.google.android.finsky.api.d.q.b(), c.a(str, i, Build.VERSION.SDK_INT, Build.DEVICE, Build.HARDWARE, Build.PRODUCT, Build.VERSION.RELEASE, Build.MODEL, Build.ID, context.getResources().getBoolean(R.bool.use_wide_layout)));
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Can't find our own package", e);
        }
    }
}
