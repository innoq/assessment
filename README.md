#Projekt PL

##Szenario
Der Abteilungsleiter Karl Klammer der Abteilung „X3KB“ der „SuperSecure AG“ hat vor geraumer Zeit bei dem externen Dienstleiter „Nearshore“ eine damals dringend benötigt Anwendung „PL“ in Auftrag gegeben.

Der externe Dienstleister „Nearshore“ schickte ihren Consultant Herrn Klaus zur Implementierung der Anwendung in Java. Herr Klaus machte sich ans Werk und implementierte die Anwendung unter vielen Überstunden am Stück einsam und alleine in einem extra bereit gestellten Büro.
 
Leider fand bei der „SuperSecure AG“ kurz nach Vollendung der Anwendung „PL“ eine Restrukturierungsmaßnahme statt. Dieser fiel die Abteilung „X3KB“ und Klaus Klammer zum Opfer. Der neue Abteilungsleiter möchte die Anwendung (da sie teuer war) aber gerne produktiv einsetzen.

Es gibt wohl keinerlei Dokumentation zu „PL“ und Herr Klaus ist nicht mehr erreichbar. Zur Rettung der Investition wird die innoQ mit der Begutachtung, Dokumentation und Wartung der Anwendung betraut.

Diese Aufgabe wird **DIR** als Consultant der innoQ übertragen!

##IST-Zustand
Bei deiner Ankunft bei der „SuperSecure AG“ wird dir der Code der Anwendung übergeben. Recht schnell wird dir klar das:

- es keine Dokumentation des Codes gibt
- der Code von sehr dürftiger Qualität ist
- der Code wohl funktionstüchtig ist aber nicht alle Anforderungen abdeckt
- der Code wohl nicht in allen Situationen das gewünschte Ergebnis liefern wird
- Herr Klaus ein Freund der Brute-Force Methode war.

Der Code besteht aus folgenden Klassen:

- Database
- Manager
- REPL
- DatabaseTest

und ist hier zu finden: https://gist.github.com/3859394

Der neue Abteilungsleiter der SuperSecure AG gibt dir noch eine Aufgabenbeschreibung mit auf den Weg und weißt dich eindringlich darauf hin das Security das A und O ist. **Deswegen ist es dir nicht erlaubt Klassen aus anderen Packages als java.lang und java.util zu benutzen**, da sie in der Firma als nicht sicher gelten.

##Aufgabenstellung
### Dokumentation
Erstelle eine kurze Dokumentation für die Anwendung „PL“. Die Dokumentation soll folgende Punkte umfassen:

- was leistet die Anwendung?
- welche Funktionen werden unterstützt?
- wie kann ein Endanwender sie bedienen?

Die Dokumentation soll kurz und knapp sein (maximal eine Seite) und extern vorliegen (z.B. Word aber keine JavaDoc).

###Analyse
Die Anwendung ist in einem schlechten Zustand. Erstelle eine Analyse der Design- und Code-Qualität. Die Analyse soll folgende Punkte umfassen:

- welche Randfälle werden von der Anwendung aktuell nicht korrekt behandelt?
- wie ist das aktuelle Design der Anwendung zu bewerten?
- welche Probleme gibt es im Code?
- wie können die Schwachstellen verbessert werden?

Konzentriere dich dabei auf die prägnantesten Probleme und begrenze den Umfang wiederum auf maximal eine Seite.

###Algorithmen
Die Klasse Database beinhaltet eine Datenstruktur und mehrere Brut-Force Algorithmen. Um die Performance zu verbessern sind hier cleverere Lösungen angebracht.
 
Beantworte folgende Fragen:

- welche Laufzeit besitzt aktuell die Methode **find** (O-Notation!)?
- wie kann diese Laufzeit verbessert werden ohne die in der Klasse verwendete Datenstruktur zu verändern (Speicher ist kein Problem!). Welche Laufzeit kann erreicht werden?
- welche Laufzeit besitzt aktuell die Methode **top** (O-Notation!)?
- wie kann diese Laufzeit verbessert werden (Speicher ist kein Problem!). Welche Laufzeit kann erreicht werden?

Es reicht wenn du deine Lösungen skizzierst und/oder mit Pseudocode verdeutlichst.

###Bonus: Weiterentwicklung
Die Methode **findSimilarNamedLanguages** scheint noch nicht implementiert worden zu sein. Sie besitzt allerdings eine JavaDoc und eine Reihe von Testfällen (s. DatabaseTest).

- Implementiere die Methode!
- Je schneller sie ist desto besser!
- Die Testfälle sollten funktionieren!

###Hilfmittel
- Google




#Viel Spass!
