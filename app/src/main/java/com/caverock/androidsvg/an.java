package com.caverock.androidsvg;

/* loaded from: classes.dex */
public final class an implements ao {

    /* renamed from: b, reason: collision with root package name */
    private byte[] f1285b;
    private float[] c;

    /* renamed from: a, reason: collision with root package name */
    int f1284a = 0;
    private int d = 0;

    public an() {
        this.f1285b = null;
        this.c = null;
        this.f1285b = new byte[8];
        this.c = new float[16];
    }

    final void a(byte b2) {
        if (this.f1284a == this.f1285b.length) {
            byte[] bArr = new byte[this.f1285b.length * 2];
            System.arraycopy(this.f1285b, 0, bArr, 0, this.f1285b.length);
            this.f1285b = bArr;
        }
        byte[] bArr2 = this.f1285b;
        int i = this.f1284a;
        this.f1284a = i + 1;
        bArr2[i] = b2;
    }

    private void a(int i) {
        if (this.c.length < this.d + i) {
            float[] fArr = new float[this.c.length * 2];
            System.arraycopy(this.c, 0, fArr, 0, this.c.length);
            this.c = fArr;
        }
    }

    @Override // com.caverock.androidsvg.ao
    public final void a(float f, float f2) {
        a((byte) 0);
        a(2);
        float[] fArr = this.c;
        int i = this.d;
        this.d = i + 1;
        fArr[i] = f;
        float[] fArr2 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        fArr2[i2] = f2;
    }

    @Override // com.caverock.androidsvg.ao
    public final void b(float f, float f2) {
        a((byte) 1);
        a(2);
        float[] fArr = this.c;
        int i = this.d;
        this.d = i + 1;
        fArr[i] = f;
        float[] fArr2 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        fArr2[i2] = f2;
    }

    @Override // com.caverock.androidsvg.ao
    public final void a(float f, float f2, float f3, float f4, float f5, float f6) {
        a((byte) 2);
        a(6);
        float[] fArr = this.c;
        int i = this.d;
        this.d = i + 1;
        fArr[i] = f;
        float[] fArr2 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        fArr2[i2] = f2;
        float[] fArr3 = this.c;
        int i3 = this.d;
        this.d = i3 + 1;
        fArr3[i3] = f3;
        float[] fArr4 = this.c;
        int i4 = this.d;
        this.d = i4 + 1;
        fArr4[i4] = f4;
        float[] fArr5 = this.c;
        int i5 = this.d;
        this.d = i5 + 1;
        fArr5[i5] = f5;
        float[] fArr6 = this.c;
        int i6 = this.d;
        this.d = i6 + 1;
        fArr6[i6] = f6;
    }

    @Override // com.caverock.androidsvg.ao
    public final void a(float f, float f2, float f3, float f4) {
        a((byte) 3);
        a(4);
        float[] fArr = this.c;
        int i = this.d;
        this.d = i + 1;
        fArr[i] = f;
        float[] fArr2 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        fArr2[i2] = f2;
        float[] fArr3 = this.c;
        int i3 = this.d;
        this.d = i3 + 1;
        fArr3[i3] = f3;
        float[] fArr4 = this.c;
        int i4 = this.d;
        this.d = i4 + 1;
        fArr4[i4] = f4;
    }

    @Override // com.caverock.androidsvg.ao
    public final void a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        a((byte) ((z2 ? 1 : 0) | (z ? 2 : 0) | 4));
        a(5);
        float[] fArr = this.c;
        int i = this.d;
        this.d = i + 1;
        fArr[i] = f;
        float[] fArr2 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        fArr2[i2] = f2;
        float[] fArr3 = this.c;
        int i3 = this.d;
        this.d = i3 + 1;
        fArr3[i3] = f3;
        float[] fArr4 = this.c;
        int i4 = this.d;
        this.d = i4 + 1;
        fArr4[i4] = f4;
        float[] fArr5 = this.c;
        int i5 = this.d;
        this.d = i5 + 1;
        fArr5[i5] = f5;
    }

    @Override // com.caverock.androidsvg.ao
    public final void a() {
        a((byte) 8);
    }

    public final void a(ao aoVar) {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f1284a) {
            byte b2 = this.f1285b[i2];
            switch (b2) {
                case 0:
                    int i4 = i3 + 1;
                    i = i4 + 1;
                    aoVar.a(this.c[i3], this.c[i4]);
                    break;
                case 1:
                    int i5 = i3 + 1;
                    i = i5 + 1;
                    aoVar.b(this.c[i3], this.c[i5]);
                    break;
                case 2:
                    int i6 = i3 + 1;
                    int i7 = i6 + 1;
                    int i8 = i7 + 1;
                    int i9 = i8 + 1;
                    int i10 = i9 + 1;
                    aoVar.a(this.c[i3], this.c[i6], this.c[i7], this.c[i8], this.c[i9], this.c[i10]);
                    i = i10 + 1;
                    break;
                case 3:
                    int i11 = i3 + 1;
                    int i12 = i11 + 1;
                    int i13 = i12 + 1;
                    i = i13 + 1;
                    aoVar.a(this.c[i3], this.c[i11], this.c[i12], this.c[i13]);
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                default:
                    int i14 = i3 + 1;
                    int i15 = i14 + 1;
                    int i16 = i15 + 1;
                    int i17 = i16 + 1;
                    aoVar.a(this.c[i3], this.c[i14], this.c[i15], (b2 & 2) != 0, (b2 & 1) != 0, this.c[i16], this.c[i17]);
                    i = i17 + 1;
                    break;
                case 8:
                    aoVar.a();
                    i = i3;
                    break;
            }
            i2++;
            i3 = i;
        }
    }
}
