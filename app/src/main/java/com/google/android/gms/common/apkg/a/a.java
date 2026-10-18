package com.google.android.gms.common.apkg.a;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.people.internal.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f5563a;

    public a(Intent intent) {
        this.f5563a = new Intent(intent);
    }

    public a(String str) {
        this(new Intent(str).setPackage("com.google.android.gms"));
    }

    @Override // com.google.android.gms.common.apkg.a.c
    public final Intent a() {
        return this.f5563a;
    }

    @Override // com.google.android.gms.common.apkg.a.c
    public final /* synthetic */ c a(String str) {
        this.f5563a.putExtra("com.google.android.gms.common.acl.EXTRA_CLIENT_APPLICATION_ID", str);
        return this;
    }

    @Override // com.google.android.gms.common.apkg.a.c
    public final /* synthetic */ c b(String str) {
        u.a(str, "People qualified ID");
        AudienceMember a2 = AudienceMember.a(str);
        Intent intent = this.f5563a;
        Parcel obtain = Parcel.obtain();
        a2.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.android.gms.common.acl.EXTRA_UPDATE_PERSON", marshall);
        return this;
    }

    @Override // com.google.android.gms.common.apkg.a.c
    public final /* synthetic */ c a(List list) {
        List list2 = list == null ? Collections.EMPTY_LIST : list;
        this.f5563a.putParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_INITIAL_AUDIENCE", list2 instanceof ArrayList ? (ArrayList) list2 : new ArrayList<>(list2));
        return this;
    }

    @Override // com.google.android.gms.common.apkg.a.c
    public final /* synthetic */ c c(String str) {
        this.f5563a.putExtra("com.google.android.gms.common.acl.EXTRA_ACCOUNT_NAME", str);
        return this;
    }
}
