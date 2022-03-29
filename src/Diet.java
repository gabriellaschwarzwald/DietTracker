import java.util.*;

public class Diet {

    String note;
    ArrayList<Entry> EntryList;
    int netWeight;

    public Diet(String n) {
        note = n;
        EntryList = new ArrayList<>();
        this.netWeight = 0;
    }
    public String getNote(){
        return this.note;
    }

    public void PrintList(){
    for (Entry x : EntryList)
        System.out.println(x.toString());
    }
    public int CalcNetWeight(){
        int size = EntryList.size() - 1;
        int lastWeight = EntryList.get(size).getWeight();
        int firstWeight = EntryList.get(0).getWeight();
       return (lastWeight - firstWeight);
    }

    public int CalcDifferential() {
        int diff = 0;
        for (int i = 0; i < EntryList.size() - 1; i++)
            diff =  EntryList.get(i + 1).getWeight() - EntryList.get(i).getWeight();
        return diff;
    }
}
