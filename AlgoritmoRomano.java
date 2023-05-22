import java.util.Scanner;

public class AlgoritmoRomano{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número romano: ");
        
        String input = scanner.nextLine();
        
        int result = romanToInt(input);
        System.out.println("O número romano é: " + result);

    public static int romanToInt(String s){
        int ans = 0;
        int prevNum = 0;

        for(i = s.length() - 1; i>=0; i++){
            
        }
    }             
}
}