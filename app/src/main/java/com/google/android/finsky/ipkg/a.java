package com.google.android.finsky.ipkg;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.support.v4.app.t;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.bp;
import com.google.android.finsky.utils.bq;
import com.google.android.finsky.utils.br;
import com.google.android.finsky.utils.bs;
import com.google.android.finsky.utils.bt;
import com.google.android.finsky.utils.bu;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements bt {

    /* renamed from: a, reason: collision with root package name */
    public final Document f2850a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2851b;
    public ArrayList<AudienceMember> c;
    public c d;
    public boolean e;

    public a(Document document, String str) {
        this.f2850a = document;
        this.f2851b = str;
    }

    public final void a(Context context, m mVar) {
        if (!this.e) {
            this.e = true;
            String str = this.f2850a.f1963a.c;
            b bVar = new b(this);
            if (com.google.android.gms.common.c.a(context) == 0) {
                bu buVar = new bu(mVar, FinskyApp.a().j(), str, bVar);
                buVar.f4787b.a((p) buVar);
                buVar.f4787b.a((q) buVar);
                if (!buVar.f4787b.e() && !buVar.f4787b.f()) {
                    buVar.f4787b.b();
                }
            } else {
                new Handler().post(new bs(bVar));
            }
            String str2 = this.f2850a.f1963a.c;
            if (!bp.c || str2 != bp.f4782b) {
                return;
            }
            bp.f4781a = this;
        }
    }

    public final void a(t tVar) {
        if (this.c == null) {
            return;
        }
        FinskyApp.a().a((Account) null).a(new bq(tVar, this.f2850a.f1963a.c, this.c, this), new br(), true);
    }

    @Override // com.google.android.finsky.utils.bt
    public final void a(ArrayList<AudienceMember> arrayList) {
        this.c = arrayList;
        a();
    }

    public final void a() {
        if (this.d != null) {
            this.d.a(this.c);
        }
    }
}
