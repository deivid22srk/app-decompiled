package com.google.android.finsky.detailspage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.AppsPermissionsActivity;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.gh;
import com.google.android.finsky.protos.gu;
import com.google.android.finsky.protos.gv;
import com.google.android.finsky.protos.jd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class m extends bd<n> implements q {
    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.bylines_module;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        return this.f2559b != 0;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        String str;
        String upperCase;
        com.google.android.finsky.protos.an anVar;
        if (this.f2559b != 0 || !z) {
            return;
        }
        int i = document.f1963a.e;
        ArrayList arrayList = new ArrayList();
        switch (i) {
            case 1:
                com.google.android.finsky.protos.ag E = document.E();
                if (!TextUtils.isEmpty(E.s)) {
                    arrayList.add(a(R.string.link_website, R.drawable.ic_developer_website, 114, 1, document, E.s));
                }
                if (!TextUtils.isEmpty(E.q)) {
                    arrayList.add(a(R.string.link_email, R.drawable.ic_developer_email, 115, 0, document, E.q));
                }
                com.google.android.finsky.protos.ae aeVar = document.f1963a.C;
                if (aeVar != null) {
                    str = aeVar.w;
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(a(R.string.privacy_policy, R.drawable.ic_developer_privacy, 116, 1, document, str));
                }
                if (!document.P()) {
                    arrayList.add(a(R.string.permission_details, R.drawable.ic_developer_permission, 130, 2, document, null));
                    break;
                }
                break;
            case 3:
                com.google.android.finsky.protos.aj ajVar = document.D() ? document.f1963a.z.c : null;
                if (ajVar != null && ajVar.e != null) {
                    com.google.android.finsky.protos.ak akVar = ajVar.e;
                    if (akVar.f3594a.length > 0) {
                        for (String str2 : akVar.f3594a) {
                            if (!TextUtils.isEmpty(str2)) {
                                arrayList.add(a(R.string.link_website, R.drawable.ic_developer_website, 117, 1, document, str2));
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(akVar.d)) {
                        arrayList.add(a(R.string.link_youtube, R.drawable.ic_developer_youtube, 118, 1, document, akVar.d));
                    }
                    if (!TextUtils.isEmpty(akVar.f3595b)) {
                        arrayList.add(a(R.string.link_googleplus, R.drawable.ic_developer_googleplus, 119, 1, document, akVar.f3595b));
                        break;
                    }
                }
                break;
            case 8:
                gh ghVar = document.D() ? document.f1963a.z.n : null;
                if (ghVar != null && !TextUtils.isEmpty(ghVar.f3864a)) {
                    arrayList.add(a(R.string.link_website, R.drawable.ic_developer_website, 114, 1, document, ghVar.f3864a));
                    break;
                }
                break;
            case 30:
                gu guVar = document.D() ? document.f1963a.z.m : null;
                if (guVar != null && guVar.f3884a != null) {
                    gv gvVar = guVar.f3884a;
                    if (gvVar.f3886a.length > 0) {
                        for (jd jdVar : gvVar.f3886a) {
                            if (!TextUtils.isEmpty(jdVar.f3988a)) {
                                arrayList.add(a(R.string.link_website, R.drawable.ic_developer_website, 117, 1, document, jdVar.f3988a));
                            }
                        }
                    }
                    if (gvVar.f3887b != null && !TextUtils.isEmpty(gvVar.f3887b.f3988a)) {
                        arrayList.add(a(R.string.link_email, R.drawable.ic_developer_googleplus, 119, 1, document, gvVar.f3887b.f3988a));
                    }
                    if (gvVar.c != null && !TextUtils.isEmpty(gvVar.c.f3988a)) {
                        arrayList.add(a(R.string.link_email, R.drawable.ic_developer_youtube, 118, 1, document, gvVar.c.f3988a));
                        break;
                    }
                }
                break;
        }
        if (!arrayList.isEmpty()) {
            this.f2559b = new n();
            n nVar = (n) this.f2559b;
            int i2 = -1;
            switch (document.f1963a.e) {
                case 1:
                    i2 = R.string.details_developer_links;
                    break;
                case 3:
                    i2 = R.string.details_artist_links;
                    break;
                case 30:
                    i2 = R.string.details_artist_links;
                    break;
            }
            if (i2 < 0) {
                upperCase = null;
            } else {
                upperCase = this.c.getString(i2).toUpperCase();
            }
            nVar.f2662a = upperCase;
            n nVar2 = (n) this.f2559b;
            if (document.f1963a.e == 1) {
                anVar = document.Y() ? document.Z() : null;
            } else {
                anVar = null;
            }
            nVar2.f2663b = anVar;
            ((n) this.f2559b).c = arrayList;
        }
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        BylinesModuleLayout bylinesModuleLayout = (BylinesModuleLayout) view;
        if (!bylinesModuleLayout.d) {
            com.google.android.play.image.e eVar = this.h;
            String str = ((n) this.f2559b).f2662a;
            com.google.android.finsky.protos.an anVar = ((n) this.f2559b).f2663b;
            List<p> list = ((n) this.f2559b).c;
            bylinesModuleLayout.f2487b.removeAllViews();
            if (list.isEmpty()) {
                bylinesModuleLayout.setVisibility(8);
                return;
            }
            int size = list.size();
            int integer = bylinesModuleLayout.getResources().getInteger(R.integer.details_extra_primary_items_per_row);
            int i = ((size + integer) - 1) / integer;
            for (int i2 = 0; i2 < i; i2++) {
                ViewGroup viewGroup = (ViewGroup) bylinesModuleLayout.f2486a.inflate(R.layout.bylines_module_row, (ViewGroup) bylinesModuleLayout.f2487b, false);
                for (int i3 = 0; i3 < integer; i3++) {
                    int i4 = (integer * i2) + i3;
                    BylinesModuleCellLayout bylinesModuleCellLayout = (BylinesModuleCellLayout) bylinesModuleLayout.f2486a.inflate(R.layout.bylines_module_cell, viewGroup, false);
                    if (i4 >= size) {
                        bylinesModuleCellLayout.setVisibility(4);
                    } else {
                        p pVar = list.get(i4);
                        o oVar = new o(bylinesModuleLayout, this, pVar);
                        if (pVar.c < 0) {
                            bylinesModuleCellLayout.f2484a.setVisibility(4);
                        } else {
                            bylinesModuleCellLayout.f2484a.setVisibility(0);
                            bylinesModuleCellLayout.f2484a.setImageResource(pVar.c);
                        }
                        if (pVar.f2667b > 0) {
                            bylinesModuleCellLayout.f2485b.setText(pVar.f2667b);
                        } else {
                            bylinesModuleCellLayout.f2485b.setText(pVar.f2666a);
                        }
                        bylinesModuleCellLayout.setOnClickListener(oVar);
                        bylinesModuleCellLayout.setContentDescription(bylinesModuleCellLayout.f2485b.getText());
                    }
                    viewGroup.addView(bylinesModuleCellLayout);
                }
                bylinesModuleLayout.f2487b.addView(viewGroup);
            }
            if (TextUtils.isEmpty(str)) {
                bylinesModuleLayout.c.setVisibility(8);
            } else {
                bylinesModuleLayout.c.setVisibility(0);
                bylinesModuleLayout.c.setText(str);
                if (anVar != null) {
                    com.google.android.finsky.utils.v.a(anVar, eVar, bylinesModuleLayout.c);
                }
            }
            bylinesModuleLayout.d = true;
        }
    }

    private static p a(int i, int i2, int i3, int i4, Document document, String str) {
        return new p(i, i2, i3, document, str, i4);
    }

    @Override // com.google.android.finsky.detailspage.q
    public final void a(p pVar) {
        int i;
        Intent a2;
        try {
            Document document = pVar.f;
            String str = pVar.g;
            switch (pVar.d) {
                case 0:
                    a2 = com.google.android.finsky.utils.cr.b(Uri.fromParts("mailto", str, null));
                    a2.putExtra("android.intent.extra.SUBJECT", document.f1963a.i);
                    break;
                case 1:
                    a2 = com.google.android.finsky.utils.cr.a(Uri.parse(str));
                    break;
                case 2:
                    a2 = AppsPermissionsActivity.a(FinskyApp.a().j(), document.f1963a.f3890a, document, true);
                    break;
                default:
                    a2 = null;
                    break;
            }
            this.c.startActivity(a2);
        } catch (ActivityNotFoundException e) {
            com.google.android.finsky.e.t tVar = this.j.ao;
            Context context = this.c;
            switch (pVar.d) {
                case 0:
                    i = R.string.no_email_app;
                    break;
                case 1:
                    i = R.string.no_web_app;
                    break;
                default:
                    i = -1;
                    break;
            }
            tVar.a("", context.getString(i), false);
        }
        if (pVar.e != -1) {
            FinskyApp.a().h().a(pVar.e, (byte[]) null, this.s);
        }
    }
}
