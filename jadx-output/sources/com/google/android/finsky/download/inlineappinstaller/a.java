package com.google.android.finsky.download.inlineappinstaller;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.billing.lightpurchase.b.f;
import com.google.android.finsky.download.inlineappinstaller.a.e;
import com.google.android.finsky.e.u;
import com.google.android.finsky.e.v;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.gx;
import com.google.android.finsky.protos.p;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;

/* loaded from: classes.dex */
public final class a extends com.google.android.finsky.billing.lightpurchase.b.a implements v {

    /* renamed from: a, reason: collision with root package name */
    public c f2701a;

    /* renamed from: b, reason: collision with root package name */
    public gx f2702b;
    public boolean c;
    private int d = -1;
    private int e;
    private p f;

    public static a a(Account account, gx gxVar, p pVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("MultiStepFragment.account", account);
        bundle.putParcelable("mediaDoc", ParcelableProto.a(gxVar));
        if (pVar != null) {
            bundle.putParcelable("successInfo", ParcelableProto.a(pVar));
        }
        a aVar = new a();
        aVar.f(bundle);
        return aVar;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.a, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null) {
            this.f2701a = (c) this.B.a("InlineConsumptionAppInstallerFragment.sidecar");
            this.d = bundle.getInt("InlineConsumptionAppInstallerFragment.handledStateInstance");
            this.e = bundle.getInt("InlineConsumptionAppInstallerFragment.previousState");
        }
        Bundle bundle2 = this.r;
        this.f2702b = (gx) ParcelableProto.a(bundle2, "mediaDoc");
        this.f = (p) ParcelableProto.a(bundle2, "successInfo");
    }

    @Override // android.support.v4.app.Fragment
    public final void a(Context context) {
        super.a(context);
        if (!(context instanceof cy)) {
            throw new IllegalStateException("Activity must implement PlayStoreUiElementNode");
        }
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.a, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putInt("InlineConsumptionAppInstallerFragment.handledStateInstance", this.d);
        bundle.putInt("InlineConsumptionAppInstallerFragment.previousState", this.e);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.a, android.support.v4.app.Fragment
    public final void g_() {
        super.g_();
        if (this.f2701a == null) {
            String str = this.i.name;
            gx gxVar = this.f2702b;
            Bundle bundle = new Bundle();
            bundle.putString("authAccount", str);
            bundle.putParcelable("InlineConsumptionAppInstallerSidecar.mediaDoc", ParcelableProto.a(gxVar));
            c cVar = new c();
            cVar.f(bundle);
            this.f2701a = cVar;
            this.B.a().a(this.f2701a, "InlineConsumptionAppInstallerFragment.sidecar").b();
        }
        this.f2701a.a(this);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.a, android.support.v4.app.Fragment
    public final void h_() {
        if (this.f2701a != null) {
            this.f2701a.a((v) null);
        }
        super.h_();
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.light_purchase, viewGroup, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.b.a
    public final int w() {
        return this.f2702b.g;
    }

    public final void b(boolean z) {
        ((b) f()).b(z);
    }

    @Override // com.google.android.finsky.e.v
    public final void a(u uVar) {
        int i = uVar.au;
        Object[] objArr = {Integer.valueOf(uVar.as), Integer.valueOf(i)};
        if (i == this.d) {
            FinskyLog.b("Already handled state %d", Integer.valueOf(this.d));
            return;
        }
        this.d = i;
        switch (this.f2701a.as) {
            case 0:
                z();
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                String str = this.f2701a.f2715b;
                Document document = this.f2701a.f2714a;
                com.google.android.finsky.download.inlineappinstaller.a.b bVar = new com.google.android.finsky.download.inlineappinstaller.a.b();
                Bundle bundle = new Bundle();
                bundle.putString("errorMsg", str);
                if (document != null) {
                    bundle.putParcelable("appDoc", document);
                }
                bVar.f(bundle);
                a((f<?>) bVar);
                break;
            case 5:
                gx gxVar = this.f2702b;
                p pVar = this.f;
                e eVar = new e();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("mediaDoc", ParcelableProto.a(gxVar));
                if (pVar != null) {
                    bundle2.putParcelable("installStep", ParcelableProto.a(pVar));
                }
                eVar.f(bundle2);
                a((f<?>) eVar);
                break;
            case 6:
                Document document2 = this.f2701a.f2714a;
                com.google.android.finsky.download.inlineappinstaller.a.c cVar = new com.google.android.finsky.download.inlineappinstaller.a.c();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("appDoc", document2);
                cVar.f(bundle3);
                a((f<?>) cVar);
                break;
            case 7:
                a((f<?>) com.google.android.finsky.download.inlineappinstaller.a.a.a(this.f2701a.f2714a));
                break;
            case 8:
                Document document3 = this.f2701a.f2714a;
                com.google.android.finsky.download.inlineappinstaller.a.d dVar = new com.google.android.finsky.download.inlineappinstaller.a.d();
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("InlineConsumptionAppInstallerReadyToReadStep.appDoc", document3);
                dVar.f(bundle4);
                a((f<?>) dVar);
                break;
        }
        this.e = uVar.as;
    }
}
