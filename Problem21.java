/*
Create a program that decodes messages. The messages will be encoded using a 
Caesar cypher, with each letter being decoded by replacing it with the previous 
letter in the alphabet. (Supposedly, this was invented by Julius Caesar.)
 */
public class Problem21 {
       public static void main(String[] args) {
        System.out.println(decodeMessage("J MPWF KBWB")); // I LOVE JAVA
        System.out.println(decodeMessage("ABCDEFGHIJKLMNOPQRSTUVWXYZ")); // ZABCDEFGHIJKLMNOPQRSTUVWXY
        System.out.println(decodeMessage("J HPU UP UIJT QPJOU PO NZ PXO!")); // I GOT TO THIS POINT ON MY OWN!
    }

    public static String decodeMessage(String phrase) {
        // Your code here
        int shift = -1;
        String plainText = "";
        char alphabet;
        char encodingAlphabet;
        for(int i=0; i < phrase.length();i++){
        
             
                alphabet = phrase.charAt(i);
                
                if (alphabet != ' '){
                
                
                    encodingAlphabet = Character.toUpperCase(alphabet);
            
            
            
            
                    if ((encodingAlphabet + shift) < 65){
                        alphabet = (char)(26 + (alphabet + shift));
            
            
                    }
                
                    else 
                    {
                        alphabet = (char)( alphabet + shift);
            
            
                    }

                
                    plainText = plainText+alphabet;
                }
                else{
                    alphabet = ' ';
                    plainText = plainText + alphabet;
                
                }
        }
        


        return plainText;
    }
    
}