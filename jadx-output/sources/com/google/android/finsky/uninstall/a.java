package com.google.android.finsky.uninstall;

import android.content.Context;
import android.support.v7.widget.eq;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public final class a extends eq implements View.OnClickListener {
    b l;
    Context m;
    final FifeImageView n;
    final TextView o;
    final TextView p;
    final TextView q;
    final CheckBox r;

    public a(View view, Context context) {
        super(view);
        this.m = context;
        this.n = (FifeImageView) view.findViewById(R.id.uninstall_row_icon);
        this.o = (TextView) view.findViewById(R.id.uninstall_row_title);
        this.p = (TextView) view.findViewById(R.id.uninstall_row_size);
        this.q = (TextView) view.findViewById(R.id.uninstall_row_uninstalling);
        this.r = (CheckBox) view.findViewById(R.id.uninstall_row_checkbox);
        view.setOnClickListener(this);
        this.r.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.l != null) {
            this.l.e_(d());
        }
    }
}
