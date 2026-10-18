#!/usr/bin/env bash
# rename_package.sh — renomeia o pacote de um APK decodificado pelo apktool
# uso: ./rename_package.sh <dir_decodificado> <pacote_antigo> <pacote_novo>
# reescreve referências (smali, manifest, res) e move os diretórios de classes
set -euo pipefail

DIR=$1
OLD=$2
NEW=$3

# forma L-classe: Lcom/android/vending/  (pontos viram barra; delimiter | no sed, / é literal)
OLD_SLASH="L${OLD//./\/}/"
NEW_SLASH="L${NEW//./\/}/"
# forma pontilhada com pontos ESCAPADOS (sem isso o . casa qualquer char e corrompe smali)
OLD_DOT_ESC=${OLD//./\\.}

echo "[*] renomeando: $OLD -> $NEW"

# 1) reescreve referências em arquivos de texto
#    (exclui original/ — cópia preservada pelo apktool — e build/ — intermediários)
grep -rl --binary-files=without-match "$OLD" "$DIR" --exclude-dir=original --exclude-dir=build | while read -r f; do
    sed -i "s|${OLD_SLASH//|/\\|}|${NEW_SLASH//|/\\|}|g; s|${OLD_DOT_ESC//|/\\|}|${NEW//|/\\|}|g" "$f"
done

# 2) move os diretórios de classes smali para o novo caminho de pacote
for d in "$DIR"/smali*/; do
    if [ -d "${d}com/android/vending" ]; then
        mkdir -p "${d}com/deivid22srk"
        mv "${d}com/android/vending" "${d}com/deivid22srk/store"
        echo "[*] movido: ${d}com/android/vending -> ${d}com/deivid22srk/store"
    fi
done

# 3) reescreve o caminho do aplicativo no apktool.yml, se houver
if [ -f "$DIR/apktool.yml" ]; then
    sed -i "s|$OLD|$NEW|g" "$DIR/apktool.yml"
fi

echo "[*] renomeado: $OLD -> $NEW"
