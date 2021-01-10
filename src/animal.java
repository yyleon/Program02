public class animal {
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    private int age;
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void reportAge(int age){
        System.out.println("我的年龄是:"+age);
    }
}
