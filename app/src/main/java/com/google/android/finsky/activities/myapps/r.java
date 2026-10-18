package com.google.android.finsky.activities.myapps;

import android.view.ActionMode;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
final class r implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ActionMode f1838a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MenuItem f1839b;
    final /* synthetic */ q c;

    r(q qVar, ActionMode actionMode, MenuItem menuItem) {
        this.c = qVar;
        this.f1838a = actionMode;
        this.f1839b = menuItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.onActionItemClicked(this.f1838a, this.f1839b);
    }
}
