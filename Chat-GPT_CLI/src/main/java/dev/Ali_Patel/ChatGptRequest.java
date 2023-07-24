package dev.Ali_Patel;

public record ChatGptRequest(String model, String prompt, int temperature, int max_tokens) {

}
