package com.google.android.finsky.activities;

import android.accounts.Account;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public class gj extends android.support.v4.app.r {
    private com.google.android.finsky.a.i aj;
    private com.google.android.finsky.layout.play.cy ak;
    private boolean al = false;
    protected go ai = null;

    public final go v() {
        return this.ai;
    }

    @Override // android.support.v4.app.r, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (this.r.getBoolean("cancel_does_negative_action", true)) {
            x();
        }
    }

    private Bundle i(Bundle bundle) {
        Bundle result;
        if (this.ai != null && (result = this.ai.getResult()) != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putAll(result);
        }
        return bundle;
    }

    public void y() {
    }

    protected void u() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.app.r
    public Dialog c(Bundle bundle) {
        Bundle bundle2 = this.r;
        Account account = (Account) bundle2.getParcelable("log_account");
        if (account == null) {
            account = FinskyApp.a().i();
        }
        this.aj = FinskyApp.a().c(account);
        this.ak = null;
        if (bundle2.containsKey("impression_type")) {
            this.ak = new com.google.android.finsky.layout.play.ad(bundle2.getInt("impression_type"), bundle2.getByteArray("impression_cookie"), null);
        }
        if (bundle == null && this.ak != null) {
            this.aj.a(0L, this.ak);
        }
        com.google.android.wallet.ui.common.a aVar = new com.google.android.wallet.ui.common.a(f());
        if (bundle2.containsKey("title_id")) {
            aVar.a(bundle2.getInt("title_id"));
        }
        if (bundle2.containsKey("title")) {
            aVar.a(bundle2.getString("title"));
        }
        if (bundle2.containsKey("message_id")) {
            aVar.b(bundle2.getInt("message_id"));
        } else if (bundle2.containsKey("message")) {
            aVar.b(bundle2.getString("message"));
        } else if (bundle2.containsKey("messageHtml")) {
            aVar.b(Html.fromHtml(bundle2.getString("messageHtml")));
        }
        if (bundle2.containsKey("positive_id")) {
            aVar.a(bundle2.getInt("positive_id"), new gk(this));
        }
        if (bundle2.containsKey("negative_id")) {
            aVar.b(bundle2.getInt("negative_id"), new gl(this));
        }
        if (bundle2.containsKey("force_inverse_background")) {
            boolean z = bundle2.getBoolean("force_inverse_background");
            if (aVar.f7468b != null) {
                aVar.f7468b.setInverseBackgroundForced(z);
            } else {
                aVar.f7467a.f473a.K = z;
            }
        }
        if (bundle2.containsKey("layoutId")) {
            View inflate = LayoutInflater.from(f()).inflate(bundle2.getInt("layoutId"), (ViewGroup) null);
            aVar.a(inflate);
            if (inflate instanceof go) {
                this.ai = (go) inflate;
                if (bundle2.containsKey("config_arguments")) {
                    this.ai.a(bundle2.getBundle("config_arguments"));
                }
            }
        }
        Dialog a2 = aVar.a();
        if (!bundle2.containsKey("layoutId")) {
            a2.setOnShowListener(new gm(this, a2));
        }
        if (bundle2.containsKey("cancel_on_touch_outside")) {
            a2.setCanceledOnTouchOutside(bundle2.getBoolean("cancel_on_touch_outside"));
        }
        return a2;
    }

    public final void w() {
        a(false);
        if (!this.al) {
            this.al = true;
            Bundle bundle = this.r;
            int i = bundle.getInt("target_request_code");
            Bundle i2 = i(bundle.getBundle("extra_arguments"));
            int i3 = bundle.getInt("click_event_type_positive", -1);
            if (i3 != -1) {
                this.aj.a(i3, (byte[]) null, this.ak);
            }
            gp z = z();
            if (z != null) {
                z.a(i, i2);
            }
            y();
        }
    }

    public final void x() {
        a(false);
        if (!this.al) {
            this.al = true;
            Bundle bundle = this.r;
            int i = bundle.getInt("target_request_code");
            Bundle i2 = i(bundle.getBundle("extra_arguments"));
            int i3 = bundle.getInt("click_event_type_negative", -1);
            if (i3 != -1) {
                this.aj.a(i3, (byte[]) null, this.ak);
            }
            gp z = z();
            if (z != null) {
                z.b(i, i2);
            }
            u();
        }
    }

    private gp z() {
        ComponentCallbacks componentCallbacks = this.s;
        if (componentCallbacks instanceof gp) {
            return (gp) componentCallbacks;
        }
        android.support.v4.app.c f = f();
        if (f instanceof gp) {
            return (gp) f;
        }
        return null;
    }
}
