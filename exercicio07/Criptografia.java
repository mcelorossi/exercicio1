package exercicio07;

public class Criptografia {
    public static String codificaRot13(String palavra) 
    {
        String criptografadaPalavra = "";

        for(int i = 0; i < palavra.length(); i++) {
        char c = palavra.charAt(i);
        if       (c >= 'a' && c <= 'm') c += 13;
        else if  (c >= 'A' && c <= 'M') c += 13;
        else if  (c >= 'n' && c <= 'z') c -= 13;
        else if  (c >= 'N' && c <= 'Z') c -= 13;
        criptografadaPalavra += c;
        
        }
        return criptografadaPalavra;
    }

    public static String decodificaRot13(String palavra) {
        return codificaRot13(palavra);
    }

}
