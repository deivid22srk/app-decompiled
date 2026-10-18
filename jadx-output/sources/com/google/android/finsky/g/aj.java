package com.google.android.finsky.g;

import android.accounts.Account;
import android.os.Handler;
import android.util.Log;
import com.google.android.finsky.protos.jb;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class aj implements ah {

    /* renamed from: a, reason: collision with root package name */
    final Handler f2795a;

    /* renamed from: b, reason: collision with root package name */
    final Handler f2796b;
    private final com.google.android.finsky.api.k d;
    private final av e;
    private final h f;
    private final boolean h;
    final Map<Account, x> c = new HashMap();
    private final List<ai> g = new ArrayList();

    public aj(com.google.android.finsky.api.k kVar, av avVar, h hVar, Handler handler, Handler handler2, boolean z) {
        this.d = kVar;
        this.e = avVar;
        this.f = hVar;
        this.f2795a = handler;
        this.f2796b = handler2;
        this.h = z;
        a();
    }

    @Override // com.google.android.finsky.g.ah
    public final synchronized void a(ai aiVar) {
        this.g.add(aiVar);
    }

    @Override // com.google.android.finsky.g.ah
    public final synchronized void a() {
        this.c.clear();
        for (a aVar : this.f.e()) {
            Account account = aVar.i;
            x xVar = new x(this.d.a(account.name), this.e, aVar, this.f2795a, this.f2796b, this.h);
            xVar.a(new ak(this, aVar));
            this.c.put(account, xVar);
        }
    }

    final synchronized void a(String str) {
        Iterator<ai> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().a(str);
        }
    }

    @Override // com.google.android.finsky.g.ah
    public final void a(Runnable runnable, String str) {
        this.f.a(new al(this, runnable, str));
    }

    @Override // com.google.android.finsky.g.ah
    public final void a(Account account, String[] strArr, Runnable runnable, String str) {
        this.f.a(new an(this, account, strArr, runnable, str));
    }

    @Override // com.google.android.finsky.g.ah
    public final void a(Account account, String str, Runnable runnable, jb... jbVarArr) {
        this.f.a(new ao(this, account, str, jbVarArr, runnable));
    }

    @Override // com.google.android.finsky.g.ah
    public final void b() {
        Log.d("FinskyLibrary", "| LibraryReplicators {");
        for (x xVar : this.c.values()) {
            String a2 = FinskyLog.a(xVar.f2844b.i.name);
            Log.d("FinskyLibrary", "|   LibraryReplicator (account=" + a2 + ") {");
            if (xVar.c != null) {
                Log.d("FinskyLibrary", "|     eventsCount=" + xVar.c.size());
                Iterator<ab> it = xVar.c.iterator();
                while (it.hasNext()) {
                    it.next().a("|   ");
                }
            } else {
                Log.d("FinskyLibrary", "|     eventsCount=0");
            }
            Log.d("FinskyLibrary", "|   } (account=" + a2 + ")");
        }
        Log.d("FinskyLibrary", "| }");
    }
}
