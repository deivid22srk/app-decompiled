package com.google.android.gms.ads.internal.overlay;

import android.R;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.gw;

@gw
/* loaded from: classes.dex */
public final class n extends FrameLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final ImageButton f5329a;

    /* renamed from: b, reason: collision with root package name */
    private final p f5330b;

    public n(Context context, int i, p pVar) {
        super(context);
        this.f5330b = pVar;
        setOnClickListener(this);
        this.f5329a = new ImageButton(context);
        this.f5329a.setImageResource(R.drawable.btn_dialog);
        this.f5329a.setBackgroundColor(0);
        this.f5329a.setOnClickListener(this);
        this.f5329a.setPadding(0, 0, 0, 0);
        this.f5329a.setContentDescription("Interstitial close button");
        com.google.android.gms.ads.internal.client.j.a();
        int a2 = com.google.android.gms.ads.internal.util.client.a.a(context, i);
        addView(this.f5329a, new FrameLayout.LayoutParams(a2, a2, 17));
    }

    public final void a(boolean z, boolean z2) {
        if (!z2) {
            this.f5329a.setVisibility(0);
        } else if (z) {
            this.f5329a.setVisibility(4);
        } else {
            this.f5329a.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f5330b != null) {
            this.f5330b.c();
        }
    }
}
