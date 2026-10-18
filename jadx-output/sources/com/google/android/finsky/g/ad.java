package com.google.android.finsky.g;

import android.os.Handler;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.finsky.protos.it;
import com.google.android.finsky.protos.jb;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.jm;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
final class ad implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ it f2790a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ac f2791b;

    ad(ac acVar, it itVar) {
        this.f2791b = acVar;
        this.f2790a = itVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ag agVar;
        a aVar;
        a aVar2;
        ag agVar2;
        Handler handler;
        ag agVar3;
        long j;
        ag agVar4;
        ag agVar5;
        String a2;
        a aVar3;
        ag agVar6;
        boolean a3;
        boolean z;
        agVar = this.f2791b.f2789b.j;
        if (agVar == null) {
            FinskyLog.e("Expected pending replication request.", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (jb jbVar : this.f2790a.f3971a) {
            if (!TextUtils.isEmpty(jbVar.e)) {
                a2 = jbVar.e;
            } else {
                a2 = a.a(jbVar.c);
            }
            byte[] bArr = this.f2791b.f2788a.get(a2);
            aVar3 = this.f2791b.f2789b.f2844b;
            if (!Arrays.equals(bArr, aVar3.i(a2))) {
                z = this.f2791b.f2789b.k;
                if (z) {
                    this.f2791b.f2789b.a(4, (jb) null, (VolleyError) null, (String) null);
                }
                FinskyLog.e("Tokens changed, not applying library update for libraryId=%s", a2);
            } else {
                x xVar = this.f2791b.f2789b;
                agVar6 = this.f2791b.f2789b.j;
                a3 = xVar.a(jbVar, agVar6.c);
                if (a3) {
                    arrayList.add(a2);
                }
            }
        }
        String[] strArr = this.f2790a.f3972b;
        aVar = this.f2791b.f2789b.f2844b;
        aVar.a(strArr);
        String a4 = jm.a(strArr);
        aVar2 = this.f2791b.f2789b.f2844b;
        bg.V.b(aVar2.i.name).a((com.google.android.finsky.c.o<String>) a4);
        if (arrayList.isEmpty()) {
            agVar2 = this.f2791b.f2789b.j;
            if (agVar2.f2794b != null) {
                handler = this.f2791b.f2789b.f;
                agVar3 = this.f2791b.f2789b.j;
                handler.post(agVar3.f2794b);
            }
        } else {
            String[] strArr2 = new String[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                strArr2[i] = (String) arrayList.get(i);
            }
            agVar4 = this.f2791b.f2789b.j;
            Runnable runnable = agVar4.f2794b;
            StringBuilder sb = new StringBuilder();
            agVar5 = this.f2791b.f2789b.j;
            this.f2791b.f2789b.a(new ag(strArr2, runnable, sb.append(agVar5.c).append("[c]").toString()));
        }
        this.f2791b.f2789b.j = null;
        x xVar2 = this.f2791b.f2789b;
        j = x.d;
        xVar2.a(j);
    }
}
