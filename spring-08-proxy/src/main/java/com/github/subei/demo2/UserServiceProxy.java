package com.github.subei.demo2;

public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        login("add");
        userService.add();
    }

    public void delete() {
        login("delete");
        userService.delete();
    }

    public void update() {
        login("update");
        userService.update();
    }

    public void query() {
        login("query");
        userService.query();
    }

    // 日志方法
    public void login(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
