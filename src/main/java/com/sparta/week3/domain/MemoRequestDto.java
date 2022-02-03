package com.sparta.week3.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemoRequestDto {
    private String username;
    private String title;
    private String contents;

}
