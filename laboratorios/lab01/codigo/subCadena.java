package rectangulos;

public class subCadena
{
        public static void main(String[] args) {
        String a = "lllaasnifrvirevpabjcncncncdña";
        String b = "laskjvalfjkbvlfvjaufhojdjdjdjdjcnncnc";
        subCadena cad = new subCadena();
        System.out.println(cad.Sub(a,b,a.length(),b.length()));
        System.out.println(cad.Sub2(a,b));
    }
    public int Sub(String a, String b, int m, int n){
        if(m==0 || n==0) return 0;
        else if(a.charAt(m-1) == b.charAt(n-1))
            return 1 + Sub(a,b, m-1, n-1);
        else return Math.max(Sub(a,b, m-1, n), Sub(a,b, m, n-1));
    }
    public int Sub2(String a, String b){
        int Cadena[][] = new int[a.length()+1][b.length()+1];
        for(int i=0;i<=a.length();i++){
            for(int j=0;j<=b.length();j++){
                if(i==0 || j== 0) Cadena[i][j] = 0;
                else if(a.charAt(i-1) == b.charAt(j-1))
                    Cadena[i][j] = 1 + Cadena[i-1][j-1]; 
                else Cadena[i][j] = Math.max(Cadena[i-1][j], Cadena[i][j-1]);
  }
        }
        return Cadena[a.length()][b.length()];
    }
    }
