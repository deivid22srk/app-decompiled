package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class cp implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f2589a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ RateReviewModuleV2Layout f2590b;

    cp(RateReviewModuleV2Layout rateReviewModuleV2Layout, boolean z) {
        this.f2590b = rateReviewModuleV2Layout;
        this.f2589a = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ImageView imageView;
        com.google.android.finsky.layout.play.cy cyVar;
        ImageView imageView2;
        Context context = this.f2590b.getContext();
        imageView = this.f2590b.l;
        com.google.android.play.layout.d dVar = new com.google.android.play.layout.d(context, imageView);
        Resources resources = this.f2590b.getContext().getResources();
        com.google.android.finsky.apkg.i h = FinskyApp.a().h();
        cyVar = this.f2590b.c;
        h.a(238, (byte[]) null, cyVar);
        if (!this.f2589a) {
            dVar.a(1, resources.getString(R.string.edit_review), true, this.f2590b);
        }
        dVar.a(2, resources.getString(R.string.delete_review), true, this.f2590b);
        imageView2 = this.f2590b.l;
        imageView2.setImageResource(R.drawable.play_overflow_menu_open);
        dVar.e = new cq(this);
        dVar.a();
    }
}
