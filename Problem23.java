/*
Create a program that encodes messages. The messages will be encoded by using 
a shift that will be given to you. This shift number can be positive, negative,
or zero and has no size limit.
 */
public class Problem23 {
    public static void main(String[] args) {
    System.out.println(encodeMessage("I LOVE JAVA", 4)); // M PSZI NEZE
    System.out.println(encodeMessage("ZABCDEFGHIJKLM NOPQRSTUVWXY", -19)); // GHIJKLMNOPQRSTUVWXYZABCDEF
    System.out.println(encodeMessage("I GOT TO THIS POINT ON MY OWN!", 235)); // J HPU UP UIJT QPJOU PO NZ PXO!
    }

    public static String encodeMessage(String phrase, int shift) {
        // Your code here
        String ciphertext = "";
        char alphabet;
        char encodingAlphabet;
        if (shift > 0){
            shift = shift% 26;
            
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
        //}
        }
        else{
            
            for(int i=0; i < phrase.length();i++){
                
                alphabet = phrase.charAt(i);
                if (alphabet != ' '){
        
             
                //alphabet = phrase.charAt(i);
                encodingAlphabet = Character.toUpperCase(alphabet);
            
            
            
            
                if ((encodingAlphabet + shift) < 65){
                    alphabet = (char)(26 + (alphabet + shift));
            
            
                }
                
                else 
                {
                    alphabet = (char)( alphabet + shift);
            
            
                }

                
                ciphertext = ciphertext+alphabet;
                }
                else{
                    alphabet = ' ';
                    ciphertext = ciphertext + alphabet;
                }
            }
                
            return ciphertext;
                
            }
                
              
            }
            
           
            
            
        }
    
    


