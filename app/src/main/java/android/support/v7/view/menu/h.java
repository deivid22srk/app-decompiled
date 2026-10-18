package android.support.v7.view.menu;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f590a;

    /* renamed from: b, reason: collision with root package name */
    private int f591b = -1;

    public h(g gVar) {
        this.f590a = gVar;
        a();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int i;
        int size = this.f590a.c.j().size();
        i = this.f590a.i;
        int i2 = size - i;
        return this.f591b < 0 ? i2 : i2 - 1;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m getItem(int i) {
        int i2;
        ArrayList<m> j = this.f590a.c.j();
        i2 = this.f590a.i;
        int i3 = i2 + i;
        if (this.f591b >= 0 && i3 >= this.f591b) {
            i3++;
        }
        return j.get(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = view == null ? this.f590a.f589b.inflate(this.f590a.f, viewGroup, false) : view;
        ((aa) inflate).a(getItem(i));
        return inflate;
    }

    private void a() {
        m mVar = this.f590a.c.j;
        if (mVar != null) {
            ArrayList<m> j = this.f590a.c.j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (j.get(i) == mVar) {
                    this.f591b = i;
                    return;
                }
            }
        }
        this.f591b = -1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
