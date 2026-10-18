package com.google.android.finsky.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.MenuItem;
import android.widget.Toast;
import com.android.vending.R;

/* loaded from: classes.dex */
public abstract class ay extends android.support.v7.a.e implements com.google.android.finsky.billing.g, com.google.android.finsky.billing.j {
    @Override // com.google.android.finsky.billing.g
    public final void a(Fragment fragment, String str) {
        android.support.v4.app.ap a2 = d().a();
        a2.a(R.id.content_frame, fragment);
        a2.c();
    }

    @Override // com.google.android.finsky.billing.g
    public final void a(android.support.v4.app.r rVar, String str) {
        android.support.v4.app.ap a2 = d().a();
        Fragment a3 = d().a(str);
        if (a3 != null) {
            a2.a(a3);
        }
        a2.a((String) null);
        rVar.a(d(), str);
    }

    @Override // com.google.android.finsky.billing.g
    public final void a(Fragment fragment) {
        android.support.v4.app.ap a2 = d().a();
        a2.a(fragment);
        a2.b();
    }

    @Override // com.google.android.finsky.billing.g
    public final void a(Bundle bundle, String str, Fragment fragment) {
        d().a(bundle, str, fragment);
    }

    @Override // com.google.android.finsky.billing.g
    public final Fragment a(Bundle bundle, String str) {
        return d().a(bundle, str);
    }

    @Override // com.google.android.finsky.billing.g
    public final void b(int i) {
    }

    @Override // com.google.android.finsky.billing.g
    public final void S_() {
    }

    @Override // com.google.android.finsky.billing.j
    public final void a(boolean z, Bundle bundle) {
        if (z) {
            setResult(0);
            finish();
        } else {
            Intent intent = new Intent();
            intent.putExtra("challenge_response", bundle);
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.google.android.finsky.billing.j
    public final void a(String str) {
        if (str != null) {
            Toast.makeText(this, str, 1).show();
        }
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }
}
