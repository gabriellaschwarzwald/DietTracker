import java.util.Scanner;

public class Manager {

    public static void main(String[] args) {

        Diet Gabri = new Diet("Eat less cheese!");
        Diet Johnny = new Diet("Drink more milk!!");

    Scanner myVar;
    String selection = "0";

            while(!(selection.equals("4"))) {
                System.out.println("MAIN MENU: \n1. Add Record \n2. View Record \n3. View All Records \n4. Exit \nChoose one option: ");

                myVar = new Scanner(System.in);
                selection = myVar.nextLine();

                if (selection.equals("1")) {
                    System.out.println("FIRST ENTRY:\n Enter date:");
                    myVar = new Scanner(System.in);
                    String date = myVar.nextLine();

                    System.out.println("Enter weight:");
                    myVar = new Scanner(System.in);
                    int weight = myVar.nextInt();

                    Entry newEntry = new Entry(date, weight);
                    Gabri.EntryList.add(newEntry);
                }
                if (selection.equals("2")) {
                    System.out.println("Enter date of record:");
                    myVar = new Scanner(System.in);
                    String record = myVar.nextLine();
                    for (int i = 0; i < Gabri.EntryList.size(); i++)
                        if ((Gabri.EntryList.get(i).getDate()).equals(record))
                            System.out.println(Gabri.EntryList.get(i).getDate());
                        else {
                            System.out.println("No record found");
                            break;
                        }
                }
                if (selection.equals("3")) {
                    System.out.println("All Records: ");
                    for (Entry x : Gabri.EntryList) {
                        System.out.println("Record: " + x.toString() + " Net Difference: " + Gabri.CalcDifferential());
                    }
                    // Net Difference does not work
                    System.out.println("Net Weight: " + Gabri.CalcNetWeight());
                    System.out.println();
                }

            }



        /* Entry G1 = new Entry("Jan 1", 60);
        Entry G2 = new Entry("Jan 2", 62);
        Entry G3 = new Entry("Jan 3", 58);
        Gabri.EntryList.add(G1);
        Gabri.EntryList.add(G2);
        Gabri.EntryList.add(G3);

        System.out.println("Gabri's Diet Record:");
        Gabri.PrintList();
        System.out.println("Net Weight: " + Gabri.CalcNetWeight() + "\n" + Gabri.CalcDifferential());

        Gabri.getNote();

        Entry J1 = new Entry("Jan 1", 70);
        Entry J2 = new Entry("Jan 2", 71);
        Entry J3 = new Entry("Jan 3", 68);
        Johnny.EntryList.add(J1);
        Johnny.EntryList.add(J2);
        Johnny.EntryList.add(J3);

        System.out.println();
        System.out.println("Johnny's Diet Record: ");
        Johnny.PrintList();
        System.out.println("Net Weight: " + Johnny.CalcNetWeight() + "\n" + Johnny.CalcDifferential());
*/

    }
}
