package com.google.android.play.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class i extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String[] f6764a = com.google.protobuf.nano.e.f;

    public i() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f6764a != null && this.f6764a.length > 0) {
            for (int i = 0; i < this.f6764a.length; i++) {
                String str = this.f6764a[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(1, str);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f6764a == null || this.f6764a.length <= 0) {
            return a2;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f6764a.length; i3++) {
            String str = this.f6764a[i3];
            if (str != null) {
                i2++;
                i += CodedOutputByteBufferNano.a(str);
            }
        }
        return a2 + i + (i2 * 1);
    }

    @Override // com.google.protobuf.nano.c
    public final /* synthetic */ com.google.protobuf.nano.c a(com.google.protobuf.nano.a aVar) {
        while (true) {
            int a2 = aVar.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 10);
                    int length = this.f6764a == null ? 0 : this.f6764a.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f6764a, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.f6764a = strArr;
                    break;
                default:
                    if (!com.google.protobuf.nano.e.a(aVar, a2)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
