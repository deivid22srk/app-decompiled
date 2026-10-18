package com.google.android.finsky.download.inlineappinstaller.a;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.a.i;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.AppSecurityPermissions;
import com.google.android.finsky.layout.h;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.er;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public final class c extends com.google.android.finsky.billing.lightpurchase.b.f<com.google.android.finsky.download.inlineappinstaller.a> {

    /* renamed from: a, reason: collision with root package name */
    private final ai f2707a = i.a(5111);

    /* renamed from: b, reason: collision with root package name */
    private Document f2708b;
    private AppSecurityPermissions c;
    private View d;

    @Override // android.support.v4.app.Fragment
    public final void o() {
        super.o();
        ik.a(e(), f_(R.string.permissions_title), this.d);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final String a(Resources resources) {
        return resources.getString(R.string.accept);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f2707a;
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2708b = (Document) this.r.getParcelable("appDoc");
        this.d = layoutInflater.inflate(R.layout.inline_app_installer_permissions, viewGroup, false);
        this.c = (AppSecurityPermissions) this.d.findViewById(R.id.app_permissions);
        View view = this.d;
        String str = this.f2708b.f1963a.c;
        String[] strArr = this.f2708b.E().p;
        ((TextView) view.findViewById(R.id.title)).setText(this.f2708b.f1963a.i);
        TextView textView = (TextView) view.findViewById(R.id.subheader);
        textView.setVisibility(0);
        com.google.android.finsky.navigationmanager.a.a(this.f2708b, view);
        boolean b2 = er.b(FinskyApp.a().r, str);
        h hVar = new h(f(), str, strArr, b2);
        textView.setText((hVar.f3279a && b2) ? R.string.also_needs_access_to : R.string.needs_access_to);
        this.c.a(hVar, this.f2708b.f1963a.i, bundle);
        this.c.requestFocus();
        return this.d;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final void u() {
        ((com.google.android.finsky.download.inlineappinstaller.a) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).a(5112, (cy) this);
        ((com.google.android.finsky.download.inlineappinstaller.a) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).f2701a.u();
    }
}
