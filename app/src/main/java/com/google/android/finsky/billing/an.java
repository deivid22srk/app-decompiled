package com.google.android.finsky.billing;

import android.text.TextUtils;
import com.google.android.finsky.protos.kw;
import com.google.android.finsky.protos.mc;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class an {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<Integer> f2166a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public mc f2167b;
    public byte[] c;
    public boolean d;
    public kw[] e;

    public final String a() {
        return TextUtils.join(",", this.f2166a);
    }

    public final void a(int i) {
        this.f2166a.add(Integer.valueOf(i));
    }
}
