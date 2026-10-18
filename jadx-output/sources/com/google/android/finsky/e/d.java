package com.google.android.finsky.e;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.nm;
import com.google.android.finsky.protos.np;
import com.google.android.finsky.utils.ExternalReferrer;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.hy;
import com.google.android.finsky.utils.jm;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends w implements com.android.volley.t<np>, com.google.android.finsky.api.p {

    /* renamed from: a, reason: collision with root package name */
    private final ai f2750a = com.google.android.finsky.a.i.a(0);

    /* renamed from: b, reason: collision with root package name */
    private np f2751b;
    private Uri c;
    private String d;
    private String e;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(np npVar) {
        np npVar2 = npVar;
        this.f2751b = npVar2;
        FinskyApp.a().h().a(new com.google.android.finsky.a.b(1104).e(this.e).a(npVar2.u).f1473a);
        m_();
    }

    public static Fragment a(Uri uri, String str) {
        String str2;
        d dVar = new d();
        Uri a2 = a(uri);
        Account[] a3 = com.google.android.finsky.api.a.a(FinskyApp.a());
        String queryParameter = a2.getQueryParameter("ah");
        if (!TextUtils.isEmpty(queryParameter)) {
            for (Account account : a3) {
                if (hy.a(account.name.getBytes()).equals(queryParameter)) {
                    str2 = account.name;
                    break;
                }
            }
        }
        str2 = null;
        if (!TextUtils.isEmpty(str2)) {
            dVar.f(str2);
            dVar.b("DeepLinkShimFragment.overrideAccount", str2);
        }
        dVar.a(FinskyApp.a().g, a2.toString());
        dVar.d = str;
        dVar.e = ExternalReferrer.a(a2);
        return dVar;
    }

    public static Uri a(Uri uri) {
        if ("market".equals(uri.getScheme()) && "webstoreredirect".equals(uri.getHost())) {
            String queryParameter = uri.getQueryParameter("uri");
            if (!TextUtils.isEmpty(queryParameter)) {
                Uri parse = Uri.parse(Uri.decode(queryParameter));
                if ("play.google.com".equals(parse.getHost())) {
                    return parse;
                }
            }
            FinskyLog.c("Unrecognized redirect URI: %s", FinskyLog.a(uri.toString()));
            return Uri.parse("http://play.google.com/store");
        }
        return uri;
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        this.c = Uri.parse(this.aA);
        y();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final int w() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final void u() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final void y() {
        FinskyApp.a().h().a(12, this.aA, (String) null, ExternalReferrer.a(this.c), this.d, (byte[]) null);
        this.aq.a(this.aA, this.d, this, this, this);
        this.aq.k(this.aA, new e(this), new f(this));
        N();
    }

    @Override // com.google.android.finsky.e.q, com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Error on resolveLink: %s", volleyError);
        a(1104, volleyError);
        this.as.a(this.ax);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, VolleyError volleyError) {
        FinskyApp.a().h().a(new com.google.android.finsky.a.b(i).a(volleyError).e(this.e).a(1).f1473a);
    }

    @Override // com.google.android.finsky.api.p
    public final void a() {
        FinskyApp.a().h().a(new com.google.android.finsky.a.b(1104).e(this.e).a(2).f1473a);
    }

    @Override // com.google.android.finsky.e.q, com.google.android.finsky.api.model.x
    public final void m_() {
        if (this.f2751b != null && L()) {
            this.as.u();
            com.google.android.finsky.a.i h = FinskyApp.a().h();
            byte[] bArr = this.f2751b.u;
            String a2 = ExternalReferrer.a(this.c);
            if (this.f2751b.f4179a.length() > 0) {
                h.a(1, this.aA, (String) null, a2, this.d, bArr);
                ExternalReferrer.a(a2, this.f2751b.f4179a, "deeplink");
                this.as.a(this.f2751b.f4179a, b(this.c), this.r.getString("DeepLinkShimFragment.overrideAccount"), this.aA);
                return;
            }
            if (this.f2751b.c.length() > 0) {
                h.a(14, this.aA, (String) null, a2, this.d, bArr);
                ExternalReferrer.a(a2, this.f2751b.c, "deeplink");
                this.as.b(this.f2751b.c, b(this.c), this.r.getString("DeepLinkShimFragment.overrideAccount"), this.aA);
                return;
            }
            if (this.f2751b.e.length() > 0) {
                h.a(2, this.aA, (String) null, a2, this.d, bArr);
                this.as.a(this.f2751b.e, (String) null, -1, this.ax, (cy) null);
                return;
            }
            if (this.f2751b.g.length() > 0) {
                h.a(3, this.aA, (String) null, a2, this.d, bArr);
                this.as.a(this.f2751b.g, this.f2751b.y, this.f2751b.w, (cy) null);
                return;
            }
            if (this.f2751b.i.length() > 0) {
                h.a(8, this.aA, (String) null, a2, this.d, bArr);
                this.as.m();
                return;
            }
            if (this.f2751b.k.length() > 0) {
                h.a(10, this.aA, (String) null, a2, this.d, bArr);
                this.as.n();
                return;
            }
            if (this.f2751b.m != null) {
                FinskyLog.a("Direct purchase deprecated.", new Object[0]);
                nm nmVar = this.f2751b.m;
                h.a(4, this.aA, (String) null, a2, this.d, bArr);
                ExternalReferrer.b(a2, this.f2751b.m.c, "deeplink");
                this.as.a(nmVar.f4173a, b(this.c), this.r.getString("DeepLinkShimFragment.overrideAccount"), this.aA);
                return;
            }
            if (this.f2751b.n.length() > 0) {
                h.a(5, this.aA, (String) null, a2, this.d, bArr);
                this.as.a(this.ax, this.f2751b.n);
                return;
            }
            if (this.f2751b.p != null) {
                h.a(6, this.aA, (String) null, a2, this.d, bArr);
                this.as.a(this.ax);
                this.as.a(this.aq.c(), this.f2751b.p);
                return;
            }
            if (this.f2751b.q.length() > 0) {
                h.a(13, this.aA, (String) null, a2, this.d, bArr);
                this.as.l();
                return;
            }
            h.a(0, this.aA, (String) null, a2, this.d, bArr);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(this.aA));
            intent.addFlags(268435456);
            intent.putExtra("dont_resolve_again", true);
            List<ResolveInfo> queryIntentActivities = f().getPackageManager().queryIntentActivities(intent, 0);
            if (queryIntentActivities.size() == 2) {
                ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
                if (activityInfo.packageName.equals(f().getPackageName())) {
                    activityInfo = queryIntentActivities.get(1).activityInfo;
                }
                intent.setPackage(activityInfo.packageName);
            }
            a(intent);
        }
    }

    private static String b(Uri uri) {
        String queryParameter = uri.getQueryParameter("url");
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        return jm.b(queryParameter);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f2750a;
    }
}
