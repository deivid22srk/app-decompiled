package com.google.android.finsky.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.TextView;
import com.google.android.finsky.layout.AppSecurityPermissions;

/* loaded from: classes.dex */
public final class ea extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private Bundle f1705a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f1706b;
    private TextView c;
    private TextView d;
    private AppSecurityPermissions e;

    public static ea a(String str, String str2, int i, int i2, int i3, String[] strArr) {
        ea eaVar = new ea();
        Bundle bundle = new Bundle();
        bundle.putString("InstallApprovalFragment.packageName", str);
        bundle.putString("InstallApprovalFragment.packageTitle", str2);
        bundle.putInt("InstallApprovalFragment.installNumber", i);
        bundle.putInt("InstallApprovalFragment.totalInstalls", i2);
        bundle.putInt("InstallApprovalFragment.approvalType", i3);
        bundle.putStringArray("InstallApprovalFragment.permissions", strArr);
        eaVar.f(bundle);
        return eaVar;
    }

    @Override // android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.f1705a = bundle;
    }

    @Override // android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (this.e != null) {
            this.e.a(bundle);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x006d, code lost:
    
        return r1;
     */
    @Override // android.support.v4.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View a(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.activities.ea.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
