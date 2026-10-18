package com.google.android.wallet.ui.common;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* loaded from: classes.dex */
final class at extends ArrayAdapter<Integer> {

    /* renamed from: a, reason: collision with root package name */
    private final int f7490a;

    /* renamed from: b, reason: collision with root package name */
    private int f7491b;
    private final int c;
    private final LayoutInflater d;

    public at(ContextThemeWrapper contextThemeWrapper, int i, int i2, Integer[] numArr) {
        super(contextThemeWrapper, i, i2, numArr);
        this.f7490a = i;
        this.c = i2;
        this.d = LayoutInflater.from(contextThemeWrapper);
    }

    @Override // android.widget.ArrayAdapter
    public final void setDropDownViewResource(int i) {
        super.setDropDownViewResource(i);
        this.f7491b = i;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, this.f7491b);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, this.f7490a);
    }

    private View a(int i, View view, ViewGroup viewGroup, int i2) {
        if (view == null) {
            view = this.d.inflate(i2, viewGroup, false);
        }
        Integer item = getItem(i);
        TextView textView = (TextView) view.findViewById(this.c);
        if (item.intValue() != 0) {
            textView.setText(com.google.android.wallet.common.apkg.f.b(item.intValue()));
        } else {
            textView.setText((CharSequence) null);
        }
        return view;
    }
}
