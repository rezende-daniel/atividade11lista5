//Data com mês por extenso. Construa uma função que receba uma data no formato DD/MM/AAAA e devolva uma string no formato D de mesPorExtenso de AAAA. 
//Opcionalmente, valide a data e retorne NULL caso a data seja inválida.



import java.util.Scanner;

public class atv11 {
    static void imprimedata(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira os dias:");
        int dias = entrada.nextInt();
        System.out.println("Insira o mês:");
        int mes = entrada.nextInt();
        System.out.println("Insira o ano:");
        int anos = entrada.nextInt();
        entrada.close();

        switch (mes){
            case 1:
            System.out.println(dias+" de janeiro de "+anos);
            break;
            case 2:
            System.out.println(dias+" de fevereiro de "+anos);
            break;
            case 3:
            System.out.println(dias+" de março de "+anos);
            break;
            case 4:
            System.out.println(dias+" de abril de "+anos);
            break;
            case 5:
            System.out.println(dias+" de maio de "+anos);
            break;
            case 6:
            System.out.println(dias+" de junho de "+anos);
            break;
            case 7:
            System.out.println(dias+" de julho de "+anos);
            break;
            case 8:
            System.out.println(dias+" de agosto de "+anos);
            break;
            case 9:
            System.out.println(dias+" de setembro de "+anos);
            break;
            case 10:
            System.out.println(dias+" de outubro de "+anos);
            break;
            case 11:
            System.out.println(dias+" de novembro de "+anos);
            break;
            case 12:
            System.out.println(dias+" de dezembro de "+anos);
            break;
            default:
            System.out.println("null");
            break;
        }}
    public static void main(String[] args) throws Exception {
        imprimedata();
        }




    }