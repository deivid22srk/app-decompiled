package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.support.v7.widget.fx;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements k, z, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f577a = {R.attr.background, R.attr.divider};

    /* renamed from: b, reason: collision with root package name */
    private i f578b;
    private int c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        fx a2 = fx.a(context, attributeSet, f577a, i);
        if (a2.e(0)) {
            setBackgroundDrawable(a2.a(0));
        }
        if (a2.e(1)) {
            setDivider(a2.a(1));
        }
        a2.f836a.recycle();
    }

    @Override // android.support.v7.view.menu.z
    public final void a(i iVar) {
        this.f578b = iVar;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.support.v7.view.menu.k
    public final boolean a(m mVar) {
        return this.f578b.a(mVar, (x) null, 0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((m) getAdapter().getItem(i));
    }

    public final int getWindowAnimations() {
        return this.c;
    }
}
