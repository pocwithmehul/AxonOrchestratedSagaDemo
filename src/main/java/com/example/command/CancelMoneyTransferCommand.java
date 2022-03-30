package com.example.command;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;
import org.springframework.stereotype.Component;

@Data
@Builder
public class CancelMoneyTransferCommand {
    @TargetAggregateIdentifier
    private String transferId;

}
