import java.util.Arrays;
import MyPrint;
public class HelloWorldApp{
	public static void main(String[] args) {
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		String answer = "";
        int[] index = new int[participant.length];
        Arrays.fill(index, 0);
        for (int i=0; i<completion.length; i++){
            for (int j=0; j<participant.length; j++){
                if (completion[i] == participant[j]){
                    index[j] = 1;
                    break;
                }                   
            }
        }
        
        for (int i=0; i<index.length; i++){
            if (index[i]==0){
                answer = participant[i];
                break;
            }
        }
        
        System.out.println(answer);
        MyPrint myprint = new MyPrint();
        myprint.printString(answer);
	}
}