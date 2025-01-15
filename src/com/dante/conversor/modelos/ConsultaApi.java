package com.dante.conversor.modelos;
import com.dante.conversor.modelos.Data;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {

    public double ConexionApi(String entrada,String salida,double valor)
    {

        String direccion2="https://v6.exchangerate-api.com/v6/e218141e83b12ae464862777/pair/"+entrada+"/"+salida;
        URI direccion = URI.create(direccion2);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)

                    .create();
            Data data2=new Gson().fromJson(json,Data.class);
            return  valor*data2.conversion_rate();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        //Titulo miTitulo=gson.fromJson(json,Titulo.class);



        return 0;


    }
}
