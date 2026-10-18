package com.google.android.finsky.activities;

import android.app.backup.BackupManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceGroup;
import android.preference.PreferenceScreen;
import android.text.TextUtils;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.auth.AuthState;
import com.google.android.finsky.protos.jm;
import com.google.android.finsky.protos.lp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ic;
import com.google.android.finsky.utils.ix;
import com.google.android.finsky.utils.jb;
import com.google.android.finsky.utils.jn;

/* loaded from: classes.dex */
public class SettingsActivity extends at implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f1523a = null;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.finsky.auth.a f1524b;
    private String c;
    private com.google.android.finsky.a.i d;
    private boolean e;
    private com.google.android.finsky.layout.play.cy f;

    @Override // com.google.android.finsky.activities.at, android.preference.PreferenceActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (com.google.android.finsky.safemode.a.b()) {
            com.google.android.finsky.safemode.a.d();
            finish();
            return;
        }
        this.c = FinskyApp.a().j();
        if (this.c == null) {
            FinskyLog.a("Exit SettingsActivity - no current account.", new Object[0]);
            finish();
            return;
        }
        addPreferencesFromResource(R.xml.settings);
        if (!ic.b(this)) {
            a("category-general", "receive-emails");
        }
        if (!com.google.android.finsky.billing.ap.a()) {
            a("category-general", "download-mode");
        }
        if (!com.google.android.finsky.auth.a.a(this.c)) {
            a("category-user-controls", "fingerprint-auth");
        }
        this.d = FinskyApp.a().h();
        this.f = new com.google.android.finsky.layout.play.ad(12);
        if (bundle == null) {
            this.d.a(0L, this.f);
        }
        getListView().setCacheColorHint(getResources().getColor(R.color.play_main_background));
        this.f1524b = new com.google.android.finsky.auth.a(com.google.android.finsky.api.a.a(this.c, FinskyApp.a()));
    }

    @Override // android.app.Activity
    protected void onResume() {
        ge[] geVarArr;
        boolean z;
        gf gfVar;
        super.onResume();
        this.e = true;
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        ((CheckBoxPreference) preferenceScreen.findPreference("update-notifications")).setChecked(jn.h.a().booleanValue());
        ((CheckBoxPreference) preferenceScreen.findPreference("update-completion-notifications")).setChecked(jn.i.a().booleanValue());
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preferenceScreen.findPreference("receive-emails");
        if (checkBoxPreference != null) {
            jm h = jb.h(this.c);
            if (h == null) {
                a("category-general", "receive-emails");
            } else {
                checkBoxPreference.setChecked(h.f3999a);
            }
        }
        SettingsListPreference settingsListPreference = (SettingsListPreference) preferenceScreen.findPreference("auto-update-mode");
        ge[] values = ge.values();
        if (FinskyApp.a().l.d()) {
            geVarArr = values;
        } else {
            geVarArr = new ge[2];
            System.arraycopy(values, 0, geVarArr, 0, 2);
        }
        settingsListPreference.a(geVarArr);
        settingsListPreference.a(c());
        SettingsListPreference settingsListPreference2 = (SettingsListPreference) preferenceScreen.findPreference("download-mode");
        if (settingsListPreference2 != null) {
            gf[] values2 = gf.values();
            if (ic.b(getApplicationContext())) {
                gf gfVar2 = values2[1];
                values2[1] = values2[0];
                values2[0] = gfVar2;
            }
            settingsListPreference2.a(values2);
            int intValue = com.google.android.finsky.utils.bg.v.a().intValue();
            if (intValue != 2) {
                if (intValue == 3) {
                    gfVar = gf.DOWNLOAD_WIFI;
                } else if (ic.b(getApplicationContext())) {
                    gfVar = gf.DOWNLOAD_ASK;
                }
                settingsListPreference2.a(gfVar);
            }
            gfVar = gf.DOWNLOAD_ALWAYS;
            settingsListPreference2.a(gfVar);
        }
        ((CheckBoxPreference) preferenceScreen.findPreference("auto-add-shortcuts")).setChecked(jn.l.a().booleanValue());
        boolean booleanValue = com.google.android.finsky.c.d.al.b().booleanValue();
        Preference findPreference = preferenceScreen.findPreference("content-level");
        if (booleanValue) {
            preferenceScreen.removePreference(findPreference);
        } else if (FinskyApp.a().e().a(12602392L)) {
            findPreference.setSummary(getString(R.string.content_filtering_apps_and_content_description));
        }
        preferenceScreen.findPreference("purchase-auth").setSummary(b().d);
        preferenceScreen.findPreference("build-version").setSummary(getString(R.string.market_version, new Object[]{FinskyApp.a().v.g(FinskyApp.a().getPackageName())}));
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) preferenceScreen.findPreference(ix.b(2));
        if (checkBoxPreference2 != null) {
            lp b2 = ix.b(this.c, 2);
            if (b2 == null) {
                ((PreferenceGroup) preferenceScreen.findPreference("category-user-controls")).removePreference(checkBoxPreference2);
            } else {
                if (!b2.d || b2.c == 0) {
                    z = b2.e;
                } else {
                    z = b2.c != 2;
                }
                checkBoxPreference2.setChecked(z);
            }
        }
        a(preferenceScreen);
        preferenceScreen.getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
        if (getIntent() != null && getIntent().hasExtra("setting-key-to-scroll")) {
            new Handler().post(new fx(this));
        }
    }

    private void a(String str, String str2) {
        PreferenceCategory preferenceCategory = (PreferenceCategory) getPreferenceScreen().findPreference(str);
        preferenceCategory.removePreference(preferenceCategory.findPreference(str2));
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.e = false;
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override // com.google.android.finsky.activities.at, android.preference.PreferenceActivity, android.app.ListActivity, android.app.Activity
    protected void onDestroy() {
        if (this.f1524b != null) {
            this.f1524b.a();
        }
        super.onDestroy();
    }

    @Override // android.preference.PreferenceActivity
    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        boolean z;
        int i;
        String key = preference.getKey();
        if ("update-notifications".equals(key)) {
            jn.h.a((com.google.android.finsky.c.o<Boolean>) Boolean.valueOf(((CheckBoxPreference) preference).isChecked()));
            z = true;
        } else if ("update-completion-notifications".equals(key)) {
            jn.i.a((com.google.android.finsky.c.o<Boolean>) Boolean.valueOf(((CheckBoxPreference) preference).isChecked()));
            z = true;
        } else if ("auto-add-shortcuts".equals(key)) {
            jn.l.a((com.google.android.finsky.c.o<Boolean>) Boolean.valueOf(((CheckBoxPreference) preference).isChecked()));
            z = true;
        } else if ("clear-history".equals(key)) {
            FinskyApp.a().A.clearHistory();
            z = false;
        } else if ("content-level".equals(key)) {
            if (FinskyApp.a().e().a(12602392L)) {
                startActivityForResult(com.google.android.finsky.utils.cr.a(this, ContentFiltersActivity2.class, "authAccount", this.c), 35);
                z = false;
            } else {
                startActivityForResult(com.google.android.finsky.utils.cr.a(this, ContentFilterActivity.class, "authAccount", this.c), 30);
                z = false;
            }
        } else if ("os-licenses".equals(key)) {
            startActivity(WebViewDialog.a(this, "file:///android_asset/licenses.html"));
            z = false;
        } else if (!"build-version".equals(key)) {
            if ("purchase-auth".equals(key)) {
                Intent intent = new Intent(this, (Class<?>) PurchaseAuthActivity.class);
                i = b().e;
                intent.putExtra("purchase-auth-current", i);
                startActivityForResult(intent, 36);
                z = false;
            } else if ("gmail-itineraries".equals(key)) {
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preference;
                boolean isChecked = checkBoxPreference.isChecked();
                ix.a(this.c, 2, isChecked ? 1 : 2, new fy(this, checkBoxPreference, isChecked));
                z = false;
            } else {
                if ("fingerprint-auth".equals(key)) {
                    a(((CheckBoxPreference) preference).isChecked(), false);
                }
                z = false;
            }
        } else {
            this.d.a(282, (byte[]) null, this.f);
            if (com.google.android.finsky.c.d.g.b().booleanValue()) {
                if (f1523a != null) {
                    a(f1523a.booleanValue());
                    z = false;
                } else {
                    com.google.android.finsky.api.b b2 = FinskyApp.a().b((String) null);
                    b2.e();
                    com.google.android.finsky.utils.cb.a(b2, com.google.android.finsky.utils.am.a(), new fz(this, b2.c()));
                }
            }
            z = false;
        }
        if (z) {
            new BackupManager(this).dataChanged();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (this.e) {
            com.google.android.wallet.ui.common.a aVar = new com.google.android.wallet.ui.common.a(this);
            aVar.b(z ? R.string.settings_self_update_new_version_yes : R.string.settings_self_update_new_version_no);
            aVar.a(R.string.ok, (DialogInterface.OnClickListener) null);
            aVar.a().show();
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        boolean z = false;
        boolean z2 = true;
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if ("auto-update-mode".equals(str)) {
            SettingsListPreference settingsListPreference = (SettingsListPreference) preferenceScreen.findPreference(str);
            String value = settingsListPreference.getValue();
            ge valueOf = ge.valueOf(value);
            switch (valueOf) {
                case AUTO_UPDATE_NEVER:
                    z2 = false;
                    break;
                case AUTO_UPDATE_ALWAYS:
                    break;
                case AUTO_UPDATE_WIFI:
                    z = true;
                    break;
                default:
                    FinskyLog.e("Unexpected list pref value %s", value);
                    z2 = false;
                    break;
            }
            this.d.a(402, Integer.valueOf(valueOf.ordinal()), Integer.valueOf(c().ordinal()), (String) null);
            com.google.android.finsky.utils.bg.t.a((com.google.android.finsky.c.o<Boolean>) Boolean.valueOf(z2));
            com.google.android.finsky.utils.bg.u.a((com.google.android.finsky.c.o<Boolean>) Boolean.valueOf(z));
            new BackupManager(this).dataChanged();
            settingsListPreference.a();
            return;
        }
        if ("download-mode".equals(str)) {
            SettingsListPreference settingsListPreference2 = (SettingsListPreference) preferenceScreen.findPreference(str);
            switch (gf.valueOf(settingsListPreference2.getValue())) {
                case DOWNLOAD_ASK:
                    com.google.android.finsky.utils.bg.v.a((com.google.android.finsky.c.o<Integer>) 1);
                    break;
                case DOWNLOAD_ALWAYS:
                    com.google.android.finsky.utils.bg.v.a((com.google.android.finsky.c.o<Integer>) 2);
                    break;
                case DOWNLOAD_WIFI:
                    com.google.android.finsky.utils.bg.v.a((com.google.android.finsky.c.o<Integer>) 3);
                    break;
                default:
                    throw new IllegalStateException("Unexpected download preference");
            }
            new BackupManager(this).dataChanged();
            settingsListPreference2.a();
            return;
        }
        if ("receive-emails".equals(str)) {
            boolean isChecked = ((CheckBoxPreference) preferenceScreen.findPreference(str)).isChecked();
            FinskyApp.a().b((String) null);
            jb.a(this.c, isChecked, new ga(this));
        }
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 30 && i2 == -1) {
            Bundle bundle = new Bundle();
            int intExtra = intent.getIntExtra("ContentFilterActivity_selectedFilterLevel", -100);
            if (intExtra == -100) {
                FinskyLog.e("Content filter returned code 'OK' but no level to set", new Object[0]);
                return;
            }
            bundle.putInt("content-level-to-set", intExtra);
            String a2 = com.google.android.finsky.utils.bg.g.a();
            if (TextUtils.isEmpty(a2)) {
                startActivityForResult(PinEntryDialog.a(this, R.string.pin_setup_label, R.string.pin_setup_summary, null, bundle), 33);
                return;
            } else {
                startActivityForResult(PinEntryDialog.a(this, R.string.pin_entry_label, R.string.pin_entry_summary, a2, bundle), 31);
                return;
            }
        }
        if (i == 35 && i2 == -1) {
            setResult(40);
            finish();
            return;
        }
        if (i == 33 && i2 == -1) {
            Bundle bundleExtra = intent.getBundleExtra("PinEntryDialog.extraParams");
            String stringExtra = intent.getStringExtra("PinEntryDialog.resultPin");
            if (TextUtils.isEmpty(stringExtra)) {
                FinskyLog.e("Create PIN result OK but no PIN sent back.", new Object[0]);
                return;
            } else {
                startActivityForResult(PinEntryDialog.a(this, R.string.pin_confirm_label, R.string.pin_confirm_summary, stringExtra, bundleExtra), 34);
                return;
            }
        }
        if (i == 34 && i2 == -1) {
            String stringExtra2 = intent.getStringExtra("PinEntryDialog.resultPin");
            if (TextUtils.isEmpty(stringExtra2)) {
                FinskyLog.e("Confirm PIN result OK but no PIN sent back.", new Object[0]);
                return;
            } else {
                com.google.android.finsky.utils.bg.g.a((com.google.android.finsky.c.o<String>) stringExtra2);
                a(intent.getBundleExtra("PinEntryDialog.extraParams"));
                return;
            }
        }
        if (i == 31 && i2 == -1) {
            Bundle bundleExtra2 = intent.getBundleExtra("PinEntryDialog.extraParams");
            if (bundleExtra2.getInt("content-level-to-set", -100) == com.google.android.finsky.c.c.SHOW_ALL.f) {
                com.google.android.finsky.utils.bg.g.c();
            }
            a(bundleExtra2);
            return;
        }
        if (i == 32 && i2 == -1) {
            Bundle bundleExtra3 = intent.getBundleExtra("GaiaAuthActivity_extraParams");
            int i3 = bundleExtra3.getInt("purchase-auth-previous", -1);
            int i4 = bundleExtra3.getInt("purchase-auth-new", -1);
            if (i4 == -1) {
                FinskyLog.e("Missing new value for PurchaseAuth", new Object[0]);
                return;
            } else {
                com.google.android.finsky.c.p.a(this.c, i4, Integer.valueOf(i3), this.d, "settings-page");
                return;
            }
        }
        if (i != 36 || i2 != -1) {
            if (i == 37) {
                a(i2 == -1, true);
            }
            super.onActivityResult(i, i2, intent);
            return;
        }
        this.f1524b.a(new gb(this, intent.getIntExtra("purchase-auth-current", -1), intent.getIntExtra("purchase-auth-new", -1)));
    }

    private void a(Bundle bundle) {
        int i = bundle.getInt("content-level-to-set", -100);
        if (i == -100) {
            FinskyLog.e("Content filter authenticated but no level to set", new Object[0]);
            return;
        }
        this.d.a(401, Integer.valueOf(i), com.google.android.finsky.utils.bg.f4774b.a(), "settings-page");
        com.google.android.finsky.utils.bg.f4774b.a((com.google.android.finsky.c.o<Integer>) Integer.valueOf(i));
        setResult(40);
        finish();
    }

    private gg b() {
        int i;
        int b2 = com.google.android.finsky.c.p.b(this.c);
        for (gg ggVar : gg.values()) {
            i = ggVar.e;
            if (i == b2) {
                return ggVar;
            }
        }
        throw new IllegalStateException("PurchaseAuth undefined in PurchaseAuthEntry: " + b2);
    }

    private static ge c() {
        boolean d = FinskyApp.a().l.d();
        boolean booleanValue = com.google.android.finsky.utils.bg.t.a().booleanValue();
        boolean booleanValue2 = com.google.android.finsky.utils.bg.u.a().booleanValue();
        if (booleanValue) {
            if (d && booleanValue2) {
                return ge.AUTO_UPDATE_WIFI;
            }
            return ge.AUTO_UPDATE_ALWAYS;
        }
        return ge.AUTO_UPDATE_NEVER;
    }

    private void a(PreferenceScreen preferenceScreen) {
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preferenceScreen.findPreference("fingerprint-auth");
        if (checkBoxPreference != null) {
            checkBoxPreference.setChecked(com.google.android.finsky.utils.bg.aR.b(this.c).a().booleanValue());
        }
    }

    private void a(boolean z, boolean z2) {
        if (!z2 && z) {
            this.f1524b.a(new gc(this));
            return;
        }
        if (z2) {
            com.google.android.finsky.auth.a.c(this.c);
        }
        com.google.android.finsky.c.p.a(this.c, z, this.d, "settings-page");
        a(getPreferenceScreen());
    }

    static /* synthetic */ void a(SettingsActivity settingsActivity, int i, int i2, AuthState authState) {
        boolean z = i2 != 2;
        Bundle bundle = new Bundle();
        bundle.putInt("purchase-auth-previous", i);
        bundle.putInt("purchase-auth-new", i2);
        settingsActivity.startActivityForResult(GaiaAuthActivity.a(settingsActivity, settingsActivity.c, z, authState, bundle), 32);
    }
}
