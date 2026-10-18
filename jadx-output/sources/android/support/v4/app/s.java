package android.support.v4.app;

import android.view.View;

/* loaded from: classes.dex */
final class s extends x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Fragment f233a;

    s(Fragment fragment) {
        this.f233a = fragment;
    }

    @Override // android.support.v4.app.x
    public final View a(int i) {
        if (this.f233a.R == null) {
            throw new IllegalStateException("Fragment does not have a view");
        }
        return this.f233a.R.findViewById(i);
    }

    @Override // android.support.v4.app.x
    public final boolean a() {
        return this.f233a.R != null;
    }
}
