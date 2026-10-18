package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes.dex */
final class at extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ av f182a;

    /* renamed from: b, reason: collision with root package name */
    private Rect f183b;

    at(av avVar) {
        this.f182a = avVar;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        if (this.f183b == null && this.f182a.f186a != null) {
            this.f183b = aq.a(this.f182a.f186a);
        }
        return this.f183b;
    }
}
