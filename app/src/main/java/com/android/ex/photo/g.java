package com.android.ex.photo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/* loaded from: classes.dex */
public class g extends android.support.v7.a.e implements t {
    private k k;
    private c l;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k = g();
        this.k.a(bundle);
    }

    public k g() {
        return new k(this);
    }

    @Override // com.android.ex.photo.t
    public final k h() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onResume() {
        super.onResume();
        this.k.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onPause() {
        this.k.e();
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onDestroy() {
        this.k.m = true;
        super.onDestroy();
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onBackPressed() {
        if (!this.k.f()) {
            super.onBackPressed();
        }
    }

    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.k.b(bundle);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z;
        k kVar = this.k;
        switch (menuItem.getItemId()) {
            case R.id.home:
                kVar.c.finish();
                z = true;
                break;
            default:
                z = false;
                break;
        }
        return z || super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.android.ex.photo.t
    public final Context i() {
        return this;
    }

    @Override // com.android.ex.photo.t
    public a j() {
        if (this.l == null) {
            this.l = new c(f().a());
        }
        return this.l;
    }
}
