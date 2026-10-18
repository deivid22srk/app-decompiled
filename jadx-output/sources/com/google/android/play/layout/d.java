package com.google.android.play.layout;

import android.content.Context;
import android.support.v7.widget.cu;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f6984a;

    /* renamed from: b, reason: collision with root package name */
    protected final View f6985b;
    protected cu c;
    protected final List<g> d = new ArrayList();
    public PopupWindow.OnDismissListener e;

    public d(Context context, View view) {
        this.f6984a = context;
        this.f6985b = view;
    }

    public final void a(int i, CharSequence charSequence, boolean z, f fVar) {
        this.d.add(new g(i, charSequence, z, fVar));
    }

    public final void a() {
        View view;
        this.c = new cu(this.f6984a);
        h hVar = new h(this.f6984a, this.d);
        this.c.a(hVar);
        this.c.a(this);
        this.c.m = new e(this, hVar);
        this.c.l = this.f6985b;
        int i = this.f6984a.getResources().getDisplayMetrics().widthPixels;
        cu cuVar = this.c;
        FrameLayout frameLayout = new FrameLayout(this.f6984a);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = hVar.getCount();
        int i2 = 0;
        int i3 = 0;
        View view2 = null;
        int i4 = 0;
        while (i2 < count) {
            int itemViewType = hVar.getItemViewType(i2);
            if (itemViewType != i3) {
                view = null;
            } else {
                itemViewType = i3;
                view = view2;
            }
            view2 = hVar.getView(i2, view, frameLayout);
            view2.measure(makeMeasureSpec, makeMeasureSpec2);
            i4 = Math.max(i4, view2.getMeasuredWidth());
            i2++;
            i3 = itemViewType;
        }
        cuVar.a(Math.min(i, i4));
        this.c.c();
        this.c.b();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.c = null;
        if (this.e != null) {
            this.e.onDismiss();
        }
    }

    public final void b() {
        if (this.c != null) {
            this.c.d();
        }
    }
}
