package com.google.android.gms.people.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.ks;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class m extends com.google.android.gms.common.internal.l<g> {
    private static volatile Bundle j;
    private static volatile Bundle k;
    public final String f;
    public final String g;
    public final Context h;
    private final HashMap<Object, s> i;
    private Long l;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0 && bundle != null) {
            a(bundle.getBundle("post_init_configuration"));
        }
        super.a(i, iBinder, bundle == null ? null : bundle.getBundle("post_init_resolution"), i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final String d() {
        return "com.google.android.gms.people.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final String e() {
        return "com.google.android.gms.people.internal.IPeopleService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putString("social_client_application_id", this.f);
        bundle.putString("real_client_package_name", this.g);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }

    public m(Context context, Looper looper, com.google.android.gms.common.api.p pVar, com.google.android.gms.common.api.q qVar, String str, com.google.android.gms.common.internal.h hVar) {
        super(context.getApplicationContext(), looper, 5, hVar, pVar, qVar);
        this.i = new HashMap<>();
        this.l = null;
        this.h = context;
        this.f = str;
        this.g = hVar.e;
    }

    @Override // com.google.android.gms.common.internal.l, com.google.android.gms.common.api.g
    public final void b() {
        synchronized (this.i) {
            if (g()) {
                for (s sVar : this.i.values()) {
                    sVar.f6423a.f6160a = null;
                    try {
                        ((g) super.o()).a((d) sVar, false, (String) null, (String) null, 0);
                    } catch (RemoteException e) {
                        t.a("PeopleClient", "Failed to unregister listener", e);
                    } catch (IllegalStateException e2) {
                        t.a("PeopleClient", "PeopleService is in unexpected state", e2);
                    }
                }
            }
            this.i.clear();
        }
        super.b();
    }

    private synchronized void a(Bundle bundle) {
        if (bundle != null) {
            com.google.android.gms.people.internal.apkg.d.a(bundle.getBoolean("use_contactables_api", true));
            com.google.android.gms.people.internal.l.f6413a.a(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
            j = bundle.getBundle("config.email_type_map");
            k = bundle.getBundle("config.phone_type_map");
        }
    }

    public final void a(ks<com.google.android.gms.people.e> ksVar, String str, String str2, String str3, int i, String str4, boolean z) {
        super.n();
        r rVar = new r(ksVar);
        try {
            ((g) super.o()).a(rVar, str, str2, str3, i, str4, z);
        } catch (RemoteException e) {
            rVar.a(8, (Bundle) null, (DataHolder) null);
        }
    }

    public final void a(ks<com.google.android.gms.people.g> ksVar, String str, String str2, String str3, Collection<String> collection, int i, boolean z, long j2, String str4, int i2, int i3, int i4) {
        super.n();
        n nVar = new n(ksVar);
        try {
            ((g) super.o()).a(nVar, str, str2, str3, collection == null ? null : new ArrayList(collection), i, z, j2, str4, i2, i3, i4);
        } catch (RemoteException e) {
            nVar.a(8, (Bundle) null, (DataHolder) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final /* synthetic */ g a(IBinder iBinder) {
        return com.google.android.gms.people.internal.h.a(iBinder);
    }

    static /* synthetic */ Status a(int i, Bundle bundle) {
        return new Status(i, null, bundle == null ? null : (PendingIntent) bundle.getParcelable("pendingIntent"));
    }

    static /* synthetic */ com.google.android.gms.people.model.f a(DataHolder dataHolder) {
        if (dataHolder == null) {
            return null;
        }
        return new com.google.android.gms.people.model.f(dataHolder, new com.google.android.gms.people.internal.apkg.c(k), new com.google.android.gms.people.internal.apkg.b(j));
    }
}
