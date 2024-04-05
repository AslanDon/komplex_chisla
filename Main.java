import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Введите первое действительное число:");
         double deys_chislo1 = input.nextDouble();
         System.out.println("Введите второе действительное число:");
         double deys_chislo2 = input.nextDouble();
         System.out.println("Введите первую мнимую еденицу:");
         double mnimaya_edenica1 = input.nextDouble();
         System.out.println("Введите вторую мнимую единицу:");
         double mnimaya_edenica2 = input.nextDouble();
         System.out.println("Выберите что хотите сделать с комплексными числами 1.Сложение 2.Вычитание 3.Умножение 4.Деление");
         int kateqoriya = input.nextInt();
         if(kateqoriya == 1) slojeniye(deys_chislo1,deys_chislo2,mnimaya_edenica1,mnimaya_edenica2);
         if(kateqoriya == 2) vicitaniye(deys_chislo1,deys_chislo2,mnimaya_edenica1,mnimaya_edenica2);
         if(kateqoriya == 3) umnojeniye(deys_chislo1,deys_chislo2,mnimaya_edenica1,mnimaya_edenica2);
         if(kateqoriya == 4) deleniye(deys_chislo1,deys_chislo2,mnimaya_edenica1,mnimaya_edenica2);
    }

    static void slojeniye(double deys_chislo1, double deys_chislo2, double mnimaya_edenica1, double mnimaya_edenica2){
        double deys_chislo3 = deys_chislo1 + deys_chislo2;
        double mnimaya_edenica3 = mnimaya_edenica1 + mnimaya_edenica2;
        System.out.print((int)deys_chislo3 + " + " + (int)mnimaya_edenica3 + "i");
    }
    static void vicitaniye(double deys_chislo1, double deys_chislo2, double mnimaya_edenica1, double mnimaya_edenica2){
        double deys_chislo3 = deys_chislo1 - deys_chislo2;
        double mnimaya_edenica3 = mnimaya_edenica1 - mnimaya_edenica2;
        System.out.print((int)deys_chislo3 + " + " + (int)mnimaya_edenica3 + "i");
    }
    static void umnojeniye(double deys_chislo1, double deys_chislo2, double mnimaya_edenica1, double mnimaya_edenica2){
        double temp1 = deys_chislo1 * deys_chislo2;
        double temp2 = deys_chislo1 * mnimaya_edenica2;
        double temp3 = mnimaya_edenica1 * deys_chislo2;
        double temp4 = (mnimaya_edenica1 * mnimaya_edenica2);
        double deys_chislo3 = temp1 - temp4;
        double mnimaya_edenica3 = temp2 + temp3;
        System.out.println((int)deys_chislo3 + " + " + (int)mnimaya_edenica3 + "i");
    }
    static void deleniye(double deys_chislo1, double deys_chislo2, double mnimaya_edenica1, double mnimaya_edenica2){
        double temp1 = (deys_chislo1 * deys_chislo2) + (mnimaya_edenica1 * mnimaya_edenica2);
        double temp2 = (deys_chislo2 * deys_chislo2) + (mnimaya_edenica2 * mnimaya_edenica2);
        double temp3 = (mnimaya_edenica1 * deys_chislo2) - (deys_chislo1 * mnimaya_edenica2);
        double temp4 = (deys_chislo2 * deys_chislo2) + (mnimaya_edenica2 * mnimaya_edenica2);
        double resul_deys = temp1 / temp2;
        double result_mnim = temp3 / temp4;
        System.out.println(resul_deys + " + " + result_mnim + "i");
    }
}