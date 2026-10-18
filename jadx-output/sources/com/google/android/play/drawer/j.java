package com.google.android.play.drawer;

import android.accounts.Account;
import com.google.android.finsky.protos.lj;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class j implements com.android.volley.t<lj> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f6863a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f6864b;

    j(a aVar, String str) {
        this.f6864b = aVar;
        this.f6863a = str;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(lj ljVar) {
        Map map;
        Set set;
        Account[] accountArr;
        Set set2;
        boolean z = false;
        map = this.f6864b.r;
        map.put(this.f6863a, ljVar.f4082a);
        set = this.f6864b.s;
        set.add(this.f6863a);
        int i = 0;
        while (true) {
            accountArr = this.f6864b.g;
            if (i < accountArr.length) {
                set2 = this.f6864b.s;
                if (!set2.contains(this.f6863a)) {
                    break;
                } else {
                    i++;
                }
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            return;
        }
        this.f6864b.notifyDataSetChanged();
    }
}
