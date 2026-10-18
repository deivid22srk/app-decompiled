package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.Document;
import java.util.List;

/* loaded from: classes.dex */
public final class au extends ArrayAdapter<Document> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ EpisodeListModuleLayout f2549a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(EpisodeListModuleLayout episodeListModuleLayout, Context context, List<Document> list) {
        super(context, R.layout.tv_season_spinner_item, list.toArray(new Document[list.size()]));
        this.f2549a = episodeListModuleLayout;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = view == null ? LayoutInflater.from(getContext()).inflate(R.layout.tv_season_spinner_selected_item, viewGroup, false) : view;
        ((TextView) inflate).setText(getItem(i).f1963a.i.toUpperCase());
        return inflate;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        Document document;
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.tv_season_spinner_item, viewGroup, false);
        }
        Document item = getItem(i);
        TextView textView = (TextView) view.findViewById(R.id.dropdown_text);
        textView.setText(getItem(i).f1963a.i.toUpperCase());
        Resources resources = getContext().getResources();
        document = this.f2549a.l;
        if (item == document) {
            view.setBackgroundColor(resources.getColor(R.color.play_movies_primary));
            textView.setTextColor(resources.getColor(R.color.white));
        } else {
            view.setBackgroundResource(R.drawable.play_highlight_overlay_light);
            textView.setTextColor(resources.getColor(R.color.play_fg_primary));
        }
        return view;
    }
}
