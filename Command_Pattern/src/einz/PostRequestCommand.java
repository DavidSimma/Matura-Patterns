package einz;

public class PostRequestCommand implements Command{
    String url;
    String param;
    WebRequest obj;

    public PostRequestCommand(String url, String param, WebRequest obj) {
        this.url = url;
        this.param = param;
        this.obj = obj;
    }

    @Override
    public void execute() {
        obj.postRequest(url, param);
    }
}
