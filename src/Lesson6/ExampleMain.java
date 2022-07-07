package Lesson6;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ExampleMain {

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient()
                .newBuilder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .followRedirects(true)
                .retryOnConnectionFailure(true)
                .build();

        Request request = new Request.Builder()
                .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=OMS3WAreAINDATJSCHG2kkbWrNhQn7zX&language=en&details=false&metric=false")
                .build();

        Response response = client.newCall(request).execute();
        String body = response.body().string();
        System.out.println(body);
    }

}
