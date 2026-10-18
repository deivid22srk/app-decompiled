package com.google.android.finsky.adapters;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.finsky.protos.eu;

/* loaded from: classes.dex */
public final class w extends ArrayAdapter<eu> {
    public w(Context context, eu[] euVarArr) {
        super(context, R.layout.simple_spinner_dropdown_item, euVarArr);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(getContext()).inflate(com.deivid22srk.store.R.layout.search_spinner_selected_item, viewGroup, false);
        ((TextView) inflate).setText(getItem(i).c);
        return inflate;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.simple_spinner_dropdown_item, viewGroup, false);
        }
        ((TextView) view.findViewById(R.id.text1)).setText(getItem(i).c);
        return view;
    }
}
