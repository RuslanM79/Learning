package uamrv.prj;
/*
Вычислить среднее значение трех вещественных чисел передаваемых на вход программы в качестве аргументов.
Для преобразования из String в double используйте метод Double.parseDouble(String s).
 */
public class AvarageOfThree {

    public Double getAvarage (String d1, String d2, String d3){
        double avarage;
        avarage=(Double.parseDouble(d1)+Double.parseDouble(d2)+Double.parseDouble(d3))/3;
        return avarage;
    }
    public static void main(String[] args){
        AvarageOfThree avarageOfThree = new AvarageOfThree();
        System.out.println(avarageOfThree.getAvarage("10", "12", "15"));
    }
}
