public class Ejercicio2{ 

    private static void permutationsAux(String base, String s) {
        int n = s.length();
        if(n==0){
            System.out.println("\"" + base + "\"");
        }
        else {
            for(int i = 0;i < s.length();i++){
                permutationsAux(base + s.charAt(i),s.substring(0,i) + s.substring(i+1,n));
            }
        }
    }

    public static void permutations(String s) {
        permutationsAux("", s);
    }
}