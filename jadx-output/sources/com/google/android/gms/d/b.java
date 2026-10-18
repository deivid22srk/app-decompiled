package com.google.android.gms.d;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;

/* loaded from: classes.dex */
final class b extends AsyncTask<Void, Void, Integer> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f5789a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f5790b;

    b(Context context, c cVar) {
        this.f5789a = context;
        this.f5790b = cVar;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Integer doInBackground(Void[] voidArr) {
        return a();
    }

    private Integer a() {
        try {
            a.a(this.f5789a);
            return 0;
        } catch (GooglePlayServicesNotAvailableException e) {
            return Integer.valueOf(e.f5558a);
        } catch (GooglePlayServicesRepairableException e2) {
            return Integer.valueOf(e2.f5559a);
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Integer num) {
        com.google.android.gms.common.b unused;
        Integer num2 = num;
        if (num2.intValue() == 0) {
            this.f5790b.b();
            return;
        }
        unused = a.f5787a;
        com.google.android.gms.common.b.a(this.f5789a, num2.intValue(), "pi");
        this.f5790b.a(num2.intValue());
    }
}
