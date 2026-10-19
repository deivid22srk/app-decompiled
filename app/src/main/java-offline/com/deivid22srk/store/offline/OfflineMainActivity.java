package com.deivid22srk.store.offline;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

/**
 * "Interface original" do app: recria o visual da loja (toolbar com busca,
 * abas APPS • JOGOS • FILMES • LIVROS, cartões com nota) porém 100% offline,
 * exibindo o catálogo de jogos e apps de exemplo — sem conta Google, sem rede.
 *
 * A interface original real (com.google.android.finsky.*) exige conta Google e
 * os servidores do Play; em modo offline ela não consegue renderizar conteúdo.
 * Esta tela replica a experiência e mantém o app estável.
 */
public class OfflineMainActivity extends Activity {

    private static final int GREEN_DARK = 0xFF0B8043;
    private static final int GREEN = 0xFF0F9D58;
    private static final int TEXT_DARK = 0xFF212121;
    private static final int TEXT_GRAY = 0xFF757575;

    private static final int[] PALETTE = {
        0xFFE57373, 0xFFF48FB1, 0xFFBA68C8, 0xFF7986CB,
        0xFF64B5F6, 0xFF4DB6AC, 0xFFAED581, 0xFFFFD54F,
        0xFFFFB74D, 0xFFA1887F, 0xFF90A4AE, 0xFFF06292,
        0xFF9575CD, 0xFF4FC3F7, 0xFFFF8A65, 0xFF81C784,
    };

    private float mDensity;

    private LinearLayout mTabBar;
    private final TextView[] mTabViews = new TextView[CatalogData.TABS.length];
    private final View[] mTabUnderlines = new View[CatalogData.TABS.length];
    private int mCurrentTab = CatalogData.TAB_JOGOS;
    private String mQuery = "";

