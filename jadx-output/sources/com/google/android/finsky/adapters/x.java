package com.google.android.finsky.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.protos.ev;
import com.google.android.finsky.protos.ew;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public final class x extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1943a;

    /* renamed from: b, reason: collision with root package name */
    private final LayoutInflater f1944b;
    private final com.google.android.finsky.c.b[] c;
    private final ew d;

    public x(Context context, com.google.android.finsky.c.b[] bVarArr, ew ewVar) {
        this.f1943a = context;
        this.f1944b = LayoutInflater.from(context);
        this.c = bVarArr;
        this.d = ewVar;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.d.d.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.d.d[i];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ev evVar = this.d.d[i];
        if (view == null) {
            view = this.f1944b.inflate(R.layout.content_filters_choice_item, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.content_filter_choice_label);
        textView.setText(evVar.d);
        FifeImageView fifeImageView = (FifeImageView) view.findViewById(R.id.content_filter_choice_icon);
        ds dsVar = evVar.c;
        if (dsVar != null) {
            com.google.android.finsky.utils.a.a.a(fifeImageView, dsVar);
            fifeImageView.a(dsVar.f, dsVar.l, FinskyApp.a().d);
            fifeImageView.setVisibility(0);
        } else {
            fifeImageView.setVisibility(8);
        }
        int a2 = com.google.android.finsky.c.a.a(this.d, this.c);
        if (com.google.android.finsky.c.a.a(evVar, a2 >= 0 ? this.c[a2] : null)) {
            view.setBackgroundColor(this.f1943a.getResources().getColor(R.color.account_selector_background));
            textView.setContentDescription(this.f1943a.getString(R.string.accessibility_event_tab_selected, evVar.d));
        } else {
            view.setBackgroundColor(0);
            textView.setContentDescription(evVar.d);
        }
        return view;
    }
}
