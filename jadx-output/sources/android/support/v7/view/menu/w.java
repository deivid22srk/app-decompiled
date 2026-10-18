package android.support.v7.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class w extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f604a;

    /* renamed from: b, reason: collision with root package name */
    private i f605b;
    private int c = -1;

    public w(v vVar, i iVar) {
        this.f604a = vVar;
        this.f605b = iVar;
        a();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        boolean z;
        z = this.f604a.k;
        ArrayList<m> j = z ? this.f605b.j() : this.f605b.h();
        if (this.c < 0) {
            return j.size();
        }
        return j.size() - 1;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m getItem(int i) {
        boolean z;
        z = this.f604a.k;
        ArrayList<m> j = z ? this.f605b.j() : this.f605b.h();
        if (this.c >= 0 && i >= this.c) {
            i++;
        }
        return j.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        LayoutInflater layoutInflater;
        if (view == null) {
            layoutInflater = this.f604a.h;
            view2 = layoutInflater.inflate(v.f602a, viewGroup, false);
        } else {
            view2 = view;
        }
        aa aaVar = (aa) view2;
        if (this.f604a.e) {
            ((ListMenuItemView) view2).setForceShowIcon(true);
        }
        aaVar.a(getItem(i));
        return view2;
    }

    private void a() {
        i iVar;
        i iVar2;
        iVar = this.f604a.i;
        m mVar = iVar.j;
        if (mVar != null) {
            iVar2 = this.f604a.i;
            ArrayList<m> j = iVar2.j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (j.get(i) == mVar) {
                    this.c = i;
                    return;
                }
            }
        }
        this.c = -1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
