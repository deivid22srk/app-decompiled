package com.google.android.finsky.utils;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.DecoratedTextView;
import com.google.android.finsky.layout.DocImageView;
import com.google.android.finsky.protos.nd;
import com.google.android.finsky.protos.ne;
import com.google.android.finsky.protos.nf;
import com.google.android.finsky.protos.ng;
import com.google.android.finsky.protos.ny;
import com.google.android.finsky.protos.pi;
import com.google.android.finsky.protos.po;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.PlayCardLabelView;
import com.google.android.play.layout.PlayCardSnippet;
import com.google.android.play.layout.PlayCardThumbnail;
import com.google.android.play.layout.PlayTextView;
import com.google.android.play.layout.StarRatingBar;

/* loaded from: classes.dex */
public final class fe {

    /* renamed from: a, reason: collision with root package name */
    private static final gq f4868a = new gq();

    /* renamed from: b, reason: collision with root package name */
    private static final gr f4869b = new gr();
    private static final gr c = new gr();
    private static String d;
    private static boolean e;
    private static boolean f;
    private static boolean g;
    private static StringBuilder h;
    private static StringBuilder i;

    static {
        if (com.google.android.finsky.navigationmanager.b.h()) {
            StringBuilder sb = new StringBuilder();
            h = sb;
            sb.append("transition_card_details:cover:");
            StringBuilder sb2 = new StringBuilder();
            i = sb2;
            sb2.append("transition_generic_circle:");
        }
    }

    public static void a() {
        ey.a();
        ew<com.google.android.play.layout.a> a2 = ew.a();
        a2.f4860a[0] = new ff();
        a2.f4860a[1] = new fs();
        a2.f4860a[10] = new ft();
        a2.f4860a[15] = new fu();
        a2.f4860a[20] = new fv();
        a2.f4860a[19] = new fw();
        a2.f4860a[9] = new fx();
        a2.f4860a[4] = new fy();
    }

