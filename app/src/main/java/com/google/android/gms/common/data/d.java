package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.av;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    final String[] f5620a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<HashMap<String, Object>> f5621b;
    private final String c;
    private final HashMap<Object, Integer> d;
    private boolean e;
    private String f;

    private d(String[] strArr) {
        this.f5620a = (String[]) av.a(strArr);
        this.f5621b = new ArrayList<>();
        this.c = null;
        this.d = new HashMap<>();
        this.e = false;
        this.f = null;
    }

    /* synthetic */ d(String[] strArr, byte b2) {
        this(strArr);
    }
}
