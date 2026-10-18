package com.google.android.libraries.bind.data;

import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class a implements q {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f6680a;

    public a(Executor executor) {
        this.f6680a = executor;
    }

    @Override // com.google.android.libraries.bind.data.q
    public final Executor a() {
        return this.f6680a;
    }

    @Override // com.google.android.libraries.bind.data.q
    public List<Data> a(List<Data> list) {
        return list;
    }
}
