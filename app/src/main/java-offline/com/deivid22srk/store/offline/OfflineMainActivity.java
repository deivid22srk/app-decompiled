package com.deivid22srk.store.offline;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Tela inicial do modo offline.
 *
 * Substitui o fluxo que exigia login com conta Google: abre direto em um
 * catálogo de jogos de exemplo, 100% offline, sem nenhuma chamada de rede e
 * sem dependência da inicialização da loja original. Toda a interface é
 * construída em código Java (sem XML novo) para não tocar nos recursos
 * originais do app decompilado.
 */
public class OfflineMainActivity extends Activity {

    // {emoji, nome, gênero, tamanho, avaliação, desenvolvedor, descrição}
    private static final String[][] GAMES = {
        {"🚇", "Subway Surfers", "Corrida infinita", "156 MB", "4,5", "SYBO Games",
            "Corra pelos trilhos, desvie dos trens e escape do inspetor nesta clássica corrida infinita. Colete moedas, use pranchas e comprem Bonecos para bater recordes."},
        {"🍬", "Candy Crush Saga", "Puzzle / Combine 3", "78 MB", "4,6", "King",
            "Combine doces coloridos, avance por milhares de níveis e use poderes especiais. O puzzle mais famoso do mundo, direto do reino dos doces."},
        {"⛏️", "Minecraft", "Sandbox / Aventura", "130 MB", "4,7", "Mojang Studios",
            "Construa o que quiser com blocos em um mundo infinito: cavernas, vilas, redstone e sobrevivência à noite. A criatividade é o limite."},
        {"🚀", "Among Us", "Multijogador / Dedução", "95 MB", "4,2", "Innersloth LLC",
            "Trabalhe na nave com a tripulação — mas cuidado com o impostor entre vocês. Complete tarefas, vote e descubra quem está sabotando."},
        {"🔫", "Free Fire", "Battle Royale", "320 MB", "4,3", "Garena International",
            "Partidas de battle royale de 10 minutos com 50 jogadores: escolha o ponto de salto, colete armas e seja o último sobrevivente."},
        {"🏰", "Clash of Clans", "Estratégia", "180 MB", "4,6", "Supercell",
            "Construa sua vila, treine tropas e ataque clãs rivais. Junte-se a um clã, forme guerras e defenda sua base com torres e muros."},
        {"🎮", "Roblox", "Sandbox / Multijogador", "160 MB", "4,4", "Roblox Corporation",
            "Milhões de experiências criadas pela comunidade: parkour, simuladores, obbys e RPGs. Jogue e crie mundos com amigos."},
        {"⚡", "Pokémon GO", "Realidade aumentada", "85 MB", "4,1", "Niantic, Inc.",
            "Saia de casa e capture Pokémon no mundo real. Vencenha ginásios, complete o registro e participe de raids com treinadores locais."},
        {"🌸", "Genshin Impact", "RPG de ação", "380 MB", "4,5", "HoYoverse",
            "Explore o vasto mundo de Teyvat com personagens elementais, resolva puzzles, derrote chefes e siga a jornada dos gêmeos viajantes."},
        {"🏎️", "Asphalt 8: Airborne", "Corrida", "1,6 GB", "4,4", "Gameloft",
            "Corridas de alta velocidade com carros licenciados, saltos e manobras aéreas em cenários do mundo todo. Derrape, voe e vença."},
        {"🐒", "Temple Run 2", "Corrida infinita", "65 MB", "4,3", "Imangi Studios",
            "Fuja com o ídolo maldito por penhascos, minas e ziplines. Deslize, vire e pule enquanto o monstro gigante persegue você."},
        {"🍉", "Fruit Ninja", "Arcade", "45 MB", "4,2", "Halfbrick Studios",
            "Fatie frutas com o dedo, evite bombas e use poderes especiais. O arcade mais refrescante e viciante para partidas rápidas."},
        {"😡", "Angry Birds Classic", "Puzzle físico", "55 MB", "4,3", "Rovio Entertainment",
            "Arremesse os pássaros com estilingue e derrube os porcos verdes em centenas de níveis com física real. O clássico que começou tudo."},
        {"🌾", "Stardew Valley", "Simulação / RPG", "250 MB", "4,8", "ConcernedApe",
            "Herdou uma fazenda antiga: plante colheitas, crie animais, pesque, minere e conquiste corações na pacata comunidade de Pelican Town."},
        {"🧟", "Plants vs. Zombies", "Tower defense", "90 MB", "4,5", "PopCap Games",
            "Defenda sua casa da invasão zumbi com um jardim de plantas guerreiras: girassóis, ervilhas e nozes em 5 níveis de quintal."},
        {"🕹️", "Retro Bowl", "Esportes / Arcade", "40 MB", "4,6", "New Star Games",
            "Gerencie seu time de futebol americano estilo retrô: contrate jogadores, chame jogadas e leve a franquia ao Retro Bowl."},
    };

