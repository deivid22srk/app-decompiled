package com.google.android.finsky.navigationmanager;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.aa;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.gn;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.api.s;
import com.google.android.finsky.bpkg.y;
import com.google.android.finsky.billing.lightpurchase.PurchaseParams;
import com.google.android.finsky.download.inlineappinstaller.InlineConsumptionAppInstallerActivity;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.protos.ea;
import com.google.android.finsky.utils.cr;
import com.google.android.finsky.utils.cy;
import com.google.android.finsky.utils.ex;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public final class a {
    public static int a(int i) {
        switch (i) {
            case 1:
                return R.string.books_download_required;
            case 2:
                return R.string.music_download_required;
            case 3:
            case 5:
            case 7:
            case 8:
            default:
                return -1;
            case 4:
                return R.string.videos_download_required;
            case 6:
                return R.string.newsstand_download_required;
            case 9:
                return R.string.gplus_download_required;
        }
    }

    private static Intent b(Context context, Document document, Account account) {
        if (document == null) {
            return null;
        }
        int i = document.f1963a.g;
        if (document.f1963a.c == null) {
            return null;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
                return cr.a(context, document, account.name);
            case 5:
            default:
                throw new IllegalStateException("Cannot open an item from the corpus " + i);
        }
    }

    public static void a(Context context, int i, aa aaVar, Fragment fragment, int i2) {
        String a2 = cr.a(i);
        if (a2 == null) {
            Toast.makeText(context, context.getString(R.string.launch_error), 0).show();
            return;
        }
        if (aaVar.a("app_needed_dialog") == null) {
            int a3 = a(i);
            Bundle bundle = new Bundle();
            bundle.putString("dialog_details_url", s.a(a2));
            gn gnVar = new gn();
            gnVar.a(a3).d(R.string.ok).e(R.string.cancel);
            gnVar.a(fragment, i2, bundle);
            gnVar.b().a(aaVar, "app_needed_dialog");
        }
    }

    public static boolean a(Context context, Account account, Document document, aa aaVar, Fragment fragment, int i) {
        if (!a(context, document, account)) {
            return false;
        }
        int i2 = document.f1963a.g;
        if (FinskyApp.a().e().a(12603704L) && ((i2 == 1 || i2 == 6) && (context instanceof Activity))) {
            ((Activity) context).startActivityForResult(InlineConsumptionAppInstallerActivity.a(account, document.f1963a), 25);
            return true;
        }
        a(context, i2, aaVar, fragment, i);
        return true;
    }

    public static boolean a(Context context, Account account, Document document, aa aaVar, Fragment fragment, int i, PurchaseParams purchaseParams) {
        if (a(context, account, document, aaVar, fragment, i)) {
            return true;
        }
        Intent b2 = b(context, document, account);
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(b2, 0);
        if (b2 != null && resolveActivity != null) {
            if (document.E() != null) {
                FinskyApp.a().n.b(document.E().w);
            }
            if (purchaseParams != null) {
                b2.putExtra("backend", purchaseParams.f2281a.e);
                b2.putExtra("backend_docid", purchaseParams.f2281a.f3740a);
                b2.putExtra("document_type", purchaseParams.f2281a.c);
                b2.putExtra("full_docid", purchaseParams.f2282b);
                b2.putExtra("calling_package", purchaseParams.i);
            }
            context.startActivity(b2);
            return false;
        }
        Toast.makeText(context, context.getString(R.string.launch_error), 0).show();
        return false;
    }

    public static void a(Document document, View view) {
        boolean z = false;
        FifeImageView fifeImageView = (FifeImageView) view.findViewById(R.id.application_icon);
        if (document != null) {
            ViewGroup.LayoutParams layoutParams = fifeImageView.getLayoutParams();
            ds a2 = com.google.android.finsky.utils.apkg.a.a(document, layoutParams.width, layoutParams.height, ex.f);
            if (a2 != null) {
                fifeImageView.a(a2.f, a2.l, FinskyApp.a().d);
                fifeImageView.setVisibility(0);
                z = true;
            }
        }
        if (!z) {
            fifeImageView.setVisibility(8);
        }
    }

    public static boolean a(Context context, Document document, Account account) {
        boolean z;
        ea[] eaVarArr;
        boolean z2;
        Intent b2;
        String a2 = cr.a(document.f1963a.g);
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        y a3 = FinskyApp.a().s.f2061b.a(a2);
        if (a3 == null) {
            z = false;
        } else if ("com.google.android.videos".equals(a2) && a3.c < cr.a()) {
            z = false;
        } else if (!"com.google.android.apps.magazines".equals(a2) || a3.c >= com.google.android.finsky.cpkg.d.dy.b().intValue()) {
            if (document != null && "com.google.android.apps.magazines".equals(a2) && (eaVarArr = document.f1963a.u) != null && eaVarArr.length > 0) {
                if (document.f1963a.e == 15) {
                    if (!eaVarArr[0].w && a3.c < com.google.android.finsky.cpkg.d.dz.b().intValue()) {
                        z = false;
                    }
                } else if (document.f1963a.e == 17 && FinskyApp.a().e().a(12602952L)) {
                    int length = eaVarArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z2 = false;
                            break;
                        }
                        if (2 == eaVarArr[i].A) {
                            z2 = true;
                            break;
                        }
                        i++;
                    }
                    boolean z3 = cy.a(document, FinskyApp.a().p, account) != null;
                    if ((a3.c < com.google.android.finsky.cpkg.d.dA.b().intValue()) && z2 && !z3) {
                        z = false;
                    }
                }
            }
            z = true;
        } else {
            z = false;
        }
        return (z && (b2 = b(context, document, account)) != null && cr.a(context.getPackageManager(), b2)) ? false : true;
    }
}
