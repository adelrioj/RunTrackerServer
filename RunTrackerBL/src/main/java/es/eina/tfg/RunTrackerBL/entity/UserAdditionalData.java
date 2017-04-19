package es.eina.tfg.RunTrackerBL.entity;

import com.liferay.portal.model.User;

public class UserAdditionalData {

    private User user;
    private int weight;
    private int height;
    private long smsCount;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public long getSmsCount() {
        return smsCount;
    }

    public void setSmsCount(long smsCount) {
        this.smsCount = smsCount;
    }

    @Override
    public String toString() {
        return "UserAdditionalData{" +
                "user=" + user.getUserId() +
                ", weight=" + weight +
                ", height=" + height +
                ", smsCount=" + smsCount +
                '}';
    }
}
