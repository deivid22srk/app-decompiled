package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.SafeBrowsingData;

/* loaded from: classes.dex */
public interface pl extends IInterface {
    void a(Status status, AttestationData attestationData);

    void a(Status status, SafeBrowsingData safeBrowsingData);

    void a(String str);
}
