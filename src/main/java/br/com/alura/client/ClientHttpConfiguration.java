package br.com.alura.client;

public class ClientHttpConfiguration {

    
      public HttpResponse<String> dispararRequisicaoGet(HttpClient client, String uri)
            throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        return client.send(request, HttpResponse.BodyHandlers.ofString());

    }

    public HttpResponse<String> dispararRequisicaoPost(HttpClient client, String uri, JsonObject json)
            throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .header("Content-Type", "application/json")
                .method("POST", HttpRequest.BodyPublishers.ofString(json.toString()))
                .build();

        return client.send(request, HttpResponse.BodyHandlers.ofString());

    }

}
