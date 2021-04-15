package util;
//classe criada para conter funções comuns entre todas as outras classes
public class Funcoes {

    public static Double removerCifraoDevolverDouble(String texto){
        texto = texto.replace("$", "");
        return Double.parseDouble(texto);
    }
}
