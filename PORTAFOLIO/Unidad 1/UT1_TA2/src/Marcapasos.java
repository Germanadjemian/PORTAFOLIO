public class Marcapasos
    {

        short presión_Sanguínea; //(0-250)
        short frecuencia_cardíaca; //(0-226)
       short azucar_sangre; //(0 - 1000).
    //Además, para autodiagnóstico mantiene un registro de:
        long maxima_fuerza; //3.000.000.000
        byte mínimo_tiempo;//0-100
        double batería;
        char[] codigo_del_Fabricante; //(Números y letras, máximo 8 caracteres).

        public short getPresión_Sanguínea() {
            return presión_Sanguínea;
        }

        public short getFrecuencia_cardíaca() {
            return frecuencia_cardíaca;
        }

        public short getAzucar_sangre() {
            return azucar_sangre;
        }

        public long getMaxima_fuerza() {
            return maxima_fuerza;
        }

        public byte getMínimo_tiempo() {
            return mínimo_tiempo;
        }

        public double getBatería() {
            return batería;
        }

        public char[] getCodigo_del_Fabricante() {
            return codigo_del_Fabricante;
        }
        /*
        public String getCodigoFabricante() {return new String(codigoFabricante).trim();} Esta QUIZAS SERIA OTRA POSIBLE MANERA PARA EL GETTER del codigoFabricante
         */

        public Marcapasos(short presión_Sanguínea, short frecuencia_cardíaca, short azucar_sangre, long maxima_fuerza, byte mínimo_tiempo, double batería, String codigo_del_Fabricante) {
            this.presión_Sanguínea = presión_Sanguínea;
            this.frecuencia_cardíaca = frecuencia_cardíaca;
            this.azucar_sangre = azucar_sangre;
            this.maxima_fuerza = maxima_fuerza;
            this.mínimo_tiempo = mínimo_tiempo;
            this.batería = batería;
            this.codigo_del_Fabricante = codigo_del_Fabricante.toCharArray();
        }
    }