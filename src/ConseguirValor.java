import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConseguirValor {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/0882418b9a87a4ba606617ed/pair/";

    public ValorMoneda buscarMoneda(String monedaBase, String monedaTarget) {
        URI direccion = URI.create(API_URL + monedaBase + "/" + monedaTarget);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                return new Gson().fromJson(response.body(), ValorMoneda.class);
            } else {
                throw new RuntimeException("No se pudo obtener la tasa de conversión. Código: " + response.statusCode());
            }
        } catch (Exception e) {
            throw new RuntimeException("Error al conectar con la API: " + e.getMessage());
        }
    }
}
