Guida filecrypt

Il programma in questione permette di cifrare e decifrare qualsiasi tipo di file è utile in situazioni ,dove si vuole proteggere qualche file privato,può solo decifrare file da lui cifrati per avviare la cifratura e la decifratura del file bisogna selezionare il file dal pulsante FileIn ,poi bisogna selezionare il percorso del file di output tramite il pulsante FileOut.


Modalità di installazione 
Per compilare il programma avete bisogno della JVM 1.8 compreso di jdk inoltre bisogna avere installato Maven lo trovate al seguente indirizzo
https://maven.apache.org/ ,una volta installato il tutto dovete recarvi nella root del progetto da terminale FileCrypt/ e digitare il comando mvn clean compile assembly:single , verrà prodotta una cartella target dove saranno presenti dei jar eseguibili avviare jar with dependencies.
Per far partire l'eseguibile bisogna avere installato la Java Virtual Machine versione 1.8.Per avviare l'eseguibile da terminale digitare java -jar  nomeEseguibile.
