public class Subscription {
    private int installationFee;//fixed fee 10$/TV
    private int nbTv; //number of TV
    private Subscriber subscriber;
    private SubscriptionCycle cycle;
    private String datee;
    //total fee
    private int totalFee;

    public Subscription( int nbTv, Subscriber subscriber, SubscriptionCycle cycle, String datee) {
        this.nbTv = nbTv;
        this.subscriber = subscriber;
        this.cycle = cycle;
        this.datee = datee;
        this.installationFee=nbTv*10;
    }

    public int getNbTv() {
        return nbTv;
    }

    public void setNbTv(int nbTv) {
        this.nbTv = nbTv;
    }

    public Subscriber getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    public SubscriptionCycle getCycle() {
        return cycle;
    }

    public void setCycle(SubscriptionCycle cycle) {
        this.cycle = cycle;
    }

    public String getDatee() {
        return datee;
    }

    public void setDatee(String datee) {
        this.datee = datee;
    }

    public int getTotalFee() {
        totalFee=installationFee+5;
        return totalFee;
    }

    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "installationFee=" + installationFee +
                ", nbTv=" + nbTv +
                ", subscriber=" + subscriber +
                ", cycle=" + cycle +
                ", datee='" + datee + '\'' +
                ", totalFee=" + totalFee +
                '}';
    }
}
