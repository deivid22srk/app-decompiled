package com.google.android.finsky.activities;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.receivers.FlushLogsReceiver;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jb;
import com.google.android.finsky.utils.jm;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ab extends at {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1532a = com.google.android.finsky.api.b.f1951a.toString();

    /* renamed from: b, reason: collision with root package name */
    private static final String f1533b = "https://android.clients.google.com/vending/api/ApiRequest".replace("api/ApiRequest", "");
    private final as<aq> c = new ae(this);
    private final as<ar> d = new af(this);

    @Override // com.google.android.finsky.activities.at, android.preference.PreferenceActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!com.google.android.finsky.c.d.f.b().booleanValue()) {
            finish();
            return;
        }
        addPreferencesFromResource(R.xml.debug);
        ((CheckBoxPreference) findPreference("image_debugging")).setChecked(com.google.android.play.utils.b.j.v.b().booleanValue());
        ((CheckBoxPreference) findPreference("skip_all_caches")).setChecked(com.google.android.finsky.api.d.K.b().booleanValue());
        ((CheckBoxPreference) findPreference("show_staging_data")).setChecked(com.google.android.finsky.api.d.L.b().booleanValue());
        ((CheckBoxPreference) findPreference("disable_personalization")).setChecked(com.google.android.finsky.api.d.M.b().booleanValue());
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference("verbose_volley_logging");
        checkBoxPreference.setChecked(Log.isLoggable("Volley", 2));
        checkBoxPreference.setEnabled(false);
        ((CheckBoxPreference) findPreference("fake_item_rater")).setChecked(com.google.android.finsky.utils.bg.ao.a().booleanValue());
        ((CheckBoxPreference) findPreference("show_all_surveys")).setChecked(com.google.android.finsky.utils.bg.an.a().booleanValue());
        getListView().setCacheColorHint(getResources().getColor(R.color.play_main_background));
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 1:
                FinskyApp.a().q.a(new ac(this), "DebugActivity");
                break;
        }
    }

    @Override // android.preference.PreferenceActivity
    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        String key = preference.getKey();
        if ("image_debugging".equals(key)) {
            a(com.google.android.play.utils.b.j.v, Boolean.toString(!com.google.android.play.utils.b.j.v.b().booleanValue()).toLowerCase());
            return true;
        }
        if ("skip_all_caches".equals(key)) {
            a(com.google.android.finsky.api.d.K, Boolean.toString(com.google.android.finsky.api.d.K.b().booleanValue() ? false : true).toLowerCase());
        } else if (!"environments".equals(key)) {
            if ("clear_cache".equals(key)) {
                a(false);
                return true;
            }
            if ("show_staging_data".equals(key)) {
                a(com.google.android.finsky.api.d.L, Boolean.toString(!com.google.android.finsky.api.d.L.b().booleanValue()).toLowerCase());
                a(false);
                return true;
            }
            if ("disable_personalization".equals(key)) {
                a(com.google.android.finsky.api.d.M, Boolean.toString(!com.google.android.finsky.api.d.M.b().booleanValue()));
                a(false);
                return true;
            }
            if ("reset_all".equals(key)) {
                a(com.google.android.play.utils.b.j.v, "false");
                a(new ar(null, null, null));
                a(new aq(null, null, null));
                a(false);
                return true;
            }
            if (!"country".equals(key)) {
                if (!"play_country".equals(key)) {
                    if ("export_library".equals(key)) {
                        a(com.google.android.finsky.b.z.b(null));
                        int i = 1;
                        for (String str : com.google.android.finsky.b.z.a(this)) {
                            a(com.google.android.finsky.b.z.b(str));
                            i++;
                        }
                        a("library.db");
                        Toast.makeText(this, String.format("Finished %d database exports", Integer.valueOf(i + 1)), 0).show();
                        return true;
                    }
                    if ("dump_library_state".equals(key)) {
                        Log.d("FinskyLibrary", "------------ LIBRARY DUMP BEGIN");
                        com.google.android.finsky.g.h hVar = FinskyApp.a().p;
                        Log.d("FinskyLibrary", "| Libraries {");
                        for (com.google.android.finsky.g.a aVar : hVar.f2822a.values()) {
                            String a2 = FinskyLog.a(aVar.i.name);
                            Log.d("FinskyLibrary", "|   AccountLibrary (account=" + a2 + ") {");
                            for (String str2 : aVar.h.keySet()) {
                                aVar.h.get(str2).a("library=" + str2, "|     ");
                            }
                            Log.d("FinskyLibrary", "|   } (account=" + a2 + ")");
                        }
                        Log.d("FinskyLibrary", "| }");
                        FinskyApp.a().q.b();
                        Log.d("FinskyLibrary", "------------ LIBRARY DUMP END");
                        Toast.makeText(this, "Library state dumped to logcat.", 0).show();
                        return true;
                    }
                    if ("fake_item_rater".equals(key)) {
                        com.google.android.finsky.utils.bg.ao.a((com.google.android.finsky.c.o<Boolean>) Boolean.valueOf(com.google.android.finsky.utils.bg.ao.a().booleanValue() ? false : true));
                    } else if ("show_all_surveys".equals(key)) {
                        com.google.android.finsky.utils.bg.an.a((com.google.android.finsky.c.o<Boolean>) Boolean.valueOf(com.google.android.finsky.utils.bg.an.a().booleanValue() ? false : true));
                    } else if ("flush_eventlog".equals(key)) {
                        FlushLogsReceiver.b();
                        Toast.makeText(this, "Flushing event logs", 0).show();
                    } else if ("force_refresh_user_settings".equals(key)) {
                        jb.a();
                        Toast.makeText(this, "Refreshing user settings...", 0).show();
                    }
                } else {
                    FinskyApp.a().b((String) null).h(null, new ag(this), new ah(this));
                    return true;
                }
            } else {
                a(this.c, "carriers.csv", "Switching country...", R.string.select_carrier, "Default");
                return true;
            }
        } else {
            a(this.d, "marketenvs.csv", "Switching environment...", R.string.select_environment, "Default");
            return true;
        }
        return super.onPreferenceTreeClick(preferenceScreen, preference);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 1
            r7 = 0
            java.io.File r1 = r10.getDatabasePath(r11)     // Catch: java.io.IOException -> L5b
            boolean r2 = r1.exists()     // Catch: java.io.IOException -> L5b
            if (r2 == 0) goto L69
            boolean r2 = r1.canRead()     // Catch: java.io.IOException -> L5b
            if (r2 == 0) goto L69
            java.io.File r2 = new java.io.File     // Catch: java.io.IOException -> L5b
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.io.IOException -> L5b
            r2.<init>(r3, r11)     // Catch: java.io.IOException -> L5b
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.io.IOException -> L5b
            r8.<init>(r1)     // Catch: java.io.IOException -> L5b
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L5b
            r9.<init>(r2)     // Catch: java.io.IOException -> L5b
            java.nio.channels.FileChannel r1 = r8.getChannel()     // Catch: java.io.IOException -> L5b
            java.nio.channels.FileChannel r6 = r9.getChannel()     // Catch: java.io.IOException -> L5b
            r2 = 0
            long r4 = r1.size()     // Catch: java.io.IOException -> L5b
            r1.transferTo(r2, r4, r6)     // Catch: java.io.IOException -> L5b
            r1.close()     // Catch: java.io.IOException -> L5b
            r6.close()     // Catch: java.io.IOException -> L5b
            r8.close()     // Catch: java.io.IOException -> L5b
            r9.close()     // Catch: java.io.IOException -> L5b
        L42:
            if (r0 != 0) goto L5a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to export "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r11)
            java.lang.String r0 = r0.toString()
            android.widget.Toast r0 = android.widget.Toast.makeText(r10, r0, r7)
            r0.show()
        L5a:
            return
        L5b:
            r1 = move-exception
            java.lang.String r2 = "Unable to export: %s"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r1.getMessage()
            r0[r7] = r1
            com.google.android.finsky.utils.FinskyLog.d(r2, r0)
        L69:
            r0 = r7
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.activities.ab.a(java.lang.String):void");
    }

    private <T> int a(String str, List<T> list, List<String> list2, as<T> asVar, String str2) {
        BufferedReader bufferedReader = null;
        list.add(asVar.a((String[]) null));
        list2.add(str2);
        try {
            try {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                File file = new File(externalStorageDirectory, str);
                if (!file.exists()) {
                    file = new File(new File(externalStorageDirectory, "Download"), str);
                }
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                int i = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            String trim = readLine.trim();
                            if (!trim.startsWith("#") && !TextUtils.isEmpty(trim)) {
                                String[] split = trim.split(",");
                                String str3 = split[0];
                                if (TextUtils.isEmpty(str3)) {
                                    FinskyLog.a("Skipping an item from csv without a name", new Object[0]);
                                } else {
                                    list2.add(str3);
                                    T a2 = asVar.a(split);
                                    list.add(a2);
                                    if (asVar.b(a2)) {
                                        i = list.size() - 1;
                                    }
                                }
                            }
                        } else {
                            jm.a(bufferedReader2);
                            return i;
                        }
                    } catch (Exception e) {
                        e = e;
                        bufferedReader = bufferedReader2;
                        FinskyLog.d("Unable to build selector: %s", e.getMessage());
                        Toast.makeText(this, "Unable to build selector.", 1).show();
                        jm.a(bufferedReader);
                        return 0;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        jm.a(bufferedReader);
                        throw th;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ar arVar) {
        String str;
        String str2;
        Intent intent = new Intent("com.google.gservices.intent.action.GSERVICES_OVERRIDE");
        if (arVar != null) {
            str2 = arVar.f1555a == null ? null : f1532a + " rewrite " + arVar.f1555a;
            str = arVar.f1556b != null ? f1533b + " rewrite " + arVar.f1556b : null;
            r1 = arVar.c;
        } else {
            str = null;
            str2 = null;
        }
        intent.putExtra("url:finsky_dfe_url", str2);
        intent.putExtra("url:vending_machine_ssl_url", str);
        intent.putExtra("url:licensing_url", str);
        intent.putExtra("finsky.wallet_escrow_url", r1);
        sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(aq aqVar) {
        a(com.google.android.finsky.api.d.o, aqVar.f1554b);
        a(com.google.android.finsky.api.d.f1953a, aqVar.c);
    }

    private void a(com.google.android.play.utils.b.a<? extends Object> aVar, String str) {
        Intent intent = new Intent("com.google.gservices.intent.action.GSERVICES_OVERRIDE");
        intent.putExtra(aVar.f7070b, str);
        sendBroadcast(intent);
    }

    protected final void a(boolean z) {
        FinskyApp.a().a(new ad(this, z));
    }

    private <T> void a(as<T> asVar, String str, String str2, int i, String str3) {
        ArrayList arrayList = new ArrayList();
        List<String> arrayList2 = new ArrayList<>();
        int a2 = a(str, arrayList, arrayList2, asVar, str3);
        com.google.android.wallet.ui.common.a aVar = new com.google.android.wallet.ui.common.a(this);
        aVar.a(i);
        aVar.a((String[]) arrayList2.toArray(new String[arrayList2.size()]), a2, new ao(this, str2, asVar, arrayList));
        aVar.a().show();
    }

    static /* synthetic */ void a(ab abVar, String str) {
        View inflate = LayoutInflater.from(abVar).inflate(R.layout.debug_play_country_dialog, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.current);
        if (TextUtils.isEmpty(str)) {
            str = abVar.getString(R.string.debug_play_country_override_none);
        }
        textView.setText(abVar.getString(R.string.debug_play_country_override_current, new Object[]{str}));
        EditText editText = (EditText) inflate.findViewById(R.id.edit);
        Dialog a2 = new com.google.android.wallet.ui.common.a(abVar).a(abVar.getString(R.string.debug_play_country_override_title)).a(inflate).a(abVar.getString(R.string.ok), new aj(abVar, editText)).b(abVar.getString(R.string.cancel), new ai(abVar)).a();
        a2.setOnShowListener(new ak(abVar, editText));
        a2.show();
    }
}
