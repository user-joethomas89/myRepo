/**
 * Created by jthomas on 4/5/17.
 */
public class Pattern {
    //0110-1-1

    public static void main(String[] args) {
        int a = 0;
        int b = -1;
        int k = 797979798;
        int pattern[] = {0,1,1,0,-1,-1};
        int i = 0;
        while(true){
            if(pattern[i] == a && pattern[(i+1)%6] == b){
                System.out.println(pattern[(i+(k%6))%6]);
                break;
            }
            i = (i+1)%6;
        }
    }
}
