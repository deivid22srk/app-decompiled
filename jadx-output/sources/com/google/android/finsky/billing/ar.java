package com.google.android.finsky.billing;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public final class ar extends android.support.v4.app.r {
    public static ar b(int i) {
        ar arVar = new ar();
        Bundle bundle = new Bundle();
        bundle.putInt("message_id", i);
        arVar.f(bundle);
        return arVar;
    }

    public static ar u() {
        ar arVar = new ar();
        arVar.f(new Bundle());
        return arVar;
    }

    @Override // android.support.v4.app.r
    public final Dialog c(Bundle bundle) {
        b(false);
        ProgressDialog progressDialog = new ProgressDialog(f());
        progressDialog.setProgressStyle(0);
        int i = this.r.getInt("message_id", R.string.loading);
        if (this.r.containsKey("message")) {
            progressDialog.setMessage(this.r.getString("message"));
        } else if (i != 0) {
            progressDialog.setMessage(g().getString(i));
        }
        progressDialog.setCancelable(false);
        progressDialog.setIndeterminate(true);
        return progressDialog;
    }
}
