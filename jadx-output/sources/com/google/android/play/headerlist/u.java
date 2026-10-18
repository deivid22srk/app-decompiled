package com.google.android.play.headerlist;

import android.database.DataSetObserver;
import android.widget.Adapter;

/* loaded from: classes.dex */
public final class u implements x {

    /* renamed from: a, reason: collision with root package name */
    final PlayHeaderListLayout f6917a;

    /* renamed from: b, reason: collision with root package name */
    protected int f6918b;
    private int c = -1;
    private final DataSetObserver d = new v(this);
    private Adapter e;

    public u(PlayHeaderListLayout playHeaderListLayout) {
        this.f6917a = playHeaderListLayout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.c = -1;
        if (z && this.e != null) {
            if (this.e != null) {
                this.e.unregisterDataSetObserver(this.d);
            }
            this.e = null;
            if (this.e != null) {
                this.e.registerDataSetObserver(this.d);
            }
            a(false);
        }
        this.f6918b = 0;
    }
}
