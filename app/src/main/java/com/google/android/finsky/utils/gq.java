package com.google.android.finsky.utils;

import android.accounts.Account;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
public final class gq {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4915a;

    /* renamed from: b, reason: collision with root package name */
    public int f4916b;
    public int c;
    public int d;
    public String e;
    public String f;
    public final gp[] g = new gp[2];

    public gq() {
        for (int i = 0; i < 2; i++) {
            this.g[i] = new gp();
        }
        a();
    }

    public final void a() {
        this.f4915a = false;
        this.c = 0;
        this.f4916b = -1;
        this.d = 0;
        this.e = null;
        this.f = null;
        for (int i = 0; i < 2; i++) {
            this.g[i].a();
        }
    }

    public final boolean b() {
        return this.d > 0;
    }

    public final boolean c() {
        return this.c != 0;
    }

    private void a(int i, String str, String str2, boolean z, int i2, au auVar, Document document, Account account) {
        if (this.d < 2) {
            this.g[this.d].a();
            this.g[this.d].f4913a = i;
            this.g[this.d].f4914b = str;
            this.g[this.d].c = str2;
            this.g[this.d].d = z;
            this.g[this.d].e = i2;
            this.g[this.d].f = auVar;
            this.g[this.d].g = document.s();
            this.g[this.d].h = document;
            this.g[this.d].i = account;
            this.d++;
            return;
        }
        FinskyLog.e("Trying to add action %d but no more room for actions", Integer.valueOf(i));
    }

    public final void a(int i, com.google.android.finsky.protos.ea eaVar, Document document, Account account) {
        a(i, eaVar.h, gl.a(eaVar) ? eaVar.t : null, false, eaVar.A, null, document, account);
    }

    public final void a(int i, com.google.android.finsky.protos.ea eaVar, boolean z, Document document, Account account) {
        a(i, eaVar.h, gl.a(eaVar) ? eaVar.t : null, z, 0, null, document, account);
    }

    public final void a(int i, Document document, Account account) {
        a(i, null, null, false, -1, null, document, account);
    }

    public final int a(int i, com.google.android.finsky.protos.ea[] eaVarArr, au auVar, au auVar2, Document document, Account account) {
        com.google.android.finsky.protos.ea eaVar;
        int i2;
        int i3 = 0;
        com.google.android.finsky.protos.ea eaVar2 = null;
        int length = eaVarArr.length;
        int i4 = 0;
        while (i4 < length) {
            com.google.android.finsky.protos.ea eaVar3 = eaVarArr[i4];
            if (auVar.a(eaVar3.A)) {
                i2 = i3 + 1;
            } else {
                eaVar3 = eaVar2;
                i2 = i3;
            }
            i4++;
            i3 = i2;
            eaVar2 = eaVar3;
        }
        if (i3 == 0) {
            return 0;
        }
        if (i3 == 1) {
            a(i, eaVar2, document, account);
            return 1;
        }
        com.google.android.finsky.protos.ea a2 = as.a(eaVarArr, true, auVar);
        boolean z = true;
        if (auVar2 == auVar || (eaVar = as.a(eaVarArr, true, auVar2)) == null || eaVar == a2) {
            eaVar = a2;
        } else {
            z = false;
        }
        a(i, eaVar.h, gl.a(eaVar) ? eaVar.t : null, z, 0, auVar, document, account);
        return i3;
    }

    public final gp a(int i) {
        if (i < this.d) {
            return this.g[i];
        }
        FinskyLog.e("Request for invalid action #%d (%d available actions)", Integer.valueOf(i), Integer.valueOf(this.d));
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.d; i++) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append(this.g[i].f4913a);
        }
        return sb.toString();
    }
}
