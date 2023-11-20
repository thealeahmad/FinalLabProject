public class SubscriptionCycle {
    private String startDate;
    private String dueDate;

    public SubscriptionCycle(String startDate, String dueDate) {
        this.startDate = startDate;
        this.dueDate = dueDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "SubscriptionCycle{" +
                "startDate='" + startDate + '\'' +
                ", dueDate='" + dueDate + '\'' +
                '}';
    }
}
