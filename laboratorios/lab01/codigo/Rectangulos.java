package rectangulos;
/** La clase Rectangulos tiene la intencion de calcular la cantidad de rectangulos
*   de 1*2 son ncesarios para llenar un contenedor de 2*n
*/
public class Rectangulos {
   
    public static int Tablero(int n){
        if(n<=2){  //c1
            return n; //c2
        }
        else{
            return Tablero(n-1) + Tablero(n-2); // C3 + T(n-1) + T(n-2)
            
        }
    
    }
    public static void main(String[] args) {
        for(int i = 30; i <= 50;i++){
            long start = System.currentTimeMillis();
            System.out.println(Tablero(i));
           long end = System.currentTimeMillis();
           System.out.println(end-start);
        }
    }
    
}
