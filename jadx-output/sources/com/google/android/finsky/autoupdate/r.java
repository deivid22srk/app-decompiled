package com.google.android.finsky.autoupdate;

import android.os.Build;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.api.model.x;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

/* loaded from: classes.dex */
final class r implements x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f2053a;

    r(q qVar) {
        this.f2053a = qVar;
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        if (this.f2053a.f.f2050b.b() != this.f2053a.f2052b) {
            FinskyLog.c("Skipping update check because account hash changed.", new Object[0]);
            p.a(this.f2053a.c, false);
            return;
        }
        List<Document> list = this.f2053a.f.j.f1990a;
        if (Build.VERSION.SDK_INT < 16) {
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Document document = list.get(i);
                if (!com.google.android.finsky.b.l.a(document)) {
                    i++;
                } else {
                    p.a(this.f2053a.f, document);
                    break;
                }
            }
        }
        p.a(this.f2053a.f, list, this.f2053a.d, this.f2053a.e);
        p.a(this.f2053a.c, true);
    }
}