    private LinearLayout mContentHost;
    private ListView mListView;
    private View mEmptyView;
    private CatalogAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (Build.VERSION.SDK_INT >= 21) {
            setTheme(android.R.style.Theme_Material_Light_NoActionBar);
        } else {
            setTheme(android.R.style.Theme_Light_NoTitleBar);
        }
        super.onCreate(savedInstanceState);
        mDensity = getResources().getDisplayMetrics().density;

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.WHITE);

        root.addView(buildToolbar());
        root.addView(buildTabBar());
        root.addView(buildSectionHeader());

        mContentHost = new LinearLayout(this);
        mContentHost.setOrientation(LinearLayout.VERTICAL);
        mListView = new ListView(this);
        mListView.setDivider(new android.graphics.drawable.ColorDrawable(0xFFEEEEEE));
        mListView.setDividerHeight(1);
        mAdapter = new CatalogAdapter();
        mListView.setAdapter(mAdapter);
        mListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(android.widget.AdapterView<?> parent, View view,
                                    int position, long id) {
                showItemDetails(position);
            }
        });
        mContentHost.addView(mListView, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f));
        mEmptyView = buildEmptyState();
        mEmptyView.setVisibility(View.GONE);
        mContentHost.addView(mEmptyView, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f));
        root.addView(mContentHost, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f));

        root.addView(buildFooter());
        setContentView(root);
        selectTab(CatalogData.TAB_JOGOS);
    }

    // ---------------------------------------------------------------- toolbar

    /** Barra superior branca: menu, caixa de busca (filtra o catálogo). */
    private View buildToolbar() {
        LinearLayout bar = new LinearLayout(this);
        bar.setOrientation(LinearLayout.HORIZONTAL);
        bar.setGravity(Gravity.CENTER_VERTICAL);
        bar.setPadding(dp(8), dp(8), dp(12), dp(8));
        bar.setBackgroundColor(Color.WHITE);

        TextView menu = new TextView(this);
        menu.setText("≡");
        menu.setTextSize(26);
        menu.setTextColor(0xFF5F6368);
        menu.setGravity(Gravity.CENTER);
        menu.setPadding(dp(8), 0, dp(8), 0);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OfflineMainActivity.this,
                        "Menu indisponível no modo offline.", Toast.LENGTH_SHORT).show();
            }
        });
        bar.addView(menu);

        LinearLayout search = new LinearLayout(this);
        search.setOrientation(LinearLayout.HORIZONTAL);
        search.setGravity(Gravity.CENTER_VERTICAL);
        GradientDrawable searchBg = new GradientDrawable();
        searchBg.setColor(0xFFF1F3F4);
        searchBg.setCornerRadius(dp(20));
        search.setBackgroundDrawable(searchBg);
        search.setPadding(dp(12), 0, dp(12), 0);

        TextView lens = new TextView(this);
        lens.setText("🔍");
        lens.setTextSize(15);
        search.addView(lens);

        final EditText input = new EditText(this);
        input.setHint("Pesquisar Google Play");
        input.setTextSize(15);
        input.setTextColor(TEXT_DARK);
        input.setHintTextColor(TEXT_GRAY);
        input.setBackgroundDrawable(null);
        input.setSingleLine(true);
        input.setPadding(dp(8), dp(10), 0, dp(10));
        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                mQuery = s.toString().trim();
                mAdapter.refresh();
            }
        });
        search.addView(input, new LinearLayout.LayoutParams(
                0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        bar.addView(search, new LinearLayout.LayoutParams(
                0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        return bar;
    }

    // ------------------------------------------------------------------- tabs

    /** Abas no estilo da loja original com sublinhado verde na selecionada. */
    private View buildTabBar() {
        mTabBar = new LinearLayout(this);
        mTabBar.setOrientation(LinearLayout.HORIZONTAL);
        mTabBar.setBackgroundColor(Color.WHITE);
        for (int i = 0; i < CatalogData.TABS.length; i++) {
            final int index = i;
            LinearLayout cell = new LinearLayout(this);
            cell.setOrientation(LinearLayout.VERTICAL);
            cell.setGravity(Gravity.CENTER);

            TextView tab = new TextView(this);
            tab.setText(CatalogData.TABS[i]);
            tab.setTextSize(14);
            tab.setAllCaps(true);
            tab.setGravity(Gravity.CENTER);
            tab.setPadding(0, dp(12), 0, dp(10));
            tab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    selectTab(index);
                    hideKeyboard(v);
                }
            });
            mTabViews[i] = tab;
            cell.addView(tab, new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            View underline = new View(this);
            underline.setBackgroundColor(GREEN);
            underline.setVisibility(View.GONE);
            mTabUnderlines[i] = underline;
            cell.addView(underline, new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, dp(3)));

            mTabBar.addView(cell, new LinearLayout.LayoutParams(
                    0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        }
        return mTabBar;
    }

    private void selectTab(int index) {
        mCurrentTab = index;
        for (int i = 0; i < mTabViews.length; i++) {
            boolean sel = (i == index);
            mTabViews[i].setTextColor(sel ? GREEN : TEXT_GRAY);
            mTabViews[i].setTypeface(null, sel ? Typeface.BOLD : Typeface.NORMAL);
            mTabUnderlines[i].setVisibility(sel ? View.VISIBLE : View.GONE);
        }
        mAdapter.refresh();
    }

    private void hideKeyboard(View v) {
        try {
            InputMethodManager imm =
                    (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
        } catch (Throwable ignored) {
        }
    }

    // -------------------------------------------------------- section header

    private TextView mSectionHeader;

    private View buildSectionHeader() {
        mSectionHeader = new TextView(this);
        mSectionHeader.setTextSize(13);
        mSectionHeader.setTypeface(Typeface.DEFAULT_BOLD);
        mSectionHeader.setTextColor(GREEN_DARK);
        mSectionHeader.setAllCaps(true);
        mSectionHeader.setPadding(dp(16), dp(14), dp(16), dp(6));
        mSectionHeader.setBackgroundColor(Color.WHITE);
        return mSectionHeader;
    }

    // ---------------------------------------------------------------- footer

    private View buildFooter() {
        TextView caption = new TextView(this);
        caption.setText("6.2.03-open • catálogo de demonstração offline • código original preservado");
        caption.setTextColor(0xFF9E9E9E);
        caption.setTextSize(11);
        caption.setGravity(Gravity.CENTER);
        caption.setPadding(dp(12), dp(6), dp(12), dp(8));
        caption.setBackgroundColor(Color.WHITE);
        return caption;
    }

    // ---------------------------------------------------------------- details

    /** Diálogo de detalhes do item (jogo ou app) selecionado. */
    private void showItemDetails(int position) {
        String[] g = adapterData().get(position);

        LinearLayout content = new LinearLayout(this);
        content.setOrientation(LinearLayout.VERTICAL);
        int p = dp(20);
        content.setPadding(p, dp(12), p, 0);

        LinearLayout head = new LinearLayout(this);
        head.setOrientation(LinearLayout.HORIZONTAL);
        head.setGravity(Gravity.CENTER_VERTICAL);

        TextView icon = new TextView(this);
        icon.setText(g[0]);
        icon.setTextSize(26);
        icon.setGravity(Gravity.CENTER);
        GradientDrawable iconBg = new GradientDrawable();
        iconBg.setColor(PALETTE[position % PALETTE.length]);
        iconBg.setCornerRadius(dp(12));
        icon.setBackgroundDrawable(iconBg);
        head.addView(icon, new LinearLayout.LayoutParams(dp(52), dp(52)));

        LinearLayout headText = new LinearLayout(this);
        headText.setOrientation(LinearLayout.VERTICAL);
        headText.setPadding(dp(14), 0, 0, 0);
        TextView name = new TextView(this);
        name.setText(g[1]);
        name.setTextSize(18);
        name.setTypeface(Typeface.DEFAULT_BOLD);
        name.setTextColor(TEXT_DARK);
        headText.addView(name);
        TextView dev = new TextView(this);
        dev.setText(g[2]);
        dev.setTextSize(13);
        dev.setTextColor(GREEN_DARK);
        headText.addView(dev);
        head.addView(headText, new LinearLayout.LayoutParams(
                0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        content.addView(head);

        content.addView(detailLine("Categoria", g[3]));
        content.addView(detailLine("Tamanho", g[4]));
        content.addView(detailLine("Avaliação", "★ " + g[5] + "  (demonstração)"));

        TextView desc = new TextView(this);
        desc.setText(g[6]);
        desc.setTextSize(14);
        desc.setTextColor(0xFF424242);
        desc.setPadding(0, dp(12), 0, 0);
        content.addView(desc);

        TextView note = new TextView(this);
        note.setText("Catálogo de exemplo offline — nenhum download real é realizado.");
        note.setTextSize(12);
        note.setTextColor(0xFF9E9E9E);
        note.setPadding(0, dp(12), 0, 0);
        content.addView(note);

        ScrollView scroll = new ScrollView(this);
        scroll.addView(content);

        new AlertDialog.Builder(this)
                .setTitle(g[0] + "  " + g[1])
                .setView(scroll)
                .setPositiveButton("Fechar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }

    private TextView detailLine(String label, String value) {
        TextView tv = new TextView(this);
        tv.setText(label + ":  " + value);
        tv.setTextSize(14);
        tv.setTextColor(0xFF616161);
        tv.setPadding(0, dp(10), 0, 0);
        return tv;
    }

    // ----------------------------------------------------------------- dados

    /** Dados da aba atual já filtrados pela busca. */
    private List<String[]> adapterData() {
        String[][] source = (mCurrentTab == 0) ? CatalogData.APPS : CatalogData.GAMES;
        List<String[]> out = new ArrayList<String[]>();
        if (mCurrentTab >= 2 || mQuery.length() == 0) {
            if (mCurrentTab < 2) {
                for (String[] row : source) {
                    out.add(row);
                }
            }
            return out;
        }
        String q = mQuery.toLowerCase();
        for (String[] row : source) {
            if (row[1].toLowerCase().contains(q) || row[2].toLowerCase().contains(q)
                    || row[3].toLowerCase().contains(q)) {
                out.add(row);
            }
        }
        return out;
    }

    // --------------------------------------------------------------- adapter

    private final class CatalogAdapter extends BaseAdapter {

        private List<String[]> items = new ArrayList<String[]>();

        void refresh() {
            items = adapterData();
            notifyDataSetChanged();
            updateSectionHeader();
            boolean empty = items.isEmpty();
            mListView.setVisibility(empty ? View.GONE : View.VISIBLE);
            mEmptyView.setVisibility(empty ? View.VISIBLE : View.GONE);
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LinearLayout row;
            TextView icon;
            TextView title;
            TextView subtitle;
            TextView rating;
            if (convertView instanceof LinearLayout) {
                row = (LinearLayout) convertView;
                icon = (TextView) row.getChildAt(0);
                LinearLayout textCol = (LinearLayout) row.getChildAt(1);
                title = (TextView) textCol.getChildAt(0);
                subtitle = (TextView) textCol.getChildAt(1);
                rating = (TextView) row.getChildAt(2);
            } else {
                row = new LinearLayout(OfflineMainActivity.this);
                row.setOrientation(LinearLayout.HORIZONTAL);
                row.setGravity(Gravity.CENTER_VERTICAL);
                int pad = dp(12);
                row.setPadding(pad, pad, pad, pad);

                icon = new TextView(OfflineMainActivity.this);
                icon.setTextSize(20);
                icon.setGravity(Gravity.CENTER);
                row.addView(icon, new LinearLayout.LayoutParams(dp(46), dp(46)));

                LinearLayout textCol = new LinearLayout(OfflineMainActivity.this);
                textCol.setOrientation(LinearLayout.VERTICAL);
                textCol.setPadding(dp(12), 0, dp(8), 0);

                title = new TextView(OfflineMainActivity.this);
                title.setTextSize(16);
                title.setTypeface(Typeface.DEFAULT_BOLD);
                title.setTextColor(TEXT_DARK);
                textCol.addView(title);

                subtitle = new TextView(OfflineMainActivity.this);
                subtitle.setTextSize(13);
                subtitle.setTextColor(TEXT_GRAY);
                textCol.addView(subtitle);

                row.addView(textCol, new LinearLayout.LayoutParams(
                        0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));

                rating = new TextView(OfflineMainActivity.this);
                rating.setTextSize(14);
                rating.setTypeface(Typeface.DEFAULT_BOLD);
                row.addView(rating);
            }

            String[] g = items.get(position);
            icon.setText(g[0]);
            GradientDrawable iconBg = new GradientDrawable();
            iconBg.setColor(PALETTE[position % PALETTE.length]);
            iconBg.setCornerRadius(dp(12));
            icon.setBackgroundDrawable(iconBg);
            title.setText(g[1]);
            subtitle.setText(g[2] + " • " + g[3]);
            rating.setText("★ " + g[5]);
            rating.setTextColor(0xFFFF8F00);
            return row;
        }
    }

    private void updateSectionHeader() {
        if (mCurrentTab >= 2) {
            mSectionHeader.setText(CatalogData.TABS[mCurrentTab]);
        } else if (mQuery.length() > 0) {
            mSectionHeader.setText("Resultados para \"" + mQuery + "\"");
        } else {
            mSectionHeader.setText(mCurrentTab == 0
                    ? "Populares no momento" : "Jogos em destaque");
        }
    }

    /** Estado vazio para FILMES / LIVROS (sem conteúdo offline). */
    private View buildEmptyState() {
        LinearLayout empty = new LinearLayout(this);
        empty.setOrientation(LinearLayout.VERTICAL);
        empty.setGravity(Gravity.CENTER);
        empty.setPadding(dp(32), dp(48), dp(32), dp(48));

        TextView icon = new TextView(this);
        icon.setText(CatalogData.EMPTY_TAB_ICON);
        icon.setTextSize(44);
        icon.setGravity(Gravity.CENTER);
        empty.addView(icon);

        TextView title = new TextView(this);
        title.setText(CatalogData.EMPTY_TAB_TITLE);
        title.setTextSize(16);
        title.setTypeface(Typeface.DEFAULT_BOLD);
        title.setTextColor(TEXT_DARK);
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, dp(12), 0, 0);
        empty.addView(title);

        TextView text = new TextView(this);
        text.setText(CatalogData.EMPTY_TAB_TEXT);
        text.setTextSize(13);
        text.setTextColor(TEXT_GRAY);
        text.setGravity(Gravity.CENTER);
        text.setPadding(0, dp(8), 0, 0);
        empty.addView(text);

        LinearLayout wrap = new LinearLayout(this);
        wrap.setOrientation(LinearLayout.VERTICAL);
        wrap.addView(empty, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        return wrap;
    }

    private int dp(int value) {
        return Math.round(value * mDensity);
    }
}
