package com.google.android.finsky.billing.lightpurchase;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class a extends android.support.v4.app.t {
    private android.support.v7.a.ag k;

    public boolean h() {
        return false;
    }

    @Override // android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        android.support.v7.a.ag f = f();
        if (f != null) {
            f.i();
            f.a(bundle);
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        android.support.v7.a.ag f = f();
        if (f != null) {
            f.c();
        }
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        android.support.v7.a.ag f = f();
        return f != null ? f.b() : super.getMenuInflater();
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        android.support.v7.a.ag f = f();
        if (f != null) {
            f.a(i);
        } else {
            super.setContentView(i);
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        android.support.v7.a.ag f = f();
        if (f != null) {
            f.a(view);
        } else {
            super.setContentView(view);
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        android.support.v7.a.ag f = f();
        if (f != null) {
            f.a(view, layoutParams);
        } else {
            super.setContentView(view, layoutParams);
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        android.support.v7.a.ag f = f();
        if (f != null) {
            f.b(view, layoutParams);
        } else {
            super.addContentView(view, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        android.support.v7.a.ag f = f();
        if (f != null) {
            f.e();
        }
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        android.support.v7.a.ag f = f();
        if (f != null) {
            f.a(charSequence);
        }
    }

    @Override // android.support.v4.app.t, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        android.support.v7.a.ag f = f();
        if (f != null) {
            f.a(configuration);
        }
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onStop() {
        super.onStop();
        android.support.v7.a.ag f = f();
        if (f != null) {
            f.d();
        }
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.support.v7.a.ag f = f();
        if (f != null) {
            f.g();
        }
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        android.support.v7.a.ag f = f();
        if (f != null) {
            f.f();
        } else {
            super.invalidateOptionsMenu();
        }
    }

    private android.support.v7.a.ag f() {
        if (h()) {
            return null;
        }
        if (this.k == null) {
            this.k = android.support.v7.a.ag.a(this, (android.support.v7.a.af) null);
        }
        return this.k;
    }
}
