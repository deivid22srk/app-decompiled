package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public class SongIndex extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private TextView f3086a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f3087b;
    private ProgressBar c;
    private int d;

    public SongIndex(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3086a = (TextView) findViewById(R.id.song_index_text);
        this.f3087b = (ImageView) findViewById(R.id.status_indicator);
        this.c = (ProgressBar) findViewById(R.id.loading_progress);
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.f3086a != null) {
            this.f3086a.getBaseline();
        }
        return super.getBaseline();
    }

    public void setState(int i) {
        int i2;
        int i3;
        a(this.d, 8);
        a(i, 0);
        ImageView imageView = this.f3087b;
        switch (i) {
            case 2:
                i2 = R.drawable.ic_music_pause;
                break;
            case 3:
            default:
                i2 = R.drawable.ic_music_play;
                break;
            case 4:
                i2 = R.drawable.ic_network_error;
                break;
            case 5:
                i2 = R.drawable.btn_music_play;
                break;
        }
        imageView.setImageResource(i2);
        ImageView imageView2 = this.f3087b;
        Resources resources = getResources();
        switch (i) {
            case 2:
                i3 = R.string.content_description_track_playing;
                break;
            case 3:
            default:
                i3 = R.string.content_description_track_paused;
                break;
            case 4:
                i3 = R.string.content_description_track_error;
                break;
            case 5:
                i3 = R.string.content_description_track_play;
                break;
        }
        imageView2.setContentDescription(resources.getString(i3));
        Context context = getContext();
        if (this.d != 4 && i == 4 && ik.c(context)) {
            ik.a(context, (CharSequence) context.getString(R.string.content_description_track_error), (View) this.f3087b, true);
        }
        this.d = i;
    }

    public void setTrackNumber(int i) {
        this.f3086a.setText(String.valueOf(i));
        this.f3086a.setContentDescription(getResources().getString(R.string.content_description_track_number, Integer.valueOf(i)));
    }

    private void a(int i, int i2) {
        switch (i) {
            case 0:
                if (this.f3086a != null) {
                    this.f3086a.setVisibility(i2);
                    break;
                }
                break;
            case 1:
                this.c.setVisibility(i2);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                this.f3087b.setVisibility(i2);
                break;
        }
    }
}
