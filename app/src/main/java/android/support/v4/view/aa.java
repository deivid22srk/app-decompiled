package android.support.v4.view;

import android.view.KeyEvent;

/* loaded from: classes.dex */
class aa implements ad {
    aa() {
    }

    private static int a(int i, int i2, int i3, int i4) {
        boolean z = (i2 & 1) != 0;
        int i5 = i3 | i4;
        boolean z2 = (i5 & 1) != 0;
        if (z) {
            if (z2) {
                throw new IllegalArgumentException("bad arguments");
            }
            return i & (i5 ^ (-1));
        }
        if (z2) {
            return i & (i2 ^ (-1));
        }
        return i;
    }

    public int a(int i) {
        int i2 = (i & 192) != 0 ? i | 1 : i;
        if ((i2 & 48) != 0) {
            i2 |= 2;
        }
        return i2 & 247;
    }

    @Override // android.support.v4.view.ad
    public boolean b(int i) {
        return a(a(a(i) & 247, 1, 64, 128), 2, 16, 32) == 1;
    }

    @Override // android.support.v4.view.ad
    public boolean c(int i) {
        return (a(i) & 247) == 0;
    }

    @Override // android.support.v4.view.ad
    public void a(KeyEvent keyEvent) {
    }
}
