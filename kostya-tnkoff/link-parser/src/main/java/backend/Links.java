package backend;

public sealed interface Links permits GitHubLink, StackOverflowLink {
    public default String getData(String URL){
        return "null";
    }
}