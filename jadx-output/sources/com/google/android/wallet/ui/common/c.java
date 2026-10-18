package com.google.android.wallet.ui.common;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;

/* loaded from: classes2.dex */
public class c extends android.support.v4.app.r {
    public static Bundle c(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("themeResourceId", i);
        return bundle;
    }

    public final LayoutInflater v() {
        return f().getLayoutInflater().cloneInContext(u());
    }

    public final ContextThemeWrapper u() {
        int i = this.r.getInt("themeResourceId");
        if (i <= 0) {
            throw new IllegalArgumentException(new StringBuilder(38).append("Invalid theme resource id: ").append(i).toString());
        }
        return new ContextThemeWrapper(f(), i);
    }
}
