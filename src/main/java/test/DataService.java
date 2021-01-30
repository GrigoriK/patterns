package test;

import lombok.Data;

@Data
public class DataService {

    public String getWorkOrException(boolean exOrWork, int seconds,int count) {
        try {
            for (int i=0;i<count;i++){
                if(i>7){
                    throw new IllegalArgumentException("Show exception");
                }
                if (exOrWork) {
                    throw new IllegalArgumentException("Show exception");
                } else {
                    System.out.println("Data service: I'm working count: "+count);

                }
                Thread.sleep(1000 * seconds);
            }

            return "I'm working";
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
    public class DataModel{
        private String data;
    }
}
