/*
Create a program that encodes messages. The messages will be encoded using a 
Caesar cypher, with each letter being encoded by replacing it with the next 
letter in the alphabet. (Supposedly, this was invented by Julius Caesar.)
 */
public class Problem22 {
        public static void main(String[] args) {
        System.out.println(encodeMessage("I LOVE JAVA")); // J MPWF KBWB
        System.out.println(encodeMessage("ZABCDEFGHIJKLMNOPQRSTUVWXY")); // ABCDEFGHIJKLMNOPQRSTUVWXYZ
        System.out.println(encodeMessage("I GOT TO THIS POINT ON MY OWN!")); // J HPU UP UIJT QPJOU PO NZ PXO!
    }

    public static String encodeMessage(String phrase) {
       // Your code here
        int shift = 1;
        String ciphertext = "";
        char alphabet;
        for(int i=0; i < phrase.length();i++){
        
             // Shift one character at a time
            alphabet = phrase.charAt(i);
            
            // if alphabet lies between a and z 
            if(alphabet >= 'a' && alphabet <= 'z') 
            {
             // shift alphabet
             alphabet = (char) (alphabet + shift);
             // if shift alphabet greater than 'z'
             if(alphabet > 'z') {
                // reshift to starting position 
                alphabet = (char) (alphabet+'a'-'z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            
            // if alphabet lies between 'A'and 'Z'
            else if(alphabet >= 'A' && alphabet <= 'Z') {
             // shift alphabet
             alphabet = (char) (alphabet + shift);    
                
             // if shift alphabet greater than 'Z'
             if(alphabet > 'Z') {
                 //reshift to starting position 
                 alphabet = (char) (alphabet+'A'-'Z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            else {
             ciphertext = ciphertext + alphabet;   
            }
        
        }
        return ciphertext;
        
        
        
        
        
    }
    
}
