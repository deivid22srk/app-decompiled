package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class jy extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f4017a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4018b = false;
    public int[] c = com.google.protobuf.nano.e.f7878a;
    public int d = 0;
    public boolean e = false;
    public String f = "";
    public boolean g = false;
    public String h = "";
    public boolean i = false;
    public String j = "";
    public boolean k = false;
    public aj[] l = aj.b();
    public String[] m = com.google.protobuf.nano.e.f;

    public jy() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4017a != 0 || this.f4018b) {
            codedOutputByteBufferNano.a(1, this.f4017a);
        }
        if (this.e || this.d != 0) {
            codedOutputByteBufferNano.a(2, this.d);
        }
        if (this.g || !this.f.equals("")) {
            codedOutputByteBufferNano.a(3, this.f);
        }
        if (this.k || !this.j.equals("")) {
            codedOutputByteBufferNano.a(4, this.j);
        }
        if (this.l != null && this.l.length > 0) {
            for (int i = 0; i < this.l.length; i++) {
                aj ajVar = this.l[i];
                if (ajVar != null) {
                    codedOutputByteBufferNano.b(5, ajVar);
                }
            }
        }
        if (this.m != null && this.m.length > 0) {
            for (int i2 = 0; i2 < this.m.length; i2++) {
                String str = this.m[i2];
                if (str != null) {
                    codedOutputByteBufferNano.a(6, str);
                }
            }
        }
        if (this.i || !this.h.equals("")) {
            codedOutputByteBufferNano.a(7, this.h);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i3 = 0; i3 < this.c.length; i3++) {
                codedOutputByteBufferNano.a(8, this.c[i3]);
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4017a != 0 || this.f4018b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f4017a);
        }
        if (this.e || this.d != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.d);
        }
        if (this.g || !this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.f);
        }
        if (this.k || !this.j.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.j);
        }
        if (this.l != null && this.l.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.l.length; i2++) {
                aj ajVar = this.l[i2];
                if (ajVar != null) {
                    i += CodedOutputByteBufferNano.d(5, ajVar);
                }
            }
            a2 = i;
        }
        if (this.m != null && this.m.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < this.m.length; i5++) {
                String str = this.m[i5];
                if (str != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.a(str);
                }
            }
            a2 = a2 + i3 + (i4 * 1);
        }
        if (this.i || !this.h.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.h);
        }
        if (this.c != null && this.c.length > 0) {
            int i6 = 0;
            for (int i7 = 0; i7 < this.c.length; i7++) {
                i6 += CodedOutputByteBufferNano.b(this.c[i7]);
            }
            return a2 + i6 + (this.c.length * 1);
        }
        return a2;
    }

    @Override // com.google.protobuf.nano.c
    public final /* synthetic */ com.google.protobuf.nano.c a(com.google.protobuf.nano.a aVar) {
        int i;
        while (true) {
            int a2 = aVar.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.f4017a = e;
                            this.f4018b = true;
                            break;
                    }
                case 16:
                    this.d = aVar.e();
                    this.e = true;
                    break;
                case 26:
                    this.f = aVar.c();
                    this.g = true;
                    break;
                case 34:
                    this.j = aVar.c();
                    this.k = true;
                    break;
                case 42:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 42);
                    int length = this.l == null ? 0 : this.l.length;
                    aj[] ajVarArr = new aj[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.l, 0, ajVarArr, 0, length);
                    }
                    while (length < ajVarArr.length - 1) {
                        ajVarArr[length] = new aj();
                        aVar.a(ajVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    ajVarArr[length] = new aj();
                    aVar.a(ajVarArr[length]);
                    this.l = ajVarArr;
                    break;
                case 50:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 50);
                    int length2 = this.m == null ? 0 : this.m.length;
                    String[] strArr = new String[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.m, 0, strArr, 0, length2);
                    }
                    while (length2 < strArr.length - 1) {
                        strArr[length2] = aVar.c();
                        aVar.a();
                        length2++;
                    }
                    strArr[length2] = aVar.c();
                    this.m = strArr;
                    break;
                case 58:
                    this.h = aVar.c();
                    this.i = true;
                    break;
                case 64:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 64);
                    int[] iArr = new int[b4];
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < b4) {
                        if (i2 != 0) {
                            aVar.a();
                        }
                        int e2 = aVar.e();
                        switch (e2) {
                            case 0:
                            case 1:
                            case 2:
                                i = i3 + 1;
                                iArr[i3] = e2;
                                break;
                            default:
                                i = i3;
                                break;
                        }
                        i2++;
                        i3 = i;
                    }
                    if (i3 != 0) {
                        int length3 = this.c == null ? 0 : this.c.length;
                        if (length3 == 0 && i3 == iArr.length) {
                            this.c = iArr;
                            break;
                        } else {
                            int[] iArr2 = new int[length3 + i3];
                            if (length3 != 0) {
                                System.arraycopy(this.c, 0, iArr2, 0, length3);
                            }
                            System.arraycopy(iArr, 0, iArr2, length3, i3);
                            this.c = iArr2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 66:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i4 = 0;
                    while (aVar.i() > 0) {
                        switch (aVar.e()) {
                            case 0:
                            case 1:
                            case 2:
                                i4++;
                                break;
                        }
                    }
                    if (i4 != 0) {
                        aVar.e(j);
                        int length4 = this.c == null ? 0 : this.c.length;
                        int[] iArr3 = new int[i4 + length4];
                        if (length4 != 0) {
                            System.arraycopy(this.c, 0, iArr3, 0, length4);
                        }
                        while (aVar.i() > 0) {
                            int e3 = aVar.e();
                            switch (e3) {
                                case 0:
                                case 1:
                                case 2:
                                    iArr3[length4] = e3;
                                    length4++;
                                    break;
                            }
                        }
                        this.c = iArr3;
                    }
                    aVar.d(c);
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
