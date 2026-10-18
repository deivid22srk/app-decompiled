package com.google.android.play.layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f6990a;

    /* renamed from: b, reason: collision with root package name */
    List<g> f6991b;

    public h(Context context, List<g> list) {
        this.f6990a = context;
        this.f6991b = list;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f6991b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f6991b.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f6990a).inflate(com.google.android.play.l.abc_popup_menu_item_layout, viewGroup, false);
            i iVar = new i((byte) 0);
            iVar.f6992a = (TextView) view.findViewById(com.google.android.play.k.title);
            iVar.f6993b = (TextView) view.findViewById(com.google.android.play.k.shortcut);
            view.setTag(iVar);
        }
        i iVar2 = (i) view.getTag();
        g gVar = this.f6991b.get(i);
        iVar2.f6992a.setText(gVar.f6989b);
        iVar2.f6992a.setEnabled(gVar.c);
        iVar2.f6993b.setVisibility(8);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return this.f6991b.get(i).c;
    }
}
