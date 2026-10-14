public class Main {
    public static void main(String[] args) {
      Medlem m1 = new Medlem("kim" , 1001);
      Medlem m2 = new Medlem("Moa" , 1002);

      System.out.println(m1.getNamn() +  " " + m1 .getMedlemsnummer());
      System.out.println(m2.getNamn()+ " " +  m2 .getMedlemsnummer());
    }
}
