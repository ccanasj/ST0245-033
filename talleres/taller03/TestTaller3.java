
public class TestTaller3 {
	
	public static void ejercicio1(){
		System.out.println("Para 2 discos la secuencia debe quedar as�");
		System.out.println("Disco 1 de 1 a 2   \nDisco 2 de 1 a 3  \nDisco 1 de 2 a 3");
		TorresHanoi.TorresHanoi(2);


		System.out.println("Para 3 discos la secuencia debe quedar as�");
		System.out.println("Disco 1 de 1 a 3  \nDisco 2 de 1 a 2  \nDisco 1 de 3 a 2  \nDisco 3 de 1 a 3  \nDisco 1 de 2 a 1  \nDisco 2 de 2 a 3  \nDisco 1 de 1 a 3  \n");
		TorresHanoi.TorresHanoi(3);


		System.out.println("Para 4 discos la secuencia debe quedar as�");
		System.out.println("Disco 1 de 1 a 2  \nDisco 2 de 1 a 3  \nDisco 1 de 2 a 3  \nDisco 3 de 1 a 2  \nDisco 1 de 3 a 1  \nDisco 2 de 3 a 2  \nDisco 1 de 1 a 2  \nDisco 4 de 1 a 3  \nDisco 1 de 2 a 3  \nDisco 2 de 2 a 1  \nDisco 1 de 3 a 1  \nDisco 3 de 2 a 3  \nDisco 1 de 1 a 2  \nDisco 2 de 1 a 3  \nDisco 1 de 2 a 3  \n");
		TorresHanoi.TorresHanoi(4);

	}

	public static void ejercicio2(){
		System.out.println("Las permutaciones de la cadena 'abc' son:");
		System.out.println("abc, acb, bac, bca, cab, cba");
		System.out.println("");
		Ejercicio2.permutations("abc");

		System.out.println("Las permutaciones de la cadena 'Hola' son:");
		System.out.println("Hola, Hoal, Hloa, Hlao, Haol, Halo, oHla, oHal, olHa, olaH, oaHl, oalH, lHoa, lHao, loHa, loaH, laHo, laoH, aHol, aHlo, aoHl, aolH, alHo, aloH");
		System.out.println("");
		Ejercicio2.permutations("Hola");

		System.out.println("Las permutaciones de la cadena 'Dato' son:");
		System.out.println("Dato, Daot, Dtao, Dtoa, Doat, Dota, aDto, aDot, atDo, atoD, aoDt, aotD, tDao, tDoa, taDo, taoD, toDa, toaD, oDat, oDta, oaDt, oatD, otDa, otaD");
		System.out.println("");
		Ejercicio2.permutations("Dato");
	}
	
	
	public static void main(String[] args){	
        //Ejercicio1
		System.out.println("");
        System.out.println("Ejercicio 1");
        ejercicio1();
        
        //Ejercicio2
        System.out.println("");
        System.out.println("Ejercicio 2");
        ejercicio2();
   
    }
}