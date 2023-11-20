public class sportsChannels extends TvChannel{
int additionalfee=10; //10 percent additional fee
    public sportsChannels(String channelName, String language, String category, int price) {

        super(channelName, language, category, price);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + super.getPrice()*additionalfee;
    }
}
