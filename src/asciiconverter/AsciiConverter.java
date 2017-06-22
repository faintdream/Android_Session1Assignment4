package asciiconverter;

public class AsciiConverter {

    /* Program to convert int to ascii, we will simply typecase to get the answer
    
    */
     int input=65; // we begin with65 which also represents ascii 'A'
     char result;
    
     void convertToAscii(){ 
         //loop with run from 69 to 90 or we can say A to Z (26 times)
         while (input <= 90) 
         {
             result=(char)input; //typecasting integer to char             
             System.out.print(input+"-"+result+"\t"); // put a tab space
             if ( input%8 ==0) //everytime remainder is 0 put a next line using 
                System.out.println("");// println                 
             input++;             //increment input
         }
     }
     
     
    public static void main(String[] args) {
        AsciiConverter obj =new AsciiConverter();
        obj.convertToAscii();
    }

    
    
}
