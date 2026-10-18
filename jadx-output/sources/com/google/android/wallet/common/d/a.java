package com.google.android.wallet.common.d;

import android.util.Pair;
import com.android.volley.t;
import com.google.android.wallet.common.c.a.c;
import com.google.protobuf.nano.c;

/* loaded from: classes.dex */
public abstract class a<RequestT extends com.google.android.wallet.common.c.a.c<?>, ResponseT extends com.google.protobuf.nano.c> implements t<Pair<RequestT, ResponseT>> {
    public abstract void a(RequestT requestt, ResponseT responset);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.volley.t
    public final /* synthetic */ void a_(Object obj) {
        Pair pair = (Pair) obj;
        a((com.google.android.wallet.common.c.a.c) pair.first, (com.google.protobuf.nano.c) pair.second);
    }
}
