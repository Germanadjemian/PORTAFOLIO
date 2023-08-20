public class Contador {
    public static void main(String[] args) {
    Contador cont= new Contador();
     cont.Contar(2,"hola mundo");
    }

    public int Contar(int caracteres, String frase)
    {
        int cont=0;
        char[] cadena=frase.toCharArray();
        for(char letra: cadena){
            if (Character.isLetter(letra)){
                cont++;
            }
        }

        return cont;
    }

}
