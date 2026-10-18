package com.google.android.gms.people.model;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.internal.ab;

/* loaded from: classes.dex */
public final class f extends c<e> {

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.people.internal.a.c f6431b;
    private final com.google.android.gms.people.internal.a.b c;

    public f(DataHolder dataHolder, com.google.android.gms.people.internal.a.c cVar, com.google.android.gms.people.internal.a.b bVar) {
        super(dataHolder);
        this.f6431b = cVar;
        this.c = bVar;
    }

    public final String toString() {
        return "People:size=" + c();
    }

    @Override // com.google.android.gms.common.data.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final e a(int i) {
        return new ab(this.f5619a, i, this.f5619a.f, this.f6431b, this.c);
    }
}
