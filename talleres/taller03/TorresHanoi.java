
public class TorresHanoi
{
    private static void TorresHanoi(int n, int Torre1, int Torre2, int Torre3){
        if(n==1){
            System.out.println("Mover la ficha de la torre " + Torre1 + " a la torre " + Torre3);

        }else{
            TorresHanoi(n-1,Torre1,Torre3,Torre2);
            TorresHanoi(1,Torre1,Torre2,Torre3);
            TorresHanoi(n-1,Torre2,Torre1,Torre3);

        }
    }

    public static void TorresHanoi(int n){
        TorresHanoi(n,1,2,3);
    }
}
