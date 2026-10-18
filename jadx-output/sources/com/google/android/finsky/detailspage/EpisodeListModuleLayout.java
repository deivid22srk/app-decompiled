package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Spinner;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.EpisodeSnippet;
import com.google.android.play.layout.PlayActionButton;
import java.util.List;

/* loaded from: classes.dex */
public class EpisodeListModuleLayout extends LinearLayout implements com.google.android.finsky.layout.az {

    /* renamed from: a, reason: collision with root package name */
    boolean f2495a;

    /* renamed from: b, reason: collision with root package name */
    com.google.android.play.image.e f2496b;
    com.google.android.finsky.layout.play.cy c;
    com.google.android.finsky.navigationmanager.b d;
    View e;
    LinearLayout f;
    View g;
    Spinner h;
    PlayActionButton i;
    at j;
    List<Document> k;
    Document l;

    public EpisodeListModuleLayout(Context context) {
        super(context);
    }

    public EpisodeListModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EpisodeListModuleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f = (LinearLayout) findViewById(R.id.episodes);
        this.g = findViewById(R.id.overlay);
        this.i = (PlayActionButton) findViewById(R.id.buy_button);
        this.e = findViewById(R.id.episode_list_in_progress_snippet);
        this.h = (Spinner) findViewById(R.id.header_spinner);
        this.h.setOnItemSelectedListener(new ar(this));
    }

    @Override // com.google.android.finsky.layout.az
    public final void a(EpisodeSnippet episodeSnippet) {
        int childCount = this.f.getChildCount();
        for (int i = 0; i < childCount; i++) {
            EpisodeSnippet episodeSnippet2 = (EpisodeSnippet) this.f.getChildAt(i);
            if (episodeSnippet2 != episodeSnippet) {
                episodeSnippet2.b();
            }
        }
        if (episodeSnippet.c()) {
            this.j.a(episodeSnippet.getEpisode());
        } else {
            this.j.a(null);
        }
    }

    public void setSelectedSeasonIndex(int i) {
        this.h.setSelection(i);
    }
}
