package android.support.v7.view;

import android.support.v4.view.ep;
import android.view.View;

/* loaded from: classes.dex */
final class m extends ep {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f573a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f574b = false;
    private int c = 0;

    m(l lVar) {
        this.f573a = lVar;
    }

    @Override // android.support.v4.view.ep, android.support.v4.view.eo
    public final void a(View view) {
        if (!this.f574b) {
            this.f574b = true;
            if (this.f573a.f572b != null) {
                this.f573a.f572b.a(null);
            }
        }
    }

    @Override // android.support.v4.view.ep, android.support.v4.view.eo
    public final void b(View view) {
        int i = this.c + 1;
        this.c = i;
        if (i == this.f573a.f571a.size()) {
            if (this.f573a.f572b != null) {
                this.f573a.f572b.b(null);
            }
            this.c = 0;
            this.f574b = false;
            this.f573a.c = false;
        }
    }
}
