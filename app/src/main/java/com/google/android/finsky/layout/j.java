package com.google.android.finsky.layout;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextView f3283a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ImageView f3284b;
    final /* synthetic */ h c;

    j(h hVar, TextView textView, ImageView imageView) {
        this.c = hVar;
        this.f3283a = textView;
        this.f3284b = imageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Context context2;
        if (this.f3283a.getVisibility() == 8) {
            this.f3284b.setImageResource(R.drawable.ic_menu_expander_maximized_light);
            ImageView imageView = this.f3284b;
            context2 = this.c.e;
            imageView.setContentDescription(context2.getString(R.string.content_description_toggle_collapse));
            this.f3283a.setVisibility(0);
            return;
        }
        this.f3284b.setImageResource(R.drawable.ic_menu_expander_minimized_light);
        ImageView imageView2 = this.f3284b;
        context = this.c.e;
        imageView2.setContentDescription(context.getString(R.string.content_description_toggle_expand));
        this.f3283a.setVisibility(8);
    }
}
