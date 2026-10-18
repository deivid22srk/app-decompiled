package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.support.v7.a.ad f7467a;

    /* renamed from: b, reason: collision with root package name */
    public final AlertDialog.Builder f7468b;
    private final Context c;

    public a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.wallet.e.c.uicDelegateToSupportLibAlertDialog});
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (z) {
            this.f7467a = new android.support.v7.a.ad(context);
            this.f7468b = null;
        } else {
            this.f7467a = null;
            this.f7468b = new AlertDialog.Builder(context);
        }
        this.c = context;
    }

    @TargetApi(11)
    public a(Context context, byte b2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.wallet.e.c.uicDelegateToSupportLibAlertDialog});
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (z) {
            this.c = context;
            this.f7467a = new android.support.v7.a.ad(context, R.style.FinskyLightDialogWithDimTheme);
            this.f7468b = null;
        } else if (Build.VERSION.SDK_INT >= 11) {
            this.c = context;
            this.f7467a = null;
            this.f7468b = new AlertDialog.Builder(context, R.style.FinskyLightDialogWithDimTheme);
        } else {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.FinskyLightDialogWithDimTheme);
            this.c = contextThemeWrapper;
            this.f7467a = null;
            this.f7468b = new AlertDialog.Builder(contextThemeWrapper);
        }
    }

    public final a a(int i) {
        if (this.f7468b != null) {
            this.f7468b.setTitle(i);
        } else {
            android.support.v7.a.ad adVar = this.f7467a;
            adVar.f473a.f = adVar.f473a.f543a.getText(i);
        }
        return this;
    }

    public final a a(CharSequence charSequence) {
        if (this.f7468b != null) {
            this.f7468b.setTitle(charSequence);
        } else {
            this.f7467a.a(charSequence);
        }
        return this;
    }

    public final a b(int i) {
        if (this.f7468b != null) {
            this.f7468b.setMessage(i);
        } else {
            android.support.v7.a.ad adVar = this.f7467a;
            adVar.f473a.h = adVar.f473a.f543a.getText(i);
        }
        return this;
    }

    public final a b(CharSequence charSequence) {
        if (this.f7468b != null) {
            this.f7468b.setMessage(charSequence);
        } else {
            this.f7467a.f473a.h = charSequence;
        }
        return this;
    }

    public final a a(int i, DialogInterface.OnClickListener onClickListener) {
        if (this.f7468b != null) {
            this.f7468b.setPositiveButton(i, onClickListener);
        } else {
            android.support.v7.a.ad adVar = this.f7467a;
            adVar.f473a.i = adVar.f473a.f543a.getText(i);
            adVar.f473a.j = onClickListener;
        }
        return this;
    }

    public final a a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        if (this.f7468b != null) {
            this.f7468b.setPositiveButton(charSequence, onClickListener);
        } else {
            android.support.v7.a.ad adVar = this.f7467a;
            adVar.f473a.i = charSequence;
            adVar.f473a.j = onClickListener;
        }
        return this;
    }

    public final a b(int i, DialogInterface.OnClickListener onClickListener) {
        if (this.f7468b != null) {
            this.f7468b.setNegativeButton(i, onClickListener);
        } else {
            android.support.v7.a.ad adVar = this.f7467a;
            adVar.f473a.k = adVar.f473a.f543a.getText(i);
            adVar.f473a.l = onClickListener;
        }
        return this;
    }

    public final a b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        if (this.f7468b != null) {
            this.f7468b.setNegativeButton(charSequence, onClickListener);
        } else {
            android.support.v7.a.ad adVar = this.f7467a;
            adVar.f473a.k = charSequence;
            adVar.f473a.l = onClickListener;
        }
        return this;
    }

    public final a a(boolean z) {
        if (this.f7468b != null) {
            this.f7468b.setCancelable(z);
        } else {
            this.f7467a.f473a.o = z;
        }
        return this;
    }

    public final a a(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        if (this.f7468b != null) {
            this.f7468b.setSingleChoiceItems(charSequenceArr, i, onClickListener);
        } else {
            android.support.v7.a.ad adVar = this.f7467a;
            adVar.f473a.s = charSequenceArr;
            adVar.f473a.u = onClickListener;
            adVar.f473a.F = i;
            adVar.f473a.E = true;
        }
        return this;
    }

    public final a a(View view) {
        if (this.f7468b != null) {
            this.f7468b.setView(view);
        } else {
            android.support.v7.a.ad adVar = this.f7467a;
            adVar.f473a.w = view;
            adVar.f473a.v = 0;
            adVar.f473a.B = false;
        }
        return this;
    }

    public final Dialog a() {
        return this.f7468b != null ? this.f7468b.create() : this.f7467a.a();
    }
}
