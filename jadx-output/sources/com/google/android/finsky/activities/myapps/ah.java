package com.google.android.finsky.activities.myapps;

import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.activities.MultiInstallActivity;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

/* loaded from: classes.dex */
final class ah implements com.google.android.finsky.api.model.x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.api.model.f f1814a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f1815b;
    final /* synthetic */ ac c;

    ah(ac acVar, com.google.android.finsky.api.model.f fVar, String str) {
        this.c = acVar;
        this.f1814a = fVar;
        this.f1815b = str;
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        Context context;
        Context context2;
        if (this.c.L()) {
            this.c.I();
            List<Document> b2 = this.f1814a.b();
            context = this.c.ap;
            Intent a2 = MultiInstallActivity.a(context, b2, this.f1815b);
            context2 = this.c.ap;
            context2.startActivity(a2);
            return;
        }
        FinskyLog.c("Bulk install cannot start because no longer active.", new Object[0]);
    }
}
