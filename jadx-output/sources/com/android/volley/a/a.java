package com.android.volley.a;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.volley.AuthFailureError;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Account f1196a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1197b;
    private final AccountManager c;
    private final boolean d;

    public a(Context context, Account account, String str) {
        this(context, account, str, (byte) 0);
    }

    public a(Context context, Account account, String str, byte b2) {
        this(AccountManager.get(context), account, str);
    }

    private a(AccountManager accountManager, Account account, String str) {
        this.c = accountManager;
        this.f1196a = account;
        this.f1197b = str;
        this.d = false;
    }

    @Override // com.android.volley.a.b
    public final String a() {
        String str = null;
        AccountManagerFuture<Bundle> authToken = this.c.getAuthToken(this.f1196a, this.f1197b, this.d, null, null);
        try {
            Bundle result = authToken.getResult();
            if (authToken.isDone() && !authToken.isCancelled()) {
                if (result.containsKey("intent")) {
                    throw new AuthFailureError((Intent) result.getParcelable("intent"));
                }
                str = result.getString("authtoken");
            }
            if (str == null) {
                throw new AuthFailureError("Got null auth token for type: " + this.f1197b);
            }
            return str;
        } catch (Exception e) {
            throw new AuthFailureError("Error while retrieving auth token", e);
        }
    }

    public final void a(String str) {
        this.c.invalidateAuthToken(this.f1196a.type, str);
    }
}
