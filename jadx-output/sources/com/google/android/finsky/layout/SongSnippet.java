package com.google.android.finsky.layout;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.jy;
import com.google.android.finsky.protos.pe;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public class SongSnippet extends RelativeLayout implements com.google.android.finsky.layout.play.cy {

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.play.image.e f3088a;

    /* renamed from: b, reason: collision with root package name */
    public Document f3089b;
    public boolean c;
    public Document d;
    public com.google.android.finsky.navigationmanager.b e;
    public int f;
    public pe g;
    public jy h;
    public boolean i;
    public boolean j;
    public boolean k;
    public com.google.android.finsky.a.ai l;
    public com.google.android.finsky.layout.play.cy m;
    private final com.google.android.finsky.j.b n;
    private SongIndex o;
    private PlayActionButton p;
    private TextView q;
    private DecoratedTextView r;
    private DecoratedTextView s;
    private TextView t;
    private ImageView u;
    private ImageView v;
    private final com.google.android.finsky.j.l w;

    static /* synthetic */ boolean e(SongSnippet songSnippet) {
        songSnippet.j = true;
        return true;
    }

    public SongSnippet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = com.google.android.finsky.a.i.a(502);
        this.w = new ed(this);
        this.n = new com.google.android.finsky.j.b(this.w);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h == null) {
            setVisibility(8);
            return;
        }
        a();
        if (this.k) {
            setOnClickListener(new dz(this, this.d.f1963a.T, FinskyApp.a().i().name));
        } else {
            setOnClickListener(null);
        }
        if (com.google.android.finsky.c.d.au.b().booleanValue()) {
            setOnLongClickListener(new ea(this));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.n.a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.o = (SongIndex) findViewById(R.id.song_index);
        this.p = (PlayActionButton) findViewById(R.id.buy_button);
        this.v = (ImageView) findViewById(R.id.badge);
        this.q = (TextView) findViewById(R.id.song_duration);
        this.r = (DecoratedTextView) findViewById(R.id.song_title);
        this.s = (DecoratedTextView) findViewById(R.id.song_subtitle);
        this.t = (TextView) findViewById(R.id.added_state);
        this.u = (ImageView) findViewById(R.id.added_drawable);
    }

    public final void a() {
        this.o.setTrackNumber(this.f);
        if (this.k) {
            String formatElapsedTime = DateUtils.formatElapsedTime(this.h.d);
            this.q.setText(formatElapsedTime);
            this.q.setContentDescription(getResources().getString(R.string.content_description_track_duration, formatElapsedTime));
            this.q.setVisibility(0);
        } else {
            this.q.setVisibility(8);
        }
        this.r.setText(this.d.f1963a.i);
        if (this.g.k != null) {
            this.v.setVisibility(0);
            com.google.android.finsky.protos.an anVar = this.g.k;
            int measuredHeight = this.v.getMeasuredHeight();
            com.google.android.finsky.protos.ds a2 = com.google.android.finsky.utils.v.a(anVar);
            if (a2 != null) {
                if (!a2.l) {
                    measuredHeight = 0;
                }
                com.google.android.play.image.j a3 = this.f3088a.a(a2.f, measuredHeight, measuredHeight, new eb(this));
                if (a3.f6944a != null) {
                    this.v.setImageBitmap(a3.f6944a);
                }
            }
        } else {
            this.v.setVisibility(4);
        }
        if (this.c) {
            this.s.setText(this.d.f1963a.m);
            com.google.android.finsky.utils.v.a(this.d, this.f3088a, this.s);
        } else {
            this.s.setVisibility(8);
        }
        this.p.setVisibility(0);
        com.google.android.finsky.g.a a4 = FinskyApp.a().p.a(FinskyApp.a().i());
        Account i = FinskyApp.a().i();
        Account a5 = com.google.android.finsky.utils.cy.a(this.d, FinskyApp.a().p, i);
        if (a5 != null) {
            b();
            this.p.a(2, R.string.listen, new ec(this, a5));
        } else if (this.d.d(1) != null) {
            b();
            this.p.a(2, this.d.R(), this.e.a(i, this.d, 1, null, null, 200, this));
        } else if (!com.google.android.finsky.utils.cy.a(this.d, FinskyApp.a().g, a4)) {
            switch (this.d.Q()) {
                case 13:
                    c();
                    break;
                default:
                    this.p.setVisibility(4);
                    break;
            }
        } else if (this.f3089b != null && this.f3089b.d(1) != null) {
            c();
        } else {
            this.p.setVisibility(4);
        }
        if (this.i) {
            this.q.setVisibility(8);
            this.t.setVisibility(0);
            this.u.setVisibility(0);
        } else {
            this.q.setVisibility(0);
            this.t.setVisibility(8);
            this.u.setVisibility(8);
        }
        this.o.setClickable(false);
        com.google.android.finsky.j.b.a(this.w);
    }

    public Document getDocument() {
        return this.d;
    }

    public void setState(int i) {
        switch (i) {
            case 1:
                this.o.setState(5);
                break;
            case 2:
                setHighlighted(true);
                this.o.setState(this.k ? 3 : 0);
                break;
            default:
                this.o.setState(0);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHighlighted(boolean z) {
        Resources resources = getResources();
        if (z) {
            setBackgroundResource(R.drawable.active_song_with_highlight);
            int color = resources.getColor(R.color.play_white);
            this.r.setTextColor(color);
            this.s.setTextColor(color);
            this.q.setTextColor(color);
            return;
        }
        int n = android.support.v4.view.by.n(this);
        int o = android.support.v4.view.by.o(this);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        setBackgroundResource(R.drawable.play_highlight_overlay_light);
        android.support.v4.view.by.a(this, n, paddingTop, o, paddingBottom);
        this.r.setTextColor(resources.getColor(R.color.play_fg_secondary));
        this.s.setTextColor(resources.getColor(R.color.play_secondary_text));
        this.q.setTextColor(resources.getColor(R.color.play_secondary_text));
    }

    private void b() {
        this.p.setDrawAsLabel(false);
        this.p.setActionStyle(2);
        this.p.setEnabled(true);
    }

    private void c() {
        this.p.setDrawAsLabel(true);
        this.p.setActionStyle(2);
        this.p.setEnabled(false);
        this.p.a(2, R.string.album_only_purchase, (View.OnClickListener) null);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.l;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.layout.play.cy getParentNode() {
        return this.m;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        throw new IllegalStateException("unwanted children");
    }

    static /* synthetic */ void f(SongSnippet songSnippet) {
        songSnippet.setHighlighted(false);
        songSnippet.o.setState(0);
    }
}
