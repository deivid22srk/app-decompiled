package com.google.android.libraries.bind.widget;

import android.widget.AbsListView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class c implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final Set<AbsListView.OnScrollListener> f6722a = new HashSet();

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        Iterator<AbsListView.OnScrollListener> it = this.f6722a.iterator();
        while (it.hasNext()) {
            it.next().onScroll(absListView, i, i2, i3);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        Iterator<AbsListView.OnScrollListener> it = this.f6722a.iterator();
        while (it.hasNext()) {
            it.next().onScrollStateChanged(absListView, i);
        }
    }
}
