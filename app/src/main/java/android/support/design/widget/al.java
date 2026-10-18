package android.support.design.widget;

import android.view.View;

/* loaded from: classes.dex */
final class al implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View.OnClickListener f85a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Snackbar f86b;

    al(Snackbar snackbar, View.OnClickListener onClickListener) {
        this.f86b = snackbar;
        this.f85a = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f85a.onClick(view);
        Snackbar.a(this.f86b, 1);
    }
}
