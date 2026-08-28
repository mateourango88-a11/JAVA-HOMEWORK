public class Nodo {
     
     int dato;
     Nodo siguiente;
     
     public Nodo (int dato) {
        this.dato = dato;
        this.siguiente = null;

     }

    public Nodo() {
    }
    
    public class Practica {

    public static void main(String[] args) {
        
        Nodo nodo1 = new Nodo(10);
        Nodo nodo2 = new Nodo(20);
        Nodo nodo3 = new Nodo(30);

        nodo1.siguiente = nodo2;
        nodo2.siguiente = nodo3;

        System.out.println("Tu nodo contiene: "+ nodo1.dato );
         System.out.println ("Tu nodo contiene: "+ nodo2.dato);
}
    

}

}