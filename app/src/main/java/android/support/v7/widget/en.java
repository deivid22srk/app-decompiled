package android.support.v7.widget;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class en {

    /* renamed from: a, reason: collision with root package name */
    int f791a = -1;

    /* renamed from: b, reason: collision with root package name */
    int f792b = 1;
    int c = 0;
    int d = 0;
    int e = 0;
    boolean f = false;
    boolean g = false;
    boolean h = false;
    boolean i = false;
    boolean j = false;
    boolean k = false;
    private SparseArray<Object> l;

    final void a(int i) {
        if ((this.f792b & i) == 0) {
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f792b));
        }
    }

    public final int a() {
        return this.g ? this.d - this.e : this.c;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f791a + ", mData=" + this.l + ", mItemCount=" + this.c + ", mPreviousLayoutItemCount=" + this.d + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.e + ", mStructureChanged=" + this.f + ", mInPreLayout=" + this.g + ", mRunSimpleAnimations=" + this.h + ", mRunPredictiveAnimations=" + this.i + '}';
    }
}
