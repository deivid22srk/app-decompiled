package com.a.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f1049a;

    /* synthetic */ t(u uVar, byte b2) {
        this(uVar);
    }

    public t(u uVar) {
        this.f1049a = (String[]) uVar.f1050a.toArray(new String[uVar.f1050a.size()]);
    }

    public final String a(String str) {
        String[] strArr = this.f1049a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final Date b(String str) {
        String a2 = a(str);
        if (a2 != null) {
            return com.a.a.apkg.apkg.m.a(a2);
        }
        return null;
    }

    public final String a(int i) {
        int i2 = i * 2;
        if (i2 < 0 || i2 >= this.f1049a.length) {
            return null;
        }
        return this.f1049a[i2];
    }

    public final String b(int i) {
        int i2 = (i * 2) + 1;
        if (i2 < 0 || i2 >= this.f1049a.length) {
            return null;
        }
        return this.f1049a[i2];
    }

    public final Set<String> a() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int length = this.f1049a.length / 2;
        for (int i = 0; i < length; i++) {
            treeSet.add(a(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public final List<String> c(String str) {
        int length = this.f1049a.length / 2;
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            if (str.equalsIgnoreCase(a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(b(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public final u b() {
        u uVar = new u();
        uVar.f1050a.addAll(Arrays.asList(this.f1049a));
        return uVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f1049a.length / 2;
        for (int i = 0; i < length; i++) {
            sb.append(a(i)).append(": ").append(b(i)).append("\n");
        }
        return sb.toString();
    }
}
