package com.google.android.libraries.bind.data;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class i implements ListAdapter, SpinnerAdapter {

    /* renamed from: a, reason: collision with root package name */
    protected final com.google.android.libraries.bind.e.a f6691a;

    /* renamed from: b, reason: collision with root package name */
    protected k f6692b;
    protected ad c;
    protected ad d;
    protected ad e;
    private final m f;
    private final z g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;

    public abstract View a(int i, View view, Data data);

    private void b() {
        if (this.f6692b == null || this.g.a() == 0) {
            if (this.h) {
                this.f6692b.b(this.f);
                this.h = false;
                return;
            }
            return;
        }
        if (!this.h) {
            this.f6692b.a(this.f);
            this.h = true;
        }
    }

    private boolean c() {
        if (this.i) {
            if ((this.f6692b == null || !a()) && !e()) {
                return true;
            }
        }
        return false;
    }

    private boolean d() {
        return this.j && !((this.f6692b != null && !this.f6692b.c()) || c() || e());
    }

    private boolean e() {
        return this.k && this.f6692b != null && this.f6692b.e.b();
    }

    private boolean f() {
        return c() || d() || e();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (f()) {
            return 1;
        }
        if (this.f6692b == null) {
            return 0;
        }
        return this.f6692b.b();
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Data getItem(int i) {
        if (f()) {
            return null;
        }
        return this.f6692b.a(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        if (c()) {
            return Long.MAX_VALUE;
        }
        if (d()) {
            return 9223372036854775806L;
        }
        if (e()) {
            return 9223372036854775805L;
        }
        Object b2 = this.f6692b.b(i);
        if (b2 instanceof Long) {
            return ((Long) b2).longValue();
        }
        if (b2 instanceof Integer) {
            return ((Integer) b2).intValue();
        }
        if (b2 == null) {
            return 0L;
        }
        int length = b2.toString().length();
        long j = 0;
        int i2 = 0;
        while (i2 < length) {
            long charAt = r6.charAt(i2) + (j * 63);
            i2++;
            j = charAt;
        }
        return j;
    }

    @Override // android.widget.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return getView(i, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.Adapter
    public boolean isEmpty() {
        return !f() && (this.f6692b == null || this.f6692b.c());
    }

    public final boolean a() {
        if (this.f6692b == null) {
            return false;
        }
        return this.f6692b.h();
    }

    public final void a(DataSetObserver dataSetObserver, int i) {
        z zVar = this.g;
        if (dataSetObserver == null) {
            throw new IllegalArgumentException("Observer is null");
        }
        zVar.f6710a.isEmpty();
        zVar.f6710a.add(new aa(dataSetObserver, i));
        Collections.sort(zVar.f6710a);
        b();
    }

    @Override // android.widget.Adapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        a(dataSetObserver, 0);
    }

    @Override // android.widget.Adapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        z zVar = this.g;
        if (dataSetObserver == null) {
            throw new IllegalArgumentException("Observer is null");
        }
        if (!zVar.f6710a.isEmpty()) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= zVar.f6710a.size()) {
                    break;
                }
                if (zVar.f6710a.get(i2).f6681a != dataSetObserver) {
                    i = i2 + 1;
                } else {
                    zVar.f6710a.remove(i2);
                    break;
                }
            }
            zVar.f6710a.isEmpty();
        }
        b();
    }

    @Override // android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return true;
    }

    @Override // android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return true;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (!c()) {
            if (!d()) {
                if (!e()) {
                    k kVar = this.f6692b;
                    com.google.android.libraries.bind.a.a.a();
                    if (kVar.e.a(i)) {
                        return null;
                    }
                    View a2 = a(i, view, this.f6692b.a(i));
                    ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
                    if (layoutParams == null || (layoutParams instanceof AbsListView.LayoutParams)) {
                        return a2;
                    }
                    a2.setLayoutParams(new AbsListView.LayoutParams(layoutParams));
                    return a2;
                }
                return this.e.a(viewGroup);
            }
            View a3 = this.d.a(viewGroup);
            a3.setLayoutParams(a(viewGroup));
            return a3;
        }
        View a4 = this.c.a(viewGroup);
        a4.setLayoutParams(a(viewGroup));
        return a4;
    }

    private static ViewGroup.LayoutParams a(ViewGroup viewGroup) {
        return new AbsListView.LayoutParams((viewGroup.getWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight(), ((viewGroup.getHeight() - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom()) - (viewGroup.getResources().getDimensionPixelSize(com.google.android.libraries.bind.b.bind__card_list_view_padding) * 2));
    }
}
