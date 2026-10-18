package com.google.android.finsky.detailspage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import java.util.List;

/* loaded from: classes.dex */
public class f extends bd<g> implements h {
    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        return this.f2559b != 0 && ((g) this.f2559b).f2655a;
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.artist_radio_module;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        List<ResolveInfo> queryIntentActivities;
        if (this.f2559b == 0) {
            this.f2559b = new g();
            ((g) this.f2559b).f2656b = com.google.android.finsky.c.d.dU.b().replace("%artistId%", document.f1963a.c);
            boolean a2 = FinskyApp.a().e().a(12603719L);
            boolean z2 = document.f1963a.e == 3;
            String str = ((g) this.f2559b).f2656b;
            PackageManager packageManager = this.c.getPackageManager();
            boolean z3 = (!com.google.android.finsky.utils.cr.a(packageManager, 2) || (queryIntentActivities = packageManager.queryIntentActivities(a(str), 65536)) == null || queryIntentActivities.isEmpty()) ? false : true;
            ((g) this.f2559b).f2655a = z3 && a2 && z2;
        }
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        ArtistRadioModuleLayout artistRadioModuleLayout = (ArtistRadioModuleLayout) view;
        if (!(this.f2559b != 0)) {
            artistRadioModuleLayout.setVisibility(8);
        } else {
            artistRadioModuleLayout.setVisibility(0);
            artistRadioModuleLayout.f2478a = this;
        }
    }

    @Override // com.google.android.finsky.detailspage.h
    public final void a() {
        this.c.startActivity(a(((g) this.f2559b).f2656b));
    }

    private static Intent a(String str) {
        Intent a2 = com.google.android.finsky.utils.cr.a(2, str, FinskyApp.a().i().name);
        a2.addFlags(268435456);
        return a2;
    }
}
