package com.google.android.finsky.e;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.bv;
import com.google.android.finsky.protos.gx;
import com.google.android.finsky.utils.aw;

/* loaded from: classes.dex */
public abstract class g implements com.android.volley.s {
    public Context f;
    public com.google.android.finsky.api.b g;
    public com.google.android.finsky.navigationmanager.b h;
    protected LayoutInflater i;
    protected View j;
    protected int k;
    public Document l;
    public bv m;

    public final void a(Context context, com.google.android.finsky.api.b bVar, com.google.android.finsky.navigationmanager.b bVar2) {
        this.f = context;
        this.g = bVar;
        this.h = bVar2;
        this.i = LayoutInflater.from(this.f);
        this.k = R.id.header;
    }

    public final void b(View view, Document document) {
        this.j = view;
        this.l = document;
        gx gxVar = document.f1963a;
        this.j = view;
        TextView textView = (TextView) this.j.findViewById(this.k);
        if (textView == null) {
            return;
        }
        textView.setText((CharSequence) null);
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        if (this.m != null) {
            this.m.a(aw.a(this.f, volleyError));
        }
    }
}
