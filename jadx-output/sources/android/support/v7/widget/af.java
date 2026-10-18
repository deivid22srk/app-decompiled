package android.support.v7.widget;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class af implements dj {

    /* renamed from: a, reason: collision with root package name */
    final ArrayList<ah> f648a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<ah> f649b;
    final ag c;
    Runnable d;
    final boolean e;
    final di f;
    int g;
    private android.support.v4.h.p<ah> h;

    af(ag agVar) {
        this(agVar, (byte) 0);
    }

    private af(ag agVar, byte b2) {
        this.h = new android.support.v4.h.q(30);
        this.f648a = new ArrayList<>();
        this.f649b = new ArrayList<>();
        this.g = 0;
        this.c = agVar;
        this.e = false;
        this.f = new di(this);
    }

    final void a() {
        a(this.f648a);
        a(this.f649b);
        this.g = 0;
    }

    final void b() {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        di diVar = this.f;
        ArrayList<ah> arrayList = this.f648a;
        while (true) {
            boolean z4 = false;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (arrayList.get(size).f650a == 8) {
                        if (z4) {
                            i = size;
                        } else {
                            z3 = z4;
                        }
                    } else {
                        z3 = true;
                    }
                    size--;
                    z4 = z3;
                } else {
                    i = -1;
                }
            }
            if (i == -1) {
                int size2 = this.f648a.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ah ahVar = this.f648a.get(i5);
                    switch (ahVar.f650a) {
                        case 1:
                            c(ahVar);
                            break;
                        case 2:
                            int i6 = ahVar.f651b;
                            int i7 = ahVar.d + ahVar.f651b;
                            char c = 65535;
                            int i8 = ahVar.f651b;
                            int i9 = 0;
                            while (i8 < i7) {
                                boolean z5 = false;
                                if (this.c.a(i8) != null || c(i8)) {
                                    if (c == 0) {
                                        b(a(2, i6, i9, null));
                                        z5 = true;
                                    }
                                    c = 1;
                                } else {
                                    if (c == 1) {
                                        c(a(2, i6, i9, null));
                                        z5 = true;
                                    }
                                    c = 0;
                                }
                                if (z5) {
                                    i4 = i8 - i9;
                                    i2 = i7 - i9;
                                    i3 = 1;
                                } else {
                                    int i10 = i8;
                                    i2 = i7;
                                    i3 = i9 + 1;
                                    i4 = i10;
                                }
                                i9 = i3;
                                i7 = i2;
                                i8 = i4 + 1;
                            }
                            if (i9 != ahVar.d) {
                                a(ahVar);
                                ahVar = a(2, i6, i9, null);
                            }
                            if (c == 0) {
                                b(ahVar);
                                break;
                            } else {
                                c(ahVar);
                                break;
                            }
                            break;
                        case 4:
                            int i11 = ahVar.f651b;
                            int i12 = ahVar.f651b + ahVar.d;
                            int i13 = ahVar.f651b;
                            int i14 = 0;
                            int i15 = i11;
                            boolean z6 = -1;
                            while (i13 < i12) {
                                if (this.c.a(i13) != null || c(i13)) {
                                    if (!z6) {
                                        b(a(4, i15, i14, ahVar.c));
                                        i14 = 0;
                                        i15 = i13;
                                    }
                                    z = true;
                                } else {
                                    if (z6) {
                                        c(a(4, i15, i14, ahVar.c));
                                        i14 = 0;
                                        i15 = i13;
                                    }
                                    z = false;
                                }
                                i13++;
                                i14++;
                                i15 = i15;
                                z6 = z;
                            }
                            if (i14 != ahVar.d) {
                                Object obj = ahVar.c;
                                a(ahVar);
                                ahVar = a(4, i15, i14, obj);
                            }
                            if (!z6) {
                                b(ahVar);
                                break;
                            } else {
                                c(ahVar);
                                break;
                            }
                            break;
                        case 8:
                            c(ahVar);
                            break;
                    }
                    if (this.d != null) {
                        this.d.run();
                    }
                }
                this.f648a.clear();
                return;
            }
            int i16 = i + 1;
            ah ahVar2 = arrayList.get(i);
            ah ahVar3 = arrayList.get(i16);
            switch (ahVar3.f650a) {
                case 1:
                    int i17 = 0;
                    if (ahVar2.d < ahVar3.f651b) {
                        i17 = -1;
                    }
                    if (ahVar2.f651b < ahVar3.f651b) {
                        i17++;
                    }
                    if (ahVar3.f651b <= ahVar2.f651b) {
                        ahVar2.f651b += ahVar3.d;
                    }
                    if (ahVar3.f651b <= ahVar2.d) {
                        ahVar2.d += ahVar3.d;
                    }
                    ahVar3.f651b = i17 + ahVar3.f651b;
                    arrayList.set(i, ahVar3);
                    arrayList.set(i16, ahVar2);
                    break;
                case 2:
                    ah ahVar4 = null;
                    boolean z7 = false;
                    if (ahVar2.f651b < ahVar2.d) {
                        z2 = false;
                        if (ahVar3.f651b == ahVar2.f651b && ahVar3.d == ahVar2.d - ahVar2.f651b) {
                            z7 = true;
                        }
                    } else {
                        z2 = true;
                        if (ahVar3.f651b == ahVar2.d + 1 && ahVar3.d == ahVar2.f651b - ahVar2.d) {
                            z7 = true;
                        }
                    }
                    if (ahVar2.d < ahVar3.f651b) {
                        ahVar3.f651b--;
                    } else if (ahVar2.d < ahVar3.f651b + ahVar3.d) {
                        ahVar3.d--;
                        ahVar2.f650a = 2;
                        ahVar2.d = 1;
                        if (ahVar3.d == 0) {
                            arrayList.remove(i16);
                            diVar.f766a.a(ahVar3);
                            break;
                        } else {
                            break;
                        }
                    }
                    if (ahVar2.f651b <= ahVar3.f651b) {
                        ahVar3.f651b++;
                    } else if (ahVar2.f651b < ahVar3.f651b + ahVar3.d) {
                        ahVar4 = diVar.f766a.a(2, ahVar2.f651b + 1, (ahVar3.f651b + ahVar3.d) - ahVar2.f651b, null);
                        ahVar3.d = ahVar2.f651b - ahVar3.f651b;
                    }
                    if (z7) {
                        arrayList.set(i, ahVar3);
                        arrayList.remove(i16);
                        diVar.f766a.a(ahVar2);
                        break;
                    } else {
                        if (z2) {
                            if (ahVar4 != null) {
                                if (ahVar2.f651b > ahVar4.f651b) {
                                    ahVar2.f651b -= ahVar4.d;
                                }
                                if (ahVar2.d > ahVar4.f651b) {
                                    ahVar2.d -= ahVar4.d;
                                }
                            }
                            if (ahVar2.f651b > ahVar3.f651b) {
                                ahVar2.f651b -= ahVar3.d;
                            }
                            if (ahVar2.d > ahVar3.f651b) {
                                ahVar2.d -= ahVar3.d;
                            }
                        } else {
                            if (ahVar4 != null) {
                                if (ahVar2.f651b >= ahVar4.f651b) {
                                    ahVar2.f651b -= ahVar4.d;
                                }
                                if (ahVar2.d >= ahVar4.f651b) {
                                    ahVar2.d -= ahVar4.d;
                                }
                            }
                            if (ahVar2.f651b >= ahVar3.f651b) {
                                ahVar2.f651b -= ahVar3.d;
                            }
                            if (ahVar2.d >= ahVar3.f651b) {
                                ahVar2.d -= ahVar3.d;
                            }
                        }
                        arrayList.set(i, ahVar3);
                        if (ahVar2.f651b != ahVar2.d) {
                            arrayList.set(i16, ahVar2);
                        } else {
                            arrayList.remove(i16);
                        }
                        if (ahVar4 != null) {
                            arrayList.add(i, ahVar4);
                            break;
                        } else {
                            break;
                        }
                    }
                case 4:
                    ah ahVar5 = null;
                    ah ahVar6 = null;
                    if (ahVar2.d < ahVar3.f651b) {
                        ahVar3.f651b--;
                    } else if (ahVar2.d < ahVar3.f651b + ahVar3.d) {
                        ahVar3.d--;
                        ahVar5 = diVar.f766a.a(4, ahVar2.f651b, 1, ahVar3.c);
                    }
                    if (ahVar2.f651b <= ahVar3.f651b) {
                        ahVar3.f651b++;
                    } else if (ahVar2.f651b < ahVar3.f651b + ahVar3.d) {
                        int i18 = (ahVar3.f651b + ahVar3.d) - ahVar2.f651b;
                        ahVar6 = diVar.f766a.a(4, ahVar2.f651b + 1, i18, ahVar3.c);
                        ahVar3.d -= i18;
                    }
                    arrayList.set(i16, ahVar2);
                    if (ahVar3.d > 0) {
                        arrayList.set(i, ahVar3);
                    } else {
                        arrayList.remove(i);
                        diVar.f766a.a(ahVar3);
                    }
                    if (ahVar5 != null) {
                        arrayList.add(i, ahVar5);
                    }
                    if (ahVar6 != null) {
                        arrayList.add(i, ahVar6);
                        break;
                    } else {
                        break;
                    }
            }
        }
    }

    final void c() {
        int size = this.f649b.size();
        for (int i = 0; i < size; i++) {
            this.c.b(this.f649b.get(i));
        }
        a(this.f649b);
        this.g = 0;
    }

    private void b(ah ahVar) {
        int i;
        boolean z;
        if (ahVar.f650a == 1 || ahVar.f650a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int b2 = b(ahVar.f651b, ahVar.f650a);
        int i2 = ahVar.f651b;
        switch (ahVar.f650a) {
            case 2:
                i = 0;
                break;
            case 3:
            default:
                throw new IllegalArgumentException("op should be remove or update." + ahVar);
            case 4:
                i = 1;
                break;
        }
        int i3 = 1;
        int i4 = b2;
        int i5 = i2;
        for (int i6 = 1; i6 < ahVar.d; i6++) {
            int b3 = b(ahVar.f651b + (i * i6), ahVar.f650a);
            switch (ahVar.f650a) {
                case 2:
                    if (b3 == i4) {
                        z = true;
                        break;
                    } else {
                        z = false;
                        break;
                    }
                case 3:
                default:
                    z = false;
                    break;
                case 4:
                    if (b3 == i4 + 1) {
                        z = true;
                        break;
                    } else {
                        z = false;
                        break;
                    }
            }
            if (z) {
                i3++;
            } else {
                ah a2 = a(ahVar.f650a, i4, i3, ahVar.c);
                a(a2, i5);
                a(a2);
                if (ahVar.f650a == 4) {
                    i5 += i3;
                }
                i3 = 1;
                i4 = b3;
            }
        }
        Object obj = ahVar.c;
        a(ahVar);
        if (i3 > 0) {
            ah a3 = a(ahVar.f650a, i4, i3, obj);
            a(a3, i5);
            a(a3);
        }
    }

    private void a(ah ahVar, int i) {
        this.c.a(ahVar);
        switch (ahVar.f650a) {
            case 2:
                this.c.a(i, ahVar.d);
                return;
            case 3:
            default:
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            case 4:
                this.c.a(i, ahVar.d, ahVar.c);
                return;
        }
    }

    private int b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = this.f649b.size() - 1;
        int i6 = i;
        while (size >= 0) {
            ah ahVar = this.f649b.get(size);
            if (ahVar.f650a == 8) {
                if (ahVar.f651b < ahVar.d) {
                    i4 = ahVar.f651b;
                    i5 = ahVar.d;
                } else {
                    i4 = ahVar.d;
                    i5 = ahVar.f651b;
                }
                if (i6 >= i4 && i6 <= i5) {
                    if (i4 == ahVar.f651b) {
                        if (i2 == 1) {
                            ahVar.d++;
                        } else if (i2 == 2) {
                            ahVar.d--;
                        }
                        i3 = i6 + 1;
                    } else {
                        if (i2 == 1) {
                            ahVar.f651b++;
                        } else if (i2 == 2) {
                            ahVar.f651b--;
                        }
                        i3 = i6 - 1;
                    }
                } else {
                    if (i6 < ahVar.f651b) {
                        if (i2 == 1) {
                            ahVar.f651b++;
                            ahVar.d++;
                            i3 = i6;
                        } else if (i2 == 2) {
                            ahVar.f651b--;
                            ahVar.d--;
                        }
                    }
                    i3 = i6;
                }
            } else if (ahVar.f651b <= i6) {
                if (ahVar.f650a == 1) {
                    i3 = i6 - ahVar.d;
                } else {
                    if (ahVar.f650a == 2) {
                        i3 = ahVar.d + i6;
                    }
                    i3 = i6;
                }
            } else if (i2 == 1) {
                ahVar.f651b++;
                i3 = i6;
            } else {
                if (i2 == 2) {
                    ahVar.f651b--;
                }
                i3 = i6;
            }
            size--;
            i6 = i3;
        }
        for (int size2 = this.f649b.size() - 1; size2 >= 0; size2--) {
            ah ahVar2 = this.f649b.get(size2);
            if (ahVar2.f650a == 8) {
                if (ahVar2.d == ahVar2.f651b || ahVar2.d < 0) {
                    this.f649b.remove(size2);
                    a(ahVar2);
                }
            } else if (ahVar2.d <= 0) {
                this.f649b.remove(size2);
                a(ahVar2);
            }
        }
        return i6;
    }

    private boolean c(int i) {
        int size = this.f649b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ah ahVar = this.f649b.get(i2);
            if (ahVar.f650a == 8) {
                if (a(ahVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (ahVar.f650a == 1) {
                int i3 = ahVar.f651b + ahVar.d;
                for (int i4 = ahVar.f651b; i4 < i3; i4++) {
                    if (a(i4, i2 + 1) == i) {
                        return true;
                    }
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void c(ah ahVar) {
        this.f649b.add(ahVar);
        switch (ahVar.f650a) {
            case 1:
                this.c.c(ahVar.f651b, ahVar.d);
                return;
            case 2:
                this.c.b(ahVar.f651b, ahVar.d);
                return;
            case 3:
            case 5:
            case 6:
            case 7:
            default:
                throw new IllegalArgumentException("Unknown update op type for " + ahVar);
            case 4:
                this.c.a(ahVar.f651b, ahVar.d, ahVar.c);
                return;
            case 8:
                this.c.d(ahVar.f651b, ahVar.d);
                return;
        }
    }

    final boolean d() {
        return this.f648a.size() > 0;
    }

    final boolean a(int i) {
        return (this.g & i) != 0;
    }

    final int b(int i) {
        return a(i, 0);
    }

    final int a(int i, int i2) {
        int size = this.f649b.size();
        int i3 = i;
        while (i2 < size) {
            ah ahVar = this.f649b.get(i2);
            if (ahVar.f650a == 8) {
                if (ahVar.f651b == i3) {
                    i3 = ahVar.d;
                } else {
                    if (ahVar.f651b < i3) {
                        i3--;
                    }
                    if (ahVar.d <= i3) {
                        i3++;
                    }
                }
            } else if (ahVar.f651b > i3) {
                continue;
            } else if (ahVar.f650a == 2) {
                if (i3 < ahVar.f651b + ahVar.d) {
                    return -1;
                }
                i3 -= ahVar.d;
            } else if (ahVar.f650a == 1) {
                i3 += ahVar.d;
            }
            i2++;
        }
        return i3;
    }

    final void e() {
        c();
        int size = this.f648a.size();
        for (int i = 0; i < size; i++) {
            ah ahVar = this.f648a.get(i);
            switch (ahVar.f650a) {
                case 1:
                    this.c.b(ahVar);
                    this.c.c(ahVar.f651b, ahVar.d);
                    break;
                case 2:
                    this.c.b(ahVar);
                    this.c.a(ahVar.f651b, ahVar.d);
                    break;
                case 4:
                    this.c.b(ahVar);
                    this.c.a(ahVar.f651b, ahVar.d, ahVar.c);
                    break;
                case 8:
                    this.c.b(ahVar);
                    this.c.d(ahVar.f651b, ahVar.d);
                    break;
            }
            if (this.d != null) {
                this.d.run();
            }
        }
        a(this.f648a);
        this.g = 0;
    }

    @Override // android.support.v7.widget.dj
    public final ah a(int i, int i2, int i3, Object obj) {
        ah a2 = this.h.a();
        if (a2 == null) {
            return new ah(i, i2, i3, obj);
        }
        a2.f650a = i;
        a2.f651b = i2;
        a2.d = i3;
        a2.c = obj;
        return a2;
    }

    @Override // android.support.v7.widget.dj
    public final void a(ah ahVar) {
        if (!this.e) {
            ahVar.c = null;
            this.h.a(ahVar);
        }
    }

    private void a(List<ah> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(list.get(i));
        }
        list.clear();
    }
}
