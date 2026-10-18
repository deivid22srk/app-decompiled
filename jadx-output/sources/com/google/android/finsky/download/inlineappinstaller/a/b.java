package com.google.android.finsky.download.inlineappinstaller.a;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.a.i;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public final class b extends com.google.android.finsky.billing.lightpurchase.b.f<com.google.android.finsky.download.inlineappinstaller.a> {

    /* renamed from: a, reason: collision with root package name */
    private final ai f2705a = i.a(5109);

    /* renamed from: b, reason: collision with root package name */
    private String f2706b;
    private View c;

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c = layoutInflater.inflate(R.layout.inline_app_installer_generic_layout, viewGroup, false);
        Bundle bundle2 = this.r;
        this.f2706b = bundle2.getString("errorMsg");
        ((TextView) this.c.findViewById(R.id.title)).setText(this.f2706b);
        com.google.android.finsky.navigationmanager.a.a((Document) bundle2.getParcelable("appDoc"), this.c);
        return this.c;
    }

    @Override // android.support.v4.app.Fragment
    public final void o() {
        super.o();
        if (TextUtils.isEmpty(this.f2706b)) {
            ik.a(e(), this.f2706b, this.c);
        }
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final String a(Resources resources) {
        return resources.getString(R.string.close);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f2705a;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final void u() {
        ((com.google.android.finsky.download.inlineappinstaller.a) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).a(5110, (cy) this);
        ((com.google.android.finsky.download.inlineappinstaller.a) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).b(false);
    }
}