    private static void a(PlayCardSnippet playCardSnippet, nd ndVar, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar, int i2, int i3, com.google.android.finsky.layout.play.cy cyVar) {
        String quantityString;
        if (ndVar != null) {
            playCardSnippet.setVisibility(0);
            FifeImageView fifeImageView = (FifeImageView) playCardSnippet.getImageView();
            Resources resources = playCardSnippet.getResources();
            nf nfVar = ndVar.e;
            if (nfVar != null) {
                ny nyVar = nfVar.f4164a;
                String str = nyVar.c != null ? nyVar.c.i : null;
                boolean z = !TextUtils.isEmpty(str);
                int i4 = nyVar.d;
                boolean z2 = !TextUtils.isEmpty(nyVar.g);
                boolean z3 = !TextUtils.isEmpty(nyVar.i);
                if (z) {
                    if (z3 && z2 && nyVar.i.indexOf(nyVar.g) != 0) {
                        quantityString = resources.getQuantityString(R.plurals.review_author_stars_title_comment, i4, str, Integer.valueOf(i4), nyVar.g, nyVar.i);
                    } else if (z3 || z2) {
                        Object[] objArr = new Object[3];
                        objArr[0] = str;
                        objArr[1] = Integer.valueOf(i4);
                        objArr[2] = z3 ? nyVar.i : nyVar.g;
                        quantityString = resources.getQuantityString(R.plurals.review_author_stars_title, i4, objArr);
                    } else {
                        quantityString = resources.getQuantityString(R.plurals.review_author_stars, i4, str, Integer.valueOf(i4));
                    }
                } else if (z3 || z2) {
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = Integer.valueOf(i4);
                    objArr2[1] = z3 ? nyVar.i : nyVar.g;
                    quantityString = resources.getQuantityString(R.plurals.review_stars_title, i4, objArr2);
                } else {
                    quantityString = resources.getQuantityString(R.plurals.review_just_stars, i4, Integer.valueOf(i4));
                }
                playCardSnippet.a(Html.fromHtml(quantityString), i2, i3);
                com.google.android.finsky.protos.gx gxVar = nyVar.c;
                com.google.android.finsky.protos.ds a2 = gxVar != null ? com.google.android.play.utils.c.a(gxVar, 4) : null;
                if (a2 != null) {
                    fifeImageView.a(a2.f, a2.l, eVar);
                    a(fifeImageView, gxVar, bVar, cyVar);
                    fifeImageView.setVisibility(0);
                    return;
                }
                fifeImageView.setVisibility(8);
                return;
            }
            if (ndVar.d != null) {
                ne neVar = ndVar.d;
                int length = neVar.c.length;
                if (length > 1) {
                    com.google.android.finsky.protos.gx gxVar2 = neVar.c[0];
                    playCardSnippet.a(Html.fromHtml(resources.getString(R.string.plus_one_multiple_friends_bold, gxVar2.i, neVar.c[1].i)), i2, i3);
                    com.google.android.finsky.protos.ds a3 = com.google.android.play.utils.c.a(gxVar2, 4);
                    fifeImageView.a(a3.f, a3.l, eVar);
                    a(fifeImageView, gxVar2, bVar, cyVar);
                    fifeImageView.setVisibility(0);
                    return;
                }
                if (length == 1) {
                    com.google.android.finsky.protos.gx gxVar3 = neVar.c[0];
                    playCardSnippet.a(Html.fromHtml(resources.getString(R.string.plus_one_single_friend_bold, gxVar3.i)), i2, i3);
                    com.google.android.finsky.protos.ds a4 = com.google.android.play.utils.c.a(gxVar3, 4);
                    fifeImageView.a(a4.f, a4.l, eVar);
                    a(fifeImageView, gxVar3, bVar, cyVar);
                    fifeImageView.setVisibility(0);
                    return;
                }
                FinskyLog.d("Server returned plus profile reason with no profiles", new Object[0]);
                return;
            }
            if (ndVar.f != null) {
                ng ngVar = ndVar.f;
                playCardSnippet.a(bc.a(ngVar.f4166b), i2, i3);
                com.google.android.finsky.protos.gx gxVar4 = ngVar.f4165a;
                com.google.android.finsky.protos.ds a5 = com.google.android.play.utils.c.a(gxVar4, 4);
                fifeImageView.a(a5.f, a5.l, eVar);
                fifeImageView.setVisibility(0);
                a(fifeImageView, gxVar4, bVar, cyVar);
                return;
            }
            playCardSnippet.a(bc.a(ndVar.f4161b), i2, i3);
            fifeImageView.setVisibility(8);
        }
    }

    private static void a(FifeImageView fifeImageView, com.google.android.finsky.protos.gx gxVar, com.google.android.finsky.navigationmanager.b bVar, com.google.android.finsky.layout.play.cy cyVar) {
        fifeImageView.setOnClickListener(new fz(bVar, gxVar, cyVar));
        fifeImageView.setContentDescription(fifeImageView.getResources().getString(R.string.content_description_view_gplus_profile, gxVar.i));
    }

    public static nd a(pi piVar) {
        return a(piVar, (nd) null);
    }

    private static nd a(pi piVar, nd ndVar) {
        if (piVar == null) {
            return null;
        }
        nd ndVar2 = null;
        for (int i2 = 0; i2 < piVar.c.length; i2++) {
            nd ndVar3 = piVar.c[i2];
            if (ndVar3 != ndVar) {
                if (ndVar3.e == null) {
                    if (ndVar3.d != null || (ndVar3.f4161b.length() > 0 && (ndVar2 == null || ndVar2.d == null))) {
                        ndVar2 = ndVar3;
                    }
                } else {
                    return ndVar3;
                }
            }
        }
        return ndVar2;
    }

    public static String a(Document document) {
        switch (document.f1963a.e) {
            case 1:
            case 2:
            case 4:
            case 6:
            case 18:
            case 19:
            case 20:
                return document.f1963a.m;
            case 5:
                String str = document.f1963a.k;
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
                return document.f1963a.m;
            case 16:
            case 17:
            case 24:
            case 25:
            case 28:
                return document.f1963a.k;
            case 44:
                return document.bd();
            default:
                return null;
        }
    }

