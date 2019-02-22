
package konversi;
/**
 * 
 * @author Firsta
 */
public class FungsiBiner {
    /**
     * This method is used to process the conversion from a decimal base to a binary base
     * @param nilai where parameter n uses an integer data type
     * @return variable temp,where the temp variable is used to display the results of a decimal to biner conversion
     */
    public static String Biner(int nilai) {
        String result = "";
        while (nilai >= 1) 
        {
            if (nilai % 2 == 0) {
                result="0"+result; 
            }
            else result="1"+result;
            nilai/=2;
        }
        return result;
    }
    
    /**
     * This method is used to process the conversion from a decimal base to a oktal base
     * @param nilai where parameter n uses an integer data type
     * @return variable temp,where the temp variable is used to display the results of a decimal to oktal conversion 
     */
    public static String Oktal(int nilai) 
    {
        String temp = "";
        while (nilai >= 1) {
            temp=String.valueOf(nilai % 8) + temp;
            nilai/=8;
        }
        return temp;
    }
    
    /**
     * This method is used to process the conversion from a decimal base to a hexa base
     * @param nilai uses an integer data type
     * @return variable temp,where the temp variable is used to display the results of a decimal to hexadecimal conversion
     */
    public static String Hexa(int nilai)
    {
        String temp ="";
        String[] daftarHexa={"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        while (nilai >=1){
           temp = daftarHexa[nilai%16]+temp;
           nilai /=16;
        }
        return temp;
     }
    
    /**
     * This method is used to process the conversion from hexadecimal base to decimal base, 
       where in this method it uses an hexadecimal array which contains the value on the base. 
     * @param nilai uses an string data type
     * @return variable result,where the result variable is used to display the results of a hexadecial to decimal conversion  
     */
    public static int hexToDec(String nilai){
        String[] daftarHexa={"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        String[] value= nilai.split(""); 
        int result=0, count=value.length-1;
        for (int i=0;i<value.length;i++) 
        {
            for (int j = 0; j<daftarHexa.length; j++) 
            {
                if (value[i].equals(daftarHexa[j])) 
                    result+=perkalian(j,pemangkatan(16,count));
                
            }
            count --;
        }
            return result;
    } 
    
    /**
     * This method is used to process the conversion from a binary base to a decimal base
     * @param nilai uses an string data type
     * @return variable result,where the result variable is used to display the results of a binary to decimal conversion  
     */
    public static int binToDec(String nilai){
        String[] value= nilai.split("");
        int result=0,count=value.length-1;
        for(int i=0;i<value.length;i++)
            {
                result+=perkalian(Integer.parseInt(value[i]),pemangkatan(2,count));
                count --;
            }
          
            return result;
    }
    
    /**
     * This method is used to process the conversion from oktal base to decimal base, 
       where in this method it uses an octal array which contains the value on the base. 
     * @param nilai uses an string data type
     * @return variable result,where the result variable is used to display the results of a oktal to decimal conversion  
     */
    public static int oktalToDec(String nilai){
        String[] Oktal={"0","1","2","3","4","5","6","7"};
        String[] value= nilai.split(""); 
        int result=0, count=value.length-1;
        for (int i=0;i<value.length;i++) 
        {
            for (int j = 0; j<Oktal.length; j++) 
            {
                if (value[i].equals(Oktal[j])) 
                    result+=perkalian(j,pemangkatan(8,count));         
            }
            count --;
        }
            return result;
    } 
    
    
    public static double perkalian(double i1, double i2) {
        double result=0;
        for (int i = 0; i < Math.abs(i2); i++) result+=i1;
        if (i2<0) return -result;
        return result;	
    }
    
    public static double pemangkatan(double i1,double i2){
        if (i2<0){
            return 1/(pemangkatan(i1,Math.abs(i2)));
        }
        if(i2==0)return 1;
        else return perkalian(i1, pemangkatan(i1,i2-1));
    }

}
