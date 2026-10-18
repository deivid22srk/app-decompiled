package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* loaded from: classes.dex */
final class ew extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ eu f805a;

    private ew(eu euVar) {
        this.f805a = euVar;
    }

    /* synthetic */ ew(eu euVar, byte b2) {
        this(euVar);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        cm cmVar;
        cmVar = this.f805a.d;
        return cmVar.getChildCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        cm cmVar;
        cmVar = this.f805a.d;
        return ((ex) cmVar.getChildAt(i)).f806a;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            return eu.a(this.f805a, (android.support.v7.a.d) getItem(i));
        }
        ex exVar = (ex) view;
        exVar.f806a = (android.support.v7.a.d) getItem(i);
        exVar.a();
        return view;
    }
}
