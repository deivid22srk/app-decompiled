package com.google.android.wallet.common.d;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.t;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.l;
import com.android.volley.o;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.b.a.a.a.b.a.k;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class b extends e {

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<l<?>> f7274b;
    public o c;
    public com.google.android.wallet.common.c.apkg.a d;

    /* renamed from: a, reason: collision with root package name */
    boolean f7273a = false;
    int e = 1;

    public abstract void u();

    public static Bundle a(Account account, com.google.d.b.a.a.b bVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("account", account);
        bundle.putParcelable("androidConfig", ParcelableProto.a(bVar));
        return bundle;
    }

    @Override // com.google.android.wallet.common.d.e, android.support.v4.app.Fragment
    public void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("attemptedToHandleAuth", this.f7273a);
        bundle.putInt("attempts", this.e);
    }

    @Override // com.google.android.wallet.common.d.e
    public void c(Bundle bundle) {
        this.f7273a = bundle.getBoolean("attemptedToHandleAuth");
        this.e = bundle.getInt("attempts");
        super.c(bundle);
    }

    public final void a(l<?> lVar, boolean z) {
        u();
        if (z) {
            this.e = 1;
        }
        if (this.f == 1 && this.g == 1) {
            if (this.f7274b == null) {
                this.f7274b = new ArrayList<>(2);
            }
            this.f7274b.add(lVar);
        } else {
            lVar.g = new com.google.android.wallet.common.c.apkg.b(com.google.android.wallet.a.a.h.b().intValue(), this.d);
            this.c.a(lVar);
            a(1, 0);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void a(int i, int i2, Intent intent) {
        if (i == 100) {
            if (i2 == -1) {
                this.f7273a = true;
                a(1, 0);
                if (this.f7274b == null) {
                    return;
                }
                int size = this.f7274b.size();
                for (int i3 = 0; i3 < size; i3++) {
                    a(this.f7274b.get(i3), true);
                }
                this.f7274b.clear();
                return;
            }
            a(3, 1);
            return;
        }
        super.a(i, i2, intent);
    }

    public boolean b(int i) {
        return false;
    }

    public final void a(com.google.android.wallet.common.c.apkg.c<?> cVar, com.google.b.a.a.a.b.a.f fVar, k kVar) {
        int i = 0;
        if (kVar == null) {
            a(2, 0);
        } else {
            if (!TextUtils.isEmpty(kVar.e)) {
                Log.e("BaseOrchSidecar", kVar.e);
            }
            if (!TextUtils.isEmpty(kVar.f7706a)) {
                a(3, 5);
                i = 3;
            } else if (kVar.f7707b == 1 && kVar.c.length > 0) {
                a(3, 4);
                i = 2;
            } else {
                throw new IllegalArgumentException("No error found in error response");
            }
        }
        com.google.android.wallet.common.bpkg.a.a.a(cVar.p(), i, null, cVar.n(), fVar.f7700a, fVar.c);
    }

    @Override // com.google.android.wallet.common.d.e, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        boolean contains;
        boolean contains2;
        Bundle bundle2 = this.r;
        com.google.d.b.a.a.b bVar = (com.google.d.b.a.a.b) ParcelableProto.a(bundle2, "androidConfig");
        Account account = (Account) bundle2.getParcelable("account");
        t f = f();
        Context applicationContext = f.getApplicationContext();
        String str = account.name;
        String str2 = bVar.d;
        if (com.google.android.gms.common.c.h(f) && (contains = str.contains("@")) != (contains2 = str2.contains("@"))) {
            if (contains) {
                str = str.substring(0, str.indexOf(64));
            }
            if (contains2) {
                str2 = str2.substring(0, str2.indexOf(64));
            }
        }
        if (account.name.equalsIgnoreCase(bVar.d) || str.equalsIgnoreCase(str2)) {
            this.d = new com.google.android.wallet.common.c.a.a(applicationContext, bVar, new com.android.volley.apkg.a(applicationContext, account, bVar.c));
            this.c = com.google.android.wallet.common.c.a.a(f().getApplicationContext());
            super.a(bundle);
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Account specified by integrator=%s must match AndroidEnvironmentConfig=%s", account.name, bVar.d));
    }
}
