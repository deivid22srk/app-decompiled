package com.google.android.finsky.layout.play;

import android.content.Context;
import android.view.View;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.MultiInstallActivity;
import com.google.android.finsky.api.model.Document;
import java.util.List;

/* loaded from: classes.dex */
final class ao implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f3406a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlayBundleContainerViewRow f3407b;

    ao(PlayBundleContainerViewRow playBundleContainerViewRow, List list) {
        this.f3407b = playBundleContainerViewRow;
        this.f3406a = list;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = this.f3407b.getContext();
        FinskyApp.a().h().a(221, (byte[]) null, (cy) this.f3407b.getLoggingData());
        context.startActivity(MultiInstallActivity.a(context, (List<Document>) this.f3406a, FinskyApp.a().j()));
    }
}
