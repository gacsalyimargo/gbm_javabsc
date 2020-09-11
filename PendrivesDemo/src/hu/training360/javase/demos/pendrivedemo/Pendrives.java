package hu.training360.javase.demos.pendrivedemo;

import java.util.List;

public class Pendrives {
    private List<Pendrive> pendriveList;

    public Pendrives(List<Pendrive> pendriveList) {
        this.pendriveList = pendriveList;
    }

    public  Pendrive  best  (List<Pendrive> pendriveList){

        Pendrive item  = pendriveList.get(0);

        Pendrive pd;
        for (int i=1 ; i< pendriveList.size(); i++) {
            pd = pendriveList.get(i);
            if (pd.comparePricePerCapaccity(item) == 1 )
                 item=pd;
        }

        return item;

    }

}
