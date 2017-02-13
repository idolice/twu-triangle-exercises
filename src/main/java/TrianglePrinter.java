/**
 * Created by bingwang on 2/13/17.
 */
public class TrianglePrinter {
    public void print(int number){
        String temp = "";
        for(int i =0;i<number;i++){
            temp+="*";
            System.out.print(temp+"\n");
        }
    }
}
