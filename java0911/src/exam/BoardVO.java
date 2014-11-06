
package exam;

public class BoardVO {
    private String title , gender, auther, sentense, date;
    private boolean agree; 
    private String wether;
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getSentense() {
        return sentense;
    }

    public void setSentense(String sentense) {
        this.sentense = sentense;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String wether) {
        this.wether = wether;
    }

    public boolean isAgree() {
        return agree;
    }

    public void setAgree(boolean agree) {
        this.agree = agree;
    }

}
