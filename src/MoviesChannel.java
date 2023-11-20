import java.util.ArrayList;

public class MoviesChannel extends TvChannel{
    MoviesChannel m1;
    MoviesChannel m2;
    MoviesChannel m3;
    MoviesChannel m4;
    MoviesChannel m5;
    MoviesChannel m6;

int additionalfee=14;
    public MoviesChannel(String channelName, String language, String category, int price) {
        super(channelName, language, category, price);
    }
    @Override
    public int getPrice() {
        return super.getPrice() + super.getPrice()*additionalfee;
    }


    private void DisplayMoviesChannel(){
         m1= new MoviesChannel("MBC bundle","EN","MOV",4);
         m2= new MoviesChannel("Cinema One","EN","MOV",5);
         m3= new MoviesChannel("CinemaPro","URDU","MOV",6);
         m4= new MoviesChannel("Cinema 1","AR","MOV",2);
        m5= new MoviesChannel("Movie Home","EN","MOV",4);
        m6= new MoviesChannel("Sony max","HINDI","MOV",2);
        ArrayList<MoviesChannel> movieList=new ArrayList<>();
        movieList.add(m1);
        movieList.add(m2);
        movieList.add(m3);
        movieList.add(m4);
        movieList.add(m5);
        movieList.add(m6);
        String movChannelString="";
        for(int i=0;i<movieList.size();i++){
            movChannelString+=
                    "    "+ movieList.get(i).getChannelName()
                            +"      "movieList.get(i).getLanguage()
                    +"      " movieList.get(i).getPrice()
                    +"\n";


    }


}
