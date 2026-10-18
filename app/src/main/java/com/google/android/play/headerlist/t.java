package com.google.android.play.headerlist;

import android.database.DataSetObserver;
import android.support.v4.view.dl;
import android.view.View;

/* loaded from: classes.dex */
final class t extends DataSetObserver implements dl {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayHeaderListTabStrip f6915a;

    /* renamed from: b, reason: collision with root package name */
    private int f6916b;

    private t(PlayHeaderListTabStrip playHeaderListTabStrip) {
        this.f6915a = playHeaderListTabStrip;
    }

    /* synthetic */ t(PlayHeaderListTabStrip playHeaderListTabStrip, byte b2) {
        this(playHeaderListTabStrip);
    }

    @Override // android.support.v4.view.dl
    public final void a(int i, float f, int i2) {
        dl dlVar;
        boolean z;
        PlayHeaderListTabContainer playHeaderListTabContainer;
        PlayHeaderListTabContainer playHeaderListTabContainer2;
        PlayHeaderListTabContainer playHeaderListTabContainer3;
        PlayHeaderListTabContainer playHeaderListTabContainer4;
        dl dlVar2;
        dlVar = this.f6915a.h;
        if (dlVar != null) {
            dlVar2 = this.f6915a.h;
            dlVar2.a(i, f, i2);
        }
        z = this.f6915a.i;
        if (z) {
            playHeaderListTabContainer = this.f6915a.d;
            int childCount = playHeaderListTabContainer.getChildCount();
            if (childCount != 0 && i >= 0 && i < childCount) {
                playHeaderListTabContainer2 = this.f6915a.d;
                playHeaderListTabContainer2.f6891a = i;
                playHeaderListTabContainer2.f6892b = f;
                playHeaderListTabContainer2.invalidate();
                playHeaderListTabContainer3 = this.f6915a.d;
                View childAt = playHeaderListTabContainer3.getChildAt(i);
                int width = childAt == null ? 0 : childAt.getWidth();
                playHeaderListTabContainer4 = this.f6915a.d;
                this.f6915a.a(i, (int) ((width + (playHeaderListTabContainer4.getChildAt(i + 1) != null ? r2.getWidth() : 0)) * f * 0.5f), false);
            }
        }
    }

    @Override // android.support.v4.view.dl
    public final void a_(int i) {
        dl dlVar;
        PlayHeaderListTabContainer playHeaderListTabContainer;
        dl dlVar2;
        dlVar = this.f6915a.h;
        if (dlVar != null) {
            dlVar2 = this.f6915a.h;
            dlVar2.a_(i);
        }
        playHeaderListTabContainer = this.f6915a.d;
        playHeaderListTabContainer.f6891a = i;
        playHeaderListTabContainer.f6892b = 0.0f;
        playHeaderListTabContainer.invalidate();
        this.f6915a.b();
    }

    @Override // android.support.v4.view.dl
    public final void b(int i) {
        dl dlVar;
        dl dlVar2;
        this.f6916b = i;
        dlVar = this.f6915a.h;
        if (dlVar != null) {
            dlVar2 = this.f6915a.h;
            dlVar2.b(i);
        }
        if (this.f6916b == 0) {
            this.f6915a.i = true;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f6915a.c();
    }
}
