package com.a.a.apkg.bpkg;

import java.util.zip.Inflater;

/* loaded from: classes.dex */
final class u extends Inflater {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f977a;

    u(s sVar) {
        this.f977a = sVar;
    }

    @Override // java.util.zip.Inflater
    public final int inflate(byte[] bArr, int i, int i2) {
        int inflate = super.inflate(bArr, i, i2);
        if (inflate == 0 && needsDictionary()) {
            setDictionary(z.f983a);
            return super.inflate(bArr, i, i2);
        }
        return inflate;
    }
}
