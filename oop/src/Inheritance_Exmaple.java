public class Inheritance_Exmaple {
    public static void main(String[] args) {
        BirthDay b = new BirthDay();
        b.birthyear = 1996;
        b.nowYear = 2023;

        System.out.println(b.calculatAge());

        M m = new M();



    }
}

class BirthDay{


    int birthyear;
    int nowYear;
    int age;

     int calculatAge(){
        age =  nowYear - birthyear;
         return  age;
     }
}
class M extends BirthDay{


}