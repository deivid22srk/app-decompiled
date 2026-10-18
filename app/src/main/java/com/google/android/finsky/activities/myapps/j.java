package com.google.android.finsky.activities.myapps;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.cy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class j extends BaseAdapter implements cy {

    /* renamed from: a, reason: collision with root package name */
    final List<Document> f1825a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    final int f1826b;
    final String c;
    final g d;
    final /* synthetic */ c e;
    private final int f;
    private com.google.android.finsky.apkg.ai g;

    public j(c cVar, int i, int i2, g gVar, int i3) {
        this.e = cVar;
        this.f = i;
        this.f1826b = i2;
        this.d = gVar;
        this.c = "**HEADER" + i;
        this.g = com.google.android.finsky.apkg.i.a(i3);
    }

    final void a(Document document) {
        this.f1825a.add(document);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (i == 0) {
            return null;
        }
        return this.f1825a.get(i - 1);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 4;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        return this.f == 0 ? 2 : 1;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i);
        getCount();
        switch (itemViewType) {
            case 0:
                return c.a(this.e, view, viewGroup, this);
            case 1:
                return c.b(this.e, (Document) getItem(i), view, viewGroup, this);
            case 2:
                return c.a(this.e, (Document) getItem(i), view, viewGroup, this);
            default:
                throw new IllegalStateException("Null row view for position " + i + " and type " + itemViewType);
        }
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final com.google.android.finsky.apkg.ai getPlayStoreUiElement() {
        return this.g;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final cy getParentNode() {
        cy cyVar;
        cyVar = this.e.p;
        return cyVar;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        com.google.android.finsky.apkg.i.a(this, cyVar);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.f1825a.size() > 0) {
            return this.f1825a.size() + 1;
        }
        return 0;
    }
}
