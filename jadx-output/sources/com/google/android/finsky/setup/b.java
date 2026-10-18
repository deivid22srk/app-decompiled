package com.google.android.finsky.setup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.protos.nv;

/* loaded from: classes.dex */
public final class b extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private final nv[] f4653a;

    /* renamed from: b, reason: collision with root package name */
    private final LayoutInflater f4654b;
    private final String c;

    public b(Context context, nv[] nvVarArr) {
        this.f4653a = nvVarArr;
        this.f4654b = (LayoutInflater) context.getSystemService("layout_inflater");
        this.c = context.getResources().getString(R.string.setup_wizard_all_apps);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f4653a.length + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String getItem(int i) {
        return i <= 0 ? this.c : this.f4653a[i - 1].f4188b;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = view == null ? this.f4654b.inflate(R.layout.restore_apps_row_entry, viewGroup, false) : view;
        ((TextView) inflate).setText(getItem(i));
        return inflate;
    }
}
