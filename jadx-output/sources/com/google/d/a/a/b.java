package com.google.d.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.c;
import com.google.protobuf.nano.e;

/* loaded from: classes2.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public int[] f7732a = e.f7878a;

    public b() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7732a != null && this.f7732a.length > 0) {
            for (int i = 0; i < this.f7732a.length; i++) {
                codedOutputByteBufferNano.a(1, this.f7732a[i]);
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7732a == null || this.f7732a.length <= 0) {
            return a2;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f7732a.length; i2++) {
            i += CodedOutputByteBufferNano.b(this.f7732a[i2]);
        }
        return a2 + i + (this.f7732a.length * 1);
    }

    @Override // com.google.protobuf.nano.c
    public final /* synthetic */ c a(com.google.protobuf.nano.a aVar) {
        while (true) {
            int a2 = aVar.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    int b2 = e.b(aVar, 8);
                    int length = this.f7732a == null ? 0 : this.f7732a.length;
                    int[] iArr = new int[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f7732a, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = aVar.e();
                        aVar.a();
                        length++;
                    }
                    iArr[length] = aVar.e();
                    this.f7732a = iArr;
                    break;
                case 10:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i = 0;
                    while (aVar.i() > 0) {
                        aVar.e();
                        i++;
                    }
                    aVar.e(j);
                    int length2 = this.f7732a == null ? 0 : this.f7732a.length;
                    int[] iArr2 = new int[i + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f7732a, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = aVar.e();
                        length2++;
                    }
                    this.f7732a = iArr2;
                    aVar.d(c);
                    break;
                default:
                    if (!e.a(aVar, a2)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
