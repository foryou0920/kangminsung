package ex3;

/*
                회원번호 int
                회원이름 String
                몸무게 float
                동의여부 boolean
                이메일 String
        */

public class Info 
{
    private int num;
    private String name;
    private float weight;
    private boolean agree;
    private String mail;
    private int age;

    public int getAge() {
        if(age>20){
            System.out.println("미성년자 / [성인]");
        }
        else if(age>0){
            System.out.println("[미성년자] / 성인");
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isAgree() {
        return agree;
    }

    public void setAgree(boolean agree) {
        this.agree = agree;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
