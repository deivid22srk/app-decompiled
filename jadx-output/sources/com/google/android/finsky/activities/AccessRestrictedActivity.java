package com.google.android.finsky.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.android.vending.R;

/* loaded from: classes.dex */
public class AccessRestrictedActivity extends android.support.v4.app.t implements gp {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onResume() {
        super.onResume();
        int intExtra = getIntent().getIntExtra("AccessRestrictedActivity.messageId", R.string.limited_user_text);
        gn gnVar = new gn();
        gnVar.a(intExtra).d(R.string.ok).a(true).a(308, null, -1, -1, null);
        gnVar.b().a(d(), "access_restricted_dialog");
    }

    private static void a(Activity activity, int i) {
        Intent intent = new Intent(activity, (Class<?>) AccessRestrictedActivity.class);
        intent.putExtra("AccessRestrictedActivity.messageId", i);
        activity.startActivity(intent);
    }

    public static void a(Activity activity) {
        a(activity, R.string.limited_user_text);
    }

    public static void b(Activity activity) {
        a(activity, R.string.limited_user_purchase_text);
    }

    public static void c(Activity activity) {
        a(activity, R.string.invalid_store_type_text);
    }

    @Override // com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        finish();
    }

    @Override // com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
        finish();
    }
}
