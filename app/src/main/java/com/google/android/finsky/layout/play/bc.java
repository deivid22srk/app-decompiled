package com.google.android.finsky.layout.play;

import android.util.SparseArray;
import android.widget.ImageView;
import com.google.android.finsky.utils.fe;
import com.google.android.finsky.utils.jm;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.PlayCardSnippet;
import java.util.List;

/* loaded from: classes.dex */
public final class bc {

    /* renamed from: a, reason: collision with root package name */
    final SparseArray<List<com.google.android.play.layout.a>> f3427a = new SparseArray<>();

    public final void a(PlayCardClusterView playCardClusterView) {
        jm.a();
        if (playCardClusterView != null && playCardClusterView.c()) {
            as metadata = playCardClusterView.getMetadata();
            int a2 = metadata.a();
            for (int i = 0; i < a2; i++) {
                com.google.android.play.layout.a a3 = playCardClusterView.a(i);
                at atVar = metadata.a(i).f3415a;
                if (a3 != null) {
                    ImageView imageView = a3.getThumbnail().getImageView();
                    if (imageView instanceof FifeImageView) {
                        ((FifeImageView) imageView).a();
                    }
                    PlayCardSnippet snippet1 = a3.getSnippet1();
                    if (snippet1 != null) {
                        ImageView imageView2 = snippet1.getImageView();
                        if (imageView instanceof FifeImageView) {
                            ((FifeImageView) imageView2).a();
                        }
                    }
                    PlayCardSnippet snippet2 = a3.getSnippet2();
                    if (snippet2 != null) {
                        ImageView imageView3 = snippet2.getImageView();
                        if (imageView instanceof FifeImageView) {
                            ((FifeImageView) imageView3).a();
                        }
                    }
                    fe.a(a3);
                    this.f3427a.get(atVar.f3413a).add(a3);
                }
            }
            playCardClusterView.b();
        }
    }
}
