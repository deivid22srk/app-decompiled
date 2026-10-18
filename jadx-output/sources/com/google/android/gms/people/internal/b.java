package com.google.android.gms.people.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
public final class b extends com.google.android.gms.common.data.i implements com.google.android.gms.people.model.a {
    private final Bundle c;

    public b(DataHolder dataHolder, int i, Bundle bundle) {
        super(dataHolder, i);
        this.c = bundle;
    }

    @Override // com.google.android.gms.people.model.a
    public final String a() {
        return c("circle_id");
    }

    @Override // com.google.android.gms.people.model.a
    public final String b() {
        Bundle bundle;
        int b2 = b("type");
        switch (b2) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 0:
            default:
                b2 = -2;
                break;
        }
        if (b2 != -1 && (bundle = this.c.getBundle("localized_group_names")) != null) {
            String string = bundle.getString(String.valueOf(b2));
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        return c("name");
    }
}
