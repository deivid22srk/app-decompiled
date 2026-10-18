package com.google.android.finsky.billing.iab;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
final class a extends com.deivid22srk.store.apkg.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FirstPartyInAppBillingService f2234a;

    private a(FirstPartyInAppBillingService firstPartyInAppBillingService) {
        this.f2234a = firstPartyInAppBillingService;
    }

    /* synthetic */ a(FirstPartyInAppBillingService firstPartyInAppBillingService, byte b2) {
        this(firstPartyInAppBillingService);
    }

    @Override // com.deivid22srk.store.apkg.c
    public final int a(String str, int i, String str2, String str3) {
        n a2 = FirstPartyInAppBillingService.a(this.f2234a, str, str2);
        return a2 != n.RESULT_OK ? a2.l : FirstPartyInAppBillingService.a(this.f2234a, str).a(i, str3);
    }

    @Override // com.deivid22srk.store.apkg.c
    public final Bundle a(String str, int i, String str2, String str3, Bundle bundle) {
        n a2 = FirstPartyInAppBillingService.a(this.f2234a, str, str2);
        return a2 != n.RESULT_OK ? FirstPartyInAppBillingService.a(a2) : FirstPartyInAppBillingService.a(this.f2234a, str).a(i, str2, str3, bundle);
    }

    @Override // com.deivid22srk.store.apkg.c
    public final Bundle a(String str, int i, String str2, String str3, String str4, String str5) {
        n a2 = FirstPartyInAppBillingService.a(this.f2234a, str, str2);
        return a2 != n.RESULT_OK ? FirstPartyInAppBillingService.a(a2) : FirstPartyInAppBillingService.a(this.f2234a, str).a(i, str2, str3, str4, str5);
    }

    @Override // com.deivid22srk.store.apkg.c
    public final Bundle a(String str, int i, String str2, String str3, String str4) {
        n a2 = FirstPartyInAppBillingService.a(this.f2234a, str, str2);
        return a2 != n.RESULT_OK ? FirstPartyInAppBillingService.a(a2) : FirstPartyInAppBillingService.a(this.f2234a, str).a(i, str2, str3, str4);
    }

    @Override // com.deivid22srk.store.apkg.c
    public final int b(String str, int i, String str2, String str3) {
        n a2 = FirstPartyInAppBillingService.a(this.f2234a, str, str2);
        return a2 != n.RESULT_OK ? a2.l : FirstPartyInAppBillingService.a(this.f2234a, str).a(i, str2, str3);
    }

    @Override // com.deivid22srk.store.apkg.c
    public final int c(String str, int i, String str2, String str3) {
        n a2 = FirstPartyInAppBillingService.a(this.f2234a, str, str2);
        return a2 != n.RESULT_OK ? a2.l : FirstPartyInAppBillingService.a(this.f2234a, str).b(i, str2, str3);
    }

    @Override // com.deivid22srk.store.apkg.c
    public final Bundle a(String str, int i, String str2, List<String> list, String str3, String str4, String str5) {
        n a2 = FirstPartyInAppBillingService.a(this.f2234a, str, str2);
        return a2 != n.RESULT_OK ? FirstPartyInAppBillingService.a(a2) : FirstPartyInAppBillingService.a(this.f2234a, str).a(i, str2, list, str3, str4, str5);
    }
}
