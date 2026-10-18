package android.support.v4.app;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.PrintWriter;

/* loaded from: classes.dex */
final class v extends z<t> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f237a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(t tVar) {
        super(tVar);
        this.f237a = tVar;
    }

    @Override // android.support.v4.app.z
    public final void a(String str, PrintWriter printWriter, String[] strArr) {
        this.f237a.dump(str, null, printWriter, strArr);
    }

    @Override // android.support.v4.app.z
    public final boolean b() {
        return !this.f237a.isFinishing();
    }

    @Override // android.support.v4.app.z
    public final LayoutInflater c() {
        return this.f237a.getLayoutInflater().cloneInContext(this.f237a);
    }

    @Override // android.support.v4.app.z
    public final void d() {
        this.f237a.c();
    }

    @Override // android.support.v4.app.z
    public final void a(Fragment fragment, Intent intent, int i) {
        t tVar = this.f237a;
        tVar.j = true;
        try {
            if (i == -1) {
                a.a(tVar, intent, -1);
            } else {
                if (((-65536) & i) != 0) {
                    throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
                }
                a.a(tVar, intent, ((fragment.p + 1) << 16) + (65535 & i));
            }
        } finally {
            tVar.j = false;
        }
    }

    @Override // android.support.v4.app.z
    public final void a(Fragment fragment, String[] strArr) {
        t.a(this.f237a, fragment, strArr);
    }

    @Override // android.support.v4.app.z
    public final boolean e() {
        return this.f237a.getWindow() != null;
    }

    @Override // android.support.v4.app.z
    public final int f() {
        Window window = this.f237a.getWindow();
        if (window == null) {
            return 0;
        }
        return window.getAttributes().windowAnimations;
    }

    @Override // android.support.v4.app.z, android.support.v4.app.x
    public final View a(int i) {
        return this.f237a.findViewById(i);
    }

    @Override // android.support.v4.app.z, android.support.v4.app.x
    public final boolean a() {
        Window window = this.f237a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