    static synchronized void a(Document document, com.google.android.play.layout.a aVar) {
        gr grVar;
        boolean z;
        synchronized (fe.class) {
            PlayCardLabelView label = aVar.getLabel();
            if (document != null && label != null) {
                int ownershipRenderingType = aVar.getOwnershipRenderingType();
                String str = document.f1963a.f3890a;
                fd a2 = ey.a(str);
                if (a2 == null) {
                    FinskyApp a3 = FinskyApp.a();
                    gl.a(a3.i(), a3.k, a3.p, a3.s, a3.g, 1, document, f4868a);
                    gq gqVar = f4868a;
                    gr grVar2 = f4869b;
                    grVar2.a();
                    if (gqVar.c()) {
                        switch (gqVar.c) {
                            case 1:
                                grVar2.f4917a = R.string.installing;
                                break;
                            case 2:
                                grVar2.f4917a = R.string.disabled_list_state;
                                break;
                            case 3:
                                grVar2.f4917a = R.string.preordered_list_state;
                                break;
                            case 4:
                                grVar2.c = gqVar.f;
                                grVar2.f4918b = gqVar.e;
                                grVar2.d = gqVar.b() ? gqVar.a(0).g : 0L;
                                break;
                            case 5:
                                grVar2.f4917a = R.string.updates_list_state;
                                break;
                            case 6:
                                grVar2.f4917a = R.string.purchased_list_state;
                                break;
                            case 7:
                                grVar2.f4917a = R.string.rented_list_state;
                                break;
                            case 8:
                                grVar2.f4917a = R.string.subscribed_list_state;
                                break;
                            case 9:
                                grVar2.f4917a = R.string.updating;
                                break;
                            case 10:
                                grVar2.f4917a = R.string.preregistration_coming_soon;
                                break;
                            case 11:
                                grVar2.f4917a = R.string.preregistration_registered;
                                break;
                            default:
                                FinskyLog.e("Unrecognized status %d", Integer.valueOf(gqVar.c));
                                break;
                        }
                    } else if (gqVar.f4915a && gqVar.f4916b == 3) {
                        grVar2.f4917a = R.string.installed_list_state;
                    }
                    gr grVar3 = f4869b;
                    boolean booleanValue = Boolean.valueOf(f4868a.f4915a).booleanValue();
                    ey.a(str, f4869b, booleanValue);
                    grVar = grVar3;
                    z = booleanValue;
                } else {
                    grVar = a2.f4866a;
                    z = a2.f4867b;
                }
                boolean z2 = (ownershipRenderingType & 1) != 0;
                boolean z3 = (ownershipRenderingType & 2) != 0;
                aVar.setItemOwned(z);
                label.setVisibility(8);
                if (z && z2) {
                    label.setVisibility(0);
                    label.setIcon(ai.f(document.f1963a.g));
                } else {
                    label.f6964a = null;
                    label.invalidate();
                    label.requestLayout();
                }
                if (!z || z3) {
                    label.setVisibility(0);
                    c();
                    if (!TextUtils.isEmpty(grVar.c) && !e) {
                        label.a(grVar.f4918b, grVar.c, document.f1963a.g, label.getResources().getString(R.string.content_description_on_sale_price, grVar.c, grVar.f4918b));
                    } else {
                        String a4 = grVar.a(label.getContext());
                        label.a(a4, document.f1963a.g);
                        if (TextUtils.isEmpty(a4)) {
                            label.setContentDescription(label.getResources().getString(R.string.purchased_list_state));
                        }
                    }
                    TextView appSize = aVar.getAppSize();
                    if (appSize == null) {
                        grVar.d = 0L;
                    } else if (f && grVar.d > 0) {
                        appSize.setText(as.a(grVar.d, appSize.getResources()));
                        appSize.setVisibility(0);
                    } else {
                        appSize.setVisibility(8);
                    }
                } else {
                    label.a((String) null, document.f1963a.g);
                }
                if (label.getVisibility() == 0 && z && z2 && !z3) {
                    String a5 = grVar.a(label.getContext());
                    if (TextUtils.isEmpty(a5)) {
                        a5 = label.getResources().getString(R.string.purchased_list_state);
                    }
                    label.setContentDescription(a5);
                }
            }
        }
    }

