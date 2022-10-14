public class Main {
    public static void main(String[] args) {
      Mashina mashin1 = new Mashina();
      mashin1.name="BMW";
      mashin1.age=1996;
      mashin1.color="black";
      mashin1.weight=30000;
        System.out.println("Name:"+mashin1.name+" age:"+mashin1.age+" color:"+mashin1.color+" weight:"+mashin1.weight);
        mashin1.jyryy();

        Mashina mashina2=new Mashina();
        mashina2.name="Mersedes";
        mashina2.age=2001;
        mashina2.color="blue";
        mashina2.weight=2000.5;
        System.out.println("Name:"+mashina2.name+" age:"+mashina2.age+" color:"+mashina2.color+" weight:"+mashina2.weight);

        Mashina mashina3=new Mashina();
        mashina3.name="Honda";
        mashina3.age=1999;
        mashina3.color="Sary";
        mashina3.weight=2223.5;
        System.out.println("Name:"+mashina3.name+" age:"+mashina3.age+" color:"+mashina3.color+" weight:"+mashina3.weight);

    }
}