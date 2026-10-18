package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
final class be extends cy {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bg f690a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppCompatSpinner f691b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    be(AppCompatSpinner appCompatSpinner, View view, bg bgVar) {
        super(view);
        this.f691b = appCompatSpinner;
        this.f690a = bgVar;
    }

    @Override // android.support.v7.widget.cy
    public final cu a() {
        return this.f690a;
    }

    @Override // android.support.v7.widget.cy
    public final boolean b() {
        bg bgVar;
        bg bgVar2;
        bgVar = this.f691b.j;
        if (!bgVar.c.isShowing()) {
            bgVar2 = this.f691b.j;
            bgVar2.b();
            return true;
        }
        return true;
    }
}
