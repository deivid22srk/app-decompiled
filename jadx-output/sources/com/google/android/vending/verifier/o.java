package com.google.android.vending.verifier;

import android.view.View;
import android.widget.ImageView;
import com.android.vending.R;

/* loaded from: classes.dex */
final class o implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f7171a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ImageView f7172b;
    final /* synthetic */ PackageWarningDialogView c;

    o(PackageWarningDialogView packageWarningDialogView, View view, ImageView imageView) {
        this.c = packageWarningDialogView;
        this.f7171a = view;
        this.f7172b = imageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f7171a.getVisibility() != 0) {
            this.f7171a.setVisibility(0);
            this.f7172b.setImageResource(R.drawable.ic_menu_expander_maximized_light);
        } else {
            this.f7171a.setVisibility(8);
            this.f7172b.setImageResource(R.drawable.ic_menu_expander_minimized_light);
        }
    }
}
