# SDE_Program

 Dit programma is gemaakt door Jay Groenendijk en Pieter Geschiere. 
 In dit programma kan je een winkel in om games te kopen, naar een ATM
 machine om geld te vragen en je hebt een allyway waar je geld kan geven aan 
 een zwerver.

 Pieter heeft de allyway, builder, ConsoleReader en de shop gemaakt.
 Jay heeft de ATM en de ConsoleReader gemaakt en geholpen aan de shop.
 Beide zijn bezig geweest met drie design patterns, 
 Jay: State, Singleton, Adapter.
 Pieter: Builder, Facade, Adapter.

 We hebben bij de ATM de pattern state toegevoegd, omdat een ATM machine
 verschillende fases heeft waarin je kan zitten. NoCard, HasCard, HasPin en NoCash.
 Op basis van deze states kan je dus verschillende functies gebruiken bijvoorbeeld insertCard(),
 dit leek ons een efficiente manier van code schrijven voor de ATM machine.

 De singleton hebben we toegevoegd bij de ATM machine, omdat er maar één instance van de
 ATM machine nodig is. We hebben hiervoor een functie toegevoegd aan de class ATM Machine
 getInstance() die checkt of er al een ATM machine instance is.

 De builder hebben we toegevoegd omdat we op die manier makkelijk alle games kunnen aanmaken.
 Omdat we de games op meerdere plekken nodig hadden hebben we nog een class gemaakt genaamd Gamelist.
 Dit deden wij omdat je op die manier de games kan aanroepen van een gezamenlijke plek in plaats van dat je ze elke keer opnieuw moet maken.
 
 De facade hebben we gemaakt bij de alleyway. 
 Dit hebben we gedaan zodat je kan checken hoeveel geld je hebt en om meteen te berekenen hoeveel geld je hebt nadat je geld geeft.
 
 De Adapter hebben we met console reader class, deze class verwerkt namelijk de input naar data
 die we gebruiken voor onze applicatie.