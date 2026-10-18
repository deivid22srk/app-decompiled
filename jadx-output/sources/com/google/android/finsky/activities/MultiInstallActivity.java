package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.layout.PlayActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class MultiInstallActivity extends android.support.v7.a.ae implements View.OnClickListener {
    private ArrayList<InstallDetails> k;
    private int l;
    private int m;
    private com.google.android.finsky.receivers.f n;
    private int o;
    private String p;
    private ea q;
    private PlayActionButton r;
    private PlayActionButton s;

    public static Intent a(Context context, List<Document> list, String str) {
        Intent intent = new Intent(context, (Class<?>) MultiInstallActivity.class);
        intent.putExtra("MultiInstallActivity.installs", com.google.android.finsky.utils.cz.a(list));
        intent.putExtra("MultiInstallActivity.mode", 1);
        intent.putExtra("MultiInstallActivity.install-account-name", str);
        return intent;
    }

    public static Intent a(Context context, List<Document> list) {
        Intent intent = new Intent(context, (Class<?>) MultiInstallActivity.class);
        intent.putExtra("MultiInstallActivity.installs", com.google.android.finsky.utils.cz.a(list));
        intent.putExtra("MultiInstallActivity.mode", 2);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        com.google.android.finsky.installer.o a2;
        super.onCreate(bundle);
        setContentView(R.layout.update_all_activity);
        this.n = FinskyApp.a().k;
        this.r = (PlayActionButton) findViewById(R.id.positive_button);
        this.r.a(3, R.string.ok, this);
        this.s = (PlayActionButton) findViewById(R.id.negative_button);
        this.s.a(3, getResources().getString(R.string.cancel), this);
        this.o = getIntent().getIntExtra("MultiInstallActivity.mode", 1);
        this.p = getIntent().getStringExtra("MultiInstallActivity.install-account-name");
        if (bundle == null) {
            this.l = 0;
            this.m = 0;
            ArrayList<Document> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("MultiInstallActivity.installs");
            int size = parcelableArrayListExtra.size();
            for (int i = 0; i < size; i++) {
                this.n.a((Document) parcelableArrayListExtra.get(i));
            }
            ArrayList arrayList = new ArrayList();
            ArrayList<InstallDetails> arrayList2 = new ArrayList<>();
            int i2 = this.o;
            if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                FinskyLog.e("The output lists are not initially empty.", new Object[0]);
            }
            com.google.android.finsky.installer.n nVar = FinskyApp.a().l;
            String str = i2 == 2 ? "bulk_update" : "bulk_install";
            boolean booleanValue = com.google.android.finsky.utils.bg.t.a().booleanValue();
            for (Document document : parcelableArrayListExtra) {
                if (i2 == 2) {
                    a2 = nVar.a(document, booleanValue);
                } else {
                    a2 = nVar.a(document, false);
                }
                InstallDetails installDetails = new InstallDetails(document, a2, str);
                if (installDetails.a()) {
                    arrayList.add(installDetails);
                } else {
                    arrayList2.add(installDetails);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((InstallDetails) it.next());
            }
            this.k = arrayList2;
            b(true);
            return;
        }
        this.k = bundle.getParcelableArrayList("MultiInstallActivity.installs-for-approval");
        this.l = bundle.getInt("MultiInstallActivity.current-install-index", 0);
        this.m = bundle.getInt("MultiInstallActivity.current-page-type", 0);
        b(this.m);
        this.q = (ea) d().a(R.id.main_layout);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("MultiInstallActivity.installs-for-approval", this.k);
        bundle.putInt("MultiInstallActivity.current-install-index", this.l);
        bundle.putInt("MultiInstallActivity.current-page-type", this.m);
    }

    private void b(int i) {
        int i2 = R.string.install_approval_permissions_yes;
        switch (i) {
            case 1:
                i2 = R.string.install_approval_auto_update_disabled_yes;
                break;
            case 2:
                i2 = R.string.install_approval_large_size_yes;
                break;
            case 3:
                break;
            default:
                FinskyLog.e("Invalid current page type: %d", Integer.valueOf(i));
                break;
        }
        this.r.setText(getResources().getString(i2).toUpperCase());
        this.s.setText(getResources().getString(R.string.install_approval_no).toUpperCase());
    }

    private void b(boolean z) {
        int i = 3;
        if (this.l >= this.k.size()) {
            finish();
            return;
        }
        InstallDetails installDetails = this.k.get(this.l);
        if (installDetails.c) {
            this.m = 1;
        } else if (installDetails.d) {
            this.m = 2;
        } else if (installDetails.e) {
            this.m = 3;
        } else {
            FinskyLog.e("Failed to determine the next page type when updating %s.", installDetails.f1520b.f1963a.f3890a);
            finish();
            return;
        }
        int i2 = this.l;
        b(this.m);
        InstallDetails installDetails2 = this.k.get(i2);
        switch (this.m) {
            case 1:
                i = 1;
                break;
            case 2:
                break;
            case 3:
                i = 2;
                break;
            default:
                FinskyLog.e("Invalid current page type: %d", Integer.valueOf(this.m));
                i = 2;
                break;
        }
        ea a2 = ea.a(installDetails2.f1520b.f1963a.f3890a, installDetails2.f1520b.f1963a.i, i2 + 1, this.k.size(), i, installDetails2.f);
        android.support.v4.app.ap a3 = d().a();
        if (z) {
            a3.a(R.anim.play_fade_in, R.anim.fade_out);
        } else {
            a3.a(R.anim.slide_in_right, R.anim.slide_out_left);
        }
        if (this.q != null) {
            a3.a(this.q);
        }
        a3.a(R.id.main_layout, a2);
        a3.b();
        this.q = a2;
        this.r.setEnabled(true);
        this.s.setEnabled(true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.m == 0) {
            FinskyLog.e("Unexpected click for page type: %d", 0);
            return;
        }
        if (view == this.r || view == this.s) {
            this.r.setEnabled(false);
            this.s.setEnabled(false);
        }
        if (view == this.r) {
            InstallDetails installDetails = this.k.get(this.l);
            switch (this.m) {
                case 1:
                    installDetails.c = false;
                    break;
                case 2:
                    installDetails.d = false;
                    this.n.a(installDetails.f1520b.f1963a.f3890a);
                    break;
                case 3:
                    installDetails.e = false;
                    com.google.android.finsky.utils.er.a(FinskyApp.a().r, installDetails.f1520b.f1963a.f3890a);
                    break;
            }
            if (installDetails.a()) {
                a(installDetails);
                this.l++;
                b(false);
                return;
            }
            b(true);
            return;
        }
        if (view == this.s) {
            this.l++;
            b(false);
        }
    }

    public class InstallDetails implements Parcelable {
        public static final Parcelable.Creator<InstallDetails> CREATOR = new eo();

        /* renamed from: a, reason: collision with root package name */
        final String f1519a;

        /* renamed from: b, reason: collision with root package name */
        final Document f1520b;
        boolean c;
        boolean d;
        boolean e;
        private final String[] f;

        public InstallDetails(Document document, com.google.android.finsky.installer.o oVar, String str) {
            this.c = oVar.c;
            this.d = oVar.f2866a;
            this.e = oVar.f2867b;
            this.f1520b = document;
            this.f1519a = str;
            if (this.e) {
                this.f = document.E().p;
            } else {
                this.f = null;
            }
        }

        public final boolean a() {
            return (this.d || this.e || this.c) ? false : true;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte((byte) (this.d ? 1 : 0));
            parcel.writeByte((byte) (this.e ? 1 : 0));
            parcel.writeByte((byte) (this.c ? 1 : 0));
            parcel.writeString(this.f1519a);
            this.f1520b.writeToParcel(parcel, i);
            if (this.e) {
                parcel.writeInt(this.f.length);
                parcel.writeStringArray(this.f);
            }
        }

        protected InstallDetails(Parcel parcel) {
            this.d = parcel.readByte() > 0;
            this.e = parcel.readByte() > 0;
            this.c = parcel.readByte() > 0;
            this.f1519a = parcel.readString();
            this.f1520b = Document.CREATOR.createFromParcel(parcel);
            if (this.e) {
                this.f = new String[parcel.readInt()];
                parcel.readStringArray(this.f);
            } else {
                this.f = null;
            }
        }
    }

    private void a(InstallDetails installDetails) {
        String str = installDetails.f1520b.f1963a.f3890a;
        if (this.o == 2) {
            this.n.g(str);
            this.n.a(str, installDetails.f1520b.d(), installDetails.f1520b.f1963a.i, installDetails.f1519a, false, 3, installDetails.f1520b.t());
            return;
        }
        com.google.android.finsky.g.h hVar = FinskyApp.a().p;
        Account a2 = com.google.android.finsky.api.a.a(this.p, getApplicationContext());
        com.google.android.finsky.g.a a3 = hVar.a(a2);
        if (a3 == null) {
            FinskyLog.a("Cannot perform install because cannot find library for %s.", FinskyLog.a(this.p));
            return;
        }
        Document document = installDetails.f1520b;
        if (com.google.android.finsky.utils.cy.a(document, a3)) {
            this.n.a(str, installDetails.f1520b.d(), this.p, installDetails.f1520b.f1963a.i, false, installDetails.f1519a, 3, document.t());
        } else {
            com.google.android.finsky.utils.gs.a(a2, document, 1, null, null, true, false);
        }
    }
}
