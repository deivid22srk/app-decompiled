package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ao extends com.google.protobuf.nano.c {
    private static volatile ao[] e;

    /* renamed from: a, reason: collision with root package name */
    public String f3600a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3601b = false;
    public ds[] c = ds.b();
    public an[] d = an.b();

    public static ao[] b() {
        if (e == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (e == null) {
                    e = new ao[0];
                }
            }
        }
        return e;
    }

    public ao() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3601b || !this.f3600a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3600a);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                ds dsVar = this.c[i];
                if (dsVar != null) {
                    codedOutputByteBufferNano.b(2, dsVar);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (int i2 = 0; i2 < this.d.length; i2++) {
                an anVar = this.d[i2];
                if (anVar != null) {
                    codedOutputByteBufferNano.b(3, anVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3601b || !this.f3600a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3600a);
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                ds dsVar = this.c[i2];
                if (dsVar != null) {
                    i += CodedOutputByteBufferNano.d(2, dsVar);
                }
            }
            a2 = i;
        }
        if (this.d != null && this.d.length > 0) {
            for (int i3 = 0; i3 < this.d.length; i3++) {
                an anVar = this.d[i3];
                if (anVar != null) {
                    a2 += CodedOutputByteBufferNano.d(3, anVar);
                }
            }
        }
        return a2;
    }

    @Override // com.google.protobuf.nano.c
    public final /* synthetic */ com.google.protobuf.nano.c a(com.google.protobuf.nano.a aVar) {
        while (true) {
            int a2 = aVar.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    this.f3600a = aVar.c();
                    this.f3601b = true;
                    break;
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.c == null ? 0 : this.c.length;
                    ds[] dsVarArr = new ds[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, dsVarArr, 0, length);
                    }
                    while (length < dsVarArr.length - 1) {
                        dsVarArr[length] = new ds();
                        aVar.a(dsVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    dsVarArr[length] = new ds();
                    aVar.a(dsVarArr[length]);
                    this.c = dsVarArr;
                    break;
                case 26:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length2 = this.d == null ? 0 : this.d.length;
                    an[] anVarArr = new an[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.d, 0, anVarArr, 0, length2);
                    }
                    while (length2 < anVarArr.length - 1) {
                        anVarArr[length2] = new an();
                        aVar.a(anVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    anVarArr[length2] = new an();
                    aVar.a(anVarArr[length2]);
                    this.d = anVarArr;
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
