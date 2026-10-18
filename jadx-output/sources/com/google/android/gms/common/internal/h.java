package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.qg;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Account f5710a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<Scope> f5711b;
    final Set<Scope> c;
    public final Map<com.google.android.gms.common.api.a<?>, i> d;
    public final String e;
    final String f;
    public final qg g;
    public Integer h;
    private final int i;
    private final View j;

    public h(Account account, Set<Scope> set, Map<com.google.android.gms.common.api.a<?>, i> map, int i, View view, String str, String str2, qg qgVar) {
        this.f5710a = account;
        this.f5711b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.d = map == null ? Collections.EMPTY_MAP : map;
        this.j = view;
        this.i = i;
        this.e = str;
        this.f = str2;
        this.g = qgVar;
        HashSet hashSet = new HashSet(this.f5711b);
        Iterator<i> it = this.d.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().f5712a);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }
}
