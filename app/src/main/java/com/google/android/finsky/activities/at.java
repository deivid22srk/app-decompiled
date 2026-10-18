package com.google.android.finsky.activities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class at extends PreferenceActivity {

    /* renamed from: a, reason: collision with root package name */
    private android.support.v7.a.ag f1557a;

    @Override // android.preference.PreferenceActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        a().i();
        a().a(bundle);
        super.onCreate(bundle);
        a().a().a(true);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        a().c();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return a().b();
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        a().a(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        a().a(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().a(view, layoutParams);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().b(view, layoutParams);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        a().e();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        a().a(charSequence);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a().a(configuration);
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        a().d();
    }

    @Override // android.preference.PreferenceActivity, android.app.ListActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        a().g();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        a().f();
    }

    private android.support.v7.a.ag a() {
        if (this.f1557a == null) {
            this.f1557a = android.support.v7.a.ag.a(this, (android.support.v7.a.af) null);
        }
        return this.f1557a;
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }
}
