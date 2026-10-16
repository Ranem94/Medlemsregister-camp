# Medlemsregister - Camp
Ett enkelt medlemsregister byggt med Java och Git workflow.
## Ett problem vi löste
Under arbetet krockade filen `src/Main.java` på samma rad med `System.out.println`.
Felet uppstod för att två grenar, `feature-valkomst-a` och `feature-valkomst-b`, ändrade exakt samma rad samtidigt utan att synka med main emellan. Det skapade en merge-konflikt som blockerade pull requesten med den röda spärren "This branch has conflicts".
Jag löste konflikten genom att öppna filen och läsa mellan markörerna `<<<<<<< HEAD` och `>>>>>>> main`, valde en kombinerad lösning `Välkommen till Klubbens Register! - Medlemsregister v1.0` och städade bort alla konfliktmarkörer manuellt.
Mergen avslutades genom att jag kontrollerade att koden kompilerade med `javac src/Main.java`, körde `git add src/Main.java`, sedan `git commit -m "fix: lös merge-konflikt"` och `git push`. Efter det blev pull requesten grön och kunde mergas till main.
## Teknisk skuld som städades
Klassen `MedlemKrasch` hade publika fält vilket tillät felaktiga värden som `nummer = -9999`. Jag byggde om den till `Medlem` med `private` fält, konstruktor som kräver både namn och nummer, samt getters för säker läsning.