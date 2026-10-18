package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ad extends aa implements android.support.v4.view.an {
    static final Interpolator A;
    static final Interpolator B;
    static final Interpolator C;
    static final Interpolator D;

    /* renamed from: a, reason: collision with root package name */
    static boolean f164a = false;

    /* renamed from: b, reason: collision with root package name */
    static final boolean f165b;
    static Field r;
    ArrayList<Runnable> c;
    Runnable[] d;
    boolean e;
    ArrayList<Fragment> f;
    ArrayList<Fragment> g;
    ArrayList<Integer> h;
    ArrayList<i> i;
    ArrayList<Fragment> j;
    ArrayList<i> k;
    ArrayList<Integer> l;
    ArrayList<ac> m;
    z o;
    x p;
    Fragment q;
    boolean s;
    boolean t;
    boolean u;
    String v;
    boolean w;
    int n = 0;
    Bundle x = null;
    SparseArray<Parcelable> y = null;
    Runnable z = new ae(this);

    ad() {
    }

    static {
        f165b = Build.VERSION.SDK_INT >= 11;
        r = null;
        A = new DecelerateInterpolator(2.5f);
        B = new DecelerateInterpolator(1.5f);
        C = new AccelerateInterpolator(2.5f);
        D = new AccelerateInterpolator(1.5f);
    }

    static boolean a(View view, Animation animation) {
        boolean z;
        if (Build.VERSION.SDK_INT < 19 || android.support.v4.view.by.g(view) != 0 || !android.support.v4.view.by.B(view)) {
            return false;
        }
        if (animation instanceof AlphaAnimation) {
            z = true;
        } else {
            if (animation instanceof AnimationSet) {
                List<Animation> animations = ((AnimationSet) animation).getAnimations();
                for (int i = 0; i < animations.size(); i++) {
                    if (animations.get(i) instanceof AlphaAnimation) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
        }
        return z;
    }

    private void a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new android.support.v4.h.e("FragmentManager"));
        if (this.o != null) {
            try {
                this.o.a("  ", printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            a("  ", (FileDescriptor) null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    @Override // android.support.v4.app.aa
    public final ap a() {
        return new i(this);
    }

    @Override // android.support.v4.app.aa
    public final boolean b() {
        return j();
    }

    @Override // android.support.v4.app.aa
    public final void c() {
        a((Runnable) new af(this), false);
    }

    @Override // android.support.v4.app.aa
    public final boolean d() {
        t();
        j();
        return a((String) null, -1, 0);
    }

    @Override // android.support.v4.app.aa
    public final void a(String str, int i) {
        a((Runnable) new ag(this, str, i), false);
    }

    @Override // android.support.v4.app.aa
    public final void b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad id: " + i);
        }
        a((Runnable) new ah(this, i), false);
    }

    @Override // android.support.v4.app.aa
    public final int e() {
        if (this.i != null) {
            return this.i.size();
        }
        return 0;
    }

    @Override // android.support.v4.app.aa
    public final ab f() {
        return this.i.get(0);
    }

    @Override // android.support.v4.app.aa
    public final void a(ac acVar) {
        if (this.m == null) {
            this.m = new ArrayList<>();
        }
        this.m.add(acVar);
    }

    @Override // android.support.v4.app.aa
    public final void b(ac acVar) {
        if (this.m != null) {
            this.m.remove(acVar);
        }
    }

    @Override // android.support.v4.app.aa
    public final void a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.p < 0) {
            a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, fragment.p);
    }

    @Override // android.support.v4.app.aa
    public final Fragment a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        if (i >= this.f.size()) {
            a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        }
        Fragment fragment = this.f.get(i);
        if (fragment == null) {
            a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
            return fragment;
        }
        return fragment;
    }

    @Override // android.support.v4.app.aa
    public final List<Fragment> g() {
        return this.f;
    }

    @Override // android.support.v4.app.aa
    public final boolean h() {
        return this.u;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.q != null) {
            android.support.v4.h.d.a(this.q, sb);
        } else {
            android.support.v4.h.d.a(this.o, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    @Override // android.support.v4.app.aa
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        int size6;
        String str2 = str + "    ";
        if (this.f != null && (size6 = this.f.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i = 0; i < size6; i++) {
                Fragment fragment = this.f.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        if (this.g != null && (size5 = this.g.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size5; i2++) {
                Fragment fragment2 = this.g.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        if (this.j != null && (size4 = this.j.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                Fragment fragment3 = this.j.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        if (this.i != null && (size3 = this.i.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                i iVar = this.i.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(iVar.toString());
                iVar.a(str2, printWriter);
            }
        }
        synchronized (this) {
            if (this.k != null && (size2 = this.k.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    Object obj = (i) this.k.get(i5);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            if (this.l != null && this.l.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.l.toArray()));
            }
        }
        if (this.c != null && (size = this.c.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                Object obj2 = (Runnable) this.c.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.p);
        if (this.q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.u);
        if (this.s) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.s);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.v);
        }
        if (this.h != null && this.h.size() > 0) {
            printWriter.print(str);
            printWriter.print("  mAvailIndices: ");
            printWriter.println(Arrays.toString(this.h.toArray()));
        }
    }

    private static Animation a(float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(A);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(B);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    private static Animation a(float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(B);
        alphaAnimation.setDuration(220L);
        return alphaAnimation;
    }

    private Animation a(Fragment fragment, int i, boolean z, int i2) {
        Animation loadAnimation;
        int i3 = fragment.P;
        Fragment.n();
        if (fragment.P == 0 || (loadAnimation = AnimationUtils.loadAnimation(this.o.c, fragment.P)) == null) {
            if (i == 0) {
                return null;
            }
            char c = 65535;
            switch (i) {
                case 4097:
                    if (!z) {
                        c = 2;
                        break;
                    } else {
                        c = 1;
                        break;
                    }
                case 4099:
                    if (!z) {
                        c = 6;
                        break;
                    } else {
                        c = 5;
                        break;
                    }
                case 8194:
                    if (!z) {
                        c = 4;
                        break;
                    } else {
                        c = 3;
                        break;
                    }
            }
            if (c < 0) {
                return null;
            }
            switch (c) {
                case 1:
                    return a(1.125f, 1.0f, 0.0f, 1.0f);
                case 2:
                    return a(1.0f, 0.975f, 1.0f, 0.0f);
                case 3:
                    return a(0.975f, 1.0f, 0.0f, 1.0f);
                case 4:
                    return a(1.0f, 1.075f, 1.0f, 0.0f);
                case 5:
                    return a(0.0f, 1.0f);
                case 6:
                    return a(1.0f, 0.0f);
                default:
                    if (i2 == 0 && this.o.e()) {
                        i2 = this.o.f();
                    }
                    return i2 == 0 ? null : null;
            }
        }
        return loadAnimation;
    }

    private static void b(View view, Animation animation) {
        Animation.AnimationListener animationListener;
        if (view != null && animation != null && a(view, animation)) {
            try {
                if (r == null) {
                    Field declaredField = Animation.class.getDeclaredField("mListener");
                    r = declaredField;
                    declaredField.setAccessible(true);
                }
                animationListener = (Animation.AnimationListener) r.get(animation);
            } catch (IllegalAccessException e) {
                Log.e("FragmentManager", "Cannot access Animation's mListener field", e);
                animationListener = null;
            } catch (NoSuchFieldException e2) {
                Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e2);
                animationListener = null;
            }
            animation.setAnimationListener(new aj(view, animation, animationListener));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0045 A[FALL_THROUGH, PHI: r12
      0x0045: PHI (r12v6 int) = 
      (r12v4 int)
      (r12v4 int)
      (r12v4 int)
      (r12v4 int)
      (r12v4 int)
      (r12v4 int)
      (r12v4 int)
      (r12v5 int)
      (r12v4 int)
      (r12v7 int)
      (r12v7 int)
     binds: [B:167:0x03a6, B:169:0x03aa, B:170:0x03af, B:195:0x058a, B:207:0x05fb, B:199:0x0592, B:206:0x05be, B:178:0x03c4, B:28:0x0042, B:151:0x0342, B:165:0x039e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void a(android.support.v4.app.Fragment r11, int r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 1576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.ad.a(android.support.v4.app.Fragment, int, int, int, boolean):void");
    }

    private void b(Fragment fragment) {
        a(fragment, this.n, 0, 0, false);
    }

    final void c(int i) {
        a(i, 0, 0, false);
    }

    final void a(int i, int i2, int i3, boolean z) {
        if (this.o == null && i != 0) {
            throw new IllegalStateException("No host");
        }
        if (z || this.n != i) {
            this.n = i;
            if (this.f != null) {
                int i4 = 0;
                boolean z2 = false;
                while (i4 < this.f.size()) {
                    Fragment fragment = this.f.get(i4);
                    if (fragment != null) {
                        a(fragment, i, i2, i3, false);
                        if (fragment.V != null) {
                            z2 |= fragment.V.b();
                        }
                    }
                    i4++;
                    z2 = z2;
                }
                if (!z2) {
                    i();
                }
                if (this.s && this.o != null && this.n == 5) {
                    this.o.d();
                    this.s = false;
                }
            }
        }
    }

    final void i() {
        if (this.f != null) {
            for (int i = 0; i < this.f.size(); i++) {
                Fragment fragment = this.f.get(i);
                if (fragment != null && fragment.T) {
                    if (this.e) {
                        this.w = true;
                    } else {
                        fragment.T = false;
                        a(fragment, this.n, 0, 0, false);
                    }
                }
            }
        }
    }

    final void a(Fragment fragment) {
        if (fragment.p < 0) {
            if (this.h == null || this.h.size() <= 0) {
                if (this.f == null) {
                    this.f = new ArrayList<>();
                }
                fragment.a(this.f.size(), this.q);
                this.f.add(fragment);
            } else {
                fragment.a(this.h.remove(this.h.size() - 1).intValue(), this.q);
                this.f.set(fragment.p, fragment);
            }
            if (f164a) {
                Log.v("FragmentManager", "Allocated fragment index " + fragment);
            }
        }
    }

    public final void a(Fragment fragment, boolean z) {
        if (this.g == null) {
            this.g = new ArrayList<>();
        }
        if (f164a) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        a(fragment);
        if (!fragment.J) {
            if (this.g.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            this.g.add(fragment);
            fragment.v = true;
            fragment.w = false;
            if (fragment.M && fragment.N) {
                this.s = true;
            }
            if (z) {
                b(fragment);
            }
        }
    }

    public final void a(Fragment fragment, int i, int i2) {
        if (f164a) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.A);
        }
        boolean z = !(fragment.A > 0);
        if (!fragment.J || z) {
            if (this.g != null) {
                this.g.remove(fragment);
            }
            if (fragment.M && fragment.N) {
                this.s = true;
            }
            fragment.v = false;
            fragment.w = true;
            a(fragment, z ? 0 : 1, i, i2, false);
        }
    }

    public final void b(Fragment fragment, int i, int i2) {
        if (f164a) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.I) {
            fragment.I = true;
            if (fragment.R != null) {
                Animation a2 = a(fragment, i, false, i2);
                if (a2 != null) {
                    b(fragment.R, a2);
                    fragment.R.startAnimation(a2);
                }
                fragment.R.setVisibility(8);
            }
            if (fragment.v && fragment.M && fragment.N) {
                this.s = true;
            }
            fragment.c(true);
        }
    }

    public final void c(Fragment fragment, int i, int i2) {
        if (f164a) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.I) {
            fragment.I = false;
            if (fragment.R != null) {
                Animation a2 = a(fragment, i, true, i2);
                if (a2 != null) {
                    b(fragment.R, a2);
                    fragment.R.startAnimation(a2);
                }
                fragment.R.setVisibility(0);
            }
            if (fragment.v && fragment.M && fragment.N) {
                this.s = true;
            }
            fragment.c(false);
        }
    }

    public final void d(Fragment fragment, int i, int i2) {
        if (f164a) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.J) {
            fragment.J = true;
            if (fragment.v) {
                if (this.g != null) {
                    if (f164a) {
                        Log.v("FragmentManager", "remove from detach: " + fragment);
                    }
                    this.g.remove(fragment);
                }
                if (fragment.M && fragment.N) {
                    this.s = true;
                }
                fragment.v = false;
                a(fragment, 1, i, i2, false);
            }
        }
    }

    public final void e(Fragment fragment, int i, int i2) {
        if (f164a) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.J) {
            fragment.J = false;
            if (!fragment.v) {
                if (this.g == null) {
                    this.g = new ArrayList<>();
                }
                if (this.g.contains(fragment)) {
                    throw new IllegalStateException("Fragment already added: " + fragment);
                }
                if (f164a) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                this.g.add(fragment);
                fragment.v = true;
                if (fragment.M && fragment.N) {
                    this.s = true;
                }
                a(fragment, this.n, i, i2, false);
            }
        }
    }

    @Override // android.support.v4.app.aa
    public final Fragment a(int i) {
        if (this.g != null) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                Fragment fragment = this.g.get(size);
                if (fragment != null && fragment.F == i) {
                    return fragment;
                }
            }
        }
        if (this.f != null) {
            for (int size2 = this.f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = this.f.get(size2);
                if (fragment2 != null && fragment2.F == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    @Override // android.support.v4.app.aa
    public final Fragment a(String str) {
        if (this.g != null && str != null) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                Fragment fragment = this.g.get(size);
                if (fragment != null && str.equals(fragment.H)) {
                    return fragment;
                }
            }
        }
        if (this.f != null && str != null) {
            for (int size2 = this.f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = this.f.get(size2);
                if (fragment2 != null && str.equals(fragment2.H)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private void t() {
        if (this.t) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.v != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.v);
        }
    }

    public final void a(Runnable runnable, boolean z) {
        if (!z) {
            t();
        }
        synchronized (this) {
            if (this.u || this.o == null) {
                throw new IllegalStateException("Activity has been destroyed");
            }
            if (this.c == null) {
                this.c = new ArrayList<>();
            }
            this.c.add(runnable);
            if (this.c.size() == 1) {
                this.o.d.removeCallbacks(this.z);
                this.o.d.post(this.z);
            }
        }
    }

    public final int a(i iVar) {
        int size;
        synchronized (this) {
            if (this.l == null || this.l.size() <= 0) {
                if (this.k == null) {
                    this.k = new ArrayList<>();
                }
                size = this.k.size();
                if (f164a) {
                    Log.v("FragmentManager", "Setting back stack index " + size + " to " + iVar);
                }
                this.k.add(iVar);
            } else {
                size = this.l.remove(this.l.size() - 1).intValue();
                if (f164a) {
                    Log.v("FragmentManager", "Adding back stack index " + size + " with " + iVar);
                }
                this.k.set(size, iVar);
            }
        }
        return size;
    }

    private void a(int i, i iVar) {
        synchronized (this) {
            if (this.k == null) {
                this.k = new ArrayList<>();
            }
            int size = this.k.size();
            if (i < size) {
                if (f164a) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + iVar);
                }
                this.k.set(i, iVar);
            } else {
                while (size < i) {
                    this.k.add(null);
                    if (this.l == null) {
                        this.l = new ArrayList<>();
                    }
                    if (f164a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.l.add(Integer.valueOf(size));
                    size++;
                }
                if (f164a) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + iVar);
                }
                this.k.add(iVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        r6.e = true;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        if (r1 >= r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        r6.d[r1].run();
        r6.d[r1] = null;
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j() {
        /*
            r6 = this;
            r0 = 1
            r2 = 0
            boolean r1 = r6.e
            if (r1 == 0) goto Le
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Recursive entry to executePendingTransactions"
            r0.<init>(r1)
            throw r0
        Le:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.support.v4.app.z r3 = r6.o
            android.os.Handler r3 = r3.d
            android.os.Looper r3 = r3.getLooper()
            if (r1 == r3) goto L24
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Must be called from main thread of process"
            r0.<init>(r1)
            throw r0
        L24:
            r1 = r2
        L25:
            monitor-enter(r6)
            java.util.ArrayList<java.lang.Runnable> r3 = r6.c     // Catch: java.lang.Throwable -> L97
            if (r3 == 0) goto L32
            java.util.ArrayList<java.lang.Runnable> r3 = r6.c     // Catch: java.lang.Throwable -> L97
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L97
            if (r3 != 0) goto L5a
        L32:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L97
            boolean r0 = r6.w
            if (r0 == 0) goto La5
            r3 = r2
            r4 = r2
        L39:
            java.util.ArrayList<android.support.v4.app.Fragment> r0 = r6.f
            int r0 = r0.size()
            if (r3 >= r0) goto L9e
            java.util.ArrayList<android.support.v4.app.Fragment> r0 = r6.f
            java.lang.Object r0 = r0.get(r3)
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
            if (r0 == 0) goto L56
            android.support.v4.app.az r5 = r0.V
            if (r5 == 0) goto L56
            android.support.v4.app.az r0 = r0.V
            boolean r0 = r0.b()
            r4 = r4 | r0
        L56:
            int r0 = r3 + 1
            r3 = r0
            goto L39
        L5a:
            java.util.ArrayList<java.lang.Runnable> r1 = r6.c     // Catch: java.lang.Throwable -> L97
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L97
            java.lang.Runnable[] r1 = r6.d     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L69
            java.lang.Runnable[] r1 = r6.d     // Catch: java.lang.Throwable -> L97
            int r1 = r1.length     // Catch: java.lang.Throwable -> L97
            if (r1 >= r3) goto L6d
        L69:
            java.lang.Runnable[] r1 = new java.lang.Runnable[r3]     // Catch: java.lang.Throwable -> L97
            r6.d = r1     // Catch: java.lang.Throwable -> L97
        L6d:
            java.util.ArrayList<java.lang.Runnable> r1 = r6.c     // Catch: java.lang.Throwable -> L97
            java.lang.Runnable[] r4 = r6.d     // Catch: java.lang.Throwable -> L97
            r1.toArray(r4)     // Catch: java.lang.Throwable -> L97
            java.util.ArrayList<java.lang.Runnable> r1 = r6.c     // Catch: java.lang.Throwable -> L97
            r1.clear()     // Catch: java.lang.Throwable -> L97
            android.support.v4.app.z r1 = r6.o     // Catch: java.lang.Throwable -> L97
            android.os.Handler r1 = r1.d     // Catch: java.lang.Throwable -> L97
            java.lang.Runnable r4 = r6.z     // Catch: java.lang.Throwable -> L97
            r1.removeCallbacks(r4)     // Catch: java.lang.Throwable -> L97
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L97
            r6.e = r0
            r1 = r2
        L86:
            if (r1 >= r3) goto L9a
            java.lang.Runnable[] r4 = r6.d
            r4 = r4[r1]
            r4.run()
            java.lang.Runnable[] r4 = r6.d
            r5 = 0
            r4[r1] = r5
            int r1 = r1 + 1
            goto L86
        L97:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L97
            throw r0
        L9a:
            r6.e = r2
            r1 = r0
            goto L25
        L9e:
            if (r4 != 0) goto La5
            r6.w = r2
            r6.i()
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.ad.j():boolean");
    }

    final void k() {
        if (this.m != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.m.size()) {
                    this.m.get(i2).a();
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    final boolean a(String str, int i, int i2) {
        if (this.i == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = this.i.size() - 1;
            if (size < 0) {
                return false;
            }
            i remove = this.i.remove(size);
            SparseArray<Fragment> sparseArray = new SparseArray<>();
            SparseArray<Fragment> sparseArray2 = new SparseArray<>();
            remove.a(sparseArray, sparseArray2);
            remove.a(true, (n) null, sparseArray, sparseArray2);
        } else {
            int i3 = -1;
            if (str != null || i >= 0) {
                int size2 = this.i.size() - 1;
                while (size2 >= 0) {
                    i iVar = this.i.get(size2);
                    if ((str != null && str.equals(iVar.n)) || (i >= 0 && i == iVar.p)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    size2--;
                    while (size2 >= 0) {
                        i iVar2 = this.i.get(size2);
                        if ((str == null || !str.equals(iVar2.n)) && (i < 0 || i != iVar2.p)) {
                            break;
                        }
                        size2--;
                    }
                }
                i3 = size2;
            }
            if (i3 == this.i.size() - 1) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int size3 = this.i.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.i.remove(size3));
            }
            int size4 = arrayList.size() - 1;
            SparseArray<Fragment> sparseArray3 = new SparseArray<>();
            SparseArray<Fragment> sparseArray4 = new SparseArray<>();
            for (int i4 = 0; i4 <= size4; i4++) {
                ((i) arrayList.get(i4)).a(sparseArray3, sparseArray4);
            }
            n nVar = null;
            int i5 = 0;
            while (i5 <= size4) {
                if (f164a) {
                    Log.v("FragmentManager", "Popping back stack state: " + arrayList.get(i5));
                }
                i5++;
                nVar = ((i) arrayList.get(i5)).a(i5 == size4, nVar, sparseArray3, sparseArray4);
            }
        }
        k();
        return true;
    }

    private void c(Fragment fragment) {
        if (fragment.S != null) {
            if (this.y == null) {
                this.y = new SparseArray<>();
            } else {
                this.y.clear();
            }
            fragment.S.saveHierarchyState(this.y);
            if (this.y.size() > 0) {
                fragment.o = this.y;
                this.y = null;
            }
        }
    }

    final Parcelable l() {
        int[] iArr;
        int size;
        int size2;
        boolean z;
        Bundle bundle;
        BackStackState[] backStackStateArr = null;
        j();
        if (f165b) {
            this.t = true;
        }
        if (this.f == null || this.f.size() <= 0) {
            return null;
        }
        int size3 = this.f.size();
        FragmentState[] fragmentStateArr = new FragmentState[size3];
        int i = 0;
        boolean z2 = false;
        while (i < size3) {
            Fragment fragment = this.f.get(i);
            if (fragment != null) {
                if (fragment.p < 0) {
                    a(new IllegalStateException("Failure saving state: active " + fragment + " has cleared index: " + fragment.p));
                }
                FragmentState fragmentState = new FragmentState(fragment);
                fragmentStateArr[i] = fragmentState;
                if (fragment.k <= 0 || fragmentState.j != null) {
                    fragmentState.j = fragment.n;
                } else {
                    if (this.x == null) {
                        this.x = new Bundle();
                    }
                    fragment.h(this.x);
                    if (this.x.isEmpty()) {
                        bundle = null;
                    } else {
                        bundle = this.x;
                        this.x = null;
                    }
                    if (fragment.R != null) {
                        c(fragment);
                    }
                    if (fragment.o != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putSparseParcelableArray("android:view_state", fragment.o);
                    }
                    if (!fragment.U) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBoolean("android:user_visible_hint", fragment.U);
                    }
                    fragmentState.j = bundle;
                    if (fragment.s != null) {
                        if (fragment.s.p < 0) {
                            a(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.s));
                        }
                        if (fragmentState.j == null) {
                            fragmentState.j = new Bundle();
                        }
                        a(fragmentState.j, "android:target_state", fragment.s);
                        if (fragment.u != 0) {
                            fragmentState.j.putInt("android:target_req_state", fragment.u);
                        }
                    }
                }
                if (f164a) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragmentState.j);
                }
                z = true;
            } else {
                z = z2;
            }
            i++;
            z2 = z;
        }
        if (!z2) {
            if (!f164a) {
                return null;
            }
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
        }
        if (this.g == null || (size2 = this.g.size()) <= 0) {
            iArr = null;
        } else {
            iArr = new int[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                iArr[i2] = this.g.get(i2).p;
                if (iArr[i2] < 0) {
                    a(new IllegalStateException("Failure saving state: active " + this.g.get(i2) + " has cleared index: " + iArr[i2]));
                }
                if (f164a) {
                    Log.v("FragmentManager", "saveAllState: adding fragment #" + i2 + ": " + this.g.get(i2));
                }
            }
        }
        if (this.i != null && (size = this.i.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i3 = 0; i3 < size; i3++) {
                backStackStateArr[i3] = new BackStackState(this.i.get(i3));
                if (f164a) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.i.get(i3));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f160a = fragmentStateArr;
        fragmentManagerState.f161b = iArr;
        fragmentManagerState.c = backStackStateArr;
        return fragmentManagerState;
    }

    final void a(Parcelable parcelable, List<Fragment> list) {
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f160a != null) {
                if (list != null) {
                    for (int i = 0; i < list.size(); i++) {
                        Fragment fragment = list.get(i);
                        if (f164a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + fragment);
                        }
                        FragmentState fragmentState = fragmentManagerState.f160a[fragment.p];
                        fragmentState.k = fragment;
                        fragment.o = null;
                        fragment.A = 0;
                        fragment.y = false;
                        fragment.v = false;
                        fragment.s = null;
                        if (fragmentState.j != null) {
                            fragmentState.j.setClassLoader(this.o.c.getClassLoader());
                            fragment.o = fragmentState.j.getSparseParcelableArray("android:view_state");
                            fragment.n = fragmentState.j;
                        }
                    }
                }
                this.f = new ArrayList<>(fragmentManagerState.f160a.length);
                if (this.h != null) {
                    this.h.clear();
                }
                for (int i2 = 0; i2 < fragmentManagerState.f160a.length; i2++) {
                    FragmentState fragmentState2 = fragmentManagerState.f160a[i2];
                    if (fragmentState2 != null) {
                        z zVar = this.o;
                        Fragment fragment2 = this.q;
                        if (fragmentState2.k == null) {
                            Context context = zVar.c;
                            if (fragmentState2.i != null) {
                                fragmentState2.i.setClassLoader(context.getClassLoader());
                            }
                            fragmentState2.k = Fragment.a(context, fragmentState2.f162a, fragmentState2.i);
                            if (fragmentState2.j != null) {
                                fragmentState2.j.setClassLoader(context.getClassLoader());
                                fragmentState2.k.n = fragmentState2.j;
                            }
                            fragmentState2.k.a(fragmentState2.f163b, fragment2);
                            fragmentState2.k.x = fragmentState2.c;
                            fragmentState2.k.z = true;
                            fragmentState2.k.F = fragmentState2.d;
                            fragmentState2.k.G = fragmentState2.e;
                            fragmentState2.k.H = fragmentState2.f;
                            fragmentState2.k.K = fragmentState2.g;
                            fragmentState2.k.J = fragmentState2.h;
                            fragmentState2.k.B = zVar.f;
                            if (f164a) {
                                Log.v("FragmentManager", "Instantiated fragment " + fragmentState2.k);
                            }
                        }
                        Fragment fragment3 = fragmentState2.k;
                        if (f164a) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i2 + ": " + fragment3);
                        }
                        this.f.add(fragment3);
                        fragmentState2.k = null;
                    } else {
                        this.f.add(null);
                        if (this.h == null) {
                            this.h = new ArrayList<>();
                        }
                        if (f164a) {
                            Log.v("FragmentManager", "restoreAllState: avail #" + i2);
                        }
                        this.h.add(Integer.valueOf(i2));
                    }
                }
                if (list != null) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        Fragment fragment4 = list.get(i3);
                        if (fragment4.t >= 0) {
                            if (fragment4.t < this.f.size()) {
                                fragment4.s = this.f.get(fragment4.t);
                            } else {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + fragment4 + " target no longer exists: " + fragment4.t);
                                fragment4.s = null;
                            }
                        }
                    }
                }
                if (fragmentManagerState.f161b != null) {
                    this.g = new ArrayList<>(fragmentManagerState.f161b.length);
                    for (int i4 = 0; i4 < fragmentManagerState.f161b.length; i4++) {
                        Fragment fragment5 = this.f.get(fragmentManagerState.f161b[i4]);
                        if (fragment5 == null) {
                            a(new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.f161b[i4]));
                        }
                        fragment5.v = true;
                        if (f164a) {
                            Log.v("FragmentManager", "restoreAllState: added #" + i4 + ": " + fragment5);
                        }
                        if (this.g.contains(fragment5)) {
                            throw new IllegalStateException("Already added!");
                        }
                        this.g.add(fragment5);
                    }
                } else {
                    this.g = null;
                }
                if (fragmentManagerState.c != null) {
                    this.i = new ArrayList<>(fragmentManagerState.c.length);
                    for (int i5 = 0; i5 < fragmentManagerState.c.length; i5++) {
                        i a2 = fragmentManagerState.c[i5].a(this);
                        if (f164a) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i5 + " (index " + a2.p + "): " + a2);
                            a2.a("  ", new PrintWriter(new android.support.v4.h.e("FragmentManager")), false);
                        }
                        this.i.add(a2);
                        if (a2.p >= 0) {
                            a(a2.p, a2);
                        }
                    }
                    return;
                }
                this.i = null;
            }
        }
    }

    public final void a(z zVar, x xVar, Fragment fragment) {
        if (this.o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.o = zVar;
        this.p = xVar;
        this.q = fragment;
    }

    public final void m() {
        this.t = false;
        c(1);
    }

    public final void n() {
        this.t = false;
        c(2);
    }

    public final void o() {
        this.t = false;
        c(4);
    }

    public final void p() {
        this.t = false;
        c(5);
    }

    public final void q() {
        this.t = true;
        c(3);
    }

    public final void r() {
        this.u = true;
        j();
        c(0);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public final void a(Configuration configuration) {
        if (this.g != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.g.size()) {
                    Fragment fragment = this.g.get(i2);
                    if (fragment != null) {
                        fragment.onConfigurationChanged(configuration);
                        if (fragment.D != null) {
                            fragment.D.a(configuration);
                        }
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void s() {
        if (this.g != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.g.size()) {
                    Fragment fragment = this.g.get(i2);
                    if (fragment != null) {
                        fragment.onLowMemory();
                        if (fragment.D != null) {
                            fragment.D.s();
                        }
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean a(Menu menu, MenuInflater menuInflater) {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList<Fragment> arrayList = null;
        if (this.g != null) {
            int i = 0;
            z = false;
            while (i < this.g.size()) {
                Fragment fragment = this.g.get(i);
                if (fragment != null) {
                    if (fragment.I) {
                        z3 = false;
                    } else {
                        if (fragment.M && fragment.N) {
                            fragment.a(menu, menuInflater);
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (fragment.D != null) {
                            z3 |= fragment.D.a(menu, menuInflater);
                        }
                    }
                    if (z3) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        arrayList.add(fragment);
                        z2 = true;
                        i++;
                        z = z2;
                    }
                }
                z2 = z;
                i++;
                z = z2;
            }
        } else {
            z = false;
        }
        if (this.j != null) {
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                Fragment fragment2 = this.j.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    Fragment.r();
                }
            }
        }
        this.j = arrayList;
        return z;
    }

    public final boolean a(Menu menu) {
        boolean z;
        if (this.g == null) {
            return false;
        }
        boolean z2 = false;
        for (int i = 0; i < this.g.size(); i++) {
            Fragment fragment = this.g.get(i);
            if (fragment != null) {
                if (fragment.I) {
                    z = false;
                } else {
                    z = fragment.M && fragment.N;
                    if (fragment.D != null) {
                        z |= fragment.D.a(menu);
                    }
                }
                if (z) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.view.MenuItem r6) {
        /*
            r5 = this;
            r3 = 1
            r2 = 0
            java.util.ArrayList<android.support.v4.app.Fragment> r0 = r5.g
            if (r0 == 0) goto L2f
            r1 = r2
        L7:
            java.util.ArrayList<android.support.v4.app.Fragment> r0 = r5.g
            int r0 = r0.size()
            if (r1 >= r0) goto L2f
            java.util.ArrayList<android.support.v4.app.Fragment> r0 = r5.g
            java.lang.Object r0 = r0.get(r1)
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
            if (r0 == 0) goto L40
            boolean r4 = r0.I
            if (r4 != 0) goto L3e
            boolean r4 = r0.M
            if (r4 == 0) goto L30
            boolean r4 = r0.N
            if (r4 == 0) goto L30
            boolean r4 = r0.a(r6)
            if (r4 == 0) goto L30
            r0 = r3
        L2c:
            if (r0 == 0) goto L40
            r2 = r3
        L2f:
            return r2
        L30:
            android.support.v4.app.ad r4 = r0.D
            if (r4 == 0) goto L3e
            android.support.v4.app.ad r0 = r0.D
            boolean r0 = r0.a(r6)
            if (r0 == 0) goto L3e
            r0 = r3
            goto L2c
        L3e:
            r0 = r2
            goto L2c
        L40:
            int r0 = r1 + 1
            r1 = r0
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.ad.a(android.view.MenuItem):boolean");
    }

    public final boolean b(MenuItem menuItem) {
        if (this.g == null) {
            return false;
        }
        for (int i = 0; i < this.g.size(); i++) {
            Fragment fragment = this.g.get(i);
            if (fragment != null) {
                if ((fragment.I || fragment.D == null || !fragment.D.b(menuItem)) ? false : true) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(Menu menu) {
        if (this.g != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.g.size()) {
                    Fragment fragment = this.g.get(i2);
                    if (fragment != null && !fragment.I && fragment.D != null) {
                        fragment.D.b(menu);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public static int d(int i) {
        switch (i) {
            case 4097:
                return 8194;
            case 4099:
                return 4099;
            case 8194:
                return 4097;
            default:
                return 0;
        }
    }

    @Override // android.support.v4.view.an
    public final View a(View view, String str, Context context, AttributeSet attributeSet) {
        Fragment fragment;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, am.f178a);
        String string = attributeValue == null ? obtainStyledAttributes.getString(0) : attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string2 = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!Fragment.b(this.o.c, string)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string2 == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + string);
        }
        Fragment a2 = resourceId != -1 ? a(resourceId) : null;
        if (a2 == null && string2 != null) {
            a2 = a(string2);
        }
        if (a2 == null && id != -1) {
            a2 = a(id);
        }
        if (f164a) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + string + " existing=" + a2);
        }
        if (a2 == null) {
            Fragment a3 = Fragment.a(context, string);
            a3.x = true;
            a3.F = resourceId != 0 ? resourceId : id;
            a3.G = id;
            a3.H = string2;
            a3.y = true;
            a3.B = this;
            a3.C = this.o;
            Bundle bundle = a3.n;
            a3.m();
            a(a3, true);
            fragment = a3;
        } else {
            if (a2.y) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + string);
            }
            a2.y = true;
            a2.C = this.o;
            if (!a2.L) {
                Bundle bundle2 = a2.n;
                a2.m();
            }
            fragment = a2;
        }
        if (this.n <= 0 && fragment.x) {
            a(fragment, 1, 0, 0, false);
        } else {
            b(fragment);
        }
        if (fragment.R == null) {
            throw new IllegalStateException("Fragment " + string + " did not create a view.");
        }
        if (resourceId != 0) {
            fragment.R.setId(resourceId);
        }
        if (fragment.R.getTag() == null) {
            fragment.R.setTag(string2);
        }
        return fragment.R;
    }
}
