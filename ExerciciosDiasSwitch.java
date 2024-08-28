public class ExerciciosDiasSwitch {
    public static void main(String[] args) {
        //Dados numero de 1 a 7, imprima se é dia util ou final de semana
        //considerando 1 como domingo
        //
        String diaUtil = "DIA UTIL TRABALHOOOOO";
        String fimDeSemana = "FIM DE SEMANAAAA";
        byte dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                System.out.println(fimDeSemana);
                break;
            case 2:
                System.out.println("Segunda");
                System.out.println(diaUtil);
                break;
            case 3:
                System.out.println("Terça");
                System.out.println(diaUtil);
                break;
            case 4:
                System.out.println("Quarta");
                System.out.println(diaUtil);
                break;
            case 5:
                System.out.println("Quinta");
                System.out.println(diaUtil);
                break;
            case 6:
                System.out.println("Sexta");
                System.out.println(fimDeSemana);
                break;
            case 7:
                System.out.println("Sabado");
                System.out.println(fimDeSemana);
                break;
            default:
                System.out.println("Opção invalida!!!");
        }
    }
}
