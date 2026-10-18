package com.google.android.wallet.ui.address;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class r extends BaseAdapter implements Filterable {

    /* renamed from: a, reason: collision with root package name */
    final char[] f7397a;

    /* renamed from: b, reason: collision with root package name */
    ArrayList<com.google.android.wallet.common.a.d> f7398b;
    CharSequence c;
    private final int d;
    private final int e;
    private final String f;
    private final char g;
    private final char[] h;
    private final List<com.google.android.wallet.common.a.c> i;
    private final LayoutInflater j;
    private s k;

    private static char[] a(char[] cArr) {
        int i = 0;
        while (i < cArr.length && !com.google.android.wallet.common.a.a.a(cArr[i])) {
            i++;
        }
        if (i < cArr.length) {
            return Arrays.copyOfRange(cArr, i, cArr.length);
        }
        throw new IllegalArgumentException("fields must contain at least one valid field");
    }

    public r(ContextThemeWrapper contextThemeWrapper, int i, int i2, String str, char c, char[] cArr, String str2, List<com.google.android.wallet.common.a.c> list) {
        if (cArr == null || cArr.length == 0) {
            throw new IllegalArgumentException("remainingFields are required");
        }
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("addressSources are required");
        }
        this.d = i;
        this.e = i2;
        this.f = str;
        this.g = c;
        this.f7397a = a(cArr);
        this.h = str2 != null ? str2.toCharArray() : null;
        this.i = new ArrayList(list);
        this.j = LayoutInflater.from(contextThemeWrapper);
        this.f7398b = new ArrayList<>();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f7398b.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.google.android.wallet.common.a.d getItem(int i) {
        return this.f7398b.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.k == null) {
            this.k = new s(this);
        }
        return this.k;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup);
    }

    private View a(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.j.inflate(this.d, viewGroup, false);
        }
        ((TextView) view.findViewById(com.google.android.wallet.e.g.description)).setText(getItem(i).f);
        return view;
    }
}
