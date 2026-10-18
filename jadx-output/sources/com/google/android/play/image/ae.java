package com.google.android.play.image;

/* loaded from: classes.dex */
abstract class ae extends ac<String> {
    final CharSequence d;
    final boolean e;
    int f;

    abstract int a(int i);

    abstract int b(int i);

    protected ae(y yVar, CharSequence charSequence) {
        super((byte) 0);
        this.f = 0;
        this.e = yVar.f6957a;
        this.d = charSequence;
    }

    @Override // com.google.android.play.image.ac
    protected final /* synthetic */ String a() {
        while (this.f != -1) {
            int i = this.f;
            int a2 = a(this.f);
            if (a2 == -1) {
                a2 = this.d.length();
                this.f = -1;
            } else {
                this.f = b(a2);
            }
            if (!this.e || i != a2) {
                return this.d.subSequence(i, a2).toString();
            }
        }
        this.f6927b = ad.DONE;
        return null;
    }
}
