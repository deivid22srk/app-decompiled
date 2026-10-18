package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.az;
import java.io.IOException;

/* loaded from: classes.dex */
final class c implements e<TokenData> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Account f5383a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f5384b;
    final /* synthetic */ Bundle c;

    c(Account account, String str, Bundle bundle) {
        this.f5383a = account;
        this.f5384b = str;
        this.c = bundle;
    }

    @Override // com.google.android.gms.auth.e
    public final /* synthetic */ TokenData a(IBinder iBinder) {
        Bundle bundle = (Bundle) b.a(az.a(iBinder).a(this.f5383a, this.f5384b, this.c));
        TokenData a2 = TokenData.a(bundle, "tokenDetails");
        if (a2 != null) {
            return a2;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        com.google.android.gms.auth.a.a.a a3 = com.google.android.gms.auth.a.a.a.a(string);
        if (com.google.android.gms.auth.a.a.a.a(a3)) {
            throw new UserRecoverableAuthException(string, intent);
        }
        if (com.google.android.gms.auth.a.a.a.b(a3)) {
            throw new IOException(string);
        }
        throw new GoogleAuthException(string);
    }
}
