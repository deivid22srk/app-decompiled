package com.google.android.finsky.activities.bpkg;

/* loaded from: classes.dex */
public final class d implements com.google.android.finsky.api.model.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f1578b;

    d(a aVar, int i) {
        this.f1578b = aVar;
        this.f1577a = i;
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        int i = -1;
        switch (this.f1577a) {
            case 0:
                i = 3;
                break;
            case 1:
                i = 4;
                break;
            case 2:
                i = 5;
                break;
        }
        if (i >= 0) {
            this.f1578b.c(this.f1578b.d.indexOf(Integer.valueOf(i)) + 3);
        }
    }
}
