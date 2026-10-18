package com.google.android.finsky.utils;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.PermissionPolicies;

/* loaded from: classes.dex */
public final class eq implements com.google.android.finsky.receivers.aq {
    @Override // com.google.android.finsky.receivers.aq
    public final void b(String str) {
        PermissionPolicies.PermissionPolicyService.a(FinskyApp.a(), str, 0);
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void a(String str, boolean z) {
        if (z) {
            PermissionPolicies.PermissionPolicyService.a(FinskyApp.a(), str, 1);
        }
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void c(String str) {
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void a(String[] strArr) {
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void d(String str) {
    }
}
