package OOP1;

public class Main {
    public static void main(String[] args) {
        Children child = new Children("Никола", "Петров", 7, "Сын");
        System.out.println(child);
        System.out.println(child.mother());
        System.out.println(child.father());
        System.out.println(child.grandMother1());
        System.out.println(child.grandFather1());
        System.out.println(child.grandMother2());
        System.out.println(child.grandFather2());

    }
}