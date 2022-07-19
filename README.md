# ProgettoBaseDati

Il DBMS che abbiamo utilizzato è PostgreSQL, versione 14, che è anche quello che abbiamo imparato ad utilizzare a lezione.

# Strumenti Aggiuntivi

Per assistere nella progettazione fisica, sono stati usati due strumenti per la manipolazione di database Postgres:

  - pgAdmin 4

# Riproduzione del Database

Lo si può riprodurre in due modi: 
  - in modo manuale, seguendo il file DB_manuale.txt
  - oppure in modo automatico

Per realizzare quest'ultimo basta andare su pgAdmin -> Tools -> Restore, selezionare nella riga Filename il file fornito "SquadraBasket", come Format lasciare "Custom or tar", infine nella sezione Options abilitare "Include CREATE DATABASE statement".

Nel file DB_manuale è presente il codice SQL per la creazione delle varie tabelle, delle funzioni/procedure e relativi triggers e quello per effettuare gli inserimenti.

# Query

Per eseguire le varie query, bisogna copiare il codice SQL nel file Query, è presente anche una cartella che contiene i risultati delle query eseguite nel database, come immagine, nominate col numero di query presente nei commenti del file Query.

# Operazioni di manipolazione dati

Per eseguire le operazioni di update or delete, basta copiare il codice SQL nel file DML.

# Altro

E' presente il file Creade_DB in cui è presente il codice SQL per la creazione del database e i relativi parametri, utilizzabile in caso di creazione del database da Prompt dei comandi.
