package com.google.android.play.drawer;

import android.accounts.Account;
import com.google.android.finsky.protos.gx;
import com.google.android.finsky.protos.lj;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class f implements com.android.volley.t<lj> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f6858a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlayDrawerProfileInfoView f6859b;
    final /* synthetic */ Account c;
    final /* synthetic */ a d;

    f(a aVar, String str, PlayDrawerProfileInfoView playDrawerProfileInfoView, Account account) {
        this.d = aVar;
        this.f6858a = str;
        this.f6859b = playDrawerProfileInfoView;
        this.c = account;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(lj ljVar) {
        Map map;
        Map map2;
        Set set;
        Account account;
        Account[] accountArr;
        Map<String, gx> map3;
        com.google.android.play.image.e eVar;
        map = this.d.r;
        gx gxVar = (gx) map.get(this.f6858a);
        gx gxVar2 = ljVar.f4082a;
        map2 = this.d.r;
        map2.put(this.f6858a, gxVar2);
        set = this.d.s;
        set.add(this.f6858a);
        if (gxVar == null && gxVar2 != null) {
            String str = this.f6858a;
            account = this.d.f;
            if (!str.equals(account.name) || !a.g(this.d)) {
                return;
            }
            PlayDrawerProfileInfoView playDrawerProfileInfoView = this.f6859b;
            Account account2 = this.c;
            accountArr = this.d.g;
            map3 = this.d.r;
            eVar = this.d.l;
            playDrawerProfileInfoView.a(account2, accountArr, map3, eVar);
        }
    }
}
