package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.qe;
import java.util.Set;

/* loaded from: classes.dex */
public final class n extends com.google.android.gms.common.internal.l<i> implements qe {
    private final boolean f;
    private final com.google.android.gms.common.internal.h g;
    private final Bundle h;
    private Integer i;

    @Override // com.google.android.gms.internal.qe
    public final void a() {
        try {
            o().a(this.i.intValue());
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // com.google.android.gms.internal.qe
    public final void a(ad adVar, Set<Scope> set, f fVar) {
        av.a(fVar, "Expecting a valid ISignInCallbacks");
        try {
            o().a(new AuthAccountRequest(adVar, set), fVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when authAccount is called");
            try {
                fVar.a(new ConnectionResult(8, null), new AuthAccountResult(8));
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.qe
    public final void a(ad adVar, boolean z) {
        try {
            o().a(adVar, this.i.intValue(), z);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // com.google.android.gms.internal.qe
    public final void c() {
        a(new r(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final String d() {
        return "com.google.android.gms.signin.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final String e() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.l, com.google.android.gms.common.api.g
    public final boolean h() {
        return this.f;
    }

    public n(Context context, Looper looper, boolean z, com.google.android.gms.common.internal.h hVar, Bundle bundle, com.google.android.gms.common.api.p pVar, com.google.android.gms.common.api.q qVar) {
        super(context, looper, 44, hVar, pVar, qVar);
        this.f = z;
        this.g = hVar;
        this.h = bundle;
        this.i = hVar.h;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(android.content.Context r9, android.os.Looper r10, com.google.android.gms.common.internal.h r11, com.google.android.gms.internal.qg r12, com.google.android.gms.common.api.p r13, com.google.android.gms.common.api.q r14, java.util.concurrent.ExecutorService r15) {
        /*
            r8 = this;
            r3 = 1
            java.lang.Integer r0 = r11.h
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r1 = "com.google.android.gms.signin.internal.offlineAccessRequested"
            boolean r2 = r12.f6245b
            r5.putBoolean(r1, r2)
            java.lang.String r1 = "com.google.android.gms.signin.internal.idTokenRequested"
            boolean r2 = r12.c
            r5.putBoolean(r1, r2)
            java.lang.String r1 = "com.google.android.gms.signin.internal.serverClientId"
            java.lang.String r2 = r12.d
            r5.putString(r1, r2)
            com.google.android.gms.common.api.r r1 = r12.e
            if (r1 == 0) goto L34
            com.google.android.gms.signin.internal.o r1 = new com.google.android.gms.signin.internal.o
            r1.<init>(r12, r15)
            android.os.IBinder r1 = r1.asBinder()
            java.lang.String r2 = "com.google.android.gms.signin.internal.signInCallbacks"
            com.google.android.gms.common.internal.BinderWrapper r4 = new com.google.android.gms.common.internal.BinderWrapper
            r4.<init>(r1)
            r5.putParcelable(r2, r4)
        L34:
            if (r0 == 0) goto L3f
            java.lang.String r1 = "com.google.android.gms.common.internal.ClientSettings.sessionId"
            int r0 = r0.intValue()
            r5.putInt(r1, r0)
        L3f:
            java.lang.String r0 = "com.google.android.gms.signin.internal.usePromptModeForAuthCode"
            boolean r1 = r12.f
            r5.putBoolean(r0, r1)
            java.lang.String r0 = "com.google.android.gms.signin.internal.forceCodeForRefreshToken"
            boolean r1 = r12.g
            r5.putBoolean(r0, r1)
            java.lang.String r0 = "com.google.android.gms.signin.internal.waitForAccessTokenRefresh"
            boolean r1 = r12.h
            r5.putBoolean(r0, r1)
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r11
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.signin.internal.n.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.h, com.google.android.gms.internal.qg, com.google.android.gms.common.api.p, com.google.android.gms.common.api.q, java.util.concurrent.ExecutorService):void");
    }

    @Override // com.google.android.gms.internal.qe
    public final void a(ap apVar) {
        av.a(apVar, "Expecting a valid IResolveAccountCallbacks");
        try {
            com.google.android.gms.common.internal.h hVar = this.g;
            Account account = hVar.f5710a != null ? hVar.f5710a : new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(account.name)) {
                com.google.android.gms.auth.api.signin.a.a a2 = com.google.android.gms.auth.api.signin.a.a.a(this.f5716a);
                googleSignInAccount = a2.a(a2.b("defaultGoogleSignInAccount"));
            }
            o().a(new ResolveAccountRequest(account, this.i.intValue(), googleSignInAccount), apVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when resolveAccount is called");
            try {
                apVar.a(new ResolveAccountResponse());
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final Bundle f() {
        if (!this.f5716a.getPackageName().equals(this.g.e)) {
            this.h.putString("com.google.android.gms.signin.internal.realClientPackageName", this.g.e);
        }
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final /* synthetic */ i a(IBinder iBinder) {
        return j.a(iBinder);
    }
}