    private static final int[] PALETTE = {
        0xFFE57373, 0xFFF48FB1, 0xFFBA68C8, 0xFF7986CB,
        0xFF64B5F6, 0xFF4DB6AC, 0xFFAED581, 0xFFFFD54F,
        0xFFFFB74D, 0xFFA1887F, 0xFF90A4AE, 0xFFF06292,
        0xFF9575CD, 0xFF4FC3F7, 0xFFFF8A65, 0xFF81C784,
    };

    private static final int GREEN_DARK = 0xFF0B8043;
    private static final int GREEN = 0xFF0F9D58;

    private float mDensity;

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

        root.addView(buildHeader());
        root.addView(buildList(), new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f));
        root.addView(buildFooter());

        setContentView(root);
    }

    /** Cabeçalho verde estilo Play Store com título, subtítulo e selos. */
    private View buildHeader() {
        LinearLayout header = new LinearLayout(this);
        header.setOrientation(LinearLayout.VERTICAL);
        GradientDrawable bg = new GradientDrawable(
                GradientDrawable.Orientation.TOP_BOTTOM, new int[]{GREEN, GREEN_DARK});
        header.setBackgroundDrawable(bg);
        int p = dp(20);
        header.setPadding(p, dp(28), p, dp(18));

        TextView title = new TextView(this);
        title.setText("Google Play Store");
        title.setTextColor(Color.WHITE);
        title.setTextSize(24);
        title.setTypeface(Typeface.DEFAULT_BOLD);
        header.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText("Catálogo de jogos offline — sem conta Google");
        subtitle.setTextColor(0xFFE8F5E9);
        subtitle.setTextSize(14);
        subtitle.setPadding(0, dp(4), 0, 0);
        header.addView(subtitle);

        LinearLayout chips = new LinearLayout(this);
        chips.setOrientation(LinearLayout.HORIZONTAL);
        chips.setPadding(0, dp(12), 0, 0);
        chips.addView(makeChip("✓ Sem login"));
        chips.addView(makeChip("✓ 100% offline"));
        chips.addView(makeChip("✓ Código aberto"));
        header.addView(chips);
        return header;
    }

    private TextView makeChip(String text) {
        TextView chip = new TextView(this);
        chip.setText(text);
        chip.setTextColor(Color.WHITE);
        chip.setTextSize(12);
        chip.setPadding(dp(10), dp(4), dp(10), dp(4));
        GradientDrawable bg = new GradientDrawable();
        bg.setColor(0x33FFFFFF);
        bg.setCornerRadius(dp(14));
        chip.setBackgroundDrawable(bg);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.rightMargin = dp(6);
        chip.setLayoutParams(lp);
        return chip;
    }

    /** Lista do catálogo com os jogos de exemplo. */
    private View buildList() {
        ListView list = new ListView(this);
        list.setDivider(new android.graphics.drawable.ColorDrawable(0xFFEEEEEE));
        list.setDividerHeight(1);
        list.setAdapter(new CatalogAdapter());
        list.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(android.widget.AdapterView<?> parent, View view,
                                    int position, long id) {
                showGameDetails(position);
            }
        });
        return list;
    }

    /** Rodapé: atalho experimental para a interface original + assinatura. */
    private View buildFooter() {
        LinearLayout footer = new LinearLayout(this);
        footer.setOrientation(LinearLayout.VERTICAL);
        footer.setGravity(Gravity.CENTER_HORIZONTAL);
        footer.setPadding(dp(12), dp(8), dp(12), dp(10));

        TextView button = new TextView(this);
        button.setText("Abrir interface original da loja (experimental)");
        button.setTextColor(GREEN);
        button.setTextSize(14);
        button.setTypeface(Typeface.DEFAULT_BOLD);
        button.setGravity(Gravity.CENTER);
        button.setPadding(dp(16), dp(10), dp(16), dp(10));
        GradientDrawable bg = new GradientDrawable();
        bg.setColor(Color.WHITE);
        bg.setCornerRadius(dp(22));
        bg.setStroke(dp(1), GREEN);
        button.setBackgroundDrawable(bg);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOriginalStore();
            }
        });
        footer.addView(button);

        TextView caption = new TextView(this);
        caption.setText("6.2.02-open • código original decompilado com jadx • catálogo de demonstração");
        caption.setTextColor(0xFF9E9E9E);
        caption.setTextSize(11);
        caption.setGravity(Gravity.CENTER);
        caption.setPadding(0, dp(6), 0, 0);
        footer.addView(caption);
        return footer;
    }

    /** Tenta abrir a Activity original (requer conta Google; pode falhar). */
    private void openOriginalStore() {
        try {
            Intent intent = new Intent();
            intent.setClassName(getPackageName(), "com.deivid22srk.store.AssetBrowserActivity");
            startActivity(intent);
        } catch (Throwable t) {
            Toast.makeText(this,
                    "Interface original indisponível neste build (modo offline).",
                    Toast.LENGTH_SHORT).show();
        }
    }

    /** Diálogo com os detalhes do jogo selecionado. */
    private void showGameDetails(final int position) {
        String[] g = GAMES[position];

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
        name.setTextColor(0xFF212121);
        headText.addView(name);
        TextView dev = new TextView(this);
        dev.setText(g[5]);
        dev.setTextSize(13);
        dev.setTextColor(0xFF0B8043);
        headText.addView(dev);
        head.addView(headText, new LinearLayout.LayoutParams(
                0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        content.addView(head);

        content.addView(detailLine("Categoria", g[2]));
        content.addView(detailLine("Tamanho", g[3]));
        content.addView(detailLine("Avaliação", "★ " + g[4] + "  (demonstração)"));

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

    /** Adapter do catálogo: ícone emoji + nome + gênero/tamanho + nota. */
    private final class CatalogAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return GAMES.length;
        }

        @Override
        public Object getItem(int position) {
            return GAMES[position];
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
            if (convertView == null) {
                row = new LinearLayout(OfflineMainActivity.this);
                row.setOrientation(LinearLayout.HORIZONTAL);
                row.setGravity(Gravity.CENTER_VERTICAL);
                int pad = dp(10);
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
                title.setTextColor(0xFF212121);
                textCol.addView(title);

                subtitle = new TextView(OfflineMainActivity.this);
                subtitle.setTextSize(13);
                subtitle.setTextColor(0xFF757575);
                textCol.addView(subtitle);

                row.addView(textCol, new LinearLayout.LayoutParams(
                        0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));

                rating = new TextView(OfflineMainActivity.this);
                rating.setTextSize(14);
                rating.setTypeface(Typeface.DEFAULT_BOLD);
                row.addView(rating);
            } else {
                row = (LinearLayout) convertView;
                icon = (TextView) row.getChildAt(0);
                LinearLayout textCol = (LinearLayout) row.getChildAt(1);
                title = (TextView) textCol.getChildAt(0);
                subtitle = (TextView) textCol.getChildAt(1);
                rating = (TextView) row.getChildAt(2);
            }

            String[] g = GAMES[position];
            icon.setText(g[0]);
            GradientDrawable iconBg = new GradientDrawable();
            iconBg.setColor(PALETTE[position % PALETTE.length]);
            iconBg.setCornerRadius(dp(12));
            icon.setBackgroundDrawable(iconBg);
            title.setText(g[1]);
            subtitle.setText(g[2] + " • " + g[3]);
            rating.setText("★ " + g[4]);
            rating.setTextColor(0xFFFF8F00);
            return row;
        }
    }

    private int dp(int value) {
        return Math.round(value * mDensity);
    }
}
