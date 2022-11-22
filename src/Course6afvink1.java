import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Course6afvink1 {

    public static List<Integer> Nrlist;
        public static void main(String[] args){
            new Course6afvink1().NumberGen();
        }
        public void NumberGen(){
            int Minval = 1;
            int Maxval = 1000000000;
            Nrlist = new ArrayList<>();
            for (int x = 0; x < 1000000000; x++){
                int randInt = ThreadLocalRandom.current().nextInt(Minval, Maxval);
                Nrlist.add(randInt);
            }
            Nrlist = Course6afvink1.Sorter();
            System.out.println(Nrlist);
        }
        public static List<Integer> Sorter(){
            Collections.sort(Nrlist);
            return Nrlist;
        }

}


