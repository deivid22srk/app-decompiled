package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.DetailsTextIconContainer;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.ik;
import com.google.android.play.image.FifeImageView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class TextModule extends bd<ek> implements View.OnClickListener, com.google.android.play.utils.k {
    protected abstract ek a(Document document, boolean z);

    public class DetailsExtraCredits implements Parcelable {
        public static final Parcelable.Creator<DetailsExtraCredits> CREATOR = new el();

        /* renamed from: a, reason: collision with root package name */
        public String f2516a;

        /* renamed from: b, reason: collision with root package name */
        public String f2517b;

        public DetailsExtraCredits(String str, String str2) {
            this.f2516a = str;
            this.f2517b = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f2516a);
            parcel.writeString(this.f2517b);
        }
    }

    public class DetailsExtraPrimary implements Parcelable {
        public static final Parcelable.Creator<DetailsExtraPrimary> CREATOR = new em();

        /* renamed from: a, reason: collision with root package name */
        public String f2518a;

        /* renamed from: b, reason: collision with root package name */
        public String f2519b;
        public String c;
        public com.google.android.finsky.protos.ds d;
        public boolean e;

        public DetailsExtraPrimary(String str, String str2, String str3, com.google.android.finsky.protos.ds dsVar, boolean z) {
            this.f2518a = str;
            this.f2519b = str2;
            this.c = str3;
            this.d = dsVar;
            this.e = z;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f2518a);
            parcel.writeString(this.f2519b);
            parcel.writeString(this.c);
            parcel.writeParcelable(ParcelableProto.a(this.d), 0);
            parcel.writeInt(this.e ? 1 : 0);
        }
    }

    public class DetailsExtraSecondary implements Parcelable {
        public static final Parcelable.Creator<DetailsExtraSecondary> CREATOR = new en();

        /* renamed from: a, reason: collision with root package name */
        public String f2520a;

        /* renamed from: b, reason: collision with root package name */
        public String f2521b;

        public DetailsExtraSecondary(String str, String str2) {
            this.f2520a = str;
            this.f2521b = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f2520a);
            parcel.writeString(this.f2521b);
        }
    }

    public class ExpandedData implements Parcelable {
        public static final Parcelable.Creator<ExpandedData> CREATOR = new eo();

        /* renamed from: a, reason: collision with root package name */
        public int f2522a;

        /* renamed from: b, reason: collision with root package name */
        public String f2523b;
        public CharSequence c;
        public int d;
        public String e;
        public CharSequence f;
        public CharSequence g;
        public CharSequence h;
        public CharSequence i;
        public boolean j;
        public String k;
        public List<DetailsExtraCredits> l = new ArrayList();
        public List<DetailsExtraPrimary> m = new ArrayList();
        public List<DetailsExtraSecondary> n = new ArrayList();
        public String o;

        public final boolean a() {
            return ((TextUtils.isEmpty(this.c) || this.c.length() < 140) && TextUtils.isEmpty(this.f) && TextUtils.isEmpty(this.g) && TextUtils.isEmpty(this.i) && TextUtils.isEmpty(this.k) && (this.l == null || this.l.isEmpty()) && ((this.m == null || this.m.isEmpty()) && ((this.n == null || this.n.isEmpty()) && TextUtils.isEmpty(this.o)))) ? false : true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ExpandedData expandedData = (ExpandedData) obj;
            if (this.f2522a == expandedData.f2522a && this.d == expandedData.d && this.j == expandedData.j) {
                if (this.f2523b == null ? expandedData.f2523b != null : !this.f2523b.equals(expandedData.f2523b)) {
                    return false;
                }
                if (this.c == null ? expandedData.c != null : !this.c.equals(expandedData.c)) {
                    return false;
                }
                if (this.e == null ? expandedData.e != null : !this.e.equals(expandedData.e)) {
                    return false;
                }
                if (this.f == null ? expandedData.f != null : !this.f.equals(expandedData.f)) {
                    return false;
                }
                if (this.g == null ? expandedData.g != null : !this.g.equals(expandedData.g)) {
                    return false;
                }
                if (this.h == null ? expandedData.h != null : !this.h.equals(expandedData.h)) {
                    return false;
                }
                if (this.i == null ? expandedData.i != null : !this.i.equals(expandedData.i)) {
                    return false;
                }
                if (this.k == null ? expandedData.k != null : !this.k.equals(expandedData.k)) {
                    return false;
                }
                if (this.l == null ? expandedData.l != null : !this.l.equals(expandedData.l)) {
                    return false;
                }
                if (this.m == null ? expandedData.m != null : !this.m.equals(expandedData.m)) {
                    return false;
                }
                if (this.n == null ? expandedData.n != null : !this.n.equals(expandedData.n)) {
                    return false;
                }
                if (this.o != null) {
                    if (this.o.equals(expandedData.o)) {
                        return true;
                    }
                } else if (expandedData.o == null) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((this.n != null ? this.n.hashCode() : 0) + (((this.m != null ? this.m.hashCode() : 0) + (((this.l != null ? this.l.hashCode() : 0) + (((this.k != null ? this.k.hashCode() : 0) + (((this.j ? 1 : 0) + (((this.i != null ? this.i.hashCode() : 0) + (((this.h != null ? this.h.hashCode() : 0) + (((this.g != null ? this.g.hashCode() : 0) + (((this.f != null ? this.f.hashCode() : 0) + (((this.e != null ? this.e.hashCode() : 0) + (((((this.c != null ? this.c.hashCode() : 0) + (((this.f2523b != null ? this.f2523b.hashCode() : 0) + (this.f2522a * 31)) * 31)) * 31) + this.d) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.o != null ? this.o.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2522a);
            parcel.writeString(this.f2523b);
            TextUtils.writeToParcel(this.c, parcel, 0);
            parcel.writeInt(this.d);
            parcel.writeString(this.e);
            TextUtils.writeToParcel(this.f, parcel, 0);
            TextUtils.writeToParcel(this.g, parcel, 0);
            TextUtils.writeToParcel(this.h, parcel, 0);
            TextUtils.writeToParcel(this.i, parcel, 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeString(this.k);
            parcel.writeTypedList(this.l);
            parcel.writeTypedList(this.m);
            parcel.writeTypedList(this.n);
            parcel.writeString(this.o);
        }
    }

    protected ExpandedData a(Document document, boolean z, ek ekVar) {
        if (!z) {
            return null;
        }
        ExpandedData expandedData = new ExpandedData();
        expandedData.f2522a = document.f1963a.g;
        expandedData.f2523b = document.f1963a.i;
        expandedData.c = ekVar.c;
        expandedData.d = ekVar.d;
        expandedData.e = ekVar.f;
        expandedData.f = ekVar.g;
        expandedData.g = ekVar.h;
        expandedData.h = this.c.getResources().getString(R.string.details_whats_new).toUpperCase();
        expandedData.i = ekVar.i;
        expandedData.j = (ekVar.j || TextUtils.isEmpty(ekVar.i)) ? false : true;
        return expandedData;
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.text_module;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        if (this.f2559b == 0) {
            return false;
        }
        ek ekVar = (ek) this.f2559b;
        return (!TextUtils.isEmpty(ekVar.c) || !TextUtils.isEmpty(ekVar.f) || !TextUtils.isEmpty(ekVar.g) || !TextUtils.isEmpty(ekVar.h) || ((!TextUtils.isEmpty(ekVar.i) && !ekVar.j) || ekVar.k != null || (ekVar.l != null && !ekVar.l.isEmpty()))) || (((ek) this.f2559b).n != null && ((ek) this.f2559b).n.a());
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        if (this.f2559b == 0) {
            this.f2559b = a(document, z);
        }
        if (this.f2559b != 0) {
            if (((ek) this.f2559b).n == null || z) {
                ek ekVar = (ek) this.f2559b;
                this.f2559b = a(document, z);
                ((ek) this.f2559b).n = a(document, z, (ek) this.f2559b);
                if (W_() && !ekVar.equals(this.f2559b)) {
                    this.d.a((bd) this, true);
                }
            }
        }
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        TextModuleLayout textModuleLayout = (TextModuleLayout) view;
        boolean a2 = ((ek) this.f2559b).n != null ? ((ek) this.f2559b).n.a() : false;
        int i = ((ek) this.f2559b).f2646a;
        int i2 = ((ek) this.f2559b).f2647b;
        CharSequence charSequence = ((ek) this.f2559b).c;
        int i3 = ((ek) this.f2559b).d;
        boolean z = ((ek) this.f2559b).e;
        String str = ((ek) this.f2559b).f;
        CharSequence charSequence2 = ((ek) this.f2559b).g;
        CharSequence charSequence3 = ((ek) this.f2559b).h;
        CharSequence charSequence4 = ((ek) this.f2559b).i;
        boolean z2 = ((ek) this.f2559b).j;
        com.google.android.finsky.protos.an anVar = ((ek) this.f2559b).k;
        List<Pair<com.google.android.finsky.protos.ds, String>> list = ((ek) this.f2559b).l;
        Integer num = ((ek) this.f2559b).m;
        TextModule textModule = a2 ? this : null;
        com.google.android.play.image.e eVar = this.h;
        textModuleLayout.k = textModule;
        if (textModuleLayout.k == null) {
            textModuleLayout.f.setVisibility(8);
        } else {
            textModuleLayout.f.setVisibility(0);
        }
        textModuleLayout.l = this;
        textModuleLayout.a(charSequence);
        textModuleLayout.a(charSequence2);
        textModuleLayout.a(charSequence3);
        textModuleLayout.a(charSequence4);
        Context context = textModuleLayout.getContext();
        Resources resources = context.getResources();
        DetailsTextIconContainer detailsTextIconContainer = textModuleLayout.d;
        if (list == null || list.isEmpty()) {
            detailsTextIconContainer.setVisibility(8);
        } else {
            detailsTextIconContainer.setVisibility(0);
            LayoutInflater from = LayoutInflater.from(detailsTextIconContainer.getContext());
            for (int max = Math.max(0, list.size() - detailsTextIconContainer.getChildCount()); max > 0; max--) {
                detailsTextIconContainer.addView((FifeImageView) from.inflate(R.layout.details_text_icon_single, (ViewGroup) detailsTextIconContainer, false));
            }
            int childCount = detailsTextIconContainer.getChildCount();
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 >= childCount) {
                    break;
                }
                FifeImageView fifeImageView = (FifeImageView) detailsTextIconContainer.getChildAt(i5);
                if (i5 < list.size()) {
                    fifeImageView.setVisibility(0);
                    Pair<com.google.android.finsky.protos.ds, String> pair = list.get(i5);
                    com.google.android.finsky.protos.ds dsVar = (com.google.android.finsky.protos.ds) pair.first;
                    fifeImageView.a(dsVar.f, dsVar.l, eVar);
                    fifeImageView.setContentDescription((CharSequence) pair.second);
                } else {
                    fifeImageView.setVisibility(8);
                }
                i4 = i5 + 1;
            }
        }
        ColorStateList a3 = com.google.android.play.utils.h.a(context, i);
        textModuleLayout.f.setTextColor(a3);
        boolean z3 = i2 == 1;
        boolean z4 = !TextUtils.isEmpty(charSequence);
        if (z4) {
            textModuleLayout.f2524a.setVisibility(0);
            textModuleLayout.f2524a.setText(charSequence);
            textModuleLayout.f2524a.setMaxLines(z ? textModuleLayout.g : Integer.MAX_VALUE);
            textModuleLayout.f2524a.setGravity(i3);
        } else {
            textModuleLayout.f2524a.setVisibility(8);
        }
        textModuleLayout.f2525b.setVisibility(8);
        if (num != null) {
            textModuleLayout.setBackgroundColor(num.intValue());
        }
        if (!z2 && !TextUtils.isEmpty(charSequence4)) {
            textModuleLayout.c.a(textModuleLayout.j, charSequence4, textModuleLayout.g);
            textModuleLayout.c.a(i, textModuleLayout.i, textModuleLayout.i);
        } else if (z3 && z4) {
            textModuleLayout.c.setVisibility(8);
        } else {
            textModuleLayout.c.a(str, charSequence2, textModuleLayout.g);
            textModuleLayout.c.a();
            if (!z4 && TextUtils.isEmpty(str)) {
                textModuleLayout.f2525b.setVisibility(0);
            }
            if (num != null) {
                int color = resources.getColor(ik.a(num.intValue()) ? R.color.play_fg_primary : R.color.play_white);
                textModuleLayout.c.a(num.intValue(), color);
                if (num.intValue() == resources.getColor(R.color.play_white)) {
                    textModuleLayout.f.setTextColor(a3);
                } else {
                    textModuleLayout.f.setTextColor(color);
                }
            }
        }
        if (anVar != null) {
            textModuleLayout.e.setText(anVar.f3598a);
            textModuleLayout.e.setTextColor(textModuleLayout.h);
            com.google.android.finsky.utils.v.a(anVar, eVar, textModuleLayout.e);
            textModuleLayout.e.setVisibility(0);
        } else {
            textModuleLayout.e.setVisibility(8);
        }
        ep epVar = new ep(textModuleLayout);
        textModuleLayout.setOnClickListener(epVar);
        textModuleLayout.c.setBodyClickListener(epVar);
        textModuleLayout.f2524a.setOnClickListener(epVar);
        textModuleLayout.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (((ek) this.f2559b).n != null) {
            com.google.android.finsky.navigationmanager.b bVar = this.i;
            ExpandedData expandedData = ((ek) this.f2559b).n;
            DfeToc dfeToc = this.e;
            if (!bVar.k()) {
                return;
            }
            bVar.a(14, (String) null, (Fragment) av.a(expandedData, dfeToc), false, new View[0]);
        }
    }

    @Override // com.google.android.play.utils.k
    public final void a(View view, String str) {
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri parse = Uri.parse(str);
        intent.setData(parse);
        intent.setPackage(context.getPackageName());
        if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
            this.i.a(parse, (String) null);
        } else {
            intent.setPackage(null);
            context.startActivity(intent);
        }
    }
}
