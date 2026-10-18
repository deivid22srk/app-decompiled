package com.google.android.play.drawer;

import android.accounts.Account;
import com.google.android.finsky.protos.gx;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class h implements y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f6861a;

    h(a aVar) {
        this.f6861a = aVar;
    }

    @Override // com.google.android.play.drawer.y
    public final void a(Account account) {
        Account account2;
        u uVar;
        r rVar;
        Set set;
        Account account3;
        u uVar2;
        Map map;
        Account account4;
        r rVar2;
        account2 = this.f6861a.f;
        if (account == account2) {
            set = this.f6861a.s;
            account3 = this.f6861a.f;
            boolean contains = set.contains(account3.name);
            uVar2 = this.f6861a.m;
            map = this.f6861a.r;
            account4 = this.f6861a.f;
            if (uVar2.a(contains, (gx) map.get(account4.name))) {
                rVar2 = this.f6861a.n;
                rVar2.h();
                return;
            }
            return;
        }
        uVar = this.f6861a.m;
        uVar.a(account.name);
        rVar = this.f6861a.n;
        rVar.h();
    }
}
