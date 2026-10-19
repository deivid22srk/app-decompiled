package com.deivid22srk.store.offline;

/**
 * Dados do catálogo offline (100% local, sem rede).
 * Formato de cada linha: {emoji, nome, desenvolvedor, gênero, tamanho, nota, descrição}
 */
public final class CatalogData {

    private CatalogData() {
    }

    /** Abas da interface (mesmas categorias da loja original). */
    public static final String[] TABS = {"APPS", "JOGOS", "FILMES", "LIVROS"};

    /** Índice da aba exibida por padrão (JOGOS). */
    public static final int TAB_JOGOS = 1;

    public static final String[][] GAMES = {
        {"🚇", "Subway Surfers", "SYBO Games", "Corrida infinita", "156 MB", "4,5",
            "Corra pelos trilhos, desvie dos trens e escape do inspetor nesta clássica corrida infinita. Colete moedas, use pranchas e compre bonecos para bater recordes."},
        {"🍬", "Candy Crush Saga", "King", "Puzzle / Combine 3", "78 MB", "4,6",
            "Combine doces coloridos, avance por milhares de níveis e use poderes especiais. O puzzle mais famoso do mundo, direto do reino dos doces."},
        {"⛏️", "Minecraft", "Mojang Studios", "Sandbox / Aventura", "130 MB", "4,7",
            "Construa o que quiser com blocos em um mundo infinito: cavernas, vilas, redstone e sobrevivência à noite. A criatividade é o limite."},
        {"🚀", "Among Us", "Innersloth LLC", "Multijogador / Dedução", "95 MB", "4,2",
            "Trabalhe na nave com a tripulação — mas cuidado com o impostor entre vocês. Complete tarefas, vote e descubra quem está sabotando."},
        {"🔫", "Free Fire", "Garena International", "Battle Royale", "320 MB", "4,3",
            "Partidas de battle royale de 10 minutos com 50 jogadores: escolha o ponto de salto, colete armas e seja o último sobrevivente."},
        {"🏰", "Clash of Clans", "Supercell", "Estratégia", "180 MB", "4,6",
            "Construa sua vila, treine tropas e ataque clãs rivais. Junte-se a um clã, participe de guerras e defenda sua base com torres e muros."},
        {"🎮", "Roblox", "Roblox Corporation", "Sandbox / Multijogador", "160 MB", "4,4",
            "Milhões de experiências criadas pela comunidade: parkour, simuladores, obbys e RPGs. Jogue e crie mundos com os amigos."},
        {"⚡", "Pokémon GO", "Niantic, Inc.", "Realidade aumentada", "85 MB", "4,1",
            "Saia de casa e capture Pokémon no mundo real. Vença ginásios, complete o registro e participe de raids com treinadores locais."},
        {"🌸", "Genshin Impact", "HoYoverse", "RPG de ação", "380 MB", "4,5",
            "Explore o vasto mundo de Teyvat com personagens elementais, resolva puzzles, derrote chefes e siga a jornada dos gêmeos viajantes."},
        {"🏎️", "Asphalt 8: Airborne", "Gameloft", "Corrida", "1,6 GB", "4,4",
            "Corridas de alta velocidade com carros licenciados, saltos e manobras aéreas em cenários do mundo todo. Derrape, voe e vença."},
        {"🐒", "Temple Run 2", "Imangi Studios", "Corrida infinita", "65 MB", "4,3",
            "Fuja com o ídolo maldito por penhascos, minas e tirolesas. Deslize, vire e pule enquanto o monstro gigante persegue você."},
        {"🍉", "Fruit Ninja", "Halfbrick Studios", "Arcade", "45 MB", "4,2",
            "Fatie frutas com o dedo, evite bombas e use poderes especiais. O arcade mais refrescante e viciante para partidas rápidas."},
        {"😡", "Angry Birds Classic", "Rovio Entertainment", "Puzzle físico", "55 MB", "4,3",
            "Arremesse os pássaros com estilingue e derrube os porcos verdes em centenas de níveis com física real. O clássico que começou tudo."},
        {"🌾", "Stardew Valley", "ConcernedApe", "Simulação / RPG", "250 MB", "4,8",
            "Herdou uma fazenda antiga: plante colheitas, crie animais, pesque, minere e conquiste corações na pacata comunidade de Pelican Town."},
        {"🧟", "Plants vs. Zombies", "PopCap Games", "Tower defense", "90 MB", "4,5",
            "Defenda sua casa da invasão zumbi com um jardim de plantas guerreiras: girassóis, ervilhas e nozes em cinco fileiras de quintal."},
        {"🕹️", "Retro Bowl", "New Star Games", "Esportes / Arcade", "40 MB", "4,6",
            "Gerencie seu time de futebol americano estilo retrô: contrate jogadores, chame as jogadas e leve a franquia ao Retro Bowl."},
    };

    public static final String[][] APPS = {
        {"💬", "WhatsApp Messenger", "Meta", "Comunicação", "35 MB", "4,3",
            "Mensagens e chamadas gratuitas pelo internet: texto, voz, vídeo, grupos e status. O mensageiro mais usado do mundo."},
        {"📸", "Instagram", "Meta", "Rede social", "95 MB", "4,4",
            "Compartilhe fotos e stories, explore Reels e acompanhe criadores. Filtros, direct e feed personalizado."},
        {"🎧", "Spotify", "Spotify AB", "Música", "110 MB", "4,5",
            "Milhões de músicas e podcasts em streaming, playlists personalizadas e modo offline para assinantes."},
        {"▶️", "YouTube", "Google LLC", "Vídeo", "120 MB", "4,2",
            "Assista a vídeos, inscreva-se em canais, curta playlists e transmita para a TV. De tutoriais a música."},
        {"🎬", "Netflix", "Netflix, Inc.", "Entretenimento", "90 MB", "4,4",
            "Filmes, séries e documentários premiados. Baixe episódios para assistir offline e continue de onde parou."},
        {"🌐", "Google Chrome", "Google LLC", "Navegador", "150 MB", "4,5",
            "Navegador rápido e seguro do Google: sincronização de abas, navegação anônima e economia de dados."},
        {"🎵", "TikTok", "TikTok Pte. Ltd.", "Rede social", "180 MB", "4,3",
            "Vídeos curtos personalizados para você: desafios, filtros, efeitos e a maior comunidade criativa."},
        {"✈️", "Telegram", "Telegram FZ-LLC", "Comunicação", "60 MB", "4,4",
            "Mensageiro focado em velocidade e privacidade: grupos gigantes, canais, arquivos ilimitados e bots."},
    };

    /** Mensagem exibida nas abas sem conteúdo offline. */
    public static final String EMPTY_TAB_ICON = "🎬";
    public static final String EMPTY_TAB_TITLE = "Conteúdo indisponível no modo offline";
    public static final String EMPTY_TAB_TEXT =
        "A loja original busca filmes e livros nos servidores do Google Play, que exigem "
            + "conta Google e conexão. Este é um catálogo de demonstração 100% offline — "
            + "confira as abas APPS e JOGOS para ver os itens de exemplo.";
}
