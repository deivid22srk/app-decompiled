package com.google.android.finsky.detailspage;

import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.DiscoveryBar;
import com.google.android.finsky.layout.play.DiscoveryBadgeGeneric;
import com.google.android.finsky.protos.gc;

/* loaded from: classes.dex */
public class ag extends bd<ah> {
    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.discovery_bar;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        if (this.f2559b != 0 && !((ah) this.f2559b).f2535a.P()) {
            if (((ah) this.f2559b).c != null) {
                return ((ah) this.f2559b).c.length > 0;
            }
            switch (((ah) this.f2559b).f2535a.f1963a.e) {
                case 1:
                case 2:
                case 5:
                case 6:
                case 16:
                case 17:
                case 18:
                case 24:
                case 25:
                    break;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        gc[] gcVarArr;
        if (document.P()) {
            this.d.a(this);
            return;
        }
        if (document.f1963a.e != 3) {
            if (this.f2559b == 0) {
                this.f2559b = new ah();
            }
            if (((ah) this.f2559b).c == null) {
                ((ah) this.f2559b).f2535a = document;
                ((ah) this.f2559b).f2536b = document2;
                if (z) {
                    ah ahVar = (ah) this.f2559b;
                    if (hVar2.f1976a == null) {
                        gcVarArr = null;
                    } else {
                        gcVarArr = hVar2.f1976a.h;
                    }
                    ahVar.c = gcVarArr;
                    if (((ah) this.f2559b).c != null && ((ah) this.f2559b).c.length > 0) {
                        this.d.a((bd) this, true);
                    } else {
                        this.d.a(this);
                    }
                }
            }
        }
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        View inflate;
        DiscoveryBar discoveryBar = (DiscoveryBar) view;
        if (((ah) this.f2559b).c != null) {
            if (!discoveryBar.h) {
                com.google.android.finsky.navigationmanager.b bVar = this.i;
                com.google.android.play.image.e eVar = this.h;
                Document document = ((ah) this.f2559b).f2536b;
                gc[] gcVarArr = ((ah) this.f2559b).c;
                DfeToc dfeToc = FinskyApp.a().g;
                PackageManager packageManager = FinskyApp.a().getPackageManager();
                boolean z = ((ah) this.f2559b).d;
                int i = ((ah) this.f2559b).e;
                com.google.android.finsky.layout.play.cy cyVar = this.s;
                if (gcVarArr == null || gcVarArr.length == 0) {
                    discoveryBar.setVisibility(8);
                } else {
                    discoveryBar.setVisibility(0);
                    discoveryBar.h = true;
                    discoveryBar.f2973a = document;
                    discoveryBar.f2974b = gcVarArr;
                    discoveryBar.c = eVar;
                    discoveryBar.d = bVar;
                    discoveryBar.e = dfeToc;
                    discoveryBar.f = packageManager;
                    discoveryBar.k = cyVar;
                    discoveryBar.i = z;
                    discoveryBar.j = i;
                    LayoutInflater from = LayoutInflater.from(discoveryBar.getContext());
                    discoveryBar.g.removeAllViews();
                    for (gc gcVar : discoveryBar.f2974b) {
                        if (gcVar.n) {
                            inflate = from.inflate(R.layout.discovery_badge_rating, discoveryBar.g, false);
                        } else if (gcVar.k) {
                            inflate = from.inflate(R.layout.discovery_badge_social_plus_one, discoveryBar.g, false);
                        } else if (gcVar.p) {
                            inflate = from.inflate(R.layout.discovery_badge_social_rating, discoveryBar.g, false);
                        } else if (gcVar.r) {
                            inflate = from.inflate(R.layout.discovery_badge_dowload_count, discoveryBar.g, false);
                        } else if (gcVar.u != null) {
                            inflate = from.inflate(R.layout.discovery_badge_social_player, discoveryBar.g, false);
                        } else if (gcVar.v != null) {
                            inflate = from.inflate(R.layout.discovery_badge_family_age_range, discoveryBar.g, false);
                        } else if (gcVar.w != null) {
                            inflate = from.inflate(R.layout.discovery_badge_family_category, discoveryBar.g, false);
                        } else {
                            inflate = from.inflate(R.layout.discovery_badge_generic, discoveryBar.g, false);
                        }
                        com.google.android.finsky.layout.play.a aVar = (com.google.android.finsky.layout.play.a) inflate;
                        aVar.a(gcVar, discoveryBar.c, discoveryBar.d, discoveryBar.f2973a, discoveryBar.e, discoveryBar.f, discoveryBar);
                        discoveryBar.g.addView(aVar);
                    }
                }
                ((ah) this.f2559b).d = false;
                return;
            }
            return;
        }
        discoveryBar.g.removeAllViews();
        DiscoveryBadgeGeneric discoveryBadgeGeneric = (DiscoveryBadgeGeneric) LayoutInflater.from(discoveryBar.getContext()).inflate(R.layout.discovery_badge_generic, discoveryBar.g, false);
        discoveryBadgeGeneric.setVisibility(4);
        discoveryBar.g.addView(discoveryBadgeGeneric);
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void b(View view) {
        DiscoveryBar discoveryBar = (DiscoveryBar) view;
        if (this.f2559b != 0) {
            ((ah) this.f2559b).d = true;
            ((ah) this.f2559b).e = discoveryBar.getScrollPosition();
        }
    }
}
