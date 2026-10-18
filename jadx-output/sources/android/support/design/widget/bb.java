package android.support.design.widget;

import android.view.View;
import android.view.animation.Animation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class bb {
    WeakReference<View> d;

    /* renamed from: a, reason: collision with root package name */
    final ArrayList<bd> f102a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    bd f103b = null;
    Animation c = null;
    private Animation.AnimationListener e = new bc(this);

    bb() {
    }

    public final void a(int[] iArr, Animation animation) {
        bd bdVar = new bd(iArr, animation, (byte) 0);
        animation.setAnimationListener(this.e);
        this.f102a.add(bdVar);
    }

    final View a() {
        if (this.d == null) {
            return null;
        }
        return this.d.get();
    }
}
