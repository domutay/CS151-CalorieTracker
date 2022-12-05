package com.calorietracker.service;

import com.calorietracker.model.Food;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Service
public class FoodDataService {

    private List<Food> foods;
    private static String FDC_URL = "https://api.nal.usda.gov/fdc/v1/foods/search?api_key=XCUnqGieAd5LPyZck2xI19iC6eUTOOjxfTzmSKFe&query=kcal&dataType=Survey%20%28FNDDS%29&pageSize=5&pageNumber=2&sortBy=dataType.keyword&sortOrder=asc";
    private String api_key = "XCUnqGieAd5LPyZck2xI19iC6eUTOOjxfTzmSKFe";
    private String query = "pepperoni pizza";
    private String dataType = "Survey (FNDDS)";
    private String pageSize = "5";
    private String targetCalories;

    @PostConstruct
    private void fetchFoodData() throws IOException, InterruptedException {
        StringBuilder builder = new StringBuilder("https://api.nal.usda.gov/fdc/v1/foods/search");
        builder.append("?api_key=");
        builder.append(URLEncoder.encode(api_key,StandardCharsets.UTF_8.toString()));
        builder.append("&query=");
        builder.append(URLEncoder.encode(query,StandardCharsets.UTF_8.toString()));
        builder.append("&dataType=");
        builder.append(URLEncoder.encode(dataType,StandardCharsets.UTF_8.toString()));
        builder.append("&pageSize=");
        builder.append(URLEncoder.encode(pageSize,StandardCharsets.UTF_8.toString()));
        URI uri = URI.create(builder.toString());
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();
        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(httpResponse.body());
        for (int i=0; i<5; i++) {
            System.out.println(jsonNode.get("foods").get(i).get("description").asText());
            System.out.println(jsonNode.get("foods").get(i).get("foodNutrients").get(3).get("value").asText());
        }

    }

    public void setTargetCalories(String targetCalories) {
        this.targetCalories = targetCalories;
    }
}
