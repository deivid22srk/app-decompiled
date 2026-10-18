package com.google.android.finsky.billing.lightpurchase.a;

import android.annotation.TargetApi;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.widget.DatePicker;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class m implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DatePickerDialog.OnDateSetListener f2298a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f2299b;

    m(l lVar, DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f2299b = lVar;
        this.f2298a = onDateSetListener;
    }

    @Override // android.content.DialogInterface.OnClickListener
    @TargetApi(11)
    public final void onClick(DialogInterface dialogInterface, int i) {
        DatePickerDialog datePickerDialog;
        if (this.f2298a != null) {
            datePickerDialog = this.f2299b.ai;
            DatePicker datePicker = datePickerDialog.getDatePicker();
            this.f2298a.onDateSet(datePicker, datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth());
            return;
        }
        FinskyLog.e("No listener found.", new Object[0]);
    }
}
