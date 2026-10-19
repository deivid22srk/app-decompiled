#!/usr/bin/env bash
# make_code_jars.sh — regenera os jars de bytecode original em app/libs/
#
# Pipeline:
#   1. apktool decode do app.apk
#   2. rename_package.sh (com.android.vending -> com.deivid22srk.store)
#   3. fix_permissions.py (dedup de permissões/authorities)
#   4. rebase_ids.py (constantes 0x7f do bytecode: IDs originais -> IDs do
#      build aapt2; requer um app-debug.apk prévio gerado por
#      `gradle assembleDebug`, pois o aapt2 não preserva entry-ids)
#   5. apktool b --use-aapt1 (monta os dexes)
#   6. extrai classes*.dex -> dex2jar -> app/libs/app-code-{1,2}.jar
#
# Requisitos: apktool.jar, dex-tools-v2.4 (https://github.com/pxb1988/dex2jar/releases),
# Android build-tools com aapt/aapt2 no PATH ou AAPT/AAPT2 definidos.
set -euo pipefail

APK="${1:-app.apk}"
OLD_PKG="${2:-com.android.vending}"
NEW_PKG="${3:-com.deivid22srk.store}"
APKTOOL="${APKTOOL:-apktool.jar}"
D2J_DIR="${D2J_DIR:-dex-tools-v2.4}"
AAPT="${AAPT:-aapt}"
AAPT2="${AAPT2:-aapt2}"

HERE="$(cd "$(dirname "$0")/.." && pwd)"   # raiz do repo
WORK=$(mktemp -d)
trap 'rm -rf "$WORK"' EXIT

echo "[1/6] decode $APK"
java -jar "$APKTOOL" d "$APK" -o "$WORK/dec" -f > /dev/null

echo "[2/6] rename $OLD_PKG -> $NEW_PKG + dedup permissoes"
bash "$HERE/rename_package.sh" "$WORK/dec" "$OLD_PKG" "$NEW_PKG" > /dev/null
python3 "$HERE/fix_permissions.py" "$WORK/dec" "$NEW_PKG" > /dev/null

BUILT_APK="app/build/outputs/apk/debug/app-debug.apk"
if [ ! -f "$BUILT_APK" ]; then
    echo "ERRO: $BUILT_APK não existe — rode 'gradle assembleDebug' antes (mapeamento de IDs)"
    exit 1
fi

echo "[3/6] rebase de IDs de recurso no bytecode"
python3 "$HERE/tools/rebase_ids.py" "$WORK/dec" "$APK" "$(pwd)/$BUILT_APK" "$AAPT" "$AAPT2"

echo "[4/6] rebuild (apktool monta os dexes)"
java -jar "$APKTOOL" b "$WORK/dec" --use-aapt1 -o "$WORK/base.apk" > /dev/null 2>&1

echo "[5/6] extrai dexes"
(cd "$WORK" && unzip -o -q base.apk classes.dex classes2.dex)

echo "[6/6] dex -> jar"
D2J_MAIN=com.googlecode.dex2jar.tools.Dex2jarCmd
CP=$(ls "$D2J_DIR"/lib/*.jar | tr '\n' ':')
java -Xmx2g -cp "$CP" "$D2J_MAIN" -f "$WORK/classes.dex" -o "$WORK/code1.jar" > /dev/null
java -Xmx2g -cp "$CP" "$D2J_MAIN" -f "$WORK/classes2.dex" -o "$WORK/code2.jar" > /dev/null

cp "$WORK/code1.jar" app/libs/app-code-1.jar
cp "$WORK/code2.jar" app/libs/app-code-2.jar
echo "OK: app/libs/app-code-1.jar / app-code-2.jar atualizados"
