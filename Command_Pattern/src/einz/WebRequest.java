package einz;

public class WebRequest {
    void getRequest(String url){
        System.out.println("GET: "+ url);
    }
    void postRequest(String url, String param){
        System.out.println("POST: "+url+" - " + param);
    }
}
