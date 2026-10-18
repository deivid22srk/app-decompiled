package com.google.android.gms.people.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
public final class ab extends com.google.android.gms.common.data.i implements com.google.android.gms.people.model.e {
    public static final String[] c = {"_id", "qualified_id", "gaia_id", "name", "sort_key", "sort_key_irank", "avatar", "profile_type", "v_circle_ids", "blocked", "in_viewer_domain", "last_modified", "name_verified", "given_name", "family_name", "affinity1", "affinity2", "affinity3", "affinity4", "affinity5", "people_in_common", "v_emails", "v_phones"};
    private final Bundle d;
    private final com.google.android.gms.people.internal.a.c e;
    private final com.google.android.gms.people.internal.a.b f;
    private final boolean g;

    public ab(DataHolder dataHolder, int i, Bundle bundle, com.google.android.gms.people.internal.a.c cVar, com.google.android.gms.people.internal.a.b bVar) {
        super(dataHolder, i);
        this.d = bundle;
        this.e = cVar;
        this.f = bVar;
        this.g = this.d.getBoolean("emails_with_affinities", false);
    }

    @Override // com.google.android.gms.people.model.e
    public final String[] a() {
        String c2 = c("v_circle_ids");
        return TextUtils.isEmpty(c2) ? u.d : u.e.split(c2, -1);
    }
}
