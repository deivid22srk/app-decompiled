package android.support.v7.widget;

import android.util.SparseIntArray;

/* loaded from: classes.dex */
public abstract class cl {

    /* renamed from: a, reason: collision with root package name */
    final SparseIntArray f739a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private boolean f740b = false;

    public abstract int a(int i);

    final int b(int i, int i2) {
        if (!this.f740b) {
            return a(i, i2);
        }
        int i3 = this.f739a.get(i, -1);
        if (i3 == -1) {
            int a2 = a(i, i2);
            this.f739a.put(i, a2);
            return a2;
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(int r7, int r8) {
        /*
            r6 = this;
            r1 = 0
            int r4 = r6.a(r7)
            if (r4 != r8) goto L8
        L7:
            return r1
        L8:
            boolean r0 = r6.f740b
            if (r0 == 0) goto L6e
            android.util.SparseIntArray r0 = r6.f739a
            int r0 = r0.size()
            if (r0 <= 0) goto L6e
            android.util.SparseIntArray r0 = r6.f739a
            int r0 = r0.size()
            int r0 = r0 + (-1)
            r2 = r1
        L1d:
            if (r2 > r0) goto L31
            int r3 = r2 + r0
            int r3 = r3 >>> 1
            android.util.SparseIntArray r5 = r6.f739a
            int r5 = r5.keyAt(r3)
            if (r5 >= r7) goto L2e
            int r2 = r3 + 1
            goto L1d
        L2e:
            int r0 = r3 + (-1)
            goto L1d
        L31:
            int r0 = r2 + (-1)
            if (r0 < 0) goto L62
            android.util.SparseIntArray r2 = r6.f739a
            int r2 = r2.size()
            if (r0 >= r2) goto L62
            android.util.SparseIntArray r2 = r6.f739a
            int r0 = r2.keyAt(r0)
        L43:
            if (r0 < 0) goto L6e
            android.util.SparseIntArray r2 = r6.f739a
            int r2 = r2.get(r0)
            int r3 = r6.a(r0)
            int r2 = r2 + r3
            int r0 = r0 + 1
        L52:
            r3 = r0
        L53:
            if (r3 >= r7) goto L68
            int r0 = r6.a(r3)
            int r2 = r2 + r0
            if (r2 != r8) goto L64
            r0 = r1
        L5d:
            int r2 = r3 + 1
            r3 = r2
            r2 = r0
            goto L53
        L62:
            r0 = -1
            goto L43
        L64:
            if (r2 > r8) goto L5d
            r0 = r2
            goto L5d
        L68:
            int r0 = r2 + r4
            if (r0 > r8) goto L7
            r1 = r2
            goto L7
        L6e:
            r0 = r1
            r2 = r1
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.cl.a(int, int):int");
    }

    public final int c(int i, int i2) {
        int a2 = a(i);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i) {
            int a3 = a(i3);
            int i6 = i5 + a3;
            if (i6 == i2) {
                i4++;
                a3 = 0;
            } else if (i6 > i2) {
                i4++;
            } else {
                a3 = i6;
            }
            i3++;
            i5 = a3;
        }
        if (i5 + a2 > i2) {
            return i4 + 1;
        }
        return i4;
    }
}
