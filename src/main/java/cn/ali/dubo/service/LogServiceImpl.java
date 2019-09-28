package cn.ali.dubo.service;

public class LogServiceImpl implements LogService{
    public String log(String msg) {
        System.out.println("log.................");
        return "log..."+msg;
    }
}
