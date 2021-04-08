package validacionN;

public class ValidacionN {
    
    public String validar(String textoAntiguo){
        String nuevoText = "";
        String ultimaletraEscrita = String.valueOf(textoAntiguo.charAt(textoAntiguo.length() - 1));

            if (ultimaletraEscrita.equals("ñ")) {
                nuevoText = textoAntiguo.replace("ñ", "n");
                return nuevoText;
            }else if(ultimaletraEscrita.equals("Ñ")){
                nuevoText = textoAntiguo.replace("Ñ", "N");
                return nuevoText;
            }else{
                return textoAntiguo;
            }
    }
    
}
