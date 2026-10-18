package android.support.v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
final class fp extends android.support.v4.widget.bb implements View.OnClickListener {
    int j;
    private final SearchManager k;
    private final SearchView l;
    private final SearchableInfo m;
    private final Context n;
    private final WeakHashMap<String, Drawable.ConstantState> o;
    private final int p;
    private boolean q;
    private ColorStateList r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;

    public fp(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.q = false;
        this.j = 1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.k = (SearchManager) this.d.getSystemService("search");
        this.l = searchView;
        this.m = searchableInfo;
        this.p = searchView.getSuggestionCommitIconResId();
        this.n = context;
        this.o = weakHashMap;
    }

    @Override // android.support.v4.widget.l, android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.support.v4.widget.l, android.support.v4.widget.p
    public final Cursor a(CharSequence charSequence) {
        String[] strArr;
        Cursor query;
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.l.getVisibility() != 0 || this.l.getWindowVisibility() != 0) {
            return null;
        }
        try {
            SearchableInfo searchableInfo = this.m;
            if (searchableInfo == null) {
                query = null;
            } else {
                String suggestAuthority = searchableInfo.getSuggestAuthority();
                if (suggestAuthority == null) {
                    query = null;
                } else {
                    Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
                    String suggestPath = searchableInfo.getSuggestPath();
                    if (suggestPath != null) {
                        fragment.appendEncodedPath(suggestPath);
                    }
                    fragment.appendPath("search_suggest_query");
                    String suggestSelection = searchableInfo.getSuggestSelection();
                    if (suggestSelection != null) {
                        strArr = new String[]{charSequence2};
                    } else {
                        fragment.appendPath(charSequence2);
                        strArr = null;
                    }
                    fragment.appendQueryParameter("limit", "50");
                    query = this.d.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
                }
            }
            if (query != null) {
                query.getCount();
                return query;
            }
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
        }
        return null;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        c(this.c);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        c(this.c);
    }

    private static void c(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    @Override // android.support.v4.widget.l, android.support.v4.widget.p
    public final void a(Cursor cursor) {
        if (this.q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.s = cursor.getColumnIndex("suggest_text_1");
                this.t = cursor.getColumnIndex("suggest_text_2");
                this.u = cursor.getColumnIndex("suggest_text_2_url");
                this.v = cursor.getColumnIndex("suggest_icon_1");
                this.w = cursor.getColumnIndex("suggest_icon_2");
                this.x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // android.support.v4.widget.bb, android.support.v4.widget.l
    public final View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View a2 = super.a(context, cursor, viewGroup);
        a2.setTag(new fq(a2));
        ((ImageView) a2.findViewById(android.support.v7.b.g.edit_query)).setImageResource(this.p);
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.widget.l
    public final void a(View view, Cursor cursor) {
        Drawable a2;
        String a3;
        fq fqVar = (fq) view.getTag();
        int i = this.x != -1 ? cursor.getInt(this.x) : 0;
        if (fqVar.f823a != null) {
            a(fqVar.f823a, a(cursor, this.s));
        }
        if (fqVar.f824b != null) {
            String a4 = a(cursor, this.u);
            if (a4 == null) {
                a3 = a(cursor, this.t);
            } else {
                if (this.r == null) {
                    TypedValue typedValue = new TypedValue();
                    this.d.getTheme().resolveAttribute(android.support.v7.b.b.textColorSearchUrl, typedValue, true);
                    this.r = this.d.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(a4);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.r, null), 0, a4.length(), 33);
                a3 = spannableString;
            }
            if (TextUtils.isEmpty(a3)) {
                if (fqVar.f823a != null) {
                    fqVar.f823a.setSingleLine(false);
                    fqVar.f823a.setMaxLines(2);
                }
            } else if (fqVar.f823a != null) {
                fqVar.f823a.setSingleLine(true);
                fqVar.f823a.setMaxLines(1);
            }
            a(fqVar.f824b, a3);
        }
        if (fqVar.c != null) {
            ImageView imageView = fqVar.c;
            if (this.v == -1) {
                a2 = null;
            } else {
                a2 = a(cursor.getString(this.v));
                if (a2 == null) {
                    ComponentName searchActivity = this.m.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    if (this.o.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = this.o.get(flattenToShortString);
                        a2 = constantState == null ? null : constantState.newDrawable(this.n.getResources());
                    } else {
                        Drawable a5 = a(searchActivity);
                        this.o.put(flattenToShortString, a5 == null ? null : a5.getConstantState());
                        a2 = a5;
                    }
                    if (a2 == null) {
                        a2 = this.d.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            a(imageView, a2, 4);
        }
        if (fqVar.d != null) {
            a(fqVar.d, this.w != -1 ? a(cursor.getString(this.w)) : null, 8);
        }
        if (this.j == 2 || (this.j == 1 && (i & 1) != 0)) {
            fqVar.e.setVisibility(0);
            fqVar.e.setTag(fqVar.f823a.getText());
            fqVar.e.setOnClickListener(this);
            return;
        }
        fqVar.e.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.l.onQueryRefine((CharSequence) tag);
        }
    }

    private static void a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private static void a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    @Override // android.support.v4.widget.l, android.support.v4.widget.p
    public final CharSequence b(Cursor cursor) {
        String a2;
        String a3;
        if (cursor == null) {
            return null;
        }
        String a4 = a(cursor, "suggest_intent_query");
        if (a4 != null) {
            return a4;
        }
        if (this.m.shouldRewriteQueryFromData() && (a3 = a(cursor, "suggest_intent_data")) != null) {
            return a3;
        }
        if (!this.m.shouldRewriteQueryFromText() || (a2 = a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return a2;
    }

    @Override // android.support.v4.widget.l, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a2 = a(this.d, this.c, viewGroup);
            if (a2 != null) {
                ((fq) a2.getTag()).f823a.setText(e.toString());
            }
            return a2;
        }
    }

    private Drawable a(String str) {
        if (str == null || str.length() == 0 || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.n.getPackageName() + "/" + parseInt;
            Drawable b2 = b(str2);
            if (b2 == null) {
                Drawable a2 = android.support.v4.b.g.a(this.n, parseInt);
                a(str2, a2);
                return a2;
            }
            return b2;
        } catch (Resources.NotFoundException e) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException e2) {
            Drawable b3 = b(str);
            if (b3 == null) {
                Drawable a3 = a(Uri.parse(str));
                a(str, a3);
                return a3;
            }
            return b3;
        }
    }

    private Drawable a(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return b(uri);
                } catch (Resources.NotFoundException e) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.n.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                try {
                    openInputStream.close();
                    return createFromStream;
                } catch (IOException e2) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e2);
                    return createFromStream;
                }
            } finally {
            }
        } catch (FileNotFoundException e3) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
        return null;
    }

    private Drawable b(String str) {
        Drawable.ConstantState constantState = this.o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private void a(String str, Drawable drawable) {
        if (drawable != null) {
            this.o.put(str, drawable.getConstantState());
        }
    }

    private Drawable a(ComponentName componentName) {
        PackageManager packageManager = this.d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    public static String a(Cursor cursor, String str) {
        return a(cursor, cursor.getColumnIndex(str));
    }

    private static String a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    private Drawable b(Uri uri) {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.d.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException e) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size == 2) {
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + uri);
            }
            if (identifier == 0) {
                throw new FileNotFoundException("No resource found for: " + uri);
            }
            return resourcesForApplication.getDrawable(identifier);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }
}
