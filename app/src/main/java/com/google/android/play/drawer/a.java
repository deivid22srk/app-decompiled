package com.google.android.play.drawer;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.v4.view.by;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.protos.gx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class a extends BaseAdapter {
    public v c;
    public boolean d;
    public boolean e;
    public Account f;
    public boolean h;
    public boolean i;
    boolean j;
    private final LayoutInflater k;
    private final com.google.android.play.image.e l;
    private u m;
    private r n;
    private ListView o;
    private com.google.android.play.dfe.api.g q;
    private Context t;
    private boolean u;

    /* renamed from: a, reason: collision with root package name */
    public final List<w> f6850a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final List<x> f6851b = new ArrayList();
    public Account[] g = new Account[0];
    private final Map<String, gx> r = new HashMap();
    private final Set<String> s = new HashSet();
    private int p = -1;

    public a(Context context, boolean z, u uVar, com.google.android.play.dfe.api.g gVar, com.google.android.play.image.e eVar, r rVar, ListView listView, boolean z2) {
        this.t = context;
        this.k = LayoutInflater.from(context);
        this.q = gVar;
        this.l = eVar;
        this.m = uVar;
        this.n = rVar;
        this.o = listView;
        this.h = z;
        this.u = z2;
    }

    public final void a() {
        if (this.g.length > 0 && this.h) {
            b();
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int i = this.e ? 1 : 0;
        if (!this.h) {
            int size = i + 1 + this.f6850a.size() + 1;
            if (this.d) {
                size++;
            }
            return size + this.f6851b.size();
        }
        return i + this.g.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (this.e) {
            if (i == 0) {
                return this.f.name;
            }
            i--;
        }
        if (!this.h) {
            if (i == 0) {
                return null;
            }
            int i2 = i - 1;
            int size = this.f6850a.size();
            if (i2 < size) {
                return this.f6850a.get(i2);
            }
            int i3 = i2 - size;
            if (this.d) {
                if (i3 == 0) {
                    return this.c;
                }
                i3--;
            }
            if (i3 == 0) {
                return null;
            }
            return this.f6851b.get(i3 - 1);
        }
        return this.g[i];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        if (this.e) {
            if (i == 0) {
                return this.u ? 9 : 0;
            }
            i--;
        }
        if (this.h) {
            return this.u ? 10 : 1;
        }
        if (i == 0) {
            return 2;
        }
        int i2 = i - 1;
        if (i2 < this.f6850a.size()) {
            w wVar = this.f6850a.get(i2);
            if (wVar.g) {
                return 6;
            }
            if (this.d && this.i && !wVar.e) {
                return 5;
            }
            if (wVar.d) {
                return 3;
            }
            return 4;
        }
        int size = i2 - this.f6850a.size();
        if (size == 0) {
            return 6;
        }
        int i3 = size - 1;
        if (this.d && i3 == 0) {
            return 8;
        }
        return 7;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 11;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        switch (getItemViewType(i)) {
            case 2:
            case 6:
                return false;
            default:
                return true;
        }
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        PlayDrawerDownloadSwitchRow playDrawerDownloadSwitchRow;
        int itemViewType = getItemViewType(i);
        Object item = getItem(i);
        switch (itemViewType) {
            case 0:
                PlayDrawerProfileInfoView playDrawerProfileInfoView = (PlayDrawerProfileInfoView) (view != null ? view : this.k.inflate(com.google.android.play.l.play_drawer_profile_info, viewGroup, false));
                this.p = i;
                Account account = this.f;
                String str = this.f.name;
                playDrawerProfileInfoView.a(account, this.g, this.r, this.l);
                boolean z = this.j;
                playDrawerProfileInfoView.f6848a.setEnabled(z);
                by.c((View) playDrawerProfileInfoView.f6848a, z ? 1 : 2);
                this.q.a(account).a(new f(this, str, playDrawerProfileInfoView, account), new g(this), true);
                for (int i2 = 0; i2 < this.g.length; i2++) {
                    Account account2 = this.g[i2];
                    String str2 = account2.name;
                    if (!this.s.contains(str2)) {
                        this.q.a(account2).a(new j(this, str2), new k(this), true);
                    }
                }
                playDrawerProfileInfoView.b(this.h);
                playDrawerProfileInfoView.f6849b = new h(this);
                if (this.g.length > 0) {
                    playDrawerProfileInfoView.a(true);
                    playDrawerProfileInfoView.a(new i(this));
                    return playDrawerProfileInfoView;
                }
                playDrawerProfileInfoView.a(false);
                playDrawerProfileInfoView.a((View.OnClickListener) null);
                return playDrawerProfileInfoView;
            case 1:
                Account account3 = (Account) item;
                PlayDrawerAccountRow playDrawerAccountRow = (PlayDrawerAccountRow) (view != null ? view : this.k.inflate(com.google.android.play.l.play_drawer_account_row, viewGroup, false));
                String str3 = account3.name;
                gx gxVar = this.r.get(str3);
                com.google.android.play.image.e eVar = this.l;
                playDrawerAccountRow.f6842b.setText(str3);
                playDrawerAccountRow.setContentDescription(playDrawerAccountRow.getResources().getString(com.google.android.play.m.play_drawer_content_description_switch_account, str3));
                if (gxVar == null) {
                    playDrawerAccountRow.f6841a.setLocalImageBitmap(BitmapFactory.decodeResource(playDrawerAccountRow.getResources(), com.google.android.play.j.ic_profile_none));
                } else {
                    ds a2 = com.google.android.play.utils.c.a(gxVar, 4);
                    playDrawerAccountRow.f6841a.a(a2.f, a2.l, eVar);
                }
                playDrawerAccountRow.setOnClickListener(new l(this, str3));
                return playDrawerAccountRow;
            case 2:
                return view != null ? view : this.k.inflate(com.google.android.play.l.play_drawer_primary_actions_top_spacing, viewGroup, false);
            case 3:
                return a(view, viewGroup, (w) item, true, false);
            case 4:
                return a(view, viewGroup, (w) item, false, false);
            case 5:
                return a(view, viewGroup, (w) item, false, true);
            case 6:
                return view != null ? view : this.k.inflate(com.google.android.play.l.play_drawer_secondary_actions_top_separator, viewGroup, false);
            case 7:
                x xVar = (x) item;
                TextView textView = (TextView) (view != null ? view : this.k.inflate(com.google.android.play.l.play_drawer_secondary_action, viewGroup, false));
                textView.setText(xVar.f6878a);
                textView.setOnClickListener(new d(this, xVar));
                com.google.android.play.utils.j.b(this.t);
                textView.setGravity(8388627);
                return textView;
            case 8:
                if (view == null) {
                    playDrawerDownloadSwitchRow = (PlayDrawerDownloadSwitchRow) this.k.inflate(com.google.android.play.l.play_drawer_download_toggle, viewGroup, false);
                    v vVar = this.c;
                    playDrawerDownloadSwitchRow.d = vVar.f6875b;
                    int i3 = vVar.d;
                    int i4 = vVar.c;
                    if (PlayDrawerDownloadSwitchRow.f6843a) {
                        if (i4 != -1) {
                            playDrawerDownloadSwitchRow.c.setTrackResource(i4);
                        }
                        if (i3 != -1) {
                            playDrawerDownloadSwitchRow.c.setThumbResource(i3);
                        }
                        playDrawerDownloadSwitchRow.c.setContentDescription(vVar.f6874a);
                    }
                    playDrawerDownloadSwitchRow.f6844b.setText(vVar.f6874a);
                    TextView textView2 = playDrawerDownloadSwitchRow.f6844b;
                    com.google.android.play.utils.j.b(playDrawerDownloadSwitchRow.getContext());
                    textView2.setGravity(8388627);
                    playDrawerDownloadSwitchRow.e = new e(this);
                } else {
                    playDrawerDownloadSwitchRow = (PlayDrawerDownloadSwitchRow) view;
                }
                playDrawerDownloadSwitchRow.a(this.i);
                return playDrawerDownloadSwitchRow;
            case 9:
                PlayDrawerMiniProfileInfoView playDrawerMiniProfileInfoView = (PlayDrawerMiniProfileInfoView) (view != null ? view : this.k.inflate(com.google.android.play.l.play_drawer_mini_profile_info_view, viewGroup, false));
                this.p = i;
                playDrawerMiniProfileInfoView.b(this.h);
                playDrawerMiniProfileInfoView.f6846a.setText(this.f.name);
                if (this.g.length > 0) {
                    playDrawerMiniProfileInfoView.a(true);
                    playDrawerMiniProfileInfoView.a(new b(this));
                    return playDrawerMiniProfileInfoView;
                }
                playDrawerMiniProfileInfoView.a(false);
                playDrawerMiniProfileInfoView.a((View.OnClickListener) null);
                return playDrawerMiniProfileInfoView;
            case 10:
                Account account4 = (Account) item;
                PlayDrawerMiniAccountRow playDrawerMiniAccountRow = (PlayDrawerMiniAccountRow) (view != null ? view : this.k.inflate(com.google.android.play.l.play_drawer_mini_account_row, viewGroup, false));
                String str4 = account4.name;
                playDrawerMiniAccountRow.f6845a.setText(str4);
                playDrawerMiniAccountRow.setContentDescription(playDrawerMiniAccountRow.getResources().getString(com.google.android.play.m.play_drawer_content_description_switch_account, str4));
                playDrawerMiniAccountRow.setOnClickListener(new m(this, str4));
                return playDrawerMiniAccountRow;
            default:
                throw new UnsupportedOperationException("View type " + itemViewType + " not supported");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.h = !this.h;
        notifyDataSetChanged();
    }

    private View a(View view, ViewGroup viewGroup, w wVar, boolean z, boolean z2) {
        int i;
        Drawable drawable;
        Drawable drawable2 = null;
        Resources resources = viewGroup.getResources();
        if (z) {
            i = com.google.android.play.l.play_drawer_primary_action_active;
        } else if (z2) {
            i = com.google.android.play.l.play_drawer_primary_action_disabled;
        } else {
            i = com.google.android.play.l.play_drawer_primary_action_regular;
        }
        TextView textView = (TextView) (view != null ? view : this.k.inflate(i, viewGroup, false));
        textView.setText(wVar.f6876a);
        if (wVar.l != null) {
            drawable = wVar.l.a(resources, z);
        } else if (z && wVar.k > 0) {
            drawable = resources.getDrawable(wVar.k);
        } else {
            drawable = resources.getDrawable(wVar.j);
        }
        if (drawable == null) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            if (z2) {
                drawable.setAlpha(66);
            } else {
                drawable.setAlpha(255);
            }
            Drawable drawable3 = wVar.i ? resources.getDrawable(com.google.android.play.j.play_dot_notification) : null;
            if (com.google.android.play.utils.j.b(this.t)) {
                textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, drawable3, (Drawable) null);
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(drawable3, (Drawable) null, drawable, (Drawable) null);
            }
            if (wVar.m != null) {
                drawable2 = wVar.m.a(resources, true);
            } else if (wVar.f6877b > 0) {
                drawable2 = resources.getDrawable(wVar.f6877b);
            }
            if (drawable2 != null) {
                if (z2) {
                    drawable2.setAlpha(66);
                } else {
                    drawable2.setAlpha(255);
                }
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                compoundDrawables[!(by.h(textView) == 0) ? (char) 0 : (char) 2] = drawable2;
                textView.setCompoundDrawablesWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
            }
        }
        if (z && wVar.c > 0) {
            textView.setTextColor(resources.getColor(wVar.c));
        } else if (z2) {
            textView.setTextColor(resources.getColor(com.google.android.play.h.play_disabled_grey));
        } else {
            textView.setTextColor(resources.getColor(com.google.android.play.h.play_fg_primary));
        }
        textView.setOnClickListener(new c(this, wVar));
        com.google.android.play.utils.j.b(this.t);
        textView.setGravity(8388627);
        if (wVar.h) {
            a(textView, resources.getDimensionPixelSize(com.google.android.play.i.play_drawer_child_item_left_padding));
        } else {
            a(textView, resources.getDimensionPixelSize(com.google.android.play.i.play_drawer_item_left_padding));
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    private static void a(TextView textView, int i) {
        by.a(textView, i, textView.getPaddingTop(), by.o(textView), textView.getPaddingBottom());
    }

    static /* synthetic */ boolean g(a aVar) {
        int firstVisiblePosition = aVar.o.getFirstVisiblePosition();
        return aVar.p >= firstVisiblePosition && aVar.p <= (aVar.o.getChildCount() + firstVisiblePosition) + (-1);
    }
}
