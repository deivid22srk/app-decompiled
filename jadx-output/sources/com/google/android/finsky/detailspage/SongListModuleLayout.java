package com.google.android.finsky.detailspage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.PlaylistControlButtons;
import java.util.List;

/* loaded from: classes.dex */
public class SongListModuleLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    boolean f2512a;

    /* renamed from: b, reason: collision with root package name */
    LinearLayout f2513b;
    TextView c;
    TextView d;
    PlaylistControlButtons e;

    public SongListModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (TextView) findViewById(R.id.header);
        this.d = (TextView) findViewById(R.id.subheader);
        this.f2513b = (LinearLayout) findViewById(R.id.songs);
        this.e = (PlaylistControlButtons) findViewById(R.id.song_list_control);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    static boolean a(List<Document> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).f1963a.T) {
                return true;
            }
        }
        return false;
    }

    static boolean a(Document document, List<Document> list) {
        String str;
        if (document.h() != null) {
            str = document.h().c;
        } else {
            str = list.get(0).f1963a.m;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(str, list.get(i).f1963a.m)) {
                return true;
            }
        }
        return false;
    }
}
