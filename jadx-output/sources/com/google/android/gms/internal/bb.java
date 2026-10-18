package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.auth.RecoveryDecision;
import com.google.android.gms.auth.RecoveryReadResponse;
import com.google.android.gms.auth.RecoveryWriteRequest;
import com.google.android.gms.auth.RecoveryWriteResponse;

/* loaded from: classes.dex */
public interface bb extends IInterface {
    RecoveryDecision a(String str, String str2, boolean z, Bundle bundle);

    RecoveryReadResponse a(String str, String str2);

    RecoveryWriteResponse a(RecoveryWriteRequest recoveryWriteRequest, String str);
}
