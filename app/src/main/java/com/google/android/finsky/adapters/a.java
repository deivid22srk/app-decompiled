package com.google.android.finsky.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a<T extends BaseAdapter> extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public T[] f1881a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList<b> f1882b;
    private int c = 0;
    private boolean d = true;
    private boolean e = true;

    public a(T[] tArr) {
        this.f1881a = tArr;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return this.d;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        b a2 = a(i);
        return a2.f1909a.isEnabled(a2.f1910b);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.c;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        b a2 = a(i);
        return a2.f1909a.getItem(a2.f1910b);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        b a2 = a(i);
        return a2.f1909a.getItemId(a2.f1910b);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        b a2 = a(i);
        return a2.f1909a.getView(a2.f1910b, view, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        b a2 = a(i);
        return a2.f1909a.getItemViewType(a2.f1910b);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return this.e;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean isEmpty() {
        return this.c == 0;
    }

    private b a(int i) {
        return this.f1882b.get(i);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        b();
    }

    private synchronized void b() {
        int length = this.f1881a.length;
        this.d = true;
        this.e = true;
        this.f1882b = new ArrayList<>(length * 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            T t = this.f1881a[i];
            int count = t.getCount();
            int i3 = i2 + count;
            this.d = this.d && t.areAllItemsEnabled();
            this.e = this.e && t.hasStableIds();
            for (int i4 = 0; i4 < count; i4++) {
                this.f1882b.add(new b(t, i4, (byte) 0));
            }
            i++;
            i2 = i3;
        }
        this.c = i2;
    }

    public final void a() {
        FinskyLog.a("****** AGGREGATED ADAPTER START ******", new Object[0]);
        StringBuilder sb = new StringBuilder("Total items: ");
        sb.append(getCount());
        sb.append(" [ ");
        for (T t : this.f1881a) {
            sb.append(t.getCount());
            sb.append(" ");
        }
        sb.append("]");
        FinskyLog.a(sb.toString(), new Object[0]);
        StringBuilder sb2 = new StringBuilder("Index translation: ");
        for (int i = 0; i < getCount(); i++) {
            sb2.append(i);
            sb2.append(":");
            sb2.append(getItemViewType(i));
            sb2.append(" ");
        }
        FinskyLog.a(sb2.toString(), new Object[0]);
        FinskyLog.a("****** AGGREGATED ADAPTER  END  ******", new Object[0]);
    }
}
