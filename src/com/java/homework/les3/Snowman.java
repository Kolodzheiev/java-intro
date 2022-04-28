package com.java.homework.les3;

public class Snowman {
    /*Дети слепили снеговика из 3х идеальной формы шаров снега. Шары получились радиусами 1м, 0.5м и 0.2м.
Учитывая, что коэффициент плотности снежных шаров равен 0.7кг/м3, найти сколько весит снеговик.
     */
    public static void main(String[] args) {
        double density = 0.7;
        double radius1 = 1;
        double radius2 = 0.5;
        double radius3 = 0.2;
        double smash1 = (double) 4 / 3 * Math.PI * Math.pow(radius1, 3);
        double smash2 = (double) 4 / 3 * Math.PI * Math.pow(radius2, 3);
        double smash3 = (double) 4 / 3 * Math.PI * Math.pow(radius3, 3);
        double weight1 = smash1 * density;
        double weight2 = smash2 * density;
        double weight3 = smash3 * density;
        double snowman = weight1 + weight2 + weight3;
        System.out.println("Сніговик важить " + snowman);


    }

}
