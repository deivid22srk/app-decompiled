package android.support.v7.a;

import android.graphics.Rect;
import android.support.v7.widget.ch;

/* loaded from: classes.dex */
final class as implements ch {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ap f482a;

    as(ap apVar) {
        this.f482a = apVar;
    }

    @Override // android.support.v7.widget.ch
    public final void a(Rect rect) {
        rect.top = ap.b(this.f482a, rect.top);
    }
}
