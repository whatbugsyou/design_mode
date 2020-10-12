package main.mediator;

import java.util.HashSet;
import java.util.Set;


public abstract class Mediator<RoleC extends Role> {
    protected Set<RoleC> roleSet;
    Mediator(){
        roleSet = new HashSet<>();
    }
    public void registerRole(RoleC role){
       roleSet.add(role);
       role.setMediator(this);
    }
     public void relayMessage(RoleC sender , String Message){
         roleSet.forEach(role -> {
             if (!role.equals(sender)){
                 role.receiveMessage(Message);
             }
         });
     }
}
