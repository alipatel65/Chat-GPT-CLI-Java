package dev.Ali_Patel;

public record ChatGptResponseChoice(
        String text,
        int index,
        Object logprobs,
        String finish_reason
) {
}