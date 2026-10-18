package com.google.android.play.headerlist;

import android.database.DataSetObserver;
import android.util.SparseIntArray;
import android.widget.AbsListView;
import android.widget.Adapter;

/* loaded from: classes.dex */
public final class n implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    protected int f6906a;

    /* renamed from: b, reason: collision with root package name */
    private final PlayHeaderListLayout f6907b;
    private Adapter d;
    private int g;
    private final SparseIntArray[] e = {new SparseIntArray(), new SparseIntArray()};
    private int f = -1;
    private final DataSetObserver c = new o(this);

    public n(PlayHeaderListLayout playHeaderListLayout) {
        this.f6907b = playHeaderListLayout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        a().clear();
        this.f = -1;
        if (z) {
            a((Adapter) null);
        }
        this.f6906a = 0;
    }

    private void a(Adapter adapter) {
        if (this.d != adapter) {
            if (this.d != null) {
                this.d.unregisterDataSetObserver(this.c);
            }
            this.d = adapter;
            if (this.d != null) {
                this.d.registerDataSetObserver(this.c);
            }
            a(false);
        }
    }

    private SparseIntArray a() {
        return this.e[this.g];
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        a(absListView.getAdapter());
        this.f6906a = i;
        this.f6907b.a(i);
        if (this.f6907b.d != null) {
            this.f6907b.d.onScrollStateChanged(absListView, this.f6906a);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int i4;
        int min = Math.min(i2, i3);
        a(absListView.getAdapter());
        SparseIntArray a2 = a();
        SparseIntArray sparseIntArray = this.e[(this.g + 1) % 2];
        sparseIntArray.clear();
        for (int i5 = i; i5 < i + min; i5++) {
            sparseIntArray.put(i5, absListView.getChildAt(i5 - i).getTop());
        }
        int i6 = i;
        int i7 = -1;
        while (true) {
            if (i6 >= i + min) {
                i4 = 0;
                break;
            }
            i7 = a2.get(i6, -1);
            if (i7 == -1) {
                i6++;
            } else {
                i4 = i7 - sparseIntArray.get(i6);
                break;
            }
        }
        this.g = (this.g + 1) % 2;
        if (this.f == -1 || i7 == -1) {
            this.f = this.f6907b.b(absListView);
        } else {
            this.f += i4;
        }
        this.f6907b.a(this.f6906a, i4, absListView.getChildCount() != 0 ? this.f : 0);
        if (this.f6907b.d != null) {
            this.f6907b.d.onScroll(absListView, i, min, i3);
        }
    }
}
