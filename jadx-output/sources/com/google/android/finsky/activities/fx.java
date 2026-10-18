package com.google.android.finsky.activities;

import android.preference.Preference;
import android.widget.ListAdapter;

/* loaded from: classes.dex */
final class fx implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SettingsActivity f1755a;

    fx(SettingsActivity settingsActivity) {
        this.f1755a = settingsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String stringExtra = this.f1755a.getIntent().getStringExtra("setting-key-to-scroll");
        ListAdapter adapter = this.f1755a.getListView().getAdapter();
        if (adapter != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < adapter.getCount()) {
                    if (!(adapter.getItem(i2) instanceof Preference) || !stringExtra.equals(((Preference) adapter.getItem(i2)).getKey())) {
                        i = i2 + 1;
                    } else {
                        this.f1755a.getListView().setSelection(i2);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
