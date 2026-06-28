TST-E1: Projektaufgabe Testen

Repository zur Einsendeaufgabe TST-E1.

Sprache: Java
Build-Tool: Maven
Testframeworks: JUnit 5 und Mockito 

Tests ausführen:
mvn test

A1 Unit-Tests für eigenen Code

Für A1 wurde ein einfacher Taschenrechner in der Klasse Calculator umgesetzt.

Getestet wurden die Addition zweier Zahlen, die Division zweier Zahlen und eine Exception bei Division durch null. Der Exception-Test befindet sich in CalculatorTest und prüft mit assertThrows, dass bei einer Division durch null eine IllegalArgumentException ausgelöst wird.



A2 TDD – Shopping Cart

Für A2 wurde ein einfacher Warenkorb im TDD-Stil entwickelt. Die Entwicklung wurde nicht nur als fertiger Endzustand umgesetzt, sondern in der Git-History in einzelnen Schritten dokumentiert. Dabei wurde pro Feature nach dem Prinzip red → green → refactor gearbeitet.

Als erstes Feature wurde das Hinzufügen eines Artikels umgesetzt. Zuerst wurde ein Test geschrieben, der fehlschlug, weil die Klasse ShoppingCart noch nicht vorhanden war. Danach wurde eine einfache Implementierung ergänzt, sodass der Test erfolgreich durchlief. Anschließend wurde der Code refaktoriert, indem mit CartItem eine eigene Klasse für Warenkorbpositionen eingeführt wurde.

Als zweites Feature wurde die Berechnung des Gesamtpreises umgesetzt. Auch hier wurde zuerst ein Test geschrieben, der zunächst fehlschlug, weil die Methode getTotalPrice() noch fehlte. Danach wurde die Berechnung des Gesamtpreises implementiert. Im Refactoring-Schritt wurde die Berechnung von einer Schleife auf eine Stream-basierte Lösung umgestellt, ohne das Verhalten des Programms zu ändern.

Die relevanten Dateien für A2 sind ShoppingCart.java, CartItem.java und ShoppingCartTest.java. 

Die red-green-refactor-Schritte sind in der Git-History über die Commits mit dem Präfix A2 sichtbar.

A3 Mocking

Für A3 wurde ein externer Versandkostenservice gemockt. Die Klasse CheckoutService verwendet dafür das Interface ShippingCostClient. Die Methode getShippingCost() steht stellvertretend für eine externe Versandkosten-API.

Diese Methode wurde gemockt, weil eine echte Versandkostenabfrage in einem Unit-Test ungeeignet wäre. Sie wäre abhängig von einer Netzwerkverbindung, der Verfügbarkeit eines externen Dienstes und möglicherweise wechselnden externen Daten. Durch den Mock bleibt der Test schnell, reproduzierbar und unabhängig von externen Systemen.

Im Test CheckoutServiceTest wird mit Mockito ein Mock von ShippingCostClient erzeugt. Für einen Warenkorbwert von 3,00 Euro wird als Versandkostenwert 4,99 Euro zurückgegeben. Anschließend wird geprüft, ob der berechnete Endpreis 7,99 Euro beträgt und ob die Methode getShippingCost(3.00) tatsächlich aufgerufen wurde.

Die relevanten Dateien für A3 sind ShippingCostClient.java, CheckoutService.java und CheckoutServiceTest.java. 

Mock-Durchlauf

Der Mocking-Test wurde mit dem Befehl mvn test ausgeführt. Dabei wurde auch CheckoutServiceTest erfolgreich ausgeführt. Der Test prüft, dass der gemockte ShippingCostClient für einen Warenkorbwert von 3,00 Euro Versandkosten von 4,99 Euro zurückgibt und dass getShippingCost(3.00) tatsächlich aufgerufen wurde.

Ergebnis des Maven-Testlaufs:

Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS

AI-Nutzung

Für die Aufgabe wurde ChatGPT unterstützend verwendet. Ich habe mir von der AI Codebeispiele für die Java-Klassen und die passenden JUnit-Tests geben lassen. Diese Beispiele habe ich anschließend in mein Maven-Projekt übernommen, angepasst und mit mvn test überprüft.

Für A3 habe ich zusätzlich nach möglichen Ideen für einen sinnvollen Mocking-Anwendungsfall gefragt. Aus den Vorschlägen habe ich den externen Versandkostenservice ausgewählt, weil sich eine solche Abhängigkeit gut als unangenehme Methode erklären lässt.

Bei der Umsetzung musste ich einzelne Punkte selbst korrigieren, zum Beispiel die richtige Ordnerstruktur für Testdateien unter src/test/java und die korrekte Einbindung von Mockito in der pom.xml.

Mock-Durchlauf

Der Mocking-Test wurde mit mvn test ausgeführt. Dabei wurde CheckoutServiceTest erfolgreich ausgeführt. Der Test prüft, dass der gemockte ShippingCostClient für einen Warenkorbwert von 3,00 Euro Versandkosten von 4,99 Euro zurückgibt und dass getShippingCost(3.00) tatsächlich aufgerufen wurde.

Der Maven-Testlauf war erfolgreich.
