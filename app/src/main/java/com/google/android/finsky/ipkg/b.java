package com.google.android.finsky.ipkg;

import com.google.android.finsky.utils.bx;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements bx {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f2852a;

    b(a aVar) {
        this.f2852a = aVar;
    }

    @Override // com.google.android.finsky.utils.bx
    public final void a(ArrayList<AudienceMember> arrayList) {
        this.f2852a.c = arrayList;
        this.f2852a.a();
    }

    @Override // com.google.android.finsky.utils.bx
    public final void a() {
        this.f2852a.c = new ArrayList<>();
        this.f2852a.a();
    }
}
