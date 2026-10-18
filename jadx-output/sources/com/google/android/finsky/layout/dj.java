package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class dj implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f3224a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ReviewItemLayout f3225b;

    dj(ReviewItemLayout reviewItemLayout, boolean z) {
        this.f3225b = reviewItemLayout;
        this.f3224a = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ImageView imageView;
        com.google.android.finsky.layout.play.cy cyVar;
        ImageView imageView2;
        Context context = this.f3225b.getContext();
        imageView = this.f3225b.p;
        com.google.android.play.layout.d dVar = new com.google.android.play.layout.d(context, imageView);
        Resources resources = this.f3225b.getContext().getResources();
        com.google.android.finsky.a.i h = FinskyApp.a().h();
        cyVar = this.f3225b.u;
        h.a(238, (byte[]) null, cyVar);
        dVar.a(1, resources.getString(this.f3224a ? R.string.review_feedback_dialog_choice_spam_undo : R.string.review_feedback_dialog_choice_spam), true, this.f3225b);
        imageView2 = this.f3225b.p;
        imageView2.setImageResource(R.drawable.play_overflow_menu_open);
        dVar.e = new dk(this);
        dVar.a();
    }
}
