package com.google.android.wallet.ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class j extends ArrayAdapter<k> {

    /* renamed from: a, reason: collision with root package name */
    private final LayoutInflater f7522a;

    public j(Context context, ArrayList<k> arrayList) {
        super(context, 0, arrayList);
        this.f7522a = LayoutInflater.from(context);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup);
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup);
    }

    private View a(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f7522a.inflate(com.google.android.wallet.e.h.view_drop_down_button, viewGroup, false);
        }
        k item = getItem(i);
        TextView textView = (TextView) view.findViewById(com.google.android.wallet.e.g.dropdown_button_text);
        textView.setText(item.f7524b);
        Context context = getContext();
        if (item.d == null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{item.f7523a});
            item.d = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(item.d, (Drawable) null, (Drawable) null, (Drawable) null);
        return view;
    }
}
