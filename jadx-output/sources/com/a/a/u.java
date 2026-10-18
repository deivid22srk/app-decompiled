package com.a.a;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    final List<String> f1050a = new ArrayList(20);

    public final u a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("name == null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("value == null");
        }
        if (str.length() == 0 || str.indexOf(0) != -1 || str2.indexOf(0) != -1) {
            throw new IllegalArgumentException("Unexpected header: " + str + ": " + str2);
        }
        return b(str, str2);
    }

    final u b(String str, String str2) {
        this.f1050a.add(str);
        this.f1050a.add(str2.trim());
        return this;
    }

    public final u a(String str) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f1050a.size()) {
                if (str.equalsIgnoreCase(this.f1050a.get(i2))) {
                    this.f1050a.remove(i2);
                    this.f1050a.remove(i2);
                    i2 -= 2;
                }
                i = i2 + 2;
            } else {
                return this;
            }
        }
    }

    public final u c(String str, String str2) {
        a(str);
        a(str, str2);
        return this;
    }

    public final t a() {
        return new t(this, (byte) 0);
    }
}
