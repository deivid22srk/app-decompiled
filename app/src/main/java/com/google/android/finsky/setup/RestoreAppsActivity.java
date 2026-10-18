package com.google.android.finsky.setup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.nv;
import com.google.android.finsky.services.RestoreService;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProtoArray;
import com.google.android.finsky.utils.bg;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class RestoreAppsActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private a f4639a;

    public static Intent a(nv[] nvVarArr, String str) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) RestoreAppsActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("backup_document_infos", ParcelableProtoArray.a(nvVarArr));
        intent.putExtra("backup_document_infos_bundle", bundle);
        intent.putExtra("authAccount", str);
        return intent;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        nv[] nvVarArr = null;
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra("backup_document_infos_bundle");
        if (bundleExtra == null) {
            FinskyLog.e("Missing backup_document_infos_bundle", new Object[0]);
        } else {
            ParcelableProtoArray parcelableProtoArray = (ParcelableProtoArray) bundleExtra.getParcelable("backup_document_infos");
            if (parcelableProtoArray == null) {
                FinskyLog.e("Missing backup_document_infos", new Object[0]);
            } else {
                nvVarArr = (nv[]) parcelableProtoArray.f4713a;
            }
        }
        if (nvVarArr == null) {
            finish();
            return;
        }
        this.f4639a = new a(nvVarArr);
        if (!this.f4639a.a(bundle)) {
            a aVar = this.f4639a;
            boolean[] zArr = new boolean[nvVarArr.length];
            String[] stringArrayExtra = intent.getStringArrayExtra("selected_apps");
            if (stringArrayExtra == null) {
                for (int i = 0; i < nvVarArr.length; i++) {
                    zArr[i] = true;
                }
            } else {
                HashSet hashSet = new HashSet(Arrays.asList(stringArrayExtra));
                for (int i2 = 0; i2 < nvVarArr.length; i2++) {
                    zArr[i2] = hashSet.contains(nvVarArr[i2].f4187a.f3740a);
                }
            }
            aVar.a(zArr);
        }
        if (intent.getBooleanExtra("confirm_restore", false)) {
            bg.aw.a((com.google.android.finsky.cpkg.o<Boolean>) false);
            RestoreService.a(getApplicationContext(), getIntent().getStringExtra("authAccount"), this.f4639a.a());
            finish();
        } else {
            setTheme(android.R.style.SetupWizardTheme_Light);
            setContentView(R.layout.restore_apps_activity_layout);
            this.f4639a.a(this, (ListView) findViewById(R.id.restore_apps_list));
            findViewById(R.id.cancel).setOnClickListener(new g(this));
            findViewById(R.id.done).setOnClickListener(new h(this));
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.f4639a.b(bundle);
        super.onSaveInstanceState(bundle);
    }

    static /* synthetic */ void a(RestoreAppsActivity restoreAppsActivity) {
        Intent intent = new Intent();
        nv[] a2 = restoreAppsActivity.f4639a.a();
        String[] strArr = new String[a2.length];
        for (int i = 0; i < a2.length; i++) {
            strArr[i] = a2[i].f4187a.f3740a;
        }
        intent.putExtra("selected_apps", strArr);
        intent.putExtra("authAccount", restoreAppsActivity.getIntent().getStringExtra("authAccount"));
        restoreAppsActivity.setResult(-1, intent);
        restoreAppsActivity.finish();
    }
}
