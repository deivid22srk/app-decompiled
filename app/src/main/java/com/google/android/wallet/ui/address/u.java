package com.google.android.wallet.ui.address;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/* loaded from: classes.dex */
public final class u<T> extends ArrayAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    private TextView f7400a;

    /* renamed from: b, reason: collision with root package name */
    private View f7401b;

    public u(Context context, int i, int i2, List<T> list, T t) {
        super(context, i, i2, list);
        insert(t, 0);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (!isEnabled(i)) {
            if (this.f7400a == null) {
                this.f7400a = (TextView) super.getView(0, null, viewGroup);
                this.f7400a.setHint(this.f7400a.getText());
                this.f7400a.setText((CharSequence) null);
            }
            return this.f7400a;
        }
        if (view == this.f7400a) {
            view = null;
        }
        return super.getView(i, view, viewGroup);
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!isEnabled(i)) {
            if (this.f7401b == null) {
                this.f7401b = new View(getContext());
                this.f7401b.setVisibility(8);
                this.f7401b.setLayoutParams(new AbsListView.LayoutParams(0, 0));
            }
            return this.f7401b;
        }
        if (view == this.f7401b) {
            view = null;
        }
        return super.getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return i != 0;
    }
}
