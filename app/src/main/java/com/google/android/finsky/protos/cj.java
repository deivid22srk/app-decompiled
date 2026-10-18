package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class cj extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f3677a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3678b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public cv[] i = cv.b();
    public v j = null;
    public db[] k = db.b();
    public String l = "";
    public boolean m = false;
    public int[] n = com.google.protobuf.nano.e.f7878a;
    public cq[] o = cq.b();

    public cj() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3678b || !this.f3677a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3677a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.i != null && this.i.length > 0) {
            for (int i = 0; i < this.i.length; i++) {
                cv cvVar = this.i[i];
                if (cvVar != null) {
                    codedOutputByteBufferNano.b(5, cvVar);
                }
            }
        }
        if (this.j != null) {
            codedOutputByteBufferNano.b(6, this.j);
        }
        if (this.k != null && this.k.length > 0) {
            for (int i2 = 0; i2 < this.k.length; i2++) {
                db dbVar = this.k[i2];
                if (dbVar != null) {
                    codedOutputByteBufferNano.b(7, dbVar);
                }
            }
        }
        if (this.m || !this.l.equals("")) {
            codedOutputByteBufferNano.a(8, this.l);
        }
        if (this.n != null && this.n.length > 0) {
            for (int i3 = 0; i3 < this.n.length; i3++) {
                codedOutputByteBufferNano.a(9, this.n[i3]);
            }
        }
        if (this.o != null && this.o.length > 0) {
            for (int i4 = 0; i4 < this.o.length; i4++) {
                cq cqVar = this.o[i4];
                if (cqVar != null) {
                    codedOutputByteBufferNano.b(10, cqVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3678b || !this.f3677a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3677a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.g);
        }
        if (this.i != null && this.i.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.i.length; i2++) {
                cv cvVar = this.i[i2];
                if (cvVar != null) {
                    i += CodedOutputByteBufferNano.d(5, cvVar);
                }
            }
            a2 = i;
        }
        if (this.j != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.j);
        }
        if (this.k != null && this.k.length > 0) {
            int i3 = a2;
            for (int i4 = 0; i4 < this.k.length; i4++) {
                db dbVar = this.k[i4];
                if (dbVar != null) {
                    i3 += CodedOutputByteBufferNano.d(7, dbVar);
                }
            }
            a2 = i3;
        }
        if (this.m || !this.l.equals("")) {
            a2 += CodedOutputByteBufferNano.b(8, this.l);
        }
        if (this.n != null && this.n.length > 0) {
            int i5 = 0;
            for (int i6 = 0; i6 < this.n.length; i6++) {
                i5 += CodedOutputByteBufferNano.b(this.n[i6]);
            }
            a2 = a2 + i5 + (this.n.length * 1);
        }
        if (this.o != null && this.o.length > 0) {
            for (int i7 = 0; i7 < this.o.length; i7++) {
                cq cqVar = this.o[i7];
                if (cqVar != null) {
                    a2 += CodedOutputByteBufferNano.d(10, cqVar);
                }
            }
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
                case 10:
                    this.f3677a = aVar.c();
                    this.f3678b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 34:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 42:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 42);
                    int length = this.i == null ? 0 : this.i.length;
                    cv[] cvVarArr = new cv[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.i, 0, cvVarArr, 0, length);
                    }
                    while (length < cvVarArr.length - 1) {
                        cvVarArr[length] = new cv();
                        aVar.a(cvVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    cvVarArr[length] = new cv();
                    aVar.a(cvVarArr[length]);
                    this.i = cvVarArr;
                    break;
                case 50:
                    if (this.j == null) {
                        this.j = new v();
                    }
                    aVar.a(this.j);
                    break;
                case 58:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 58);
                    int length2 = this.k == null ? 0 : this.k.length;
                    db[] dbVarArr = new db[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.k, 0, dbVarArr, 0, length2);
                    }
                    while (length2 < dbVarArr.length - 1) {
                        dbVarArr[length2] = new db();
                        aVar.a(dbVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    dbVarArr[length2] = new db();
                    aVar.a(dbVarArr[length2]);
                    this.k = dbVarArr;
                    break;
                case 66:
                    this.l = aVar.c();
                    this.m = true;
                    break;
                case 72:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 72);
                    int[] iArr = new int[b4];
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < b4) {
                        if (i2 != 0) {
                            aVar.a();
                        }
                        int e = aVar.e();
                        switch (e) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                                i = i3 + 1;
                                iArr[i3] = e;
                                break;
                            default:
                                i = i3;
                                break;
                        }
                        i2++;
                        i3 = i;
                    }
                    if (i3 != 0) {
                        int length3 = this.n == null ? 0 : this.n.length;
                        if (length3 == 0 && i3 == iArr.length) {
                            this.n = iArr;
                            break;
                        } else {
                            int[] iArr2 = new int[length3 + i3];
                            if (length3 != 0) {
                                System.arraycopy(this.n, 0, iArr2, 0, length3);
                            }
                            System.arraycopy(iArr, 0, iArr2, length3, i3);
                            this.n = iArr2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 74:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i4 = 0;
                    while (aVar.i() > 0) {
                        switch (aVar.e()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                                i4++;
                                break;
                        }
                    }
                    if (i4 != 0) {
                        aVar.e(j);
                        int length4 = this.n == null ? 0 : this.n.length;
                        int[] iArr3 = new int[i4 + length4];
                        if (length4 != 0) {
                            System.arraycopy(this.n, 0, iArr3, 0, length4);
                        }
                        while (aVar.i() > 0) {
                            int e2 = aVar.e();
                            switch (e2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                    iArr3[length4] = e2;
                                    length4++;
                                    break;
                            }
                        }
                        this.n = iArr3;
                    }
                    aVar.d(c);
                    break;
                case 82:
                    int b5 = com.google.protobuf.nano.e.b(aVar, 82);
                    int length5 = this.o == null ? 0 : this.o.length;
                    cq[] cqVarArr = new cq[b5 + length5];
                    if (length5 != 0) {
                        System.arraycopy(this.o, 0, cqVarArr, 0, length5);
                    }
                    while (length5 < cqVarArr.length - 1) {
                        cqVarArr[length5] = new cq();
                        aVar.a(cqVarArr[length5]);
                        aVar.a();
                        length5++;
                    }
                    cqVarArr[length5] = new cq();
                    aVar.a(cqVarArr[length5]);
                    this.o = cqVarArr;
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
