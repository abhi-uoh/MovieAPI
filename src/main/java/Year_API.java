
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Scanner;
public class Year_API {
    public static void main(String[] args) throws IOException,InterruptedException {
        String url="https://api.themoviedb.org/3/discover/movie?api_key=dee9f0cf7cafd488c017d1db70a27c2c&year&=";

//        List response = restTemplate.getForObject("https://api.themoviedb.org/3/movie/550?api_key=dee9f0cf7cafd488c017d1db70a27c2c",List.class);

////        response.forEach(post->{
////            System.out.println(post);
////            System.out.println("");


        HttpRequest request;
        HttpClient client;
        HttpResponse response;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        String s = sc.next();
        url = url+s;
        request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        client = HttpClient.newBuilder().build();
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
