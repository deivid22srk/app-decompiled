package com.google.android.finsky.detailspage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.PlaylistControlButtons;
import com.google.android.finsky.layout.SongSnippet;
import com.google.android.finsky.protos.jy;
import com.google.android.finsky.protos.om;
import com.google.android.finsky.protos.pe;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class ed extends bd<ee> implements com.android.volley.s, com.google.android.finsky.api.model.x, com.google.android.finsky.gpkg.o {

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.finsky.api.model.i f2635a;
    private boolean u;

    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.song_list_module;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        return (this.f2559b == 0 || ((ee) this.f2559b).c == null || ((ee) this.f2559b).c.isEmpty()) ? false : true;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(bf bfVar) {
        super.a(bfVar);
        if (this.f2559b != 0 && ((ee) this.f2559b).c == null) {
            e();
        }
        this.m.a(this);
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        if (b(document) && this.f2559b == 0) {
            this.f2559b = a(document);
            ((ee) this.f2559b).g = new HashSet();
            e();
        }
    }

    protected ee a(Document document) {
        String str;
        ee eeVar = new ee();
        eeVar.f2636a = document;
        eeVar.e = document.f1963a.e == 2;
        om aw = document.aw();
        if (aw != null) {
            eeVar.f = aw.f4215a;
        }
        if (c(document)) {
            eeVar.h = document.f();
            eeVar.f2637b = document.g();
        } else {
            com.google.android.finsky.protos.ae aeVar = document.f1963a.C;
            if (aeVar != null && aeVar.c != null) {
                str = aeVar.c.f4213a;
            } else {
                str = "";
            }
            eeVar.h = str;
            eeVar.f2637b = document.e();
        }
        return eeVar;
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        List<Document> list;
        int i;
        boolean z;
        SongSnippet songSnippet;
        boolean z2;
        SongListModuleLayout songListModuleLayout = (SongListModuleLayout) view;
        if (!songListModuleLayout.f2512a || this.u) {
            String c = this.f.c();
            com.google.android.finsky.navigationmanager.b bVar = this.i;
            com.google.android.play.image.e eVar = this.h;
            Document document = ((ee) this.f2559b).f2636a;
            List<Document> list2 = ((ee) this.f2559b).c;
            String str = ((ee) this.f2559b).h;
            String str2 = ((ee) this.f2559b).i;
            boolean z3 = ((ee) this.f2559b).e;
            Set<String> set = ((ee) this.f2559b).g;
            com.google.android.finsky.layout.play.cy cyVar = this.s;
            String str3 = ((ee) this.f2559b).f;
            View findViewById = songListModuleLayout.findViewById(R.id.song_list_header);
            songListModuleLayout.c.setText(str);
            if (!TextUtils.isEmpty(str2)) {
                songListModuleLayout.d.setText(str2);
                songListModuleLayout.d.setVisibility(0);
            } else {
                songListModuleLayout.d.setVisibility(8);
            }
            int size = list2.size();
            if (document.f1963a.e == 3) {
                int min = Math.min(list2.size(), 5);
                ArrayList a2 = com.google.android.finsky.utils.cz.a(min);
                for (int i2 = 0; i2 < min; i2++) {
                    a2.add(list2.get(i2));
                }
                i = min;
                list = a2;
            } else {
                list = list2;
                i = size;
            }
            int i3 = 0;
            int i4 = 0;
            while (i4 < i) {
                pe G = list.get(i4).G();
                i4++;
                i3 = (G == null || !G.i || TextUtils.isEmpty(G.h)) ? i3 : i3 + 1;
            }
            if (i3 < 2) {
                songListModuleLayout.e.setVisibility(8);
                findViewById.setOnClickListener(null);
                findViewById.setClickable(false);
            } else {
                songListModuleLayout.e.setVisibility(0);
                PlaylistControlButtons playlistControlButtons = songListModuleLayout.e;
                playlistControlButtons.f3045a = list;
                playlistControlButtons.a(2, R.string.play_all, (View.OnClickListener) null);
                findViewById.setOnClickListener(new ef(songListModuleLayout, SongListModuleLayout.a(list), c));
                findViewById.setClickable(true);
            }
            boolean a3 = SongListModuleLayout.a(document, list);
            LayoutInflater layoutInflater = null;
            boolean isEmpty = TextUtils.isEmpty(str3);
            int childCount = songListModuleLayout.f2513b.getChildCount();
            int i5 = 0;
            boolean z4 = isEmpty;
            while (i5 < i) {
                Document document2 = list.get(i5);
                if (i5 < childCount) {
                    SongSnippet songSnippet2 = (SongSnippet) songListModuleLayout.f2513b.getChildAt(i5);
                    songSnippet2.setVisibility(0);
                    z = false;
                    songSnippet = songSnippet2;
                } else {
                    if (layoutInflater == null) {
                        layoutInflater = LayoutInflater.from(songListModuleLayout.getContext());
                    }
                    z = true;
                    songSnippet = (SongSnippet) layoutInflater.inflate(R.layout.music_song_snippet, (ViewGroup) null);
                }
                int i6 = z3 ? document2.G().f : i5 + 1;
                boolean contains = set.contains(document2.f1963a.f3890a);
                songSnippet.f3088a = eVar;
                songSnippet.c = a3;
                songSnippet.f3089b = document;
                songSnippet.d = document2;
                songSnippet.e = bVar;
                songSnippet.f = i6;
                songSnippet.i = contains;
                songSnippet.m = cyVar;
                songSnippet.g = songSnippet.d.G();
                songSnippet.h = songSnippet.g.c;
                songSnippet.k = (songSnippet.h == null || songSnippet.h.d <= 0 || TextUtils.isEmpty(songSnippet.g.h)) ? false : true;
                com.google.android.finsky.apkg.i.a(songSnippet.l, songSnippet.d.f1963a.R);
                songSnippet.m.a(songSnippet);
                if (!songListModuleLayout.f2512a && document2.f1963a.f3890a.equals(str3)) {
                    songSnippet.setState(2);
                } else if (z) {
                    songSnippet.setState(0);
                }
                if (z4 && songSnippet.k) {
                    if (!songSnippet.j) {
                        songSnippet.setState(1);
                        songSnippet.j = true;
                    }
                    z2 = false;
                } else {
                    z2 = z4;
                }
                if (z) {
                    songListModuleLayout.f2513b.addView(songSnippet);
                } else {
                    songSnippet.a();
                }
                i5++;
                z4 = z2;
            }
            for (int size2 = list.size(); size2 < childCount; size2++) {
                songListModuleLayout.f2513b.getChildAt(size2).setVisibility(8);
            }
            songListModuleLayout.f2512a = true;
            this.u = false;
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void f() {
        super.f();
        if (this.f2635a != null) {
            this.f2635a.b((com.google.android.finsky.api.model.x) this);
            this.f2635a.b((com.android.volley.s) this);
        }
        this.m.b(this);
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void b(View view) {
        ((SongListModuleLayout) view).f2512a = false;
    }

    private void e() {
        this.f2635a = new com.google.android.finsky.api.model.i(this.f, ((ee) this.f2559b).f2637b, false);
        this.f2635a.a((com.google.android.finsky.api.model.x) this);
        this.f2635a.a((com.android.volley.s) this);
        this.f2635a.q();
    }

    private static boolean c(Document document) {
        return !TextUtils.isEmpty(document.g());
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        int p = this.f2635a.p();
        ArrayList a2 = com.google.android.finsky.utils.cz.a(p);
        for (int i = 0; i < p; i++) {
            Document c = this.f2635a.c(i);
            jy jyVar = c.G().c;
            if (jyVar != null && jyVar.d > 0) {
                a2.add(c);
            }
        }
        ((ee) this.f2559b).c = a2;
        if (W_()) {
            h();
        }
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        Toast.makeText(this.c, com.google.android.finsky.utils.aw.a(this.c, volleyError), 0).show();
    }

    @Override // com.google.android.finsky.gpkg.o
    public final void M_() {
    }

    @Override // com.google.android.finsky.gpkg.o
    public final void L_() {
        if (W_()) {
            h();
        }
    }

    private void h() {
        boolean z = ((ee) this.f2559b).d == null;
        if (z) {
            ((ee) this.f2559b).d = new HashSet();
        }
        for (int i = 0; i < ((ee) this.f2559b).c.size(); i++) {
            Document document = ((ee) this.f2559b).c.get(i);
            if (com.google.android.finsky.utils.cy.a(document, (com.google.android.finsky.gpkg.p) this.m)) {
                if (z) {
                    ((ee) this.f2559b).d.add(document.f1963a.f3890a);
                } else if (!((ee) this.f2559b).d.contains(document.f1963a.f3890a)) {
                    ((ee) this.f2559b).g.add(document.f1963a.f3890a);
                }
            }
        }
        this.u = true;
        this.d.a((bd) this, true);
    }

    protected boolean b(Document document) {
        int i = document.f1963a.e;
        if (i == 2 || i == 3) {
            if (c(document)) {
                return true;
            }
            if (!TextUtils.isEmpty(document.e())) {
                return true;
            }
        }
        return false;
    }
}
