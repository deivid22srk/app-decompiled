package com.google.android.finsky.setup;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckedTextView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.finsky.protos.nv;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final nv[] f4649a;

    /* renamed from: b, reason: collision with root package name */
    private boolean[] f4650b;
    private ListView c;
    private int d;

    public a(nv[] nvVarArr) {
        this.f4649a = nvVarArr;
    }

    public final boolean a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        boolean[] booleanArray = bundle.getBooleanArray("SetupWizardAppListDialog.selectedBackupDocs");
        if (booleanArray == null) {
            FinskyLog.e("Missing SetupWizardAppListDialog.selectedBackupDocs", new Object[0]);
            return false;
        }
        this.f4650b = Arrays.copyOf(booleanArray, booleanArray.length);
        b();
        return true;
    }

    final void a(boolean[] zArr) {
        this.f4650b = zArr;
        b();
    }

    private void b() {
        this.d = 0;
        for (int i = 0; i < this.f4650b.length; i++) {
            if (this.f4650b[i]) {
                this.d++;
            }
        }
    }

    public final void a(Context context, ListView listView) {
        this.c = listView;
        listView.setAdapter((ListAdapter) new b(context, this.f4649a));
        for (int i = 0; i < this.f4650b.length; i++) {
            this.c.setItemChecked(i + 1, this.f4650b[i]);
        }
        listView.setItemChecked(0, this.d == this.f4650b.length);
        listView.setOnItemClickListener(this);
    }

    public final nv[] a() {
        int i = 0;
        nv[] nvVarArr = new nv[this.d];
        for (int i2 = 0; i2 < this.f4649a.length; i2++) {
            if (this.f4650b[i2]) {
                nvVarArr[i] = this.f4649a[i2];
                i++;
            }
        }
        return nvVarArr;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean isChecked = ((CheckedTextView) view).isChecked();
        if (i <= 0) {
            for (int i2 = 0; i2 < this.f4650b.length; i2++) {
                this.c.setItemChecked(i2 + 1, isChecked);
                this.f4650b[i2] = isChecked;
            }
            this.d = isChecked ? this.f4650b.length : 0;
            return;
        }
        this.f4650b[i - 1] = isChecked;
        this.d = (isChecked ? 1 : -1) + this.d;
        this.c.setItemChecked(0, this.d == this.f4650b.length);
    }

    public final void b(Bundle bundle) {
        bundle.putBooleanArray("SetupWizardAppListDialog.selectedBackupDocs", this.f4650b);
    }
}
