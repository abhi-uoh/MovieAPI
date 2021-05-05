package org.api;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
//API Key: 8c4c63a228db55743cff53868b3124af
/**
 * Hello world!
 *
 */
public class app {
    public static void main(String[] args) throws IOException, InterruptedException {
//        https://api.themoviedb.org/3/search/person?api_key=THE_KEY&language=en-US&query=Tom+Cruise
//        String url="https://api.themoviedb.org/3/search/movie?api_key=THE_KEY&language=en-US&query=Fight+Club"
//        String url= "https://api.themoviedb.org/3/movie/550?api_key=8c4c63a228db55743cff53868b3124af";
        //httprequest
/////////URL Creation
        String url1 = "https://api.themoviedb.org/3/search/movie?api_key=8c4c63a228db55743cff53868b3124af&language=en-US&query=";
        String url2 = "https://api.themoviedb.org/3/search/person?api_key=8c4c63a228db55743cff53868b3124af&language=en-US&query=";
//        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
//        HttpClient client = HttpClient.newBuilder().build();
//        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
//
//        System.out.println(response.statusCode());
//        System.out.println(response.body());
        HttpRequest request;
        HttpClient client;
        HttpResponse response;
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream.
        System.out.println("Enter Your choice");
        System.out.println("1 for Movie Name: ");
        System.out.println("2 for Actor Name: ");
        System.out.println("3 for Actress Name: ");
        System.out.println("Any other for exit");
        int n = sc.nextInt();
        String s;
        if (n == 1) {
            System.out.println("Enter movie name");
            s = sc.next();
            url1 = url1 + s;
            request = HttpRequest.newBuilder().GET().uri(URI.create(url1)).build();
            client = HttpClient.newBuilder().build();
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.statusCode());
            System.out.println(response.body());
        } else if (n == 2) {
            System.out.println("Enter Actor Name: ");
            s = sc.next();
            url2 = url2 + s;
            request = HttpRequest.newBuilder().GET().uri(URI.create(url2)).build();
            client = HttpClient.newBuilder().build();
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.statusCode());
            System.out.println(response.body());
        } else if (n == 3) {
            System.out.println("Enter Actress Name: ");
            s = sc.next();
            url2 = url2 + s;
            request = HttpRequest.newBuilder().GET().uri(URI.create(url2)).build();
            client = HttpClient.newBuilder().build();
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.statusCode());
            System.out.println(response.body());
        }
    }
}