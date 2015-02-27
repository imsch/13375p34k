#!/bin/bash
#Script für automatischen upload zu github

	echo "Aktueller Pfad: "
	pwd
	echo "Vorhandene Dateien und Ordner"
	ls -a
read -p "welche Datei/Ordner soll gepusht werden: " datei
	git add $datei
	echo "Datei hinzugefügt"
read -p "Was wurde geändert: " aenderung
	git commit -m $aenderung
	echo "commit ausgeführt"
	echo "upload startet"
	git push -u origin master
	echo "Push beendet! Herzlichen Glückwunsch!"
