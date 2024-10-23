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
    }
}
