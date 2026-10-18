package com.google.android.libraries.bind.data;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.AbsListView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends i {
    private static final int[] f = {com.google.android.libraries.bind.d.bind__card_edit_placeholder, com.google.android.libraries.bind.d.bind__card_list_padding};
    private static SparseIntArray g;
    private k h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final List<Integer> m;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.libraries.bind.data.i
    public final View a(int i, View view, Data data) {
        Integer num = (Integer) data.b(this.i);
        if (num == null) {
            com.google.android.libraries.bind.card.g gVar = (com.google.android.libraries.bind.card.g) data.b(this.j);
            com.google.android.libraries.bind.dpkg.a.a(gVar != null, "Missing both view resource ID and view generator");
            return gVar.a();
        }
        View a2 = this.f6691a.a(num.intValue(), view, new AbsListView.LayoutParams(-1, -2));
        int[] iArr = (int[]) data.b(this.k);
        if (!(a2 instanceof o)) {
            return a2;
        }
        u uVar = new u(this.h, this.h.b(i), new w(num.intValue(), this.i), iArr);
        uVar.i();
        ((o) a2).setDataRow(uVar);
        return a2;
    }

    @Override // com.google.android.libraries.bind.data.i, android.widget.Adapter
    public final int getItemViewType(int i) {
        if (i < this.m.size()) {
            return this.m.get(i).intValue();
        }
        return -1;
    }

    @Override // com.google.android.libraries.bind.data.i, android.widget.Adapter
    public final int getViewTypeCount() {
        return g.size();
    }

    public final int a(Object obj) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < getCount()) {
                Data c = getItem(i2);
                if (c != null) {
                    if (c.a(this.i)) {
                        if (obj.equals(this.f6692b.b(i2))) {
                            return i2;
                        }
                    } else {
                        Iterator<Object> it = ((com.google.android.libraries.bind.card.g) c.b(this.j)).b().iterator();
                        while (it.hasNext()) {
                            if (obj.equals(it.next())) {
                                return i2;
                            }
                        }
                    }
                }
                i = i2 + 1;
            } else {
                return -1;
            }
        }
    }

    public final Object a(int i) {
        Data c = getItem(i);
        if (c == null) {
            return null;
        }
        if (c.a(this.i)) {
            return this.f6692b.b(i);
        }
        List<Object> b2 = ((com.google.android.libraries.bind.card.g) c.b(this.j)).b();
        if (b2.size() > 0) {
            return b2.get(0);
        }
        return null;
    }

    public final int b(int i) {
        Integer num;
        Data c = getItem(i);
        if (c != null && (num = (Integer) c.b(this.l)) != null) {
            return num.intValue();
        }
        return 1;
    }
}
