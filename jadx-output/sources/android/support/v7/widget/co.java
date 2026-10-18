package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;

/* loaded from: classes.dex */
final class co extends ct {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LinearLayoutManager f741a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    co(LinearLayoutManager linearLayoutManager, Context context) {
        super(context);
        this.f741a = linearLayoutManager;
    }

    @Override // android.support.v7.widget.ct
    public final PointF a(int i) {
        LinearLayoutManager linearLayoutManager = this.f741a;
        if (linearLayoutManager.q() == 0) {
            return null;
        }
        int i2 = (i < LinearLayoutManager.a(linearLayoutManager.f(0))) != linearLayoutManager.k ? -1 : 1;
        if (linearLayoutManager.i == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }
}
