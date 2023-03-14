package com.itwang.stringTest;

public class UserOperation {
    private User user;

    public UserOperation() {
    }

    public UserOperation(User user) {
        this.user = user;
    }

    public boolean login(String name,String password){
        User user = new User();
        user.setId(1);
        user.setName("wang");
        user.setPassword("123456");
        if (user.getName().equals(name)){
            if (user.getPassword().equals(password)){
                return true;
            }else {
                System.out.println("密码错误，请核查");
                System.out.println("----------------");
            }
        }else {
            System.out.println("用户名错误，请检查");
            System.out.println("-------------------");
        }
        return false;
    }
}
