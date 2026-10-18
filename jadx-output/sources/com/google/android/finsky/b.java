package com.google.android.finsky;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.finsky.g.ah;
import com.google.android.finsky.protos.iz;
import com.google.android.finsky.protos.jb;
import com.google.android.finsky.protos.kf;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.as;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.dw;
import com.google.android.finsky.utils.ic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements com.google.android.finsky.api.m {

    /* renamed from: a, reason: collision with root package name */
    final List<String> f2058a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    final List<String> f2059b = new ArrayList();
    final com.google.android.finsky.receivers.f c;
    final dw d;
    final Context e;
    final com.google.android.finsky.b.a f;
    final ah g;
    private final com.google.android.finsky.g.d h;

    public b(Context context, com.google.android.finsky.receivers.f fVar, dw dwVar, com.google.android.finsky.b.a aVar, ah ahVar, com.google.android.finsky.g.d dVar) {
        this.c = fVar;
        this.d = dwVar;
        this.e = context;
        this.f = aVar;
        this.g = ahVar;
        this.h = dVar;
        b();
    }

    @Override // com.google.android.finsky.api.m
    public final void a(kf kfVar) {
        if (!ic.a(this.e)) {
            FinskyLog.a("Dropping notification type=%d because store type invalid", Integer.valueOf(kfVar.f4031a));
        } else if (Looper.myLooper() == Looper.getMainLooper() && this.f.f2060a.b()) {
            b(kfVar);
        } else {
            this.f.a(new c(this, kfVar));
        }
    }

    final void b(kf kfVar) {
        boolean z;
        String str = kfVar.c;
        if (this.f2058a.contains(str)) {
            FinskyLog.a("Notification [%s] ignored, already handled.", str);
            a();
            return;
        }
        FinskyLog.a("Handling notification type=[%s], id=[%s]", Integer.valueOf(kfVar.f4031a), str);
        d dVar = new d(this, kfVar, str);
        if (kfVar.l != null) {
            Account a2 = this.h.a(kfVar.j);
            if (a2 != null) {
                FinskyLog.a("Processing notification library update.", new Object[0]);
                jb jbVar = kfVar.l;
                iz[] izVarArr = jbVar.i;
                int length = izVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    iz izVar = izVarArr[i];
                    if (!as.a(izVar.f3981a)) {
                        i++;
                    } else {
                        FinskyLog.a("Encountered IAB item in notification: %s.", izVar.f3981a.f3740a);
                        z = true;
                        break;
                    }
                }
                if (z) {
                    FinskyLog.e("Ignoring notification LibraryUpdate with IAB mutations.", new Object[0]);
                } else {
                    this.g.a(a2, "notification (type=[" + kfVar.f4031a + "],id=[" + kfVar.c + "])", dVar, jbVar);
                    return;
                }
            } else {
                FinskyLog.a("Could not process library update for unknown account.", new Object[0]);
            }
        }
        dVar.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Iterator<String> it = this.f2059b.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    final void a(String str) {
        FinskyApp.a().b((String) null).b(str, new e(this, str), new f(this, str));
    }

    private void b() {
        String a2 = bg.y.a();
        if (!TextUtils.isEmpty(a2)) {
            String[] split = a2.split(",");
            for (int i = 0; i < split.length; i++) {
                this.f2059b.add(split[i]);
                this.f2058a.add(split[i]);
            }
        }
    }

    static /* synthetic */ void b(b bVar) {
        if (bVar.f2059b.isEmpty()) {
            bg.y.c();
        } else if (bVar.f2059b.size() == 1) {
            bg.y.a((com.google.android.finsky.c.o<String>) bVar.f2059b.get(0));
        } else {
            bg.y.a((com.google.android.finsky.c.o<String>) TextUtils.join(",", bVar.f2059b));
        }
    }
}
