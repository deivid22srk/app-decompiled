package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ga;
import com.google.android.gms.internal.zzfu;

/* loaded from: classes.dex */
public class AdActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private ga f5254a;

    private void a() {
        if (this.f5254a != null) {
            try {
                this.f5254a.l();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.b.c("Could not forward setContentViewSet to ad overlay:", e);
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        boolean z = true;
        try {
            if (this.f5254a != null) {
                z = this.f5254a.e();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Could not forward onBackPressed to ad overlay:", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5254a = zzfu.a((Activity) this);
        if (this.f5254a == null) {
            com.google.android.gms.ads.internal.util.client.b.e("Could not create ad overlay.");
            finish();
            return;
        }
        try {
            this.f5254a.a(bundle);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Could not forward onCreate to ad overlay:", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        try {
            if (this.f5254a != null) {
                this.f5254a.k();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Could not forward onDestroy to ad overlay:", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        try {
            if (this.f5254a != null) {
                this.f5254a.i();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Could not forward onPause to ad overlay:", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        try {
            if (this.f5254a != null) {
                this.f5254a.f();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Could not forward onRestart to ad overlay:", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        try {
            if (this.f5254a != null) {
                this.f5254a.h();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Could not forward onResume to ad overlay:", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.f5254a != null) {
                this.f5254a.b(bundle);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Could not forward onSaveInstanceState to ad overlay:", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        try {
            if (this.f5254a != null) {
                this.f5254a.g();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Could not forward onStart to ad overlay:", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        try {
            if (this.f5254a != null) {
                this.f5254a.j();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Could not forward onStop to ad overlay:", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        super.setContentView(i);
        a();
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
