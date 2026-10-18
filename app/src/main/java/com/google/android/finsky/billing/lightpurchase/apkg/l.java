package com.google.android.finsky.billing.lightpurchase.apkg;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.r;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class l extends r {
    public DatePickerDialog ai;

    public static l a(Calendar calendar) {
        if (calendar == null) {
            throw new IllegalStateException("Calendar is not set");
        }
        l lVar = new l();
        Bundle bundle = new Bundle();
        bundle.putSerializable("DatePickerDialogFragment.calendar", calendar);
        lVar.f(bundle);
        return lVar;
    }

    @Override // android.support.v4.app.r, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBundle("DatePickerDialogFragment.calendar", this.ai.onSaveInstanceState());
    }

    @Override // android.support.v4.app.r
    public final Dialog c(Bundle bundle) {
        DatePickerDialog.OnDateSetListener onDateSetListener;
        ComponentCallbacks componentCallbacks = this.s;
        if (componentCallbacks instanceof DatePickerDialog.OnDateSetListener) {
            onDateSetListener = (DatePickerDialog.OnDateSetListener) componentCallbacks;
        } else {
            android.support.v4.app.c f = f();
            onDateSetListener = f instanceof DatePickerDialog.OnDateSetListener ? (DatePickerDialog.OnDateSetListener) f : null;
        }
        DatePickerDialog.OnDateSetListener onDateSetListener2 = Build.VERSION.SDK_INT >= 16 ? null : onDateSetListener;
        if (bundle == null) {
            Calendar calendar = (Calendar) this.r.getSerializable("DatePickerDialogFragment.calendar");
            this.ai = new DatePickerDialog(f(), onDateSetListener2, calendar.get(1), calendar.get(2), calendar.get(5));
        } else {
            this.ai = new DatePickerDialog(f(), onDateSetListener2, 0, 0, 0);
            this.ai.onRestoreInstanceState(bundle.getBundle("DatePickerDialogFragment.calendar"));
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.ai.setButton(-1, f().getString(R.string.ok), new m(this, onDateSetListener));
            this.ai.setButton(-2, f().getString(R.string.cancel), new n(this));
        }
        return this.ai;
    }
}
