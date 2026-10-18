package com.google.android.finsky.adapters;

import android.content.Context;
import android.support.v7.widget.dt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.layout.ErrorFooter;
import com.google.android.finsky.layout.IdentifiableLinearLayout;

/* loaded from: classes.dex */
public abstract class al extends dt implements com.google.android.finsky.api.model.x {
    protected final LayoutInflater s;
    public final Context t;
    public final com.google.android.finsky.navigationmanager.b u;
    protected int v;
    protected View.OnClickListener w = new am(this);

    public abstract boolean O_();

    public abstract void d();

    public abstract String e();

    public al(Context context, com.google.android.finsky.navigationmanager.b bVar, boolean z, boolean z2) {
        this.t = context;
        this.u = bVar;
        this.s = LayoutInflater.from(context);
        if (z) {
            this.v = 2;
        } else if (z2) {
            this.v = 1;
        } else {
            this.v = 0;
        }
    }

    public final View g(ViewGroup viewGroup) {
        return a(R.layout.loading_footer, viewGroup, false);
    }

    protected View f(ViewGroup viewGroup) {
        return a(R.layout.play_list_vspacer, viewGroup, false);
    }

    public static void e(View view) {
        ((IdentifiableLinearLayout) view).setIdentifier("loading_footer");
    }

    public final View h(ViewGroup viewGroup) {
        return a(R.layout.error_footer, viewGroup, false);
    }

    public final View f(View view) {
        ErrorFooter errorFooter = (ErrorFooter) view;
        errorFooter.a(e(), this.w);
        errorFooter.setIdentifier("error_footer");
        return errorFooter;
    }

    @Override // android.support.v7.widget.dt
    public final long b(int i) {
        return i;
    }

    public final View a(int i, ViewGroup viewGroup, boolean z) {
        return this.s.inflate(i, viewGroup, z);
    }

    protected void h(int i) {
        this.v = i;
        this.f774a.a();
    }

    protected int t() {
        return 0;
    }

    public final void u() {
        h(2);
    }

    public final int v() {
        return this.v;
    }

    public void m_() {
        if (O_()) {
            h(1);
        } else {
            h(t());
        }
    }
}
