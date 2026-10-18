package com.google.android.gms.common.data;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class j<T> extends a<T> {

    /* renamed from: b, reason: collision with root package name */
    private boolean f5626b;
    private ArrayList<Integer> c;

    public j(DataHolder dataHolder) {
        super(dataHolder);
        this.f5626b = false;
    }

    private int b(int i) {
        if (i < 0 || i >= this.c.size()) {
            throw new IllegalArgumentException("Position " + i + " is out of bounds for this buffer");
        }
        return this.c.get(i).intValue();
    }

    public abstract T a(int i, int i2);

    @Override // com.google.android.gms.common.data.a, com.google.android.gms.common.data.b
    public final int c() {
        b();
        return this.c.size();
    }

    public abstract String d();

    @Override // com.google.android.gms.common.data.b
    public final T a(int i) {
        int i2;
        b();
        int b2 = b(i);
        if (i < 0 || i == this.c.size()) {
            i2 = 0;
        } else {
            i2 = i == this.c.size() + (-1) ? this.f5619a.h - this.c.get(i).intValue() : this.c.get(i + 1).intValue() - this.c.get(i).intValue();
            if (i2 == 1) {
                this.f5619a.a(b(i));
            }
        }
        return a(b2, i2);
    }

    private void b() {
        synchronized (this) {
            if (!this.f5626b) {
                int i = this.f5619a.h;
                this.c = new ArrayList<>();
                if (i > 0) {
                    this.c.add(0);
                    String d = d();
                    String b2 = this.f5619a.b(d, 0, this.f5619a.a(0));
                    int i2 = 1;
                    while (i2 < i) {
                        int a2 = this.f5619a.a(i2);
                        String b3 = this.f5619a.b(d, i2, a2);
                        if (b3 == null) {
                            throw new NullPointerException("Missing value for markerColumn: " + d + ", at row: " + i2 + ", for window: " + a2);
                        }
                        if (b3.equals(b2)) {
                            b3 = b2;
                        } else {
                            this.c.add(Integer.valueOf(i2));
                        }
                        i2++;
                        b2 = b3;
                    }
                }
                this.f5626b = true;
            }
        }
    }
}
