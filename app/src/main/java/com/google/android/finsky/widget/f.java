package com.google.android.finsky.widget;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.aa;
import android.text.TextUtils;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.AccessRestrictedActivity;
import com.google.android.finsky.activities.gn;
import com.google.android.finsky.activities.gp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.protos.pt;
import com.google.android.finsky.utils.cg;
import com.google.android.finsky.utils.hi;
import com.google.android.finsky.utils.ic;

/* loaded from: classes.dex */
public abstract class f extends android.support.v4.app.t implements gp {
    public abstract void a(int i, String str);

    public abstract boolean h();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (com.google.android.finsky.safemode.a.b()) {
            com.google.android.finsky.safemode.a.d();
            finish();
        } else if (!ic.a(this)) {
            AccessRestrictedActivity.c(this);
            finish();
        } else {
            hi.a(new g(this));
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        setResult(0);
        finish();
    }

    @Override // com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
        setResult(0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DfeToc dfeToc, int i) {
        int size = (h() ? 1 : 0) + dfeToc.b().size();
        if (!f() || size <= 1) {
            a(-1, "apps");
            return;
        }
        Intent intent = new Intent(this, (Class<?>) WidgetConfigurationActivity.class);
        intent.putExtra("enableMultiCorpus", h());
        intent.putExtra("dfeToc", dfeToc);
        intent.putExtra("appWidgetId", i);
        for (pt ptVar : dfeToc.b()) {
            int i2 = ptVar.f4268a;
            intent.putExtra("backend_" + i2, c(i2));
            String str = "name_" + i2;
            String b2 = b(ptVar.f4268a);
            intent.putExtra(str, TextUtils.isEmpty(b2) ? ptVar.c : b2);
        }
        intent.putExtra("name_0", b(0));
        intent.putExtra("dialog_title", i());
        startActivityForResult(intent, 1);
    }

    public int i() {
        return R.string.app_name;
    }

    public String b(int i) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String str = null;
        if (intent != null) {
            str = s.a(intent.getIntExtra("backend", 3));
        }
        a(i2, str);
    }

    public boolean c(int i) {
        return true;
    }

    protected boolean f() {
        return true;
    }

    public static Intent a(Context context, Class<? extends f> cls, int i) {
        Intent intent = new Intent(context, cls);
        intent.addFlags(268435456);
        intent.putExtra("appWidgetId", i);
        return intent;
    }

    public static PendingIntent b(Context context, Class<? extends f> cls, int i) {
        Intent a2 = a(context, cls, -1);
        a2.putExtra("appWidgetId", i);
        return PendingIntent.getActivity(context, i, a2, 0);
    }

    static /* synthetic */ void a(f fVar) {
        com.google.android.finsky.api.b b2 = FinskyApp.a().b((String) null);
        if (b2 == null) {
            fVar.a(-1, (String) null);
            return;
        }
        Intent intent = fVar.getIntent();
        int intExtra = intent != null ? intent.getIntExtra("appWidgetId", -1) : -1;
        DfeToc dfeToc = FinskyApp.a().g;
        if (dfeToc != null) {
            fVar.a(dfeToc, intExtra);
        } else {
            cg.a(b2, false, new h(fVar, intExtra));
        }
    }

    static /* synthetic */ void b(f fVar) {
        aa d = fVar.d();
        if (d == null || d.a("Dialog.NoNetworkConnection") != null) {
            return;
        }
        gn gnVar = new gn();
        gnVar.a(R.string.no_connection_widget_dialog).d(R.string.ok);
        gnVar.b().a(d, "Dialog.NoNetworkConnection");
    }
}
