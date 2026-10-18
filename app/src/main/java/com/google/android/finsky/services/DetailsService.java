package com.google.android.finsky.services;

import android.accounts.Account;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.billing.lightpurchase.LightPurchaseFlowActivity;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.gl;
import com.google.android.finsky.utils.gp;
import com.google.android.finsky.utils.gq;
import com.google.android.finsky.utils.gr;
import com.google.android.finsky.utils.ib;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class DetailsService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new r(this);
    }

    private static boolean a(Document document, int i, Bundle bundle) {
        String str;
        List<ds> b2 = document.b(i);
        if (b2 != null && !b2.isEmpty()) {
            ds dsVar = b2.get(0);
            if (dsVar.g) {
                if (dsVar.m && dsVar.l) {
                    str = "fife_url";
                } else {
                    FinskyLog.a("App %s no FIFE URL for %d", document.f1963a.f3890a, Integer.valueOf(i));
                    str = "image_url";
                }
                bundle.putString(str, dsVar.f);
                return true;
            }
        }
        return false;
    }

    public static Bundle a(Context context, Document document, Account account, DfeToc dfeToc, com.google.android.finsky.receivers.f fVar, com.google.android.finsky.bpkg.a aVar, com.google.android.finsky.gpkg.h hVar, String str, com.google.android.finsky.apkg.i iVar) {
        gp gpVar;
        String str2 = document.f1963a.c;
        int i = document.f1963a.g;
        if (i != 3) {
            FinskyLog.a("Document %s is not an app, backend=%d", str2, Integer.valueOf(i));
            ib.a(iVar, 512, str2, "doc-backend", str, null);
            return null;
        }
        int i2 = document.f1963a.e;
        if (i2 != 1) {
            FinskyLog.a("Document %s is not an app, doc_type=%d", str2, Integer.valueOf(i2));
            ib.a(iVar, 512, str2, "doc-type", str, null);
            return null;
        }
        gq gqVar = new gq();
        gl.a(account, fVar, hVar, aVar, dfeToc, 0, document, gqVar);
        for (int i3 = 0; i3 < gqVar.d; i3++) {
            gp a2 = gqVar.a(i3);
            if (a2.f4913a == 7 || a2.f4913a == 15 || a2.f4913a == 1) {
                gpVar = a2;
                break;
            }
        }
        gpVar = null;
        if (gpVar == null) {
            FinskyLog.a("App %s has no buy or install action, actions=%s", str2, gqVar.toString());
            ib.a(iVar, 512, str2, "doc-actions", str, null);
            return null;
        }
        Locale locale = context.getResources().getConfiguration().locale;
        Bundle bundle = new Bundle();
        bundle.putString("title", document.f1963a.i);
        bundle.putString("creator", document.f1963a.m.toUpperCase(locale));
        if (document.z()) {
            bundle.putFloat("star_rating", document.A());
            bundle.putLong("rating_count", document.B());
        }
        if (!a(document, 4, bundle)) {
            if (a(document, 0, bundle)) {
                FinskyLog.a("App %s using thumbnail image", document.f1963a.f3890a);
            } else {
                FinskyLog.a("App %s failed to find any image", document.f1963a.f3890a);
            }
        }
        gr grVar = new gr();
        gl.a(gpVar, i, false, false, grVar);
        bundle.putString("purchase_button_text", grVar.a(context).toUpperCase(locale));
        Intent a3 = LightPurchaseFlowActivity.a(document);
        a3.setData(Uri.fromParts("detailsservice", str2, null));
        bundle.putParcelable("purchase_intent", PendingIntent.getActivity(context, 0, a3, 0));
        Uri build = new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", str2).appendQueryParameter("api_source", "DetailsService").appendQueryParameter("referrer_package", str).build();
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(build);
        bundle.putParcelable("details_intent", PendingIntent.getActivity(context, 0, intent, 0));
        ib.a(iVar, 512, str2, null, str, null);
        return bundle;
    }
}
