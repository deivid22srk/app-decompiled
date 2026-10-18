package com.google.android.finsky.uninstall;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.eq;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public final class p extends eq implements AdapterView.OnItemSelectedListener {
    final Spinner l;
    q m;
    private final ArrayAdapter<String> n;

    public p(View view, Context context) {
        super(view);
        this.l = (Spinner) view.findViewById(R.id.uninstall_selector_spinner);
        this.l.setOnItemSelectedListener(this);
        Resources resources = context.getResources();
        this.n = new ArrayAdapter<>(context, android.R.layout.simple_spinner_item, new String[]{resources.getString(R.string.uninstall_manager_sort_by_size), resources.getString(R.string.uninstall_manager_sort_by_name)});
        this.n.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.l.setAdapter((SpinnerAdapter) this.n);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.m != null) {
            this.m.f(i);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
