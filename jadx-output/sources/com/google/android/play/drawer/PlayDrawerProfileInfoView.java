package com.google.android.play.drawer;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.view.by;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.protos.gx;
import com.google.android.play.image.FifeImageView;
import java.util.Map;

/* loaded from: classes.dex */
class PlayDrawerProfileInfoView extends FrameLayout implements View.OnClickListener, com.google.android.play.image.t {

    /* renamed from: a, reason: collision with root package name */
    FifeImageView f6848a;

    /* renamed from: b, reason: collision with root package name */
    y f6849b;
    private FifeImageView c;
    private View d;
    private FifeImageView e;
    private View f;
    private FifeImageView g;
    private TextView h;
    private TextView i;
    private ImageView j;
    private View k;
    private boolean l;
    private boolean m;
    private Account n;
    private Account o;
    private Account p;

    public PlayDrawerProfileInfoView(Context context) {
        this(context, null);
    }

    public PlayDrawerProfileInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (FifeImageView) findViewById(com.google.android.play.k.cover_photo);
        this.f6848a = (FifeImageView) findViewById(com.google.android.play.k.avatar);
        this.d = findViewById(com.google.android.play.k.secondary_avatar_frame_left);
        this.e = (FifeImageView) findViewById(com.google.android.play.k.secondary_avatar_left);
        this.f = findViewById(com.google.android.play.k.secondary_avatar_frame_right);
        this.g = (FifeImageView) findViewById(com.google.android.play.k.secondary_avatar_right);
        this.h = (TextView) findViewById(com.google.android.play.k.display_name);
        this.i = (TextView) findViewById(com.google.android.play.k.account_name);
        this.j = (ImageView) findViewById(com.google.android.play.k.toggle_account_list_button);
        this.k = findViewById(com.google.android.play.k.account_info_container);
        this.f6848a.setOnClickListener(this);
        this.d.setOnClickListener(this);
        this.e.setDuplicateParentStateEnabled(true);
        this.f.setOnClickListener(this);
        this.g.setDuplicateParentStateEnabled(true);
    }

    public final void a(boolean z) {
        if (this.l != z) {
            this.l = z;
            a();
            if (!z) {
                b(false);
            }
        }
    }

    public final void b(boolean z) {
        if (this.m != z) {
            this.m = z;
            a();
        }
    }

    public final void a(Account account, Account[] accountArr, Map<String, gx> map, com.google.android.play.image.e eVar) {
        this.n = account;
        this.p = accountArr.length > 0 ? accountArr[0] : null;
        this.o = accountArr.length > 1 ? accountArr[1] : null;
        gx gxVar = map.get(this.n.name);
        gx gxVar2 = this.p != null ? map.get(this.p.name) : null;
        gx gxVar3 = this.o != null ? map.get(this.o.name) : null;
        setBackgroundDrawable(new ColorDrawable(getResources().getColor(com.google.android.play.h.play_main_background)));
        if (gxVar == null) {
            this.c.setImageResource(com.google.android.play.j.bg_default_profile_art);
            this.h.setText(account.name);
            this.i.setVisibility(8);
        } else {
            this.c.setTag(null);
            ds a2 = com.google.android.play.utils.c.a(gxVar, 15);
            String str = gxVar.i;
            this.c.setOnLoadedListener(this);
            this.c.a(a2.f, a2.l, eVar);
            if (!TextUtils.isEmpty(str)) {
                this.h.setText(str);
            }
            this.i.setText(account.name);
            this.i.setVisibility(0);
        }
        CharSequence text = this.h.getText();
        if (TextUtils.isEmpty(text)) {
            text = account.name;
        }
        a(this.f6848a, true, text, gxVar, eVar);
        if (this.o != null) {
            this.d.setVisibility(0);
            a(this.e, false, this.o.name, gxVar3, eVar);
        } else {
            this.d.setVisibility(8);
        }
        if (this.p != null) {
            this.f.setVisibility(0);
            a(this.g, false, this.p.name, gxVar2, eVar);
        } else {
            this.f.setVisibility(8);
        }
    }

    private void a(FifeImageView fifeImageView, boolean z, CharSequence charSequence, gx gxVar, com.google.android.play.image.e eVar) {
        fifeImageView.setContentDescription(z ? charSequence.toString() : getResources().getString(com.google.android.play.m.play_drawer_content_description_switch_account, charSequence.toString()));
        if (gxVar != null) {
            ds a2 = com.google.android.play.utils.c.a(gxVar, 4);
            fifeImageView.setTag(null);
            fifeImageView.a(a2.f, a2.l, eVar);
            return;
        }
        fifeImageView.setLocalImageBitmap(BitmapFactory.decodeResource(getResources(), com.google.android.play.j.ic_profile_none));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f6849b != null) {
            if (view == this.f6848a) {
                this.f6849b.a(this.n);
            } else if (view == this.d) {
                this.f6849b.a(this.o);
            } else if (view == this.f) {
                this.f6849b.a(this.p);
            }
        }
    }

    private void a() {
        Resources resources = getResources();
        if (this.m) {
            this.j.setVisibility(0);
            this.j.setImageResource(com.google.android.play.j.ic_up_white_16);
            this.j.setContentDescription(resources.getString(com.google.android.play.m.play_drawer_content_description_hide_account_list_button));
        } else {
            if (this.l) {
                this.j.setVisibility(0);
                this.j.setImageResource(com.google.android.play.j.ic_down_white_16);
                this.j.setContentDescription(resources.getString(com.google.android.play.m.play_drawer_content_description_show_account_list_button));
                return;
            }
            this.j.setVisibility(8);
        }
    }

    public final void a(View.OnClickListener onClickListener) {
        int n = by.n(this.k);
        int o = by.o(this.k);
        int paddingTop = this.k.getPaddingTop();
        int paddingBottom = this.k.getPaddingBottom();
        if (onClickListener != null) {
            this.k.setBackgroundResource(com.google.android.play.j.play_highlight_overlay_dark);
        } else {
            this.k.setBackgroundResource(0);
        }
        by.a(this.k, n, paddingTop, o, paddingBottom);
        this.k.setOnClickListener(onClickListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView, Bitmap bitmap) {
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView) {
        setBackgroundDrawable(null);
    }
}
