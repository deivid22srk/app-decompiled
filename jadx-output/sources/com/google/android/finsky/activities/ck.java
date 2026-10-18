package com.google.android.finsky.activities;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.ow;
import com.google.android.finsky.protos.ox;

/* loaded from: classes.dex */
public final class ck extends com.google.android.finsky.e.q implements com.android.volley.t<ox> {

    /* renamed from: a, reason: collision with root package name */
    private LinearLayout f1653a;

    /* renamed from: b, reason: collision with root package name */
    private ow[] f1654b;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(ox oxVar) {
        this.f1654b = oxVar.f4231a;
        m_();
    }

    public static ck r_() {
        return new ck();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final int w() {
        return R.layout.family_library_settings_fragment;
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        k();
        if (bundle == null) {
            FinskyApp.a().h().a(0L, (com.google.android.finsky.layout.play.cy) this);
        }
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = super.a(layoutInflater, viewGroup, bundle);
        this.f1653a = (LinearLayout) a2.findViewById(R.id.library_settings_list);
        return a2;
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        o_();
        if (this.f1654b != null) {
            u();
        } else {
            this.au.a();
            y();
        }
    }

    @Override // com.google.android.finsky.e.q
    public final void o_() {
        this.ao.b_(f_(R.string.family_library_settings_title));
        this.ao.a(0, false);
        this.ao.s_();
        this.ao.h().q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final void y() {
        this.aq.h(this, this);
    }

    @Override // android.support.v4.app.Fragment
    public final void p() {
        boolean z = false;
        for (int i = 0; i < this.f1653a.getChildCount(); i++) {
            FamilyLibrarySettingsRowView familyLibrarySettingsRowView = (FamilyLibrarySettingsRowView) this.f1653a.getChildAt(i);
            ow owVar = this.f1654b[i];
            boolean z2 = owVar.c;
            owVar.c = familyLibrarySettingsRowView.f1516a.isChecked();
            if (owVar.c != z2) {
                z = true;
            }
        }
        if (z) {
            this.aq.a(this.f1654b, new cl(this), new cm(this));
        }
        super.p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final void u() {
        long j;
        String string;
        this.f1653a.removeAllViews();
        LayoutInflater layoutInflater = f().getLayoutInflater();
        com.google.android.finsky.d.d d = FinskyApp.a().d(this.aq.c());
        for (ow owVar : this.f1654b) {
            switch (owVar.f4229a) {
                case 1:
                    j = 12604245;
                    break;
                case 2:
                default:
                    j = -1;
                    break;
                case 3:
                    j = 12604244;
                    break;
                case 4:
                    j = 12604246;
                    break;
            }
            if (d.a(j)) {
                FamilyLibrarySettingsRowView familyLibrarySettingsRowView = (FamilyLibrarySettingsRowView) layoutInflater.inflate(R.layout.family_library_settings_row, (ViewGroup) this.f1653a, false);
                this.f1653a.addView(familyLibrarySettingsRowView);
                TextView textView = familyLibrarySettingsRowView.f1517b;
                Resources resources = familyLibrarySettingsRowView.getResources();
                int i = owVar.f4229a;
                switch (i) {
                    case 1:
                        string = resources.getString(R.string.corpus_title_books);
                        break;
                    case 2:
                        string = resources.getString(R.string.corpus_title_music);
                        break;
                    case 3:
                        string = resources.getString(R.string.corpus_title_apps);
                        break;
                    case 4:
                        string = resources.getString(R.string.corpus_title_movies);
                        break;
                    case 5:
                    default:
                        throw new IllegalArgumentException("Unsupported backendId (" + i + ")");
                    case 6:
                        string = resources.getString(R.string.corpus_title_newsstand);
                        break;
                }
                textView.setText(string);
                familyLibrarySettingsRowView.c.setImageResource(com.google.android.finsky.utils.ai.i(owVar.f4229a));
                familyLibrarySettingsRowView.f1516a.setChecked(owVar.c);
            }
        }
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d() {
        super.d();
        this.f1653a = null;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return com.google.android.finsky.a.i.a(5220);
    }
}
