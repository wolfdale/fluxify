package com.active.fluxify.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@Getter
@Setter
public class Transaction {
    @Id
    private Long id;

    private String transId;

    private String origin;

    private boolean isVerified;


}
