package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
final class ga implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Toolbar f841a;

    ga(Toolbar toolbar) {
        this.f841a = toolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f841a.d();
    }
}