    private static synchronized void c() {
        synchronized (fe.class) {
            FinskyApp a2 = FinskyApp.a();
            String j = a2.j();
            if (d == null || !d.equals(j)) {
                e = a2.e().a(12603136L);
                f = a2.e().a(12603329L);
                g = a2.e().a(12603517L);
                d = j;
                ey.b();
            }
        }
    }

    public static void a(com.google.android.play.layout.a aVar, Document document, String str, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar, com.google.android.finsky.layout.play.cy cyVar) {
        a(aVar, document, str, eVar, bVar, false, null, cyVar, true, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(com.google.android.play.layout.a aVar, Document document, String str, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar, boolean z, com.google.android.finsky.layout.play.az azVar, com.google.android.finsky.layout.play.cy cyVar, boolean z2, int i2, boolean z3) {
        String str2;
        String str3;
        DocImageView docImageView;
        boolean z4;
        String str4;
        String str5;
        TextView title;
        jm.a();
        gb gbVar = (gb) aVar.getLoggingData();
        if (gbVar != null) {
            gbVar.a(aVar.getCardType(), cyVar);
        } else {
            aVar.setLoggingData(new gb(aVar.getCardType(), cyVar));
        }
        gb gbVar2 = (gb) aVar.getLoggingData();
        Resources resources = aVar.getResources();
        boolean aF = document.aF();
        ew<com.google.android.play.layout.a> a2 = ew.a();
        ev<? extends com.google.android.play.layout.a> evVar = a2.f4860a[aVar.getCardType()];
        if (evVar == null) {
            evVar = a2.f4861b;
        }
        evVar.a(aVar, document);
        TextView title2 = aVar.getTitle();
        if (document.f1963a.e != 5) {
            str2 = document.f1963a.i;
        } else {
            str2 = (!document.D() || document.f1963a.z.e == null) ? null : document.f1963a.z.e.o;
            if (TextUtils.isEmpty(str2)) {
                str2 = document.f1963a.i;
            }
        }
        if (i2 >= 0 && !aF) {
            str2 = aVar.getResources().getString(R.string.numbered_title, Integer.valueOf(i2 + 1), str2);
        }
        title2.setVisibility(0);
        title2.setText(str2);
        if (document == null) {
            str3 = null;
        } else {
            str3 = document.f1963a.i;
        }
        if (document != null && !TextUtils.isEmpty(str3)) {
            Resources resources2 = aVar.getResources();
            int c2 = ai.c(document.f1963a.e);
            if (c2 >= 0 && (title = aVar.getTitle()) != null) {
                title.setContentDescription(resources2.getString(c2, str3));
            }
        }
        PlayCardThumbnail thumbnail = aVar.getThumbnail();
        if (thumbnail == null) {
            docImageView = null;
        } else {
            thumbnail.setVisibility(0);
            thumbnail.a(document.f1963a.g);
            int[] imageTypePreference = aVar instanceof ex ? ((ex) aVar).getImageTypePreference() : ex.f;
            DocImageView docImageView2 = (DocImageView) thumbnail.getImageView();
            docImageView2.a(document, eVar, imageTypePreference);
            docImageView = docImageView2;
        }
        if (com.google.android.finsky.navigationmanager.b.h()) {
            int i3 = document.f1963a.e;
            if (!(i3 == 2 || i3 == 4 || i3 == 24 || i3 == 25) && docImageView != null) {
                boolean z5 = (aVar instanceof com.google.android.finsky.navigationmanager.j) || i3 == 18 || i3 == 19 || i3 == 3;
                if ((i3 == 30 || i3 == 34 || i3 == 8) && !document.c(4)) {
                    z5 = true;
                }
                if (z5) {
                    i.setLength(26);
                    i.append(document.f1963a.f3890a);
                    i.append(':');
                    i.append(str);
                    docImageView.setTransitionName(i.toString());
                } else {
                    h.setLength(30);
                    h.append(document.f1963a.f3890a);
                    h.append(':');
                    h.append(str);
                    docImageView.setTransitionName(h.toString());
                }
                aVar.setTransitionGroup(true);
            } else {
                docImageView.setTransitionName(null);
                aVar.setTransitionGroup(false);
            }
        }
        if (z2) {
            aVar.setThumbnailAspectRatio(com.google.android.finsky.layout.play.as.b(document.f1963a.e));
        }
        DecoratedTextView decoratedTextView = (DecoratedTextView) aVar.getSubtitle();
        StarRatingBar ratingBar = aVar.getRatingBar();
        DecoratedTextView decoratedTextView2 = (DecoratedTextView) aVar.getItemBadge();
        if (decoratedTextView != null) {
            decoratedTextView.setVisibility(4);
        }
        if (ratingBar != null) {
            ratingBar.setVisibility(4);
        }
        if (decoratedTextView2 != null) {
            decoratedTextView2.setVisibility(4);
        }
        boolean c3 = aVar.c();
        boolean z6 = ratingBar != null && document.f1963a.e == 1;
        boolean z7 = c3 || z6;
        PlayTextView description = aVar.getDescription();
        boolean z8 = c3 || !z6;
        String str6 = null;
        PlayTextView subtitle2 = aVar.getSubtitle2();
        if (subtitle2 != null) {
            subtitle2.setVisibility(8);
        }
        if ((document.bb() && document.aO()) && z8 && decoratedTextView != null) {
            String bc = document.bc();
            String a3 = a(document);
            if (subtitle2 != null) {
                subtitle2.setVisibility(0);
                subtitle2.setText(a3);
                z4 = z8;
                str4 = bc;
            } else {
                str6 = a3;
                z4 = z8;
                str4 = bc;
            }
        } else if (document.f1963a.e != 44 || description == null) {
            z4 = z8;
            str4 = null;
        } else {
            String be = document.be();
            if (TextUtils.isEmpty(be)) {
                z8 = false;
            }
            str6 = document.bd();
            z4 = z8;
            str4 = be;
        }
        if (z7) {
            v.a(document, ratingBar, decoratedTextView2);
        }
        if (decoratedTextView != null) {
            if (z4) {
                decoratedTextView.setVisibility(0);
                decoratedTextView.setText(str4 != null ? str4 : a(document));
                if (aVar.A) {
                    v.a(document, eVar, decoratedTextView);
                }
            } else {
                decoratedTextView.setVisibility(8);
            }
        }
        a(document, aVar);
        if (description != null) {
            if (TextUtils.isEmpty(str6)) {
                str5 = document.f1963a.s;
                CharSequence u = document.u();
                if (TextUtils.isEmpty(str5) || (!z3 && !TextUtils.isEmpty(u))) {
                    str5 = u;
                }
            } else {
                str5 = str6;
            }
            description.setText(str5);
            description.setVisibility(TextUtils.isEmpty(str5) ? 8 : 0);
        }
        PlayCardSnippet snippet1 = aVar.getSnippet1();
        PlayCardSnippet snippet2 = aVar.getSnippet2();
        if (snippet1 != null || snippet2 != null) {
            if (snippet1 != null) {
                snippet1.setVisibility(8);
                snippet1.setSeparatorVisible(false);
            }
            if (snippet2 != null) {
                snippet2.setVisibility(8);
                snippet2.setSeparatorVisible(false);
            }
            int textOnlySnippetMarginLeft = aVar.getTextOnlySnippetMarginLeft();
            int avatarSnippetMarginLeft = aVar.getAvatarSnippetMarginLeft();
            String as = document.as();
            if (!TextUtils.isEmpty(as)) {
                PlayCardSnippet playCardSnippet = snippet2 != null ? snippet2 : snippet1;
                playCardSnippet.a(bc.a(as), textOnlySnippetMarginLeft, avatarSnippetMarginLeft);
                ((FifeImageView) playCardSnippet.getImageView()).setVisibility(8);
                playCardSnippet.setVisibility(0);
            } else {
                pi ar = document.ar();
                if (ar == null || ar.c.length == 0) {
                    if (snippet2 != null && document.k()) {
                        snippet2.a(document.l().f4409a, textOnlySnippetMarginLeft, avatarSnippetMarginLeft);
                        ((FifeImageView) snippet2.getImageView()).setVisibility(8);
                        snippet2.setVisibility(0);
                    }
                } else {
                    com.google.android.finsky.layout.play.cy cyVar2 = (com.google.android.finsky.layout.play.cy) aVar.getLoggingData();
                    if (ar.c.length != 1 && snippet1 != null && snippet2 != null) {
                        snippet2.setSeparatorVisible(true);
                        nd a4 = a(ar, (nd) null);
                        nd a5 = a(ar, a4);
                        a(snippet1, a4, eVar, bVar, textOnlySnippetMarginLeft, avatarSnippetMarginLeft, cyVar2);
                        a(snippet2, a5, eVar, bVar, textOnlySnippetMarginLeft, avatarSnippetMarginLeft, cyVar2);
                    } else {
                        nd a6 = a(ar, (nd) null);
                        if (snippet2 != null) {
                            snippet1 = snippet2;
                        }
                        a(snippet1, a6, eVar, bVar, textOnlySnippetMarginLeft, avatarSnippetMarginLeft, cyVar2);
                    }
                }
            }
        }
        ImageView overflow = aVar.getOverflow();
        if (overflow != null && document != null) {
            if (z || document.f1963a.e == 3 || document.f1963a.e == 44) {
                overflow.setVisibility(4);
                overflow.setOnClickListener(null);
            } else {
                overflow.setVisibility(0);
                Context context = overflow.getContext();
                if (document.aF()) {
                    overflow.setOnTouchListener(new fj());
                } else {
                    overflow.setOnTouchListener(null);
                }
                overflow.setOnClickListener(new fk(context, overflow, gbVar2, document, bVar, aVar, azVar));
                if (overflow.isFocusable()) {
                    PlayCardSnippet snippet12 = aVar.getSnippet1();
                    PlayCardSnippet snippet22 = aVar.getSnippet2();
                    if (snippet12 != null && snippet12.getVisibility() == 0) {
                        snippet22 = snippet12;
                    } else if (snippet22 == null || snippet22.getVisibility() != 0) {
                        snippet22 = null;
                    }
                    ImageView imageView = snippet22 == null ? null : snippet22.getImageView();
                    if (snippet22 != null && imageView.getVisibility() == 0) {
                        overflow.setNextFocusDownId(imageView.getId());
                        imageView.setNextFocusUpId(overflow.getId());
                        imageView.setFocusable(true);
                    } else {
                        overflow.setNextFocusDownId(-1);
                    }
                }
            }
        }
        TextView adLabel = aVar.getAdLabel();
        if (adLabel != null) {
            if (aF) {
                if (z) {
                    adLabel.setVisibility(4);
                } else {
                    adLabel.setVisibility(0);
                    po aJ = document.aJ();
                    adLabel.setText((aJ == null || aJ.B == null) ? null : aJ.B.e);
                }
            } else {
                adLabel.setVisibility(8);
            }
        }
        TextView adCreative = aVar.getAdCreative();
        if (adCreative != null && aF && !resources.getBoolean(R.bool.use_small_as_listing_card)) {
            po aJ2 = document.aJ();
            CharSequence a7 = (aJ2 == null || aJ2.B == null) ? null : bc.a(aJ2.B.c);
            adCreative.setText(a7);
            adCreative.setVisibility(TextUtils.isEmpty(a7) ? 8 : 0);
        }
        if (z) {
            aVar.setDisplayAsDisabled(true);
            aVar.setOnClickListener(null);
            aVar.setClickable(false);
        } else {
            aVar.setDisplayAsDisabled(false);
            if (bVar != null) {
                aVar.setOnClickListener(bVar.a(document, gbVar2, (String) null, -1, docImageView));
                if (aF) {
                    aVar.setOnTouchListener(new fg());
                } else {
                    aVar.setOnTouchListener(null);
                }
            }
        }
        View loadingIndicator = aVar.getLoadingIndicator();
        if (loadingIndicator != null) {
            loadingIndicator.setVisibility(8);
        }
        com.google.android.finsky.apkg.i.a(gbVar2.getPlayStoreUiElement(), document.f1963a.R);
        gbVar2.getParentNode().a(gbVar2);
        if (document.aF() && FinskyApp.a().e().a(12605043L)) {
            FinskyApp.a().h().a((Runnable) null);
        }
        aVar.setVisibility(0);
    }

    public static void a(com.google.android.play.layout.a aVar, Document document, com.google.android.finsky.api.b bVar, com.google.android.finsky.layout.play.az azVar, com.google.android.finsky.layout.play.cy cyVar) {
        FinskyApp.a().h().a(212, (byte[]) null, cyVar);
        bVar.i(document.aI().f3872a, new fh(azVar, document, aVar), new fi(document));
    }

    public static void a(com.google.android.play.layout.a aVar) {
        gb gbVar = (gb) aVar.getLoggingData();
        if (gbVar == null) {
            return;
        }
        gbVar.f4891a = null;
        gbVar.f4892b = null;
    }

    public static com.google.android.finsky.layout.play.cy b(com.google.android.play.layout.a aVar) {
        gb gbVar = (gb) aVar.getLoggingData();
        if (gbVar == null) {
            return null;
        }
        return gbVar.getParentNode();
    }

    static /* synthetic */ void a(com.google.android.play.layout.d dVar, Context context, Document document, com.google.android.finsky.navigationmanager.b bVar, com.google.android.finsky.layout.play.cy cyVar, boolean z, View view) {
        int i2;
        FinskyApp a2 = FinskyApp.a();
        gl.a(a2.i(), a2.k, a2.p, a2.s, a2.g, 2, document, f4868a);
        context.getResources();
        int i3 = 0;
        if (!f4868a.b()) {
            i2 = 0;
        } else {
            int i4 = 0;
            while (true) {
                int i5 = i4;
                i2 = i3;
                if (i5 >= f4868a.d) {
                    break;
                }
                gp a3 = f4868a.a(i5);
                if (!gl.a(a3)) {
                    FinskyLog.c("Can't make click listener for action %d", Integer.valueOf(a3.f4913a));
                    i3 = i2;
                } else {
                    gl.a(a3, f4868a.f4916b, c);
                    dVar.a(0, c.a(context), true, new fr(context, document, view, gl.a(a3, f4868a.f4916b, bVar, (String) null, cyVar, context)));
                    i3 = i2 + 1;
                }
                i4 = i5 + 1;
            }
        }
        if (!z || i2 != 0 || !f4868a.c()) {
            return;
        }
        gq gqVar = f4868a;
        gr grVar = c;
        grVar.a();
        switch (gqVar.c) {
            case 1:
                grVar.f4917a = R.string.installing;
                break;
            case 2:
                grVar.f4917a = R.string.disabled_list_state;
                break;
            case 3:
                grVar.f4917a = R.string.preordered_list_state;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                FinskyLog.e("Expected to have an available action with status %d", Integer.valueOf(gqVar.c));
                break;
            case 9:
                grVar.f4917a = R.string.updating;
                break;
        }
        dVar.a(0, c.a(context), false, null);
    }

    static /* synthetic */ int a(int i2) {
        switch (i2) {
            case 0:
                return 509;
            case 1:
                return 511;
            case 2:
            case 3:
                return 507;
            case 4:
                return 506;
            case 5:
                return 512;
            case 6:
                return 513;
            case 7:
                return 504;
            case 8:
                return 510;
            case 9:
                return 501;
            case 10:
                return 508;
            case 11:
                return 505;
            case 12:
                return 515;
            case 13:
                return 514;
            case 14:
                return 518;
            case 15:
            case 20:
                return 521;
            case 16:
                return 519;
            case 17:
                return 2701;
            case 18:
                return 2700;
            case 19:
                return 520;
            case 21:
                return 522;
            default:
                throw new IllegalArgumentException("Unknown card type: " + i2);
        }
    }
}
