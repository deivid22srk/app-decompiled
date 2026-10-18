package android.support.v4.app;

import android.os.Build;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
final class i extends ap implements ab, Runnable {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f219a;

    /* renamed from: b, reason: collision with root package name */
    final ad f220b;
    m c;
    m d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    int k;
    boolean l;
    String n;
    boolean o;
    int q;
    CharSequence r;
    int s;
    CharSequence t;
    ArrayList<String> u;
    ArrayList<String> v;
    boolean m = true;
    int p = -1;

    static {
        f219a = Build.VERSION.SDK_INT >= 21;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.p >= 0) {
            sb.append(" #");
            sb.append(this.p);
        }
        if (this.n != null) {
            sb.append(" ");
            sb.append(this.n);
        }
        sb.append("}");
        return sb.toString();
    }

    public final void a(String str, PrintWriter printWriter) {
        a(str, printWriter, true);
    }

    public final void a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.n);
            printWriter.print(" mIndex=");
            printWriter.print(this.p);
            printWriter.print(" mCommitted=");
            printWriter.println(this.o);
            if (this.j != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.k));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.h != 0 || this.i != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.h));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.i));
            }
            if (this.q != 0 || this.r != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.q));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.r);
            }
            if (this.s != 0 || this.t != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.s));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.t);
            }
        }
        if (this.c != null) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str3 = str + "    ";
            int i = 0;
            m mVar = this.c;
            while (mVar != null) {
                switch (mVar.c) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    default:
                        str2 = "cmd=" + mVar.c;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(mVar.d);
                if (z) {
                    if (mVar.e != 0 || mVar.f != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(mVar.e));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(mVar.f));
                    }
                    if (mVar.g != 0 || mVar.h != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(mVar.g));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(mVar.h));
                    }
                }
                if (mVar.i != null && mVar.i.size() > 0) {
                    for (int i2 = 0; i2 < mVar.i.size(); i2++) {
                        printWriter.print(str3);
                        if (mVar.i.size() == 1) {
                            printWriter.print("Removed: ");
                        } else {
                            if (i2 == 0) {
                                printWriter.println("Removed:");
                            }
                            printWriter.print(str3);
                            printWriter.print("  #");
                            printWriter.print(i2);
                            printWriter.print(": ");
                        }
                        printWriter.println(mVar.i.get(i2));
                    }
                }
                mVar = mVar.f227a;
                i++;
            }
        }
    }

    public i(ad adVar) {
        this.f220b = adVar;
    }

    final void a(m mVar) {
        if (this.c == null) {
            this.d = mVar;
            this.c = mVar;
        } else {
            mVar.f228b = this.d;
            this.d.f227a = mVar;
            this.d = mVar;
        }
        mVar.e = this.f;
        mVar.f = this.g;
        mVar.g = this.h;
        mVar.h = this.i;
        this.e++;
    }

    @Override // android.support.v4.app.ap
    public final ap a(Fragment fragment, String str) {
        a(0, fragment, str, 1);
        return this;
    }

    @Override // android.support.v4.app.ap
    public final ap a(int i, Fragment fragment) {
        a(i, fragment, (String) null, 1);
        return this;
    }

    @Override // android.support.v4.app.ap
    public final ap a(int i, Fragment fragment, String str) {
        a(i, fragment, str, 1);
        return this;
    }

    private void a(int i, Fragment fragment, String str, int i2) {
        fragment.B = this.f220b;
        if (str != null) {
            if (fragment.H != null && !str.equals(fragment.H)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.H + " now " + str);
            }
            fragment.H = str;
        }
        if (i != 0) {
            if (fragment.F != 0 && fragment.F != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.F + " now " + i);
            }
            fragment.F = i;
            fragment.G = i;
        }
        m mVar = new m();
        mVar.c = i2;
        mVar.d = fragment;
        a(mVar);
    }

    @Override // android.support.v4.app.ap
    public final ap b(int i, Fragment fragment) {
        return b(i, fragment, (String) null);
    }

    @Override // android.support.v4.app.ap
    public final ap b(int i, Fragment fragment, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        a(i, fragment, str, 2);
        return this;
    }

    @Override // android.support.v4.app.ap
    public final ap a(Fragment fragment) {
        m mVar = new m();
        mVar.c = 3;
        mVar.d = fragment;
        a(mVar);
        return this;
    }

    @Override // android.support.v4.app.ap
    public final ap b(Fragment fragment) {
        m mVar = new m();
        mVar.c = 4;
        mVar.d = fragment;
        a(mVar);
        return this;
    }

    @Override // android.support.v4.app.ap
    public final ap c(Fragment fragment) {
        m mVar = new m();
        mVar.c = 5;
        mVar.d = fragment;
        a(mVar);
        return this;
    }

    @Override // android.support.v4.app.ap
    public final ap d(Fragment fragment) {
        m mVar = new m();
        mVar.c = 6;
        mVar.d = fragment;
        a(mVar);
        return this;
    }

    @Override // android.support.v4.app.ap
    public final ap e(Fragment fragment) {
        m mVar = new m();
        mVar.c = 7;
        mVar.d = fragment;
        a(mVar);
        return this;
    }

    @Override // android.support.v4.app.ap
    public final ap a() {
        this.j = 4099;
        return this;
    }

    @Override // android.support.v4.app.ap
    public final ap a(View view, String str) {
        if (f219a) {
            String transitionName = view.getTransitionName();
            if (transitionName == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.u == null) {
                this.u = new ArrayList<>();
                this.v = new ArrayList<>();
            }
            this.u.add(transitionName);
            this.v.add(str);
        }
        return this;
    }

    @Override // android.support.v4.app.ap
    public final ap a(String str) {
        if (!this.m) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.l = true;
        this.n = str;
        return this;
    }

    final void a(int i) {
        if (this.l) {
            if (ad.f164a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            for (m mVar = this.c; mVar != null; mVar = mVar.f227a) {
                if (mVar.d != null) {
                    mVar.d.A += i;
                    if (ad.f164a) {
                        Log.v("FragmentManager", "Bump nesting of " + mVar.d + " to " + mVar.d.A);
                    }
                }
                if (mVar.i != null) {
                    for (int size = mVar.i.size() - 1; size >= 0; size--) {
                        Fragment fragment = mVar.i.get(size);
                        fragment.A += i;
                        if (ad.f164a) {
                            Log.v("FragmentManager", "Bump nesting of " + fragment + " to " + fragment.A);
                        }
                    }
                }
            }
        }
    }

    @Override // android.support.v4.app.ap
    public final int b() {
        return a(false);
    }

    @Override // android.support.v4.app.ap
    public final int c() {
        return a(true);
    }

    private int a(boolean z) {
        if (this.o) {
            throw new IllegalStateException("commit already called");
        }
        if (ad.f164a) {
            Log.v("FragmentManager", "Commit: " + this);
            a("  ", new PrintWriter(new android.support.v4.h.e("FragmentManager")));
        }
        this.o = true;
        if (this.l) {
            this.p = this.f220b.a(this);
        } else {
            this.p = -1;
        }
        this.f220b.a(this, z);
        return this.p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar;
        Fragment fragment;
        if (ad.f164a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        if (this.l && this.p < 0) {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        a(1);
        if (!f219a) {
            nVar = null;
        } else {
            SparseArray<Fragment> sparseArray = new SparseArray<>();
            SparseArray<Fragment> sparseArray2 = new SparseArray<>();
            b(sparseArray, sparseArray2);
            nVar = a(sparseArray, sparseArray2, false);
        }
        int i = nVar != null ? 0 : this.k;
        int i2 = nVar != null ? 0 : this.j;
        for (m mVar = this.c; mVar != null; mVar = mVar.f227a) {
            int i3 = nVar != null ? 0 : mVar.e;
            int i4 = nVar != null ? 0 : mVar.f;
            switch (mVar.c) {
                case 1:
                    Fragment fragment2 = mVar.d;
                    fragment2.P = i3;
                    this.f220b.a(fragment2, false);
                    break;
                case 2:
                    Fragment fragment3 = mVar.d;
                    int i5 = fragment3.G;
                    if (this.f220b.g != null) {
                        int size = this.f220b.g.size() - 1;
                        while (size >= 0) {
                            Fragment fragment4 = this.f220b.g.get(size);
                            if (ad.f164a) {
                                Log.v("FragmentManager", "OP_REPLACE: adding=" + fragment3 + " old=" + fragment4);
                            }
                            if (fragment4.G == i5) {
                                if (fragment4 == fragment3) {
                                    fragment = null;
                                    mVar.d = null;
                                    size--;
                                    fragment3 = fragment;
                                } else {
                                    if (mVar.i == null) {
                                        mVar.i = new ArrayList<>();
                                    }
                                    mVar.i.add(fragment4);
                                    fragment4.P = i4;
                                    if (this.l) {
                                        fragment4.A++;
                                        if (ad.f164a) {
                                            Log.v("FragmentManager", "Bump nesting of " + fragment4 + " to " + fragment4.A);
                                        }
                                    }
                                    this.f220b.a(fragment4, i2, i);
                                }
                            }
                            fragment = fragment3;
                            size--;
                            fragment3 = fragment;
                        }
                    }
                    if (fragment3 != null) {
                        fragment3.P = i3;
                        this.f220b.a(fragment3, false);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    Fragment fragment5 = mVar.d;
                    fragment5.P = i4;
                    this.f220b.a(fragment5, i2, i);
                    break;
                case 4:
                    Fragment fragment6 = mVar.d;
                    fragment6.P = i4;
                    this.f220b.b(fragment6, i2, i);
                    break;
                case 5:
                    Fragment fragment7 = mVar.d;
                    fragment7.P = i3;
                    this.f220b.c(fragment7, i2, i);
                    break;
                case 6:
                    Fragment fragment8 = mVar.d;
                    fragment8.P = i4;
                    this.f220b.d(fragment8, i2, i);
                    break;
                case 7:
                    Fragment fragment9 = mVar.d;
                    fragment9.P = i3;
                    this.f220b.e(fragment9, i2, i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + mVar.c);
            }
        }
        this.f220b.a(this.f220b.n, i2, i, true);
        if (this.l) {
            ad adVar = this.f220b;
            if (adVar.i == null) {
                adVar.i = new ArrayList<>();
            }
            adVar.i.add(this);
            adVar.k();
        }
    }

    private static void a(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2, Fragment fragment) {
        int i;
        if (fragment != null && (i = fragment.G) != 0 && !fragment.I) {
            if (fragment.q_() && fragment.R != null && sparseArray.get(i) == null) {
                sparseArray.put(i, fragment);
            }
            if (sparseArray2.get(i) == fragment) {
                sparseArray2.remove(i);
            }
        }
    }

    private static void b(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2, Fragment fragment) {
        int i;
        if (fragment != null && (i = fragment.G) != 0) {
            if (!fragment.q_()) {
                sparseArray2.put(i, fragment);
            }
            if (sparseArray.get(i) == fragment) {
                sparseArray.remove(i);
            }
        }
    }

    private void b(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2) {
        if (this.f220b.p.a()) {
            for (m mVar = this.c; mVar != null; mVar = mVar.f227a) {
                switch (mVar.c) {
                    case 1:
                        b(sparseArray, sparseArray2, mVar.d);
                        break;
                    case 2:
                        Fragment fragment = mVar.d;
                        if (this.f220b.g != null) {
                            int i = 0;
                            Fragment fragment2 = fragment;
                            while (true) {
                                int i2 = i;
                                if (i2 < this.f220b.g.size()) {
                                    Fragment fragment3 = this.f220b.g.get(i2);
                                    if (fragment2 == null || fragment3.G == fragment2.G) {
                                        if (fragment3 == fragment2) {
                                            fragment2 = null;
                                            sparseArray2.remove(fragment3.G);
                                        } else {
                                            a(sparseArray, sparseArray2, fragment3);
                                        }
                                    }
                                    i = i2 + 1;
                                }
                            }
                        }
                        b(sparseArray, sparseArray2, mVar.d);
                        break;
                    case 3:
                        a(sparseArray, sparseArray2, mVar.d);
                        break;
                    case 4:
                        a(sparseArray, sparseArray2, mVar.d);
                        break;
                    case 5:
                        b(sparseArray, sparseArray2, mVar.d);
                        break;
                    case 6:
                        a(sparseArray, sparseArray2, mVar.d);
                        break;
                    case 7:
                        b(sparseArray, sparseArray2, mVar.d);
                        break;
                }
            }
        }
    }

    public final void a(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2) {
        if (this.f220b.p.a()) {
            for (m mVar = this.d; mVar != null; mVar = mVar.f228b) {
                switch (mVar.c) {
                    case 1:
                        a(sparseArray, sparseArray2, mVar.d);
                        break;
                    case 2:
                        if (mVar.i != null) {
                            for (int size = mVar.i.size() - 1; size >= 0; size--) {
                                b(sparseArray, sparseArray2, mVar.i.get(size));
                            }
                        }
                        a(sparseArray, sparseArray2, mVar.d);
                        break;
                    case 3:
                        b(sparseArray, sparseArray2, mVar.d);
                        break;
                    case 4:
                        b(sparseArray, sparseArray2, mVar.d);
                        break;
                    case 5:
                        a(sparseArray, sparseArray2, mVar.d);
                        break;
                    case 6:
                        b(sparseArray, sparseArray2, mVar.d);
                        break;
                    case 7:
                        a(sparseArray, sparseArray2, mVar.d);
                        break;
                }
            }
        }
    }

    public final n a(boolean z, n nVar, SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2) {
        if (ad.f164a) {
            Log.v("FragmentManager", "popFromBackStack: " + this);
            a("  ", new PrintWriter(new android.support.v4.h.e("FragmentManager")));
        }
        if (f219a) {
            if (nVar == null) {
                if (sparseArray.size() != 0 || sparseArray2.size() != 0) {
                    nVar = a(sparseArray, sparseArray2, true);
                }
            } else if (!z) {
                a(nVar, this.v, this.u);
            }
        }
        a(-1);
        int i = nVar != null ? 0 : this.k;
        int i2 = nVar != null ? 0 : this.j;
        for (m mVar = this.d; mVar != null; mVar = mVar.f228b) {
            int i3 = nVar != null ? 0 : mVar.g;
            int i4 = nVar != null ? 0 : mVar.h;
            switch (mVar.c) {
                case 1:
                    Fragment fragment = mVar.d;
                    fragment.P = i4;
                    this.f220b.a(fragment, ad.d(i2), i);
                    break;
                case 2:
                    Fragment fragment2 = mVar.d;
                    if (fragment2 != null) {
                        fragment2.P = i4;
                        this.f220b.a(fragment2, ad.d(i2), i);
                    }
                    if (mVar.i != null) {
                        for (int i5 = 0; i5 < mVar.i.size(); i5++) {
                            Fragment fragment3 = mVar.i.get(i5);
                            fragment3.P = i3;
                            this.f220b.a(fragment3, false);
                        }
                        break;
                    } else {
                        break;
                    }
                case 3:
                    Fragment fragment4 = mVar.d;
                    fragment4.P = i3;
                    this.f220b.a(fragment4, false);
                    break;
                case 4:
                    Fragment fragment5 = mVar.d;
                    fragment5.P = i3;
                    this.f220b.c(fragment5, ad.d(i2), i);
                    break;
                case 5:
                    Fragment fragment6 = mVar.d;
                    fragment6.P = i4;
                    this.f220b.b(fragment6, ad.d(i2), i);
                    break;
                case 6:
                    Fragment fragment7 = mVar.d;
                    fragment7.P = i3;
                    this.f220b.e(fragment7, ad.d(i2), i);
                    break;
                case 7:
                    Fragment fragment8 = mVar.d;
                    fragment8.P = i3;
                    this.f220b.d(fragment8, ad.d(i2), i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + mVar.c);
            }
        }
        if (z) {
            this.f220b.a(this.f220b.n, ad.d(i2), i, true);
            nVar = null;
        }
        if (this.p >= 0) {
            ad adVar = this.f220b;
            int i6 = this.p;
            synchronized (adVar) {
                adVar.k.set(i6, null);
                if (adVar.l == null) {
                    adVar.l = new ArrayList<>();
                }
                if (ad.f164a) {
                    Log.v("FragmentManager", "Freeing back stack index " + i6);
                }
                adVar.l.add(Integer.valueOf(i6));
            }
            this.p = -1;
        }
        return nVar;
    }

    @Override // android.support.v4.app.ab
    public final String d() {
        return this.n;
    }

    private static Object a(Object obj, Fragment fragment, ArrayList<View> arrayList, android.support.v4.h.a<String, View> aVar, View view) {
        if (obj == null) {
            return obj;
        }
        View view2 = fragment.R;
        if (obj == null) {
            return obj;
        }
        aq.a(arrayList, view2);
        if (aVar != null) {
            arrayList.removeAll(aVar.values());
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        arrayList.add(view);
        aq.b((Transition) obj, arrayList);
        return obj;
    }

    private android.support.v4.h.a<String, View> a(n nVar, Fragment fragment, boolean z) {
        android.support.v4.h.a<String, View> aVar = new android.support.v4.h.a<>();
        if (this.u != null) {
            aq.a((Map<String, View>) aVar, fragment.R);
            if (!z) {
                aVar = a(this.u, this.v, aVar);
            } else {
                android.support.v4.h.h.a((Map) aVar, (Collection<?>) this.v);
            }
        }
        if (z) {
            if (fragment.ag != null) {
                cy cyVar = fragment.ag;
            }
            a(nVar, aVar, false);
        } else {
            if (fragment.ah != null) {
                cy cyVar2 = fragment.ah;
            }
            b(nVar, aVar, false);
        }
        return aVar;
    }

    private boolean a(int i, n nVar, boolean z, SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2) {
        Object obj;
        Object a2;
        TransitionSet transitionSet;
        Object obj2;
        Object a3;
        android.support.v4.h.a<String, View> aVar;
        TransitionSet transitionSet2;
        boolean z2;
        Transition transition;
        boolean booleanValue;
        Object obj3;
        ViewGroup viewGroup = (ViewGroup) this.f220b.p.a(i);
        if (viewGroup == null) {
            return false;
        }
        Fragment fragment = sparseArray2.get(i);
        Fragment fragment2 = sparseArray.get(i);
        if (fragment == null) {
            a2 = null;
        } else {
            if (z) {
                if (fragment.ab != Fragment.j) {
                    obj = fragment.ab;
                } else {
                    obj = fragment.aa;
                }
            } else {
                obj = fragment.Y;
            }
            a2 = aq.a(obj);
        }
        if (fragment == null || fragment2 == null) {
            transitionSet = null;
        } else {
            if (z) {
                if (fragment2.ad != Fragment.j) {
                    obj3 = fragment2.ad;
                } else {
                    obj3 = fragment2.ac;
                }
            } else {
                obj3 = fragment.ac;
            }
            if (obj3 == null) {
                transitionSet = null;
            } else {
                Transition transition2 = (Transition) obj3;
                if (transition2 == null) {
                    transitionSet = null;
                } else {
                    transitionSet = new TransitionSet();
                    transitionSet.addTransition(transition2);
                }
            }
        }
        if (fragment2 == null) {
            a3 = null;
        } else {
            if (z) {
                if (fragment2.Z != Fragment.j) {
                    obj2 = fragment2.Z;
                } else {
                    obj2 = fragment2.Y;
                }
            } else {
                obj2 = fragment2.aa;
            }
            a3 = aq.a(obj2);
        }
        ArrayList arrayList = new ArrayList();
        if (transitionSet == null) {
            aVar = null;
            transitionSet2 = transitionSet;
        } else {
            android.support.v4.h.a<String, View> a4 = a(nVar, fragment2, z);
            if (a4.isEmpty()) {
                aVar = null;
                transitionSet2 = null;
            } else {
                cy cyVar = z ? fragment2.ag : fragment.ag;
                if (cyVar != null) {
                    cyVar.a(new ArrayList(a4.keySet()), new ArrayList(a4.values()));
                }
                viewGroup.getViewTreeObserver().addOnPreDrawListener(new k(this, viewGroup, transitionSet, arrayList, nVar, z, fragment, fragment2));
                aVar = a4;
                transitionSet2 = transitionSet;
            }
        }
        if (a2 == null && transitionSet2 == null && a3 == null) {
            return false;
        }
        ArrayList arrayList2 = new ArrayList();
        Object a5 = a(a3, fragment2, (ArrayList<View>) arrayList2, aVar, nVar.d);
        if (this.v != null && aVar != null) {
            View view = aVar.get(this.v.get(0));
            if (view != null) {
                if (a5 != null) {
                    aq.a(a5, view);
                }
                if (transitionSet2 != null) {
                    aq.a(transitionSet2, view);
                }
            }
        }
        j jVar = new j(this, fragment);
        ArrayList arrayList3 = new ArrayList();
        android.support.v4.h.a aVar2 = new android.support.v4.h.a();
        if (fragment == null) {
            z2 = true;
        } else {
            if (z) {
                booleanValue = fragment.ae == null ? true : fragment.ae.booleanValue();
            } else {
                booleanValue = fragment.af == null ? true : fragment.af.booleanValue();
            }
            z2 = booleanValue;
        }
        Transition transition3 = (Transition) a2;
        Transition transition4 = (Transition) a5;
        TransitionSet transitionSet3 = transitionSet2;
        if (transition3 == null || transition4 == null) {
            z2 = true;
        }
        if (z2) {
            TransitionSet transitionSet4 = new TransitionSet();
            if (transition3 != null) {
                transitionSet4.addTransition(transition3);
            }
            if (transition4 != null) {
                transitionSet4.addTransition(transition4);
            }
            if (transitionSet3 != null) {
                transitionSet4.addTransition(transitionSet3);
            }
            transition = transitionSet4;
        } else {
            if (transition4 != null && transition3 != null) {
                transition3 = new TransitionSet().addTransition(transition4).addTransition(transition3).setOrdering(1);
            } else if (transition4 != null) {
                transition3 = transition4;
            } else if (transition3 == null) {
                transition3 = null;
            }
            if (transitionSet3 != null) {
                TransitionSet transitionSet5 = new TransitionSet();
                if (transition3 != null) {
                    transitionSet5.addTransition(transition3);
                }
                transitionSet5.addTransition(transitionSet3);
                transition = transitionSet5;
            } else {
                transition = transition3;
            }
        }
        if (transition != null) {
            View view2 = nVar.d;
            av avVar = nVar.c;
            android.support.v4.h.a<String, String> aVar3 = nVar.f229a;
            if (a2 != null || transitionSet2 != null) {
                Transition transition5 = (Transition) a2;
                if (transition5 != null) {
                    transition5.addTarget(view2);
                }
                if (transitionSet2 != null) {
                    aq.a(transitionSet2, view2, aVar, arrayList);
                }
                viewGroup.getViewTreeObserver().addOnPreDrawListener(new as(viewGroup, transition5, view2, jVar, aVar3, aVar2, arrayList3));
                if (transition5 != null) {
                    transition5.setEpicenterCallback(new at(avVar));
                }
            }
            viewGroup.getViewTreeObserver().addOnPreDrawListener(new l(this, viewGroup, nVar, i, transition));
            aq.a((Object) transition, nVar.d, true);
            a(nVar, i, transition);
            TransitionManager.beginDelayedTransition(viewGroup, transition);
            View view3 = nVar.d;
            ArrayList<View> arrayList4 = nVar.f230b;
            Transition transition6 = (Transition) a2;
            Transition transition7 = (Transition) a5;
            TransitionSet transitionSet6 = transitionSet2;
            Transition transition8 = transition;
            if (transition8 != null) {
                viewGroup.getViewTreeObserver().addOnPreDrawListener(new au(viewGroup, transition6, arrayList3, transition7, arrayList2, transitionSet6, arrayList, aVar2, arrayList4, transition8, view3));
            }
        }
        return transition != null;
    }

    private static android.support.v4.h.a<String, View> a(ArrayList<String> arrayList, ArrayList<String> arrayList2, android.support.v4.h.a<String, View> aVar) {
        if (!aVar.isEmpty()) {
            android.support.v4.h.a<String, View> aVar2 = new android.support.v4.h.a<>();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = aVar.get(arrayList.get(i));
                if (view != null) {
                    aVar2.put(arrayList2.get(i), view);
                }
            }
            return aVar2;
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(n nVar, int i, Object obj) {
        if (this.f220b.g != null) {
            for (int i2 = 0; i2 < this.f220b.g.size(); i2++) {
                Fragment fragment = this.f220b.g.get(i2);
                if (fragment.R != null && fragment.Q != null && fragment.G == i) {
                    if (fragment.I) {
                        if (!nVar.f230b.contains(fragment.R)) {
                            aq.a(obj, fragment.R, true);
                            nVar.f230b.add(fragment.R);
                        }
                    } else {
                        aq.a(obj, fragment.R, false);
                        nVar.f230b.remove(fragment.R);
                    }
                }
            }
        }
    }

    private static void a(android.support.v4.h.a<String, String> aVar, String str, String str2) {
        if (str != null && str2 != null) {
            for (int i = 0; i < aVar.size(); i++) {
                if (str.equals(aVar.c(i))) {
                    aVar.a(i, (int) str2);
                    return;
                }
            }
            aVar.put(str, str2);
        }
    }

    private static void a(n nVar, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        if (arrayList != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < arrayList.size()) {
                    a(nVar.f229a, arrayList.get(i2), arrayList2.get(i2));
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    private void a(n nVar, android.support.v4.h.a<String, View> aVar, boolean z) {
        int size = this.v == null ? 0 : this.v.size();
        for (int i = 0; i < size; i++) {
            String str = this.u.get(i);
            View view = aVar.get(this.v.get(i));
            if (view != null) {
                String transitionName = view.getTransitionName();
                if (z) {
                    a(nVar.f229a, str, transitionName);
                } else {
                    a(nVar.f229a, transitionName, str);
                }
            }
        }
    }

    private static void b(n nVar, android.support.v4.h.a<String, View> aVar, boolean z) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            String b2 = aVar.b(i);
            String transitionName = aVar.c(i).getTransitionName();
            if (z) {
                a(nVar.f229a, b2, transitionName);
            } else {
                a(nVar.f229a, transitionName, b2);
            }
        }
    }

    @Override // android.support.v4.app.ap
    public final ap a(int i, int i2) {
        this.f = i;
        this.g = i2;
        this.h = 0;
        this.i = 0;
        return this;
    }

    private n a(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2, boolean z) {
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            Fragment valueAt = sparseArray2.valueAt(i);
            if (valueAt.k <= 0) {
                this.f220b.a(valueAt);
                this.f220b.a(valueAt, 1, 0, 0, false);
            }
        }
        n nVar = new n(this);
        nVar.d = new View(this.f220b.o.c);
        boolean z2 = false;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            if (a(sparseArray.keyAt(i2), nVar, z, sparseArray, sparseArray2)) {
                z2 = true;
            }
        }
        for (int i3 = 0; i3 < sparseArray2.size(); i3++) {
            int keyAt = sparseArray2.keyAt(i3);
            if (sparseArray.get(keyAt) == null && a(keyAt, nVar, z, sparseArray, sparseArray2)) {
                z2 = true;
            }
        }
        if (!z2) {
            return null;
        }
        return nVar;
    }

    static /* synthetic */ android.support.v4.h.a a(i iVar, n nVar, boolean z, Fragment fragment) {
        android.support.v4.h.a<String, View> aVar = new android.support.v4.h.a<>();
        View view = fragment.R;
        if (view != null && iVar.u != null) {
            aq.a((Map<String, View>) aVar, view);
            if (z) {
                aVar = a(iVar.u, iVar.v, aVar);
            } else {
                android.support.v4.h.h.a((Map) aVar, (Collection<?>) iVar.v);
            }
        }
        if (z) {
            if (fragment.ah != null) {
                cy cyVar = fragment.ah;
            }
            iVar.a(nVar, aVar, true);
        } else {
            if (fragment.ag != null) {
                cy cyVar2 = fragment.ag;
            }
            b(nVar, aVar, true);
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void a(i iVar, android.support.v4.h.a aVar, n nVar) {
        View view;
        if (iVar.v == null || aVar.isEmpty() || (view = (View) aVar.get(iVar.v.get(0))) == null) {
            return;
        }
        nVar.c.f186a = view;
    }

    static /* synthetic */ void a(Fragment fragment, Fragment fragment2, boolean z, android.support.v4.h.a aVar) {
        cy cyVar = z ? fragment2.ag : fragment.ag;
        if (cyVar == null) {
            return;
        }
        new ArrayList(aVar.keySet());
        new ArrayList(aVar.values());
        cyVar.a();
    }
}
