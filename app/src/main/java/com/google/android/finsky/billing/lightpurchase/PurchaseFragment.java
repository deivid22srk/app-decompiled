package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.SettingsActivity;
import com.google.android.finsky.activities.gp;
import com.google.android.finsky.auth.AuthState;
import com.google.android.finsky.billing.an;
import com.google.android.finsky.billing.ap;
import com.google.android.finsky.billing.aq;
import com.google.android.finsky.billing.giftcard.RedeemCodeResult;
import com.google.android.finsky.billing.lightpurchase.billingprofile.BillingProfileActivity;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.as;
import com.google.android.finsky.protos.cl;
import com.google.android.finsky.protos.io;
import com.google.android.finsky.protos.ma;
import com.google.android.finsky.protos.pb;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.cr;
import com.google.android.finsky.utils.jr;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class PurchaseFragment extends com.google.android.finsky.billing.lightpurchase.bpkg.a implements gp, aq, com.google.android.finsky.billing.i, com.google.android.finsky.epkg.v {

    /* renamed from: a, reason: collision with root package name */
    public e f2277a;
    private boolean aA;
    private com.google.android.finsky.billing.h ao;
    private Bundle ap;
    private int ar;
    private int as;
    private VoucherParams at;
    private String aw;
    private Bundle ax;
    private boolean ay;
    private boolean az;

    /* renamed from: b, reason: collision with root package name */
    public PurchaseParams f2278b;
    byte[] c;
    public String d;
    PurchaseError e;
    boolean f;
    Bundle g;
    boolean h;
    private int aq = -1;
    private Bundle au = new Bundle();
    private Bundle av = new Bundle();

    public static PurchaseFragment a(Account account, PurchaseParams purchaseParams, byte[] bArr, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("MultiStepFragment.account", account);
        bundle2.putParcelable("PurchaseFragment.params", purchaseParams);
        bundle2.putByteArray("PurchaseFragment.docServerLogsCookie", bArr);
        bundle2.putBundle("PurchaseFragment.appDownloadSizeWarningArgs", bundle);
        PurchaseFragment purchaseFragment = new PurchaseFragment();
        purchaseFragment.f(bundle2);
        return purchaseFragment;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.a, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null) {
            this.f2277a = (e) this.B.a("PurchaseFragment.sidecar");
            this.aq = bundle.getInt("PurchaseFragment.handledStateInstance");
            this.ar = bundle.getInt("PurchaseFragment.previousState");
            this.as = bundle.getInt("PurchaseFragment.previousSubstate");
        }
        Bundle bundle2 = this.r;
        this.f2278b = (PurchaseParams) bundle2.getParcelable("PurchaseFragment.params");
        this.c = bundle2.getByteArray("PurchaseFragment.docServerLogsCookie");
        this.ax = bundle2.getBundle("PurchaseFragment.appDownloadSizeWarningArgs");
        if (bundle != null) {
            this.aw = bundle.getString("PurchaseFragment.selectedInstrumentId");
            this.at = (VoucherParams) bundle.getParcelable("PurchaseFragment.voucherParams");
            this.au = bundle.getBundle("PurchaseFragment.prepareChallengeResponses");
            this.av = bundle.getBundle("PurchaseFragment.commitChallengeResponses");
            this.e = (PurchaseError) bundle.getParcelable("PurchaseFragment.error");
            this.f = bundle.getBoolean("PurchaseFragment.succeeded");
            this.ay = bundle.getBoolean("PurchaseFragment.skipCheckout");
            this.g = bundle.getBundle("PurchaseFragment.extraPurchaseData");
            this.d = bundle.getString("PurchaseFragment.escrowHandleParameterKey");
            this.az = bundle.getBoolean("PurchaseFragment.usePinBasedAuth");
            this.aA = bundle.getBoolean("PurchaseFragment.useDelegatedAuth");
            this.h = bundle.getBoolean("PurchaseFragment.postSuccessItemOpened");
            return;
        }
        if (!TextUtils.isEmpty(this.f2278b.k)) {
            this.at = new VoucherParams(this.f2278b.k, true, true);
        } else {
            this.at = new VoucherParams(null, true, jr.a(FinskyApp.a().p.a(this.i)));
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void a(Activity activity) {
        super.a(activity);
        if (!(activity instanceof cy)) {
            throw new IllegalStateException("Activity must implement PlayStoreUiElementNode");
        }
    }

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.a, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putInt("PurchaseFragment.handledStateInstance", this.aq);
        bundle.putInt("PurchaseFragment.previousState", this.ar);
        bundle.putInt("PurchaseFragment.previousSubstate", this.as);
        bundle.putBundle("PurchaseFragment.prepareChallengeResponses", this.au);
        bundle.putBundle("PurchaseFragment.commitChallengeResponses", this.av);
        bundle.putString("PurchaseFragment.selectedInstrumentId", this.aw);
        bundle.putParcelable("PurchaseFragment.voucherParams", this.at);
        bundle.putBoolean("PurchaseFragment.succeeded", this.f);
        bundle.putParcelable("PurchaseFragment.error", this.e);
        bundle.putBoolean("PurchaseFragment.skipCheckout", this.ay);
        bundle.putBundle("PurchaseFragment.extraPurchaseData", this.g);
        bundle.putString("PurchaseFragment.escrowHandleParameterKey", this.d);
        bundle.putBoolean("PurchaseFragment.usePinBasedAuth", this.az);
        bundle.putBoolean("PurchaseFragment.useDelegatedAuth", this.aA);
        bundle.putBoolean("PurchaseFragment.postSuccessItemOpened", this.h);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.a, android.support.v4.app.Fragment
    public final void g_() {
        super.g_();
        this.ao = (com.google.android.finsky.billing.h) h().a("PurchaseFragment.completeFlowFragment");
        if (this.f2277a == null) {
            String str = this.i.name;
            PurchaseParams purchaseParams = this.f2278b;
            Bundle bundle = new Bundle();
            bundle.putString("authAccount", str);
            bundle.putParcelable("CheckoutPurchaseSidecar.purchaseParams", purchaseParams);
            e eVar = new e();
            eVar.f(bundle);
            this.f2277a = eVar;
            this.B.a().a(this.f2277a, "PurchaseFragment.sidecar").b();
        }
        this.f2277a.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.a
    public final int w() {
        return this.f2278b.f2281a.e;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.a, android.support.v4.app.Fragment
    public final void h_() {
        if (this.f2277a != null) {
            this.f2277a.a((com.google.android.finsky.epkg.v) null);
        }
        super.h_();
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.light_purchase, viewGroup, false);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.a, android.support.v4.app.Fragment
    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
    }

    private void a(CheckoutPurchaseError checkoutPurchaseError, boolean z) {
        a((com.google.android.finsky.billing.lightpurchase.bpkg.f<?>) com.google.android.finsky.billing.lightpurchase.cpkg.o.a(checkoutPurchaseError, z));
    }

    private void b(boolean z) {
        e eVar = this.f2277a;
        boolean z2 = eVar.i;
        eVar.i = false;
        a((com.google.android.finsky.billing.lightpurchase.bpkg.f<?>) com.google.android.finsky.billing.lightpurchase.cpkg.g.a(this.f2278b.f2281a.e, this.f2277a.g, z, z2, this.f2277a.ar));
    }

    private void D() {
        pb pbVar = this.f2277a.am.g.f3717a;
        String str = this.i.name;
        int b2 = com.google.android.finsky.billing.u.b();
        com.google.android.finsky.billing.lightpurchase.cpkg.y yVar = new com.google.android.finsky.billing.lightpurchase.cpkg.y();
        yVar.f(com.google.android.finsky.billing.lightpurchase.cpkg.y.a(str, pbVar, b2));
        a((com.google.android.finsky.billing.lightpurchase.bpkg.f<?>) yVar);
    }

    public final void a(cl clVar, AuthState authState) {
        this.az = authState.a() == 2;
        a((com.google.android.finsky.billing.lightpurchase.bpkg.f<?>) com.google.android.finsky.billing.lightpurchase.cpkg.b.a(w(), this.i, clVar, authState));
    }

    public final void u() {
        int i = this.f2278b.f2281a.c;
        if (ap.a(i)) {
            com.google.android.finsky.billing.y.a(this, this.f2278b.c != null ? this.f2278b.c.s() : 0L).a(this.B, "PurchaseFragment.downloadNetworkDialog");
        } else if (i == 1 && this.ax != null) {
            com.google.android.finsky.billing.ae.a(this, this.ax).a(this.B, "PurchaseFragment.appDownloadSizeWarningDialog");
        } else {
            E();
        }
    }

    private void E() {
        ap.a(this.f2278b.f2281a.f3740a);
        if (this.ay) {
            this.f2277a.u();
            v();
            return;
        }
        io ioVar = this.f2277a.g.o;
        if (ioVar.f == 2) {
            int a2 = com.google.android.finsky.billing.u.a(ioVar);
            if (this.ao != null) {
                FinskyLog.e("No complete flow fragment expected.", new Object[0]);
                return;
            }
            if (a2 == 3) {
                FinskyLog.a("Start complete flow for DCB3 instrument.", new Object[0]);
                Account account = this.i;
                Bundle bundle = new Bundle();
                bundle.putParcelable("CompleteDcb3Flow.account", account);
                bundle.putParcelable("CompleteDcb3Flow.instrument", ParcelableProto.a(ioVar));
                n nVar = new n();
                nVar.f(bundle);
                this.ao = nVar;
            }
            if (this.ao != null) {
                z();
                h().a().a(this.ao, "PurchaseFragment.completeFlowFragment").b();
                return;
            }
        }
        F();
    }

    public final void v() {
        ((ae) f()).j();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void F() {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.lightpurchase.PurchaseFragment.F():void");
    }

    public final void a(as asVar) {
        Account account = this.i;
        e eVar = this.f2277a;
        String str = null;
        if (eVar.aq != null) {
            str = eVar.aq.e;
        }
        if (TextUtils.isEmpty(str) && eVar.g != null) {
            str = eVar.g.m;
        }
        if (!((eVar.am == null || eVar.am.l == null || eVar.am.l.f3684b) ? false : true) && TextUtils.isEmpty(str)) {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(eVar.g == null);
            objArr[1] = Boolean.valueOf(eVar.aq == null);
            FinskyLog.e("Unexpected empty purchaseContextToken: %b %b", objArr);
        }
        a(BillingProfileActivity.a(account, str, this.f2278b.f2281a, this.f2278b.d, asVar), 1);
    }

    public final void x() {
        a(new Intent(FinskyApp.a(), (Class<?>) SettingsActivity.class), 4);
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.at = new VoucherParams(str, true, true);
        } else {
            this.at = new VoucherParams(null, false, true);
        }
        a((an) null, (Boolean) null);
    }

    public final boolean c(Bundle bundle) {
        int i = this.f2277a.as;
        switch (i) {
            case 6:
                this.au.putAll(bundle);
                a((an) null, (Boolean) null);
                return true;
            case 7:
            case 8:
            case 12:
                this.av.putAll(bundle);
                F();
                return true;
            case 9:
            case 10:
            case 11:
            default:
                FinskyLog.e("Cannot answer challenge in state %d", Integer.valueOf(i));
                return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r8.f2277a.am.l.f3684b == false) goto L21;
     */
    @Override // android.support.v4.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r9, int r10, android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.lightpurchase.PurchaseFragment.a(int, int, android.content.Intent):void");
    }

    private boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.aw = str;
        a((an) null, (Boolean) null);
        return true;
    }

    private boolean a(RedeemCodeResult redeemCodeResult) {
        if (redeemCodeResult == null) {
            return false;
        }
        if (redeemCodeResult.f2206b) {
            String a2 = redeemCodeResult.a();
            if (!TextUtils.isEmpty(a2)) {
                this.at = new VoucherParams(a2, true, true);
                a((an) null, (Boolean) null);
                return true;
            }
            this.ay = true;
            u();
            return true;
        }
        this.f = true;
        this.g = redeemCodeResult.c;
        v();
        return true;
    }

    @Override // com.google.android.finsky.billing.i
    public final void a_(Bundle bundle) {
        if (!j()) {
            FinskyLog.a("Not resumed, ignoring onFlowFinished.", new Object[0]);
            return;
        }
        G();
        this.ap = bundle;
        F();
    }

    @Override // com.google.android.finsky.billing.i
    public final void a() {
        if (!j()) {
            FinskyLog.a("Not resumed, ignoring onFlowCanceled.", new Object[0]);
        } else {
            G();
            A();
        }
    }

    @Override // com.google.android.finsky.billing.i
    public final void b(String str) {
        if (!j()) {
            FinskyLog.a("Not resumed, ignoring onFlowError.", new Object[0]);
            return;
        }
        a(new CheckoutPurchaseError(str), true);
        G();
        A();
    }

    private void G() {
        if (this.ao != null) {
            h().a().a(this.ao).b();
            this.ao = null;
        }
    }

    @Override // com.google.android.finsky.billing.aq
    public final void a(boolean z, boolean z2) {
        String str = this.f2278b.f2281a.f3740a;
        FinskyLog.a("Will queue %s to be downloaded on wifi only = %b", str, Boolean.valueOf(z));
        if (z) {
            FinskyApp.a().k.e(str);
        } else {
            FinskyApp.a().k.a(str);
        }
        if (z2 && !bg.w.a().booleanValue()) {
            com.google.android.finsky.billing.ab.u().a(this.B, "PurchaseFragment.downloadNetworkDialog");
            bg.w.a((com.google.android.finsky.cpkg.o<Boolean>) true);
        }
        E();
    }

    @Override // com.google.android.finsky.billing.aq
    public final void T_() {
        a(new Intent("android.settings.WIFI_SETTINGS"));
    }

    @Override // com.google.android.finsky.billing.aq
    public final void U_() {
        FinskyLog.a("Download size warning dismissed for app = %s", this.f2278b.f2281a.f3740a);
    }

    @Override // com.google.android.finsky.billing.aq
    public final void V_() {
        E();
    }

    @Override // com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        if (i == 101) {
            a(cr.a(f(), bundle.getString("dialog_details_url")));
            v();
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
        if (i == 101) {
            v();
        }
    }

    public class PurchaseError implements Parcelable {
        public static final Parcelable.Creator<PurchaseError> CREATOR = new af();

        /* renamed from: a, reason: collision with root package name */
        public final int f2279a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2280b;

        public PurchaseError(int i, int i2) {
            this.f2279a = i;
            this.f2280b = i2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2279a);
            parcel.writeInt(this.f2280b);
        }

        public String toString() {
            return "PurchaseError{type=" + this.f2279a + " subtype=" + this.f2280b + "}";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0267  */
    @Override // com.google.android.finsky.epkg.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.finsky.epkg.u r21) {
        /*
            Method dump skipped, instructions count: 2162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.lightpurchase.PurchaseFragment.a(com.google.android.finsky.epkg.u):void");
    }

    public final void a(an anVar, Boolean bool) {
        HashMap hashMap = new HashMap();
        ma a2 = com.google.android.finsky.cpkg.p.a(this.i.name);
        com.google.android.finsky.billing.carrierbilling.a.a(false, hashMap);
        hashMap.put("bppcc", Base64.encodeToString(com.google.android.wallet.common.pub.e.a(f(), com.google.android.finsky.billing.u.b()), 8));
        this.f2277a.a(this.aw, this.at, this.au, a2, anVar, bool, hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y() {
        /*
            r15 = this;
            r2 = 0
            r3 = 1
            r7 = 0
            boolean r0 = r15.f
            if (r0 == 0) goto Lc8
            com.google.android.finsky.billing.lightpurchase.e r0 = r15.f2277a
            com.google.android.finsky.protos.k r0 = r0.al
            com.google.android.finsky.protos.l r1 = r0.f4021a
            if (r1 == 0) goto Lc8
            com.google.android.finsky.protos.l r0 = r0.f4021a
            com.google.android.finsky.protos.g r1 = r0.c
            if (r1 == 0) goto L76
            com.google.android.finsky.api.model.Document r1 = new com.google.android.finsky.api.model.Document
            com.google.android.finsky.protos.g r0 = r0.c
            com.google.android.finsky.protos.gx r0 = r0.f3855a
            r1.<init>(r0)
            com.google.android.finsky.protos.ag r0 = r1.E()
            java.lang.String r4 = r0.w
            com.google.android.finsky.protos.ag r0 = r1.E()
            int r0 = r0.e
            com.google.android.finsky.FinskyApp r5 = com.google.android.finsky.FinskyApp.a()
            com.google.android.finsky.bpkg.x r5 = r5.v
            com.google.android.finsky.bpkg.y r5 = r5.a(r4)
            if (r5 == 0) goto L61
            int r5 = r5.c
            if (r5 < r0) goto L61
            r0 = r3
        L3b:
            if (r0 == 0) goto L63
            android.support.v4.app.t r0 = r15.f()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r4)
            if (r0 != 0) goto L53
            android.support.v4.app.t r0 = r15.f()
            android.content.Intent r0 = com.google.android.finsky.utils.cr.b(r0, r1)
        L53:
            r15.a(r0)
        L56:
            r3 = r7
        L57:
            if (r3 == 0) goto Lc8
            java.lang.String r0 = "Dialog shown, waiting for user input."
            java.lang.Object[] r1 = new java.lang.Object[r7]
            com.google.android.finsky.utils.FinskyLog.a(r0, r1)
        L60:
            return
        L61:
            r0 = r7
            goto L3b
        L63:
            android.accounts.Account r0 = r15.i
            com.google.android.finsky.protos.gx r4 = r1.f1963a
            byte[] r5 = r4.R
            r4 = r2
            r6 = r2
            r8 = r2
            r9 = r7
            android.content.Intent r0 = com.google.android.finsky.billing.lightpurchase.LightPurchaseFlowActivity.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = 6
            r15.a(r0, r1)
            goto L57
        L76:
            com.google.android.finsky.protos.i r1 = r0.f4066a
            if (r1 == 0) goto L9c
            com.google.android.finsky.api.model.Document r10 = new com.google.android.finsky.api.model.Document
            com.google.android.finsky.protos.i r0 = r0.f4066a
            com.google.android.finsky.protos.gx r0 = r0.f3938a
            r10.<init>(r0)
            android.support.v4.app.t r8 = r15.f()
            android.accounts.Account r9 = r15.i
            android.support.v4.app.ad r11 = r15.B
            r13 = 101(0x65, float:1.42E-43)
            com.google.android.finsky.billing.lightpurchase.PurchaseParams r14 = r15.f2278b
            r12 = r15
            boolean r0 = com.google.android.finsky.navigationmanager.a.a(r8, r9, r10, r11, r12, r13, r14)
            if (r0 != 0) goto L9a
        L96:
            r15.h = r3
            r3 = r0
            goto L57
        L9a:
            r3 = r7
            goto L96
        L9c:
            com.google.android.finsky.protos.j r1 = r0.f4067b
            if (r1 == 0) goto La8
            java.lang.String r0 = "Invalid PostSuccessAction. Should not go to home from purchase flow."
            java.lang.Object[] r1 = new java.lang.Object[r7]
            com.google.android.finsky.utils.FinskyLog.e(r0, r1)
            goto L56
        La8:
            com.google.android.finsky.protos.m r1 = r0.d
            if (r1 == 0) goto Lb4
            java.lang.String r0 = "Invalid PostSuccessAction. Cannot enter purchase flow from purchase flow."
            java.lang.Object[] r1 = new java.lang.Object[r7]
            com.google.android.finsky.utils.FinskyLog.e(r0, r1)
            goto L56
        Lb4:
            com.google.android.finsky.protos.h r0 = r0.e
            if (r0 == 0) goto Lc0
            java.lang.String r0 = "Invalid PostSuccessAction. Cannot open container from purchase flow."
            java.lang.Object[] r1 = new java.lang.Object[r7]
            com.google.android.finsky.utils.FinskyLog.e(r0, r1)
            goto L56
        Lc0:
            java.lang.String r0 = "Unsupported PostSuccessAction."
            java.lang.Object[] r1 = new java.lang.Object[r7]
            com.google.android.finsky.utils.FinskyLog.c(r0, r1)
            goto L56
        Lc8:
            r15.v()
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.lightpurchase.PurchaseFragment.y():void");
    }
}
