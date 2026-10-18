package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener {

    /* renamed from: a, reason: collision with root package name */
    private static final android.support.v4.h.r<String, Class<?>> f159a = new android.support.v4.h.r<>();
    static final Object j = new Object();
    int A;
    public ad B;
    public z C;
    ad D;
    public Fragment E;
    public int F;
    int G;
    public String H;
    public boolean I;
    boolean J;
    boolean K;
    boolean L;
    public boolean M;
    boolean O;
    int P;
    ViewGroup Q;
    public View R2;
    View S;
    boolean T;
    az V;
    boolean W;
    boolean X;
    Boolean ae;
    Boolean af;
    View l;
    int m;
    Bundle n;
    SparseArray<Parcelable> o;
    String q;
    public Bundle r;
    public Fragment s;
    int u;
    boolean v;
    public boolean w;
    boolean x;
    boolean y;
    boolean z;
    int k = 0;
    int p = -1;
    int t = -1;
    boolean N = true;
    boolean U = true;
    public Object Y = null;
    Object Z = j;
    public Object aa = null;
    Object ab = j;
    public Object ac = null;
    Object ad = j;
    public cy ag = null;
    public cy ah = null;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static Fragment a(Context context, String str) {
        return a(context, str, (Bundle) null);
    }

    public static Fragment a(Context context, String str, Bundle bundle) {
        try {
            Class<?> cls = f159a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f159a.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.r = bundle;
            }
            return fragment;
        } catch (ClassNotFoundException e) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (java.lang.InstantiationException e3) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        }
    }

    static boolean b(Context context, String str) {
        try {
            Class<?> cls = f159a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f159a.put(str, cls);
            }
            return Fragment.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    final void a(int i, Fragment fragment) {
        this.p = i;
        if (fragment != null) {
            this.q = fragment.q + ":" + this.p;
        } else {
            this.q = "android:fragment:" + this.p;
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        android.support.v4.h.d.a(this, sb);
        if (this.p >= 0) {
            sb.append(" #");
            sb.append(this.p);
        }
        if (this.F != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.F));
        }
        if (this.H != null) {
            sb.append(" ");
            sb.append(this.H);
        }
        sb.append('}');
        return sb.toString();
    }

    public final void f(Bundle bundle) {
        if (this.p >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        this.r = bundle;
    }

    public final void a(Fragment fragment, int i) {
        this.s = fragment;
        this.u = i;
    }

    public final Context e() {
        if (this.C == null) {
            return null;
        }
        return this.C.c;
    }

    public final t f() {
        if (this.C == null) {
            return null;
        }
        return (t) this.C.f241b;
    }

    public final Resources g() {
        if (this.C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        return this.C.c.getResources();
    }

    public final String f_(int i) {
        return g().getString(i);
    }

    public final String a(int i, Object... objArr) {
        return g().getString(i, objArr);
    }

    public final aa h() {
        if (this.D == null) {
            s();
            if (this.k >= 5) {
                this.D.p();
            } else if (this.k >= 4) {
                this.D.o();
            } else if (this.k >= 2) {
                this.D.n();
            } else if (this.k > 0) {
                this.D.m();
            }
        }
        return this.D;
    }

    public final boolean q_() {
        return this.C != null && this.v;
    }

    public final boolean j() {
        return this.k >= 5;
    }

    public void c(boolean z) {
    }

    public final void k() {
        if (this.E != null) {
            throw new IllegalStateException("Can't retain fragements that are nested in other fragments");
        }
        this.K = true;
    }

    public final void d(boolean z) {
        if (this.N != z) {
            this.N = z;
            if (this.M && q_() && !this.I) {
                this.C.d();
            }
        }
    }

    public final ax l() {
        if (this.V != null) {
            return this.V;
        }
        if (this.C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.X = true;
        this.V = this.C.a(this.q, this.W, true);
        return this.V;
    }

    public void a(int i, int i2, Intent intent) {
    }

    public final void a_(String[] strArr) {
        if (this.C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.C.a(this, strArr);
    }

    public void a(int[] iArr) {
    }

    public LayoutInflater b(Bundle bundle) {
        LayoutInflater c = this.C.c();
        h();
        android.support.v4.view.ae.a(c, this.D);
        return c;
    }

    public final void m() {
        this.O = true;
        if ((this.C == null ? null : this.C.f241b) != null) {
            this.O = false;
            this.O = true;
        }
    }

    public void a(Context context) {
        this.O = true;
        Activity activity = this.C == null ? null : this.C.f241b;
        if (activity != null) {
            this.O = false;
            a(activity);
        }
    }

    @Deprecated
    public void a(Activity activity) {
        this.O = true;
    }

    public static Animation n() {
        return null;
    }

    public void a(Bundle bundle) {
        this.O = true;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void a(View view, Bundle bundle) {
    }

    public void d(Bundle bundle) {
        this.O = true;
    }

    public void g(Bundle bundle) {
        this.O = true;
    }

    public void g_() {
        this.O = true;
        if (!this.W) {
            this.W = true;
            if (!this.X) {
                this.X = true;
                this.V = this.C.a(this.q, this.W, false);
            }
            if (this.V != null) {
                this.V.c();
            }
        }
    }

    public void o() {
        this.O = true;
    }

    public void e(Bundle bundle) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.O = true;
    }

    public void p() {
        this.O = true;
    }

    public void h_() {
        this.O = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.O = true;
    }

    public void d() {
        this.O = true;
    }

    public void q() {
        this.O = true;
        if (!this.X) {
            this.X = true;
            this.V = this.C.a(this.q, this.W, false);
        }
        if (this.V != null) {
            this.V.h();
        }
    }

    public void E_() {
        this.O = true;
    }

    public void a(Menu menu, MenuInflater menuInflater) {
    }

    public static void r() {
    }

    public boolean a(MenuItem menuItem) {
        return false;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        f().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.F));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.G));
        printWriter.print(" mTag=");
        printWriter.println(this.H);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.k);
        printWriter.print(" mIndex=");
        printWriter.print(this.p);
        printWriter.print(" mWho=");
        printWriter.print(this.q);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.A);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.v);
        printWriter.print(" mRemoving=");
        printWriter.print(this.w);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.x);
        printWriter.print(" mInLayout=");
        printWriter.println(this.y);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.I);
        printWriter.print(" mDetached=");
        printWriter.print(this.J);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.N);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.M);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.K);
        printWriter.print(" mRetaining=");
        printWriter.print(this.L);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.U);
        if (this.B != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.B);
        }
        if (this.C != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.C);
        }
        if (this.E != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.E);
        }
        if (this.r != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.r);
        }
        if (this.n != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.n);
        }
        if (this.o != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.o);
        }
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.s);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.u);
        }
        if (this.P != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(this.P);
        }
        if (this.Q != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.Q);
        }
        if (this.R2 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.R2);
        }
        if (this.S != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.R2);
        }
        if (this.l != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.l);
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.m);
        }
        if (this.V != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.V.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.D != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.D + ":");
            this.D.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    final void s() {
        this.D = new ad();
        this.D.a(this.C, new s(this), this);
    }

    final View b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.D != null) {
            this.D.t = false;
        }
        return a(layoutInflater, viewGroup, bundle);
    }

    final void h(Bundle bundle) {
        Parcelable l;
        e(bundle);
        if (this.D != null && (l = this.D.l()) != null) {
            bundle.putParcelable("android:support:fragments", l);
        }
    }

    final void t() {
        if (this.D != null) {
            this.D.c(2);
        }
        this.k = 2;
        if (this.W) {
            this.W = false;
            if (!this.X) {
                this.X = true;
                this.V = this.C.a(this.q, this.W, false);
            }
            if (this.V != null) {
                if (this.C.h) {
                    this.V.e();
                } else {
                    this.V.d();
                }
            }
        }
    }

    public final void a(Intent intent) {
        if (this.C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.C.a(this, intent, -1);
    }

    public final void a(Intent intent, int i) {
        if (this.C == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.C.a(this, intent, i);
    }
}
