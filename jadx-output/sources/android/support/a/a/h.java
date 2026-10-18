package android.support.a.a;

import android.content.res.TypedArray;

/* loaded from: classes.dex */
final class h extends k {
    public h() {
    }

    public h(h hVar) {
        super(hVar);
    }

    final void a(TypedArray typedArray) {
        String string = typedArray.getString(0);
        if (string != null) {
            this.n = string;
        }
        String string2 = typedArray.getString(1);
        if (string2 != null) {
            this.m = b.a(string2);
        }
    }

    @Override // android.support.a.a.k
    public final boolean a() {
        return true;
    }
}
