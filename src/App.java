public class App {
    public static void main(String[] args){
        /*
         * OPERATORI DI COMPARAZIONE -> risultato atteso True || False (boolean)
         * 
         * < MINORE
         * 
         * > MAGGIORE
         * 
         * <= MINORE UGUALE
         * 
         * >= MAGGIORE UGUALE
         * 
         * == UGUALE (il singolo = corrisponde ad assegnazione)
         * 
         * != DIVERSO (negazione dell'uguaglianza)
         * 
         */

        boolean x = 3 < 10; //essendo comparazioni, sono SEMPRE variabili di tipo BOOLEAN
        boolean y = 5 <= 5;
        boolean z = 2 > 8;
        boolean w = 3 >= 3;
        boolean k = 2 == 4;
        boolean j = 6 != 7;
        System.out.println("x: " + x + " y: " + y + " z: " + z + " w: " + w + " k: " + k + " j: " + j);





        /*
         * OPERTATORI LOGICI -> risultato atteso True || False (boolean)
         * 
         * AND -> &&
         * 
         * OR -> ||
         * 
         * NOT -> !
         * 
         */

        //confronto 2 condizioni con l'operatore AND -> se una delle due condizioni è false e l'altra true, il risultato sarà false
                   //false       true
        boolean a = (3 > 5) && (8 % 2 == 0);
        System.out.println("Condizione AND: " + a); //false

        //confronto 2 condizioni con l'operatore OR -> se una delle due condizioni è true e l'altra false, il risultato sarà true
                   //false       true
        boolean b = (3 > 5) || (8 % 2 == 0);
        System.out.println("Condizione OR: " + b); //true

        //confronto 2 condizioni con l'operatore NOT -> nega l'esito atteso, quindi se è false diventa true; se è true diventa false
                //  !   false       true  -> !(true)  [NOT(true)]
        boolean c = ! ((3 > 5) || (8 % 2 == 0));
        System.out.println("Condizione NOT: " + c); //false



        /*
         * CONDIZIONI CON if
         * 
         * if
         * else
         * else if
         * if annidati
         * operatore ternario
         * 
         */

         //salvo in una variabile la condizione di partenza
         boolean isOnLine = true;

         //SE isOnLine è vera
            //ALLORA stampa il messaggio
         if(isOnLine){
            System.out.println("è online"); //NON viene stampato nulla, perchè la condizione iniziale della variabile è FALSE
         }

         //SE isOnLine NON è vera
            //ALLORA stampa il messaggio
         if(!isOnLine){
            System.out.println("non è online"); //VERRA' stampato il messaggio, perché la condizione iniziale false è negata dall'operatore NOT
         }

         //SE isOnLine è vera
            //ALLORA stampa: è online
         //ALTRIMENTI stampa: non è online
         if(isOnLine){
            System.out.println("è online"); 
         } else {
            System.out.println("non è online");
         }
        

        //definisco il valore per il controllo
        String name = "Marco";

        /* CONTROLLO CON IF-ELSE */
        if(name == "Luca"){
            System.out.println("Luca è online");
        } else {
            System.out.println("Luca è offline, ma " + name + " è online");
        }

        /* CONTROLLO CON IF-ELSE IF-ELSE */
        if(name == "Luca"){
            System.out.println("Luca è online");

        } else if(name == "Gianni") {
            System.out.println("Gianni è online");

        }else{
            System.out.println(name + " è online");
        }


        //definisco il valore per il controllo (if annidati)
        int num = 5;

        /* CONTROLLO CON IF ANNIDATI */
        if(num < 10){
            System.out.println(num + " è minore di 10");

            if(num % 2 == 0){
                System.out.println(num + " è pari");

            } else{
                System.out.println(num + " è dispari");
            }

        } else {
            System.out.println(num + " non è minore di 10");
        }


        /* OPERATORE TERNARIO */
        //definisco il tipo di dato atteso (String)
        //pongo la condizione da controllare (2 > 5)
        //definsico gli esiti
        // SE 2 > 5
            // ALLORA (?) "ciao"
        // ALTRIMENTI (:) "buongiorno"
        String greet = 2 > 5 ? "ciao" : "buongiorno";
        System.out.println(greet);

        boolean compare = 2 < 4 ? true : false;
        System.out.println("La condizione è: " + compare);



        /* SWITCH - CASE - BREAK - DEFAULT */

        /* 
        switch(condizione){
            (case) in caso fosse così:
            esegui questo;
            (break) interrompi;

            (case) in caso sia così:
            esegui quest'altro;
            (break) interrompi;
             -- se non è nessuna delle precedenti --
            default:
            esegui questo
        }
        */

        boolean isOdd = 5 % 2 == 0;

        switch(isOdd){
            case true:
                System.out.println("è pari");
            break;

            case false:
                System.out.println(isOdd + ", è dispari");
            break;
        }

        String surname = "Pasticcio";

        switch(surname){
            case "Mastronardi":
                System.out.println("Salve Mastronardi");
            break;

            case "Zingarolli":
                System.out.println("Salve Zingarolli");
            break;

            default: //nel caso in cui i controlli precedenti non dovessero andare a buon fine, allora stampa...
                System.out.println("default: Salve " + surname);
        }

    }
}
