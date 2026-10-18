package com.google.android.play.search;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* loaded from: classes.dex */
final class m implements ActionMode.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlaySearchEditText f7049a;

    m(PlaySearchEditText playSearchEditText) {
        this.f7049a = playSearchEditText;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }
}
