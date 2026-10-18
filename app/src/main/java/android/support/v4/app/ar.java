package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes.dex */
final class ar extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Rect f179a;

    ar(Rect rect) {
        this.f179a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.f179a;
    }
}
