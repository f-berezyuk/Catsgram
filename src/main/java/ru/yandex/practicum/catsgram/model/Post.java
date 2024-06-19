package ru.yandex.practicum.catsgram.model;

import java.time.Instant;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder(toBuilder = true)
@EqualsAndHashCode(of = "id")
public class Post {
    Long id;
    long authorId;
    String description;
    Instant postDate;
}

