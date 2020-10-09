package main.chainOfResponsibility.test;

import main.chainOfResponsibility.HandlerA;
import main.chainOfResponsibility.HandlerB;
import main.chainOfResponsibility.HandlerChain;
import main.chainOfResponsibility.Message;
import org.junit.jupiter.api.Test;

class HandlerChainTest {
    @Test
    void test(){
        HandlerChain handlerA1 = new HandlerA(1);
        HandlerChain handlerB1 = new HandlerB(2);
        HandlerChain handlerA2 = new HandlerA(3);
        HandlerChain handlerB2 = new HandlerB(4);

        HandlerChain chain = handlerA1;
        chain.setNextHandler(handlerA2).setNextHandler(handlerB1).setNextHandler(handlerB2);

        Message message = new Message(2);
        chain.handle(message);
    }
}