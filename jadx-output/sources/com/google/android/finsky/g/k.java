package com.google.android.finsky.g;

import android.accounts.Account;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

/* loaded from: classes.dex */
final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f2828a;

    k(h hVar) {
        this.f2828a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        av avVar;
        d dVar;
        avVar = this.f2828a.c;
        dVar = this.f2828a.f2823b;
        List<Account> a2 = dVar.a();
        StringBuilder sb = new StringBuilder();
        String[] strArr = new String[a2.size()];
        for (int i = 0; i < a2.size(); i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append('?');
            strArr[i] = a2.get(i).name;
        }
        int delete = avVar.f2812a.getWritableDatabase().delete("ownership", "account NOT IN (" + sb.toString() + ")", strArr);
        if (delete <= 0) {
            return;
        }
        FinskyLog.a("Removed %d obsolete library rows.", Integer.valueOf(delete));
    }
}
