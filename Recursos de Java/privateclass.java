class Outer_Demo {
   int num;
   
   // clase interna o anidada no estatica
   private class Inner_Demo {
      public void print() {
         System.out.println("esto es una clase interna");
      }
   }
   
   // acceso a la clase interna desde un metodo de entrada
   void display_Inner() {
      Inner_Demo inner = new Inner_Demo();
      inner.print();
   }
}
   
public class My_class {

   public static void main(String args[]) {
      // instanciando la clase Outer
      Outer_Demo outer = new Outer_Demo();
      
      // Accediendo a display_Inner() metodo.
      outer.display_Inner();
   }
}
