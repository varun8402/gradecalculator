import java.util.*;
public class gradecalc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int n = sc.nextInt();
        int sum = 0;
        for(int i =1;i<=n;i++){
            System.out.println("Enter the marks for Subject" + i);
            sum += sc.nextInt(); 
        }
        float percentage = (float)sum / n;
        System.out.println("Percentage = " + percentage +"%");
        System.out.print("Grade = ");
        if(percentage >= 90){
            System.out.print("A");
        }
        else if(percentage >= 80){
            System.out.print("B");
        }
        else if(percentage >= 60){
            System.out.print("C");
        }
        else if(percentage >= 40){
            System.out.print("D");
        }
        else{
            System.out.print("E");
        }
        
    }
}
