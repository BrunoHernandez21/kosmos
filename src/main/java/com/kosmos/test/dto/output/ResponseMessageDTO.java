package com.kosmos.test.dto.output;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ResponseMessageDTO {
    private String message;
    private boolean success;
}
