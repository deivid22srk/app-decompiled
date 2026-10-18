package com.google.android.finsky.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* loaded from: classes.dex */
final class bb extends ArrayAdapter<String> {
    public bb(Context context, String[] strArr) {
        super(context, android.R.layout.simple_spinner_dropdown_item, strArr);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(getContext()).inflate(com.deivid22srk.store.R.layout.search_spinner_selected_item, viewGroup, false);
        ((TextView) inflate).setText(getItem(i));
        return inflate;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_spinner_dropdown_item, viewGroup, false);
        }
        ((TextView) view.findViewById(android.R.id.text1)).setText(getItem(i));
        return view;
    }
}
