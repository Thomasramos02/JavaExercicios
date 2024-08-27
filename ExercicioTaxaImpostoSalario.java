public class ExercicioTaxaImpostoSalario {
    public static void main(String[] args) {
        // TAXA USADA DA HOLANDA
        int salario = 600000; //euro por Ano
        double imposto;

        if(salario > 0 && salario <= 34000){
            System.out.println("voce paga 9,70% de imposto");
            imposto = 9.70;
            System.out.println("voce vai pagar "+ salario * imposto /100+" de imposto");
        } else if (salario > 34000 && salario <= 68000) {
            System.out.println("voce paga 37,55% de imposto");
            imposto = 37.5;
            System.out.println("voce vai pagar "+ imposto * salario/100+" de imposto");
        }else {
            System.out.println("voce paga 49,00% de imposto");
            imposto = 49.0;
            System.out.println("voce paga "+imposto*salario/100+" de imposto");
        }
    }
}
