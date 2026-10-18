package com.google.android.finsky.download.inlineappinstaller.a;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.a.i;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public final class d extends com.google.android.finsky.billing.lightpurchase.b.f<com.google.android.finsky.download.inlineappinstaller.a> {

    /* renamed from: a, reason: collision with root package name */
    private final ai f2709a = i.a(5107);

    /* renamed from: b, reason: collision with root package name */
    private View f2710b;

    @Override // android.support.v4.app.Fragment
    public final void o() {
        super.o();
        ik.a(e(), f_(R.string.app_install_success), this.f2710b);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final String a(Resources resources) {
        return resources.getString(R.string.read);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f2709a;
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Document document = (Document) this.r.getParcelable("InlineConsumptionAppInstallerReadyToReadStep.appDoc");
        this.f2710b = layoutInflater.inflate(R.layout.inline_app_installer_generic_layout, viewGroup, false);
        com.google.android.finsky.navigationmanager.a.a(document, this.f2710b);
        return this.f2710b;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final void u() {
        ((com.google.android.finsky.download.inlineappinstaller.a) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).a(5108, (cy) this);
        ((com.google.android.finsky.download.inlineappinstaller.a) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).b(true);
    }
}
