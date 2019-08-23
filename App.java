
package center;

public class App {

    public static void main(String[] args) {    
        String str1 = "";
        long sum = 0;
        int count = 0;
        System.out.println("program that converts binary numbers into decimal numbers:");
        System.out.println("the following number in binary is 11011110101110111010111110010101");
        str1 = "11011110101110111010111110010101";
       
        for(int i = 0; i< str1.length(); i++){
          char c =   str1.charAt(i);
          int num = Character.getNumericValue(c);
         
          
          sum = sum + num * (long)(Math.pow(2,(str1.length()-1)-i));
         count++;
        }
        System.out.println(sum + " in decimal");
        System.out.println(count + " bits");
        System.out.println("the following program  converts decimal numbers into binary numbers:");
        System.out.println("converting 245367 into binary:");
        long num2;
        long num3;
        long num4 = 245367;
        count = 0;
        String str2 ="";
        do{
            count++;
            num2 =num4/2;
             num3 =num4%2;
             num4 = num4/2;
             str2 = str2 + num3;
        }while(num4 != 0);
        
       //reversing it to get the binary number
       String reversed = "";
       for (int i = str2.length()-1; i >= 0; i--){
          char c =  str2.charAt(i);
          reversed += c;
       }
       System.out.println(reversed);
         System.out.println(count + " bits");
    }
    
}
