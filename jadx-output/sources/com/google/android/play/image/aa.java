package com.google.android.play.image;

/* loaded from: classes.dex */
final class aa extends ae {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f6924a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(z zVar, y yVar, CharSequence charSequence) {
        super(yVar, charSequence);
        this.f6924a = zVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r0 = r0 + 1;
     */
    @Override // com.google.android.play.image.ae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(int r7) {
        /*
            r6 = this;
            com.google.android.play.image.z r0 = r6.f6924a
            java.lang.String r0 = r0.f6959a
            int r2 = r0.length()
            java.lang.CharSequence r0 = r6.d
            int r0 = r0.length()
            int r3 = r0 - r2
            r0 = r7
        L11:
            if (r0 > r3) goto L2e
            r1 = 0
        L14:
            if (r1 >= r2) goto L2f
            java.lang.CharSequence r4 = r6.d
            int r5 = r1 + r0
            char r4 = r4.charAt(r5)
            com.google.android.play.image.z r5 = r6.f6924a
            java.lang.String r5 = r5.f6959a
            char r5 = r5.charAt(r1)
            if (r4 != r5) goto L2b
            int r1 = r1 + 1
            goto L14
        L2b:
            int r0 = r0 + 1
            goto L11
        L2e:
            r0 = -1
        L2f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.image.aa.a(int):int");
    }

    @Override // com.google.android.play.image.ae
    public final int b(int i) {
        return this.f6924a.f6959a.length() + i;
    }
}
