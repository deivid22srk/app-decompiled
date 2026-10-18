package android.support.v4.view.a;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final o f324a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f325b;

    static {
        if (Build.VERSION.SDK_INT >= 22) {
            f324a = new m();
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            f324a = new l();
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            f324a = new s();
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            f324a = new r();
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            f324a = new q();
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            f324a = new p();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f324a = new n();
        } else {
            f324a = new t();
        }
    }

    public j(Object obj) {
        this.f325b = obj;
    }

    public static j a(j jVar) {
        Object a2 = f324a.a(jVar.f325b);
        if (a2 != null) {
            return new j(a2);
        }
        return null;
    }

    public final int a() {
        return f324a.b(this.f325b);
    }

    public final void a(int i) {
        f324a.a(this.f325b, i);
    }

    public final boolean a(k kVar) {
        return f324a.a(this.f325b, kVar.w);
    }

    public final void a(View view) {
        f324a.b(this.f325b, view);
    }

    public final void a(Rect rect) {
        f324a.a(this.f325b, rect);
    }

    public final void b(Rect rect) {
        f324a.b(this.f325b, rect);
    }

    public final boolean b() {
        return f324a.k(this.f325b);
    }

    public final void a(boolean z) {
        f324a.d(this.f325b, z);
    }

    public final boolean c() {
        return f324a.l(this.f325b);
    }

    public final void b(boolean z) {
        f324a.e(this.f325b, z);
    }

    public final boolean d() {
        return f324a.p(this.f325b);
    }

    public final boolean e() {
        return f324a.i(this.f325b);
    }

    public final boolean f() {
        return f324a.m(this.f325b);
    }

    public final boolean g() {
        return f324a.j(this.f325b);
    }

    public final void c(boolean z) {
        f324a.g(this.f325b, z);
    }

    public final CharSequence h() {
        return f324a.e(this.f325b);
    }

    public final CharSequence i() {
        return f324a.c(this.f325b);
    }

    public final void a(CharSequence charSequence) {
        f324a.a(this.f325b, charSequence);
    }

    public final CharSequence j() {
        return f324a.d(this.f325b);
    }

    public final void a(Object obj) {
        f324a.c(this.f325b, ((v) obj).f329a);
    }

    public final int hashCode() {
        if (this.f325b == null) {
            return 0;
        }
        return this.f325b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            j jVar = (j) obj;
            return this.f325b == null ? jVar.f325b == null : this.f325b.equals(jVar.f325b);
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        sb.append("; boundsInParent: " + rect);
        b(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ").append(h());
        sb.append("; className: ").append(i());
        sb.append("; text: ").append(f324a.f(this.f325b));
        sb.append("; contentDescription: ").append(j());
        sb.append("; viewId: ").append(f324a.u(this.f325b));
        sb.append("; checkable: ").append(f324a.g(this.f325b));
        sb.append("; checked: ").append(f324a.h(this.f325b));
        sb.append("; focusable: ").append(b());
        sb.append("; focused: ").append(c());
        sb.append("; selected: ").append(d());
        sb.append("; clickable: ").append(e());
        sb.append("; longClickable: ").append(f());
        sb.append("; enabled: ").append(g());
        sb.append("; password: ").append(f324a.n(this.f325b));
        sb.append("; scrollable: " + f324a.o(this.f325b));
        sb.append("; [");
        int a2 = a();
        while (a2 != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(a2);
            int i = (numberOfTrailingZeros ^ (-1)) & a2;
            switch (numberOfTrailingZeros) {
                case 1:
                    str = "ACTION_FOCUS";
                    break;
                case 2:
                    str = "ACTION_CLEAR_FOCUS";
                    break;
                case 4:
                    str = "ACTION_SELECT";
                    break;
                case 8:
                    str = "ACTION_CLEAR_SELECTION";
                    break;
                case 16:
                    str = "ACTION_CLICK";
                    break;
                case 32:
                    str = "ACTION_LONG_CLICK";
                    break;
                case 64:
                    str = "ACTION_ACCESSIBILITY_FOCUS";
                    break;
                case 128:
                    str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    break;
                case 256:
                    str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    break;
                case 512:
                    str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    break;
                case 1024:
                    str = "ACTION_NEXT_HTML_ELEMENT";
                    break;
                case 2048:
                    str = "ACTION_PREVIOUS_HTML_ELEMENT";
                    break;
                case 4096:
                    str = "ACTION_SCROLL_FORWARD";
                    break;
                case 8192:
                    str = "ACTION_SCROLL_BACKWARD";
                    break;
                case 16384:
                    str = "ACTION_COPY";
                    break;
                case 32768:
                    str = "ACTION_PASTE";
                    break;
                case 65536:
                    str = "ACTION_CUT";
                    break;
                case 131072:
                    str = "ACTION_SET_SELECTION";
                    break;
                default:
                    str = "ACTION_UNKNOWN";
                    break;
            }
            sb.append(str);
            if (i != 0) {
                sb.append(", ");
            }
            a2 = i;
        }
        sb.append("]");
        return sb.toString();
    }
}
