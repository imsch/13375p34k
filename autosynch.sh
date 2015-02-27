#/bin/bash
#einmal ausführen zum Pushen des Javaprojektordners

read -p "Versionsnummer: " vers
	mkdir ./Leet_$vers
	cp ./Leet/* -r ./Leet:$vers/
	git add ./*
	git commit -m "Aktualisierung"
	git push -u origin master
