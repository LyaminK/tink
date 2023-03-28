package backend;

public final class StackOverflowLink implements Links{
    public String getData(String URL){
        return URL.split("/")[4];
    }
}
