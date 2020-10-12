package main.mediator.test;

import main.mediator.Role;
import main.mediator.RoleA;
import main.mediator.RoleB;
import main.mediator.RoleMediator;
import org.junit.jupiter.api.Test;

class MediatorTest {
    @Test
    public void test(){
        Role roleA = new RoleA();
        Role roleB = new RoleB();
        RoleMediator roleMediator = new RoleMediator();
        roleMediator.registerRole(roleA);
        roleMediator.registerRole(roleB);
        roleA.sendMessage("Message A");
        roleB.sendMessage("Message B");
    }
}