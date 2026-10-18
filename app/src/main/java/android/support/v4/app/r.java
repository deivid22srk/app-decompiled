package android.support.v4.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/* loaded from: classes.dex */
public class r extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    int f231a = 0;

    /* renamed from: b, reason: collision with root package name */
    int f232b = 0;
    boolean c = true;
    public boolean d = true;
    int e = -1;
    public Dialog f;
    boolean g;
    boolean h;
    boolean i;

    public final void a(int i, int i2) {
        this.f231a = i;
        if (this.f231a == 2 || this.f231a == 3) {
            this.f232b = android.R.style.Theme.Panel;
        }
        if (i2 != 0) {
            this.f232b = i2;
        }
    }

    public void a(aa aaVar, String str) {
        this.h = false;
        this.i = true;
        ap a2 = aaVar.a();
        a2.a(this, str);
        a2.b();
    }

    public final void a(boolean z) {
        if (!this.h) {
            this.h = true;
            this.i = false;
            if (this.f != null) {
                this.f.dismiss();
                this.f = null;
            }
            this.g = true;
            if (this.e >= 0) {
                this.B.b(this.e);
                this.e = -1;
                return;
            }
            ap a2 = this.B.a();
            a2.a(this);
            if (z) {
                a2.c();
            } else {
                a2.b();
            }
        }
    }

    public final void b(boolean z) {
        this.c = z;
        if (this.f != null) {
            this.f.setCancelable(z);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void a(Activity activity) {
        super.a(activity);
        if (!this.i) {
            this.h = false;
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void E_() {
        super.E_();
        if (!this.i && !this.h) {
            this.h = true;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        this.d = this.G == 0;
        if (bundle != null) {
            this.f231a = bundle.getInt("android:style", 0);
            this.f232b = bundle.getInt("android:theme", 0);
            this.c = bundle.getBoolean("android:cancelable", true);
            this.d = bundle.getBoolean("android:showsDialog", this.d);
            this.e = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final LayoutInflater b(Bundle bundle) {
        if (!this.d) {
            return super.b(bundle);
        }
        this.f = c(bundle);
        if (this.f != null) {
            Dialog dialog = this.f;
            switch (this.f231a) {
                case 3:
                    dialog.getWindow().addFlags(24);
                case 1:
                case 2:
                    dialog.requestWindowFeature(1);
                    break;
            }
            return (LayoutInflater) this.f.getContext().getSystemService("layout_inflater");
        }
        return (LayoutInflater) this.C.c.getSystemService("layout_inflater");
    }

    public Dialog c(Bundle bundle) {
        return new Dialog(f(), this.f232b);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.g) {
            a(true);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void d(Bundle bundle) {
        Bundle bundle2;
        super.d(bundle);
        if (!this.d) {
            return;
        }
        View view = this.R;
        if (view != null) {
            if (view.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            this.f.setContentView(view);
        }
        this.f.setOwnerActivity(f());
        this.f.setCancelable(this.c);
        this.f.setOnCancelListener(this);
        this.f.setOnDismissListener(this);
        if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f.onRestoreInstanceState(bundle2);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void g_() {
        super.g_();
        if (this.f != null) {
            this.g = false;
            this.f.show();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void e(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.e(bundle);
        if (this.f != null && (onSaveInstanceState = this.f.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        if (this.f231a != 0) {
            bundle.putInt("android:style", this.f231a);
        }
        if (this.f232b != 0) {
            bundle.putInt("android:theme", this.f232b);
        }
        if (!this.c) {
            bundle.putBoolean("android:cancelable", this.c);
        }
        if (!this.d) {
            bundle.putBoolean("android:showsDialog", this.d);
        }
        if (this.e != -1) {
            bundle.putInt("android:backStackId", this.e);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void h_() {
        super.h_();
        if (this.f != null) {
            this.f.hide();
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void d() {
        super.d();
        if (this.f != null) {
            this.g = true;
            this.f.dismiss();
            this.f = null;
        }
    }
}
