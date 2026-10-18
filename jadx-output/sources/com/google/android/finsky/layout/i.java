package com.google.android.finsky.layout;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
final class i implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f3281a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ImageView f3282b;
    final /* synthetic */ ViewGroup c;
    final /* synthetic */ TextView d;
    final /* synthetic */ h e;

    i(h hVar, View view, ImageView imageView, ViewGroup viewGroup, TextView textView) {
        this.e = hVar;
        this.f3281a = view;
        this.f3282b = imageView;
        this.c = viewGroup;
        this.d = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Context context2;
        boolean booleanValue = ((Boolean) this.f3281a.getTag()).booleanValue();
        if (!booleanValue) {
            this.f3282b.setImageResource(R.drawable.ic_menu_expander_maximized_light);
            ImageView imageView = this.f3282b;
            context2 = this.e.e;
            imageView.setContentDescription(context2.getString(R.string.content_description_toggle_collapse));
            this.c.setVisibility(0);
            this.d.setVisibility(8);
        } else {
            this.f3282b.setImageResource(R.drawable.ic_menu_expander_minimized_light);
            ImageView imageView2 = this.f3282b;
            context = this.e.e;
            imageView2.setContentDescription(context.getString(R.string.content_description_toggle_expand));
            this.c.setVisibility(8);
            this.d.setVisibility(0);
        }
        this.f3281a.setTag(Boolean.valueOf(!booleanValue));
    }
}
